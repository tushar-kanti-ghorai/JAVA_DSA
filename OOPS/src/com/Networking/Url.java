package com.Networking;

import java.net.URL;

public class Url {
    public static void main(String[] args) throws Exception{
        URL u=new URL("https://www.yahoo.com/index.html");
        System.out.println("protocol:"+u.getProtocol());
        System.out.println("Host:"+u.getHost());
        System.out.println("Port:"+u.getPort());
        System.out.println("Path:"+u.getPath());
        System.out.println("File:"+u.getFile());
        System.out.println("External Form:"+u.toExternalForm());

    }
}
