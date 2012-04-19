import com.sun.tools.javac.Main;

import java.io.File;

public class OOTest {
    public static void main(String[] args) throws Exception {
        Main.compile(new String[]{"sample/MathTest.java"});
        Main.compile(new String[]{"sample/CmpTest.java"});
        Main.compile(new String[]{"sample/MapIndexTest.java"});
        Main.compile(new String[]{"sample/ListIndexGetTest.java"});
        Main.compile(new String[]{"sample/ListIndexSetTest.java"});
    }
}
