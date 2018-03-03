package Banks;

import Formats.FormatBehavior;
import Protocols.ProtocolBehavior;
import java.util.ArrayList;

public abstract class Bank {
    protected String name;
    protected ProtocolBehavior protocolBehavior;
    protected FormatBehavior formatBehavior;

    public Bank(String name, ProtocolBehavior protocolBehavior, FormatBehavior formatBehavior) {
        this.name = name;
        this.protocolBehavior = protocolBehavior;
        this.formatBehavior = formatBehavior;
    }

    public String getName() {
        return name;
    }

    public void setProtocolBehavior(ProtocolBehavior protocolBehavior) {
        this.protocolBehavior = protocolBehavior;
    }

    public void setFormatBehavior(FormatBehavior formatBehavior) {
        this.formatBehavior = formatBehavior;
    }

    public void notifyUser(String message) {
        System.out.println("User has been notified.");
    }

    public abstract void transfer(Bank source, Bank target, double amount);
}
