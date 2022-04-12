package com.geekbrains.patterns.structure.composite;

public class ImageFile extends File {

    private final byte[] data;

    public ImageFile(String url) throws Exception {
        data = new byte[]{1, 2, 3};
    }

    @Override
    public byte[] getData() {
        return data;
    }
}
