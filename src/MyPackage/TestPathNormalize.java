package MyPackage;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPathNormalize {
    public static void main(String[] args) {
        
        Path path1 = Paths.get("/home/./clarence/foo");
        path1 = path1.normalize();
        System.out.println(path1);

        Path path2 = Paths.get("/home/peter/../clarence/foo");
        path2 = path2.normalize();
        System.out.println(path2);
    }
}
