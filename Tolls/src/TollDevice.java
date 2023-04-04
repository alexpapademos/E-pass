public class TollDevice {
    private double balance;
    public double getBalance(){
        return balance;
    }
    public void addMoney(double money){
        balance += money;

    }
    public boolean passToll(double rate){
        if(rate<=balance){
            balance-=rate;
            return true;
        }
        else{
            return false;
        }
    }
}
