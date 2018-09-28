package week2.task2;
import week2.task1.Task1;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator;
    private int denominator;
    
    //setter, getter 2 thuộc tính
    public int getNumerator() {
        return this.numerator;
    }
    
    //Getter, setter các thuộc tính
    public void setNumerator(int num) {
        this.numerator = num;
    }
    
    public int getDenominator() {
        return this.denominator;
    }
    
    public void setDenominator(int den) {
        this.denominator = den;
    }
    
    //Hàm tính UCLN
    private int gcd(int a, int b) {
        while (a != b) {
            if (a > b) a -= b;
            else b -= a;
        }
        return a;
    }

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public boolean equals(Fraction other) {
        if((this.denominator/other.denominator == this.numerator/other.numerator) || (this.numerator == 0 && other.numerator ==0)) {
            return true;
        } else {
            return false;
        }
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction result = new Fraction(1,1);
        result.setDenominator(this.denominator * other.denominator);
        result.setNumerator(this.numerator * other.denominator + other.numerator * this.denominator);
        //result.minimize();
        return result;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction result = new Fraction(1,1);
        result.setDenominator(this.denominator * other.denominator);
        result.setNumerator(this.numerator * other.denominator - other.numerator * this.denominator);
        //result.minimize();
        return result;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction result = new Fraction(1,1);
        result.setDenominator(this.denominator * other.denominator);
        result.setNumerator(this.numerator *  other.numerator);
        //result.minimize();
        return result;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction result = new Fraction(1,1);
        result.setDenominator(this.denominator * other.numerator);
        result.setNumerator(this.numerator *  other.denominator);
        //result.minimize();
        return result;
    }
    
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2,3);
        Fraction f2 = new Fraction(4,5);
        Fraction result = f1.subtract(f2);
        System.out.println(result.getNumerator() + "/" + result.getDenominator());
    }
}
