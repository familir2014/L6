package com.geekbrains.patterns.creational.factory;

import java.io.IOException;

public interface ResourceFactory {

    WritableResource getResource() throws IOException;

}
