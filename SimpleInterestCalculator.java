public class SimpleInterestCalculator {
    public double interest( double p, double R, int t){
        return(p*R*t);
    }
    public static void main(String[] args){
        SimpleInterestCalculator MysimpleInterest = new SimpleInterestCalculator();

        double result = MysimpleInterest.interest(1000000, 0.05, 5);
        System.out.println(result);
       
    }
}


