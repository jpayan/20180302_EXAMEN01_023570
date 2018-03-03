package Formats;

import java.util.Map;

public class XMLBehavior implements FormatBehavior {
    @Override
    public Object parse(Map<String, Object> message) {
        System.out.println("Message parsed to XML.");
        return message.toString();
    }
}
