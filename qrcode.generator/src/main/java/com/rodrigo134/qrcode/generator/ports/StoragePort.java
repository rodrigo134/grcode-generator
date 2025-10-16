package com.rodrigo134.qrcode.generator.ports;

public interface StoragePort {

    String upLoadFile(byte[] fileData ,String fileName, String contentType);
}
