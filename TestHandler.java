import java.util.HashMap;
import java.util.Map;

public class TestHandler implements Handler {
    @Override
    public void handle(HashMap<String,Object> data) {
        System.out.println("Control passed to TestHandler");
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().toString());
        }
    }
}
