package com.company;

public class DuckDetails {
    private String Ducktype;
    private String name;

    public  DuckDetails(String name,String Ducktype) {
        this.Ducktype = Ducktype;
        this.name = name;
    }

    public void Swim()
    {
        System.out.println( this.Ducktype+" is Swimming");
    }

    public void Quack()
    {
        System.out.println(this.Ducktype+" is Quacking");
    }

    public void fly()
    {
        String ret = "";
        if (this.Ducktype == "rubber")
        {
            ret = Ducktype+" cannot fly";
        }
        else if (Ducktype == "Mallard" || Ducktype == "RedHead")
        {
            ret = Ducktype+" fly fast";
        }
        else if (Ducktype == "Marbled")
        {
            ret = Ducktype+" fly Slow";
        }
        else
        {
            ret = "Can fly";
        }
        System.out.println( ret);
    }

    public String getDuckType() {
        return Ducktype;
    }
}

