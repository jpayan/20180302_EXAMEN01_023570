package Formats;

public class XMLBehavior implements FormatBehavior {
    @Override
    public Object parse(Object message) {
        System.out.println("Message parsed to XML.");
        return message.toString();
    }
}
