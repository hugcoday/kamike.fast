/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kamike.fast;

/**
 *
 * @author THiNk
 */
public class FastConfig {
    public static int PacketLength=1024;
    public static int DataLength=1024+48;
    public static int PacketInWindow=512;
    public static int WindowLength=1024*512;
    public static int HeaderLength=48;
    public static String ConfigFileExtension=".cfg";
    public static String FilePath="D:/data/";
}
