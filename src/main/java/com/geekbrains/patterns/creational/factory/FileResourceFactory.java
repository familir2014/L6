package com.geekbrains.patterns.creational.factory;

import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileResourceFactory implements ResourceFactory {

    private final String resource;

    public FileResourceFactory(String resource) {
        this.resource = resource;
    }

    @Override
    public WritableResource getResource() throws IOException {
        return new FileResource(resource);
    }

}
