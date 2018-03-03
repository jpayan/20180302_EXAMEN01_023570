import Banks.BanCetys;
import Banks.BanPayucas;
import Formats.JSONBehavior;
import Formats.XMLBehavior;
import Protocols.FTPBehavior;
import Protocols.HTTPBehavior;

public class Main {
    public static void main(String[] args) {
        BanCetys banCetys = new BanCetys("BanCetys", new HTTPBehavior(), new JSONBehavior(), "Calle Numero Ciudad");
        BanPayucas banPayucas = new BanPayucas("BanPayucas", new HTTPBehavior(), new JSONBehavior(), "BC");

        banCetys.transfer(banCetys, banPayucas, 1000);

        banCetys.setFormatBehavior(new XMLBehavior());
        banCetys.setProtocolBehavior(new FTPBehavior());

        banCetys.transfer(banCetys, banPayucas, 2000);
    }
}
