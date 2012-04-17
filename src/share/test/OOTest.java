import com.sun.tools.javac.Main;

public class OOTest {
    public static void main(String[] args) throws Exception {
        Main.compile(new String[]{"src/share/sample/MapIndexTest.java"});
        Main.compile(new String[]{"src/share/sample/ListIndexGetTest.java"});
        Main.compile(new String[]{"src/share/sample/ListIndexSetTest.java"});
    }
}
