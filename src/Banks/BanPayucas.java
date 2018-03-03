package Banks;

import Formats.FormatBehavior;
import Protocols.ProtocolBehavior;

import java.util.HashMap;
import java.util.Map;

public class BanPayucas extends Bank {
    String office;
    public BanPayucas(String name, ProtocolBehavior protocolBehavior, FormatBehavior transferBehavior, String office) {
        super(name, protocolBehavior, transferBehavior);
        this.office = office;
    }

    @Override
    public void transfer(Bank source, Bank target, double amount) {
        Map<String, Object> attributes = new HashMap<>();
        attributes.put("Office", this.office);
        String message = (String) formatBehavior.parse(attributes);
        protocolBehavior.transfer(source, target, amount, message);
    }
}
