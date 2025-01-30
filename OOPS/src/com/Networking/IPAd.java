package com.Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAd {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip=InetAddress.getByName("www.google.com");
        System.out.println("HostName:"+ip.getHostName());
        System.out.println("iP Adress:"+ip);
        System.out.println("iP Adress Method use:"+ip.getHostAddress());


    }
}
