import java.util.ArrayList;
import java.util.Calendar;

public class TeaShop extends SoldOutException implements Shop{
    ArrayList<Bubble> BubbleList=new ArrayList<Bubble>();
    ArrayList<Coconut> CoconutList=new ArrayList<Coconut>();


    @Override
    public void Add(Bubble bubble) {
        BubbkeEXPdelete(BubbleList);
        try{
            BubbleWarning(BubbleList);
        }catch (Exception e){
            Buy(bubble);
        }
        System.out.println("Add Bubble to the milktea");
    }
    @Override
    public void Add(Coconut coconut) {
        CoconutEXPdelete(CoconutList);
        try{
            CoconutWarning(CoconutList);
        }catch(Exception e){
            Buy(coconut);
        }
        System.out.println("Add coconut to the milktea");
    }
    @Override
    public void Sell(String milkname, String ingredientname) {
        System.out.println("You want "+milkname+" with "+ingredientname);
        MilkTea milktea=new MilkTea();
        milktea.setName(milkname);
        if(ingredientname.compareTo("Bubble")==0){
            milktea.setIngredient(new Bubble());
            milktea.getIngredient().name="Bubble";
            milktea.getIngredient().EXP=7;
            Add((Bubble) milktea.getIngredient());
            milktea.setIngredient(BubbleList.get(0));
            BubbleSolddelete(BubbleList);
        }
        else if(ingredientname.compareTo("Coconut")==0){
            milktea.setIngredient(new Coconut());
            milktea.getIngredient().name="Coconut";
            milktea.getIngredient().EXP=5;
            Add((Coconut) milktea.getIngredient());
            milktea.setIngredient(CoconutList.get(0));
            CoconutSolddelete(CoconutList);
        }
        System.out.println(milktea.toString());
    }

    @Override
    public void Buy(Ingredient ingredient) {
        if(ingredient instanceof Bubble){
            Bubble[] bubble=new Bubble[10];
            int i;
            for(i=0;i<10;i++) {
                bubble[i]=new Bubble();
                bubble[i].setPD(Calendar.getInstance());
                BubbleList.add(bubble[i]);
            }
            System.out.println("Buy 10 bubbles");
        }
        if(ingredient instanceof Coconut){
            Coconut[] coconut=new Coconut[10];
            int i;
            for(i=0;i<10;i++){
                coconut[i]=new Coconut();
                coconut[i].setPD(Calendar.getInstance());
                CoconutList.add(coconut[i]);
            }
            System.out.println("Buy 10 coconuts");
        }
    }
}
