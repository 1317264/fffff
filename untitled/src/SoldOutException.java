import java.util.ArrayList;
import java.util.Calendar;

public class SoldOutException {
    public void BubbkeEXPdelete(ArrayList<Bubble> bubblelist) {
        int i;
        for(i=0;i<bubblelist.size();i++){
            Calendar calendar=Calendar.getInstance();
            if((calendar.getTimeInMillis()-bubblelist.get(i).getPD().getTimeInMillis())/(1000*60*60*24)>7){
                bubblelist.remove(i);
                System.out.println("Remove overdue bubble");
                i--;
            }
        }
    }

    public void BubbleWarning(ArrayList<Bubble> bubblelist) throws Exception {
        if (bubblelist.isEmpty()){
            System.out.println("Bubble sold out");
            throw new Exception("Bubble sold out");
        }
    }

    public void BubbleSolddelete(ArrayList<Bubble> bubblelist) {
        bubblelist.remove(0);
    }

    public void CoconutEXPdelete(ArrayList<Coconut> coconutlist) {
        int i;
        for(i=0;i<coconutlist.size();i++){
            Calendar calendar=Calendar.getInstance();
            if((calendar.getTimeInMillis()-coconutlist.get(i).getPD().getTimeInMillis())/(1000*60*60*24)>7){
                coconutlist.remove(i);
                System.out.println("Remove overdue coconut");
                i--;
            }
        }
    }

    public void CoconutWarning(ArrayList<Coconut> coconutlist)throws Exception{
        if(coconutlist.isEmpty()){
            System.out.println("Coconut sold out");
            throw new Exception("Coconut sold out");
        }
    }


    public void CoconutSolddelete(ArrayList<Coconut> coconutlist){
        coconutlist.remove(0);
    }


}
