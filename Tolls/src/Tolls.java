public class Tolls {
    public static void handleTopUP(TollDevice tb,double money){
        tb.addMoney(money);
        System.out.println("Your device now has "+tb.getBalance()+"$");
    }

    public static void handleTollStation(TollDevice tb,double rate){
        System.out.println("Balance: "+tb.getBalance()+"$.");
        System.out.println("Rate: "+rate+"$.");
        if(tb.passToll(rate)){
            System.out.println("Passed successfully");
            System.out.println("New Balance: "+tb.getBalance()+"$.");
        }
        else{
            System.out.println("Not enough money to get through.");
        }
    }

    public static void main(String[] args) {
        //System.out.println("Hello world!");
        TollDevice ePass1 = new TollDevice();
        handleTopUP(ePass1,10);
        handleTollStation(ePass1,3.8);

    }
}