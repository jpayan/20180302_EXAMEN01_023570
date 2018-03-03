package Protocols;

import Banks.Bank;

public class EmailBehavior implements ProtocolBehavior {
    @Override
    public void transfer(Bank source, Bank target, double amount, Object message) {
        System.out.println("Message sent via Email from " + source.getName() + " to " + target.getName());
        target.notifyUser((String) message);
    }
}
