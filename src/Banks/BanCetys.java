package Banks;

import Formats.FormatBehavior;
import Protocols.ProtocolBehavior;

public class BanCetys extends Bank {
    String address;

    public BanCetys(String name, ProtocolBehavior protocolBehavior, FormatBehavior transferBehavior, String address) {
        super(name, protocolBehavior, transferBehavior);
        this.address = address;
    }
}
