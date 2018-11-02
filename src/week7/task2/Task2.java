package week7.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.lang.reflect.Array;

public class Task2 {

    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4};
        try {
            MakeArrayIndexOutOfBound(a);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Chi so nam ngoai mang");
        }

        try {
            String str = null;
            MakeNullPointer(str);
        } catch (NullPointerException e) {
            System.out.println("Con tro rong (null pointer)");
        }

        try {
            double x = MakeDivisionArithmetic(1, 0);
        } catch (ArithmeticException e) {
            System.out.println("Loi chia cho 0");
        }

        try {
            MakeClassCast();
        } catch (ClassCastException e) {
            System.out.println("Loi chuyen kieu");
        }

        try {
            MakeFileNotFoundException();
        } catch (java.io.FileNotFoundException e) {
            System.out.print("khong tin thay file");
        }
    }

    public static void MakeFileNotFoundException() throws java.io.FileNotFoundException {
        FileInputStream in = null;
        in = new FileInputStream("");
    }

    public static void MakeNullPointer(Object obj) throws java.lang.NullPointerException {
        if (obj == null) {
            throw new NullPointerException();
        }
    }

    public static void MakeArrayIndexOutOfBound(int a[]) throws java.lang.ArrayIndexOutOfBoundsException {
        int i = -1;
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static double MakeDivisionArithmetic(int a, int b) throws java.lang.ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        } else {
            return a / b;
        }
    }

    public static void MakeClassCast() throws java.lang.ClassCastException {
        Object i = Integer.valueOf(42);
        String s = (String) i;
    }
}
