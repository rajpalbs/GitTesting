package com.hamming.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by rajpalsinhsongara on 27/4/17.
 */
public class BlockingIO {
    public static void main(String[] args){
        BufferedReader br = null;
        String sCurrentLine = null;
        try{
            br = new BufferedReader(new FileReader("test.txt"));
            while ((sCurrentLine = br.readLine()) != null){
                System.out.println(sCurrentLine);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}

