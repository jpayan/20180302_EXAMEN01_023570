package Banks;

import Formats.FormatBehavior;
import Protocols.ProtocolBehavior;

import java.util.HashMap;
import java.util.Map;

public class BanPatito extends Bank {
    String state;
    public BanPatito(String name, ProtocolBehavior protocolBehavior, FormatBehavior transferBehavior, String state) {
        super(name, protocolBehavior, transferBehavior);
        this.state = state;
    }

    @Override
    public void transfer(Bank source, Bank target, double amount) {
        Map<String, Object> attributes = new HashMap<>();
        attributes.put("State", state);
        String message = (String) formatBehavior.parse(attributes);
        protocolBehavior.transfer(source, target, amount, message);
    }
}
