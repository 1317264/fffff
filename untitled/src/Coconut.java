import java.util.Calendar;

public class Coconut extends Ingredient{
    private String name="Coconut";
    private Calendar PD;
    private int EXP=5;

    String getName(){
        return name;
    }
    Calendar getPD(){
        return PD;
    }
    int getEXP(){
        return EXP;
    }
    void setName(String name1){
        this.name=name1;
    }
    void setPD(Calendar PD1){
        this.PD=PD1;
    }
    void setEXP(int EXP1){
        this.EXP=EXP1;
    }

    @Override
    public String toString(){
        return("name:"+getName()+"   PD:"+getPD().getTime()+"   EXP:"+getEXP());
    }
}