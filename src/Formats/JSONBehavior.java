package Formats;

import java.util.Map;

public class JSONBehavior implements FormatBehavior {
    @Override
    public Object parse(Map<String, Object> message) {
        System.out.println("Message parsed to JSON");
        return message.toString();
    }
}
