package Protocols;

import Banks.Bank;

public class HTTPBehavior implements ProtocolBehavior {
    @Override
    public void transfer(Bank target, double amount) {
        System.out.println("Message sent via HTTP.");
    }
}
