package com.geekbrains.patterns.structure.composite;

public abstract class File implements Item {

    public abstract byte[] getData();


    @Override
    public boolean isDirectory() {
        return false;
    }

    @Override
    public boolean isFile() {
        return true;
    }
}
