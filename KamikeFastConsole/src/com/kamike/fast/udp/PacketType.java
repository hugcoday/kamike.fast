/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kamike.fast.udp;

/**
 *
 * @author THiNk
 */
public enum PacketType {
    Data,
    UploadStatus,
    BeginUpload,
    BeginDownload,
    RetryData,
    Finish
    
}
