import java.util.Arrays;
import java.util.List;

public class Main {

    public Main(String args[]) {
//        DuckDetails dobj = new DuckDetails("Mallard");
//        List<DuckDetails> lobj = Arrays.asList();
//        lobj.add(new DuckDetails("Mallard"));
//        lobj.add(new DuckDetails("Redhead"));
//        lobj.add(new DuckDetails("Marbled"));
        DuckDetails dobj = new DuckDetails();
        DuckCollection dcobj = new DuckCollection();
        dcobj.addDuckType("Mallard");
        dcobj.addDuckType("Redhead");
        dcobj.addDuckType("Marbled");
        dcobj.selectDuckType();





    }
}
