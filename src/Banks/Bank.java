package Banks;

import Formats.FormatBehavior;
import Protocols.ProtocolBehavior;
import java.util.ArrayList;

public abstract class Bank {
    protected String name;
    protected ProtocolBehavior protocolBehavior;
    protected FormatBehavior transferBehavior;
    protected ArrayList<Bank> associates;

    public Bank(String name, ProtocolBehavior protocolBehavior, FormatBehavior transferBehavior) {
        this.name = name;
        this.protocolBehavior = protocolBehavior;
        this.transferBehavior = transferBehavior;
        this.associates = new ArrayList<>();
    }

    public void setProtocolBehavior(ProtocolBehavior protocolBehavior) {
        this.protocolBehavior = protocolBehavior;
    }

    public void setTransferBehavior(FormatBehavior transferBehavior) {
        this.transferBehavior = transferBehavior;
    }

    public void addAssociate(Bank bank) {
        this.associates.add(bank);
    }

    public void removeAssociate(Bank bank) {
        this.associates.remove(bank);
    }

    public void notifiyUser() {
        System.out.println("User has been notified.");
    }

    public void transfer() {
        transferBehavior.();
    }
}
