import java.util.Iterator;

public class Extension {
	//@Extension
	public static boolean extension(String s) {
		return true;
	}
	public static boolean test() {
		String s = "qwe";
		return extension(s) && s.extension();
	}
	public static void main(String[] args) {
		System.out.println(Extension.test());
	}
}
