package com.utils;

import java.util.UUID;

/**
 * @author yzze
 * @create 2021-05-30 20:16
 */
public class IDUtils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

}
