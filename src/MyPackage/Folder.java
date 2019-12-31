package MyPackage;

import java.io.IOException;

public class Folder implements AutoCloseable {

    @Override
    public void close() throws IOException {
        System.out.print("Close");
    }

    public void open() {
        System.out.print("Open");
    }
}
