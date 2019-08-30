import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DuckCollection {
    List<String> dd = Arrays.asList();
    DuckDetails dobj = new DuckDetails();

    public String addDuckType(String DuckType)
    {
        String ret = "DuckType couldn be added";
        if(dd.add(DuckType)) ret =  "Duck Type is added";
        return ret;

    }
    public String selectDuckType()
    {
        Random rnd = new Random();
        int selectduct = rnd.nextInt(dd.size());
        String DuckType = String.valueOf(dd.get(selectduct));
        System.out.println(dd.get(selectduct));
        DuckAction(DuckType);
        return "My name is "+DuckType;
    }

    public void DuckAction(String DuckType)
    {
        dobj.Quack(DuckType);
        dobj.Swim(DuckType);
        dobj.fly(DuckType);

    }
}
