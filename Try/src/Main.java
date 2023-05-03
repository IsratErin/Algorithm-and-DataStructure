import java.net.*;
import java.nio.charset.StandardCharsets;
import java.io.*;

public class HTTPAsk {
    public static void main(String[] args) {
        try {
            int port = Integer.parseInt(args[0]);
            ServerSocket serverSocket = new ServerSocket(port);

            while (true) {
                Socket socket = serverSocket.accept();
                OutputStream socketOutput = socket.getOutputStream();
                StringBuilder sb = new StringBuilder();
                // System.out.println("Accepted connection from " + socket.getInetAddress());

                try {
                    byte[] buffer = new byte[1024];
                    socket.getInputStream().read(buffer);
                    String decodedString = new String(buffer, StandardCharsets.UTF_8);

                    if (!decodedString.split(" ")[0].equals("GET") || !decodedString.contains("HTTP/1.1")) {
                        sb.append("HTTP/1.1 400 Bad Request\r\n");
                        throw new Exception("Bad Request");
                    }

                    String url = decodedString.split(" ")[1];
                    String[] params = url.split("\\?");
                
                    if (params.length > 0 && params[0].equals("/ask")) {
                        if (params.length < 2) {
                            sb.append("HTTP/1.1 400 Bad Request\r\n");
                            throw new Exception("Bad Request");
                        }

                        String[] paramList = params[1].split("&");
                        // for(String param : paramList) System.out.println(param);

                        String hostname = "";
                        int portClient = 0;
                        byte[] bytesToServer = new byte[0];
                        Integer timeout = null;
                        Integer limit = null;
                        boolean shutdown = false;
                        
                        for (String param : paramList) {
                            String[] keyValue = param.split("=");

                            if(keyValue.length < 2) {
                                sb.append("HTTP/1.1 400 Bad Request\r\n");
                                throw new Exception("Bad Request");
                            }

                            if (keyValue[0].equals("shutdown")) {
                                shutdown = Boolean.parseBoolean(keyValue[1]);
                            } else if (keyValue[0].equals("timeout")) {
                                timeout = Integer.parseInt(keyValue[1]);
                            } else if (keyValue[0].equals("limit")) {
                                limit = Integer.parseInt(keyValue[1]);
                            } else if (keyValue[0].equals("hostname")) {
                                hostname = keyValue[1];
                            } else if (keyValue[0].equals("port")) {
                                portClient = Integer.parseInt(keyValue[1]);
                            } else if (keyValue[0].equals("string")) {
                                bytesToServer = keyValue[1].getBytes();
                            }
                        }

                        if (hostname.equals("") || portClient == 0) {
                            sb.append("HTTP/1.1 400 Bad Request\r\n");
                            throw new Exception("Bad Request");
                        }

                        try {
                            sb.append("HTTP/1.1 200 OK\r\n\r\n");

                            TCPClient client = new TCPClient(shutdown, timeout, limit);
                            sb.append(new String(client.askServer(hostname, portClient, bytesToServer)));

                        } catch (Exception e) {
                            sb.append("HTTP/1.1 500 Internal Server Error\r\n");
                            throw new Exception("Internal Server Error");
                        }
                        
                    } else {
                        sb.append("HTTP/1.1 404 Not Found\r\n");
                        throw new Exception("Not Found");
                    }

                    socketOutput.write(sb.toString().getBytes());
                    socket.close();
                    // System.out.println(sb.toString());
                    
                } catch (Exception e) {
                    socketOutput.write(sb.toString().getBytes());
                    socket.close();
                    // System.out.println(e + " " + sb.toString());
                }
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            // System.out.println(e);
            System.exit(1);

        } catch (IOException e) {
            // System.out.println(e);
            System.exit(1);
        }
    }
}