package com.app.UDPExercise.send;
import java.io.IOException;
import java.net.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // init
        DatagramSocket socket = new DatagramSocket(11450);
        Scanner sc = new Scanner(System.in);
        InetAddress zyz = InetAddress.getByName("192.168.119.127");

        // send message
        String data = "";
        while (true) {
            data = sc.nextLine();
            if (data.equals("886")) break;
            byte[] buf = data.getBytes();

            DatagramPacket packet = new DatagramPacket(buf, buf.length, zyz, 11451);
            socket.send(packet);
        }

        socket.close();
        sc.close();
    }
}
