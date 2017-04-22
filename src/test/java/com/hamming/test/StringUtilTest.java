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
        String inputString = "Rajpalsinh Songara";
        String resultString = StringUtil.decode(StringUtil.encode(inputString));
        assertEquals(inputString,resultString);
    }
}
