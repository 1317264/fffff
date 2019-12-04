import java.time.Year;
import java.util.Calendar;

public class Test {
    public static void main(String[] args){
        TeaShop teashop=new TeaShop();
        Bubble bubble1=new Bubble();
        bubble1.setPD(Calendar.getInstance());
        bubble1.getPD().add(Calendar.YEAR,-10);
        teashop.BubbleList.add(bubble1);
        Bubble bubble2=new Bubble();
        bubble2.setPD(Calendar.getInstance());
        bubble2.getPD().add(Calendar.DATE,-5);
        teashop.BubbleList.add(bubble2);
        teashop.Sell("奶茶1","Bubble");
        teashop.Sell("奶茶2","Coconut");

    }
}
