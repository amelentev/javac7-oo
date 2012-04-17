import java.util.Arrays;
import java.util.List;

public class ListIndexGetTest {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1};
        List<Integer> lst = Arrays.asList(1);
        int resa = arr[0];
        int resl1 = lst.get(0);
        int resl2 = lst[0];
        System.out.println(resl2 == resa);
    }
}