import Banks.BanCetys;
import Banks.BanPayucas;
import Formats.JSONBehavior;
import Protocols.HTTPBehavior;

public class Main {
    public static void main(String[] args) {
        BanCetys banCetys = new BanCetys("BanCetys", new HTTPBehavior(), new JSONBehavior(), "Calle Numero Ciudad");
        banCetys.addAssociate(new BanPayucas("BanPayucas", new HTTPBehavior(), new JSONBehavior()));
    }
}
