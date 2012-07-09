import com.sun.tools.javac.Main;

public class ExtensionTest {
    public static void main(String[] args) throws Exception {
    	String clas = "Extension";
    	String file = "sample/"+clas+".java";
		System.out.print("Compiling " + file + ": ");
		boolean res = Main.compile(new String[]{file, "-d", "build/classes"})==0;
		res &= (Boolean)Class.forName(clas).getDeclaredMethod("test").invoke(null);
		System.out.println(res ? "ok" : "fail");
    }
}
