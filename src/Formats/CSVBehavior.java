package Formats;

public class CSVBehavior implements FormatBehavior {
    @Override
    public Object parse(Object message) {
        System.out.println("Message parsed to CSV.");
        return message;
    }
}
