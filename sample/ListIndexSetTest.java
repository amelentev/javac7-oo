import java.lang.Integer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIndexSetTest {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1};
        List<Integer> lst = new ArrayList<>(Arrays.asList(1));
        arr[0] = 2;
        lst.set(0, 2);
        lst[0] = 2;
        System.out.println(lst.get(0)==2);
    }
}
