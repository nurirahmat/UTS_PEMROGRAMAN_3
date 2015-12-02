/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nurysmile;
/**
 *
 * @author Windows 7
 */
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class JsonProcessors {
    static URL url;
    public static String fetchJsonURL(String sUrl) {
        String sReturn = "";
        try {
            url = new URL(sUrl);
            URLConnection connection = url.openConnection();
            connection.connect();
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String myString;
            while ((myString = br.readLine()) != null) {
                sReturn += myString;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();  //
        } catch (IOException e) {
            e.printStackTrace();  
        }
        return sReturn;
    }
}
