package com.interview.javabasic.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(65000);
        while (true){
            Socket socket = ss.accept();
        }
    }


}
