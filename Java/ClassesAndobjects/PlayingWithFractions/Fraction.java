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
    // public void add(Fraction f2){
    //     this.numerator = (this.numerator*f2.denominator)+(f2.numerator*this.denominator);
    //     this.denominator=this.denominator*f2.denominator;
    //     simplify();
    // }
    public static Fraction add(Fraction f1, Fraction f2){
        int newNumerator = (f1.numerator*f2.denominator)+(f2.numerator*f1.denominator);
        int newDenominator = f1.denominator*f2.denominator;
        Fraction f = new Fraction(newNumerator, newDenominator);
        return f;
    }
    // public void multiply(Fraction f2){
    //     this.numerator*=f2.numerator;
    //     this.denominator*=f2.denominator;
    //     simplify();
    // }
    public static Fraction multiply(Fraction f1, Fraction f2){
        int newNumerator = f1.numerator*f2.numerator;
        int newDenominator = f1.denominator*f2.denominator;
        Fraction f = new Fraction(newNumerator, newDenominator);
        return f;
    }
    public static Fraction subtract(Fraction f1, Fraction f2){
        int newNumerator = (f1.numerator*f2.denominator)-(f2.numerator*f1.denominator);
        int newDenominator = f1.denominator*f2.denominator;
        Fraction f = new Fraction(newNumerator, newDenominator);
        return f;
    }
    public static Fraction divide(Fraction f1, Fraction f2){
        int temp = f2.numerator;
        f2.numerator=f2.denominator;
        f2.denominator=temp;
        Fraction f = Fraction.multiply(f1, f2);
        return f;
    }
}
