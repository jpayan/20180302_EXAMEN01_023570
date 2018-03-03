package Protocols;

import Banks.Bank;

public interface ProtocolBehavior {
    void transfer(Bank source, Bank target, double amount, Object message);
}
