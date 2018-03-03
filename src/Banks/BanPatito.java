package Banks;

import Formats.FormatBehavior;
import Protocols.ProtocolBehavior;

public class BanPatito extends Bank {
    public BanPatito(String name, ProtocolBehavior protocolBehavior, FormatBehavior transferBehavior) {
        super(name, protocolBehavior, transferBehavior);
    }
}
