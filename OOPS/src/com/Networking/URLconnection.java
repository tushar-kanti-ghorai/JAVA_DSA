package com.Networking;
import java.net.*;
import java.io.*;

public class URLconnection {
    public static void main(String[] args) throws Exception {
        URL u=new URL("http://www.yahoo.com/index.html");
        URLConnection obj=u.openConnection();
        



    }
}
