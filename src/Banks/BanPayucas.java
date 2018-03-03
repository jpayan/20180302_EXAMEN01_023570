package Banks;

import Formats.FormatBehavior;
import Protocols.ProtocolBehavior;

public class BanPayucas extends Bank {
    public BanPayucas(String name, ProtocolBehavior protocolBehavior, FormatBehavior transferBehavior) {
        super(name, protocolBehavior, transferBehavior);
    }
}
