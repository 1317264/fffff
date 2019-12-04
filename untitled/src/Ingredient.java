import java.util.Calendar;

public abstract class Ingredient {
    protected String name;
    protected Calendar PD;
    protected int EXP;

    @Override
    public String toString(){
        return("name:"+name+" PD:"+PD+" EXP:"+EXP);
    }
}

