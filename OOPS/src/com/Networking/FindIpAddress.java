package com.Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class FindIpAddress {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter website name:");
        String site=bf.readLine();
        try{
         InetAddress    ip=InetAddress.getByName(site);
            System.out.println("Ip address:"+ip);
        }catch (UnknownHostException e){
            System.out.println("Website not found");
        }

    }
}
