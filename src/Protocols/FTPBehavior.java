package Protocols;

import Banks.Bank;

public class FTPBehavior implements ProtocolBehavior {
    @Override
    public void transfer(Bank target, double amount) {
        System.out.println("Message sent via FTP.");
    }
}
