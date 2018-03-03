package Protocols;

import Banks.Bank;

public class EmailBehavior implements Protocols.ProtocolBehavior {
    @Override
    public void transfer(Bank target, double amount) {
        System.out.println("Message sent via Email.");
    }
}
