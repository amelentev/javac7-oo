import java.util.HashMap;
import java.util.Map;
public class MapIndexTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map["qwe"] = "asd";
        System.out.println(map["qwe"].equals("asd"));
    }
}
