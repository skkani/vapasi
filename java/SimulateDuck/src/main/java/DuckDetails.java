import java.util.*;

public class DuckDetails {
    //HashMap<Integer, String> duckTypeObj = new HashMap<>();
    private String Ducktype;

    public void SetDuckDetails(String Ducktype) {
        this.Ducktype = Ducktype;
    }

    public String Swim(String DuckType)
    {
        return DuckType+" is Swimming";
    }

    public String Quack(String DuckType)
    {
        return  DuckType+" is Quacking";
    }

    public String fly(String DuckType)
    {
        return  DuckType+" is flying";
    }


    public String getDuckType() {
        return Ducktype;
    }
}
