package com.app.UDPExercise.receive;
import java.io.IOException;
import java.net.*;

public class Main {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(11451);
        byte[] buf = new byte[1024];

        while (true) {
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            System.out.println("Receiving message...");
            socket.receive(packet);
            String data = new String(packet.getData(), 0, packet.getLength());
            System.out.println(data);
        }
    }
}