package Formats;

import java.util.Map;

public interface FormatBehavior {
    Object parse(Map<String, Object> message);
}
