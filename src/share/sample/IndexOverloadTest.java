import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndexOverloadTest {
	public static boolean test() {
		return 0 == Arrays.asList(1, 2)[0];
	}
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        Integer[] arr = new Integer[] {1};
        lst.add(1);
        int resa = arr[0];
        { int resl1 = lst.get(0); }
        int resl2 = lst[0];
        System.out.println(resl2);
        System.out.println(test());
        //lst[0] = 2;
        //System.out.println(lst[0]);
    }
}