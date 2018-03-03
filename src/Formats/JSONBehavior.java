package Formats;

public class JSONBehavior implements FormatBehavior {
    @Override
    public Object parse(Object message) {
        System.out.println("Parsed message to JSON");
        return message.toString();
    }
}
