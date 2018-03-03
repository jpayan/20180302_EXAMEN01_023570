package Formats;

import java.util.Map;

public class CSVBehavior implements FormatBehavior {
    @Override
    public Object parse(Map<String, Object> message) {
        System.out.println("Message parsed to CSV.");
        return message.toString();
    }
}
