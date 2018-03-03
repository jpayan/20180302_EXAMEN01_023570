package Formats;

import java.util.Map;

public class JSONBehavior implements FormatBehavior {
    @Override
    public Object parse(Map<String, Object> message) {
        System.out.println("Parsed message to JSON");
        return message.toString();
    }
}
