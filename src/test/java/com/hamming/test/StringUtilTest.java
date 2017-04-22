package com.hamming.test;

import com.hamming.utility.StringUtil;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by rajpalsinhsongara on 21/4/17.
 */
public class StringUtilTest {
    @Test
    public void base64EncodeDecodeTest(){
        String inputString="Rajpalsinh Songara";
        String resultString = StringUtil.decode(StringUtil.encode(inputString));
        assertEquals(inputString,resultString);
    }

    @Test(expected = IllegalArgumentException.class)
    public void base64EncodeFail(){
        StringUtil.encode(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void base64DecodeFail(){
        StringUtil.decode_urlsafe(null);
    }

    @Test
    public void base64EncodeDecodeURLSafeTest(){
        String inputString="Rajpalsinh Songara";
        String resultString = StringUtil.decode(StringUtil.encode_urlsafe(inputString));
        assertEquals(inputString,resultString);
    }

    @Test(expected = IllegalArgumentException.class)
    public void base64EncodeURLSafeFail(){
        StringUtil.encode_urlsafe(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void base64DecodeURLSafeFail(){
        StringUtil.decode_urlsafe(null);
    }
}
