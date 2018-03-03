package Banks;

import Formats.FormatBehavior;
import Protocols.ProtocolBehavior;

import java.util.HashMap;
import java.util.Map;

public class BanCetys extends Bank {
    String address;

    public BanCetys(String name, ProtocolBehavior protocolBehavior, FormatBehavior transferBehavior, String address) {
        super(name, protocolBehavior, transferBehavior);
        this.address = address;
    }

    @Override
    public void transfer(Bank source, Bank target, double amount) {
        Map<String, Object> attributes = new HashMap<>();
        attributes.put("Address", address);
        String message = (String) formatBehavior.parse(attributes);
        protocolBehavior.transfer(source, target, amount, message);
    }
}
