
    public class CompoundInterestCalculator {
        public double compound(double p, double R, int n, int t)
        {
        return (p*(1+(R/n)*n*t));
        } 
            public static void main(String[] args){
            CompoundInterestCalculator myCompound = new CompoundInterestCalculator();
            double result = myCompound.compound(500000, 0.18, 12, 3);
            System.out.println(result);
            }
    }
    

