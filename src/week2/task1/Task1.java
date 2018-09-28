package week2.task1;

public class Task1 {

    //Hàm tính UCLN của 2 số a,b
    public static int gcd(int a, int b) {
        if (a >= 0 && a >= 0) {
            while (a != b) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
            return a;
        } else {
            if(a<0) a = -a;
            if(b<0) b = -b;
            while (a != b) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
            return a;
        } 
    }

    //Hàm tính fibonacci bằng đệ quy
    public static int fibonacci(int n) {
        if( n == 0 ) return 0;
        return n == 1 ? 1 : fibonacci( n - 1 ) + fibonacci( n - 2 );
    }
}
