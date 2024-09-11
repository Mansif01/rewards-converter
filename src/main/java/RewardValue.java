public class RewardValue {
    public double cash;
    public double mile;
    public final double miles_to_cash = 0.0035;
    public RewardValue(double cash){
        this.cash = cash;
        this.mile = cash / miles_to_cash;
    }

    public RewardValue(int mile){
        this.mile = mile;
        this.cash = mile * miles_to_cash;
    }
    public double getCashValue(){
        return cash;
    }

    public double getMilesValue(){
        return mile;
    }
}
