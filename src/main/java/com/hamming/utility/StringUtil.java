package com.hamming.utility;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * Created by rajpalsinhsongara on 18/4/17.
 */
public class StringUtil {
    public static String encode(String plainString){
        byte[] plainStringBytes = plainString.getBytes(StandardCharsets.UTF_8);
        return Base64.getEncoder().encodeToString(plainStringBytes);
    }

    public static String decode(String encodedString){
        return new String(Base64.getDecoder().decode(encodedString));
    }

    public static String encode_urlsafe(){
        return null;
    }

    public static String decode_urlsafe(){
        return null;
    }


}
