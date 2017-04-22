package com.hamming.utility;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * Created by rajpalsinhsongara on 18/4/17.
 */
public class StringUtil {
    public static String encode(String plainString){
        if (plainString == null) {
            throw new IllegalArgumentException("plainString cannot be null.");
        }
        byte[] plainStringBytes = plainString.getBytes(StandardCharsets.UTF_8);
        return Base64.getEncoder().encodeToString(plainStringBytes);
    }

    public static String decode(String encodedString){
        if (encodedString == null) {
            throw new IllegalArgumentException("encodedString cannot be null.");
        }
        return new String(Base64.getDecoder().decode(encodedString));
    }

    public static String encode_urlsafe(String plainString){
        if (plainString == null) {
            throw new IllegalArgumentException("plainString cannot be null.");
        }
        byte[] plainStringBytes = plainString.getBytes(StandardCharsets.UTF_8);
        return Base64.getUrlEncoder().encodeToString(plainStringBytes);
    }

    public static String decode_urlsafe(String encodedString){
        if (encodedString == null) {
            throw new IllegalArgumentException("encodedString cannot be null.");
        }
        return new String(Base64.getUrlDecoder().decode(encodedString));
    }
}
