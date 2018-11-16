package week10;

import java.util.Random;

public class Task2 {

    public static double[] BubbleSort(double a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    double temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        double[] random = new double[10];
        Random numb = new Random();
        for (int i = 0; i < 10; i++) {
            random[i] = Math.ceil(numb.nextDouble()*100 * 10) / 10; 
            System.err.print(random[i] + " ");
        }
        random = Task2.BubbleSort(random);
        System.err.println("_______");
        for (int i = 0; i < 10; i++) {
            System.err.print(random[i] + " ");
        }
    }
}
