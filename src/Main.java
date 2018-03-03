import Banks.BanCetys;
import Banks.BanPatito;
import Banks.BanPayucas;
import Formats.CSVBehavior;
import Formats.JSONBehavior;
import Formats.XMLBehavior;
import Protocols.EmailBehavior;
import Protocols.FTPBehavior;
import Protocols.HTTPBehavior;

public class Main {
    public static void main(String[] args) {
        BanCetys banCetys = new BanCetys("BanCetys", new HTTPBehavior(), new JSONBehavior(), "Calle Numero Ciudad");
        BanPayucas banPayucas = new BanPayucas("BanPayucas", new FTPBehavior(), new XMLBehavior(), "Head Quaters");
        BanPatito banPatito = new BanPatito("BanPatito", new EmailBehavior(), new CSVBehavior(), "BC");

        banCetys.transfer(banCetys, banPayucas, 1000);
        banPayucas.transfer(banPayucas, banPatito, 800);
        banPatito.transfer(banPatito, banCetys, 100);

        banCetys.setFormatBehavior(new XMLBehavior());
        banCetys.setProtocolBehavior(new FTPBehavior());

        banCetys.transfer(banCetys, banPayucas, 2000);
    }
}
