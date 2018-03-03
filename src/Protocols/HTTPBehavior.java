package Protocols;

import Banks.Bank;

public class HTTPBehavior implements ProtocolBehavior {
    @Override
    public void transfer(Bank source, Bank target, double amount, Object message) {
        System.out.println("Message sent via HTTP from " + source.getName() + " to " + target.getName());
        target.notifyUser((String) message);
    }
}
