package Protocols;

import Banks.Bank;

public class FTPBehavior implements ProtocolBehavior {
    @Override
    public void transfer(Bank source, Bank target, double amount, Object message) {
        System.out.println("Message sent via FTP from " + source.getName() + " to " + target.getName());
        target.notifyUser((String) message);
    }
}
