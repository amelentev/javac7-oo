import com.sun.tools.javac.Main;

public class JCOOTest {
    public static void main(String[] args) throws Exception {
        compile("Math");
        compile("Cmp");
        compile("ListIndexGet");
        compile("ListIndexSet");
        compile("MapIndex");
    }
    public static void compile(String clas) throws Exception {
    	String file = "../examples/"+clas+".java";
		System.out.print("Compiling " + file + ": ");
		boolean res = Main.compile(new String[]{file, "-d", "build/classes"})==0;
		res &= (boolean)Class.forName(clas).getDeclaredMethod("test").invoke(null);
		System.out.println(res ? "ok" : "fail");
	}
}
