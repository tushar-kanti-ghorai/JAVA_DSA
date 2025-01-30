package com.Networking;
import java.net.*;

public class UrlInfo {
    public static void main(String[] args) throws MalformedURLException {
        URL obj=new URL("https://www.google.com/index.html");
        System.out.println("Host name:"+obj.getHost());
        System.out.println("File name"+obj.getFile());
        System.out.println("Port no:"+obj.getPort());
        System.out.println("Prtocol:"+obj.getProtocol());



    }

}
