package ClassesAndobjects.PlayingWithFractions;

public class Fraction {
    private int numerator;
    private int denominator;

    
    public void setNumerator(int numerator){
        this.numerator=numerator;
        simplify();
    }
    public void setDenominator(int num){
        if(num==0){
            return;
        }
        this.denominator=num;
        simplify();
    }
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }

    public Fraction(int numerator, int denominator){
        if(denominator==0){
            denominator=1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }
    private void simplify(){
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for(int i=2;i<=smaller;i++){
            if(numerator%i==0 && denominator%i==0){
                gcd = i;
            }
        }
        numerator/=gcd;
        denominator/=gcd;
    }
    public void increment(){
        numerator+=denominator;
        simplify();
    }
    public void print(){
        System.out.println(numerator+"/"+denominator);
    }
    public void add(Fraction f2){
        // if(denominator1!=denominator2){
        //     numerator1*=denominator2;
        //     denominator1*=denominator2;
        //     numerator2*=denominator1;
        //     denominator2*=denominator1;
        // }
        // numerator=numerator1+numerator2;
        // denominator=denominator1;
        // simplify();
        this.numerator = (this.numerator*f2.denominator)+(f2.numerator*this.denominator);
        this.denominator=this.denominator*f2.denominator;
        simplify();
    }
}
