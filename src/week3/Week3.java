package week3;

public class Week3 {

    public static int max(int m, int n) {
        if (m >= n) {
            return m;
        } else {
            return n;
        }
    }

    public static int minOfArray(int[] array) {

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     *
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        double bmi;
        String result;
        bmi = weight / (height * height);
        if (bmi < 18.5) {
            result = "Thieu can";
        } else if (bmi >= 18.5 && bmi < 23) {
            result = "Binh thuong";
        } else if (bmi >= 23 && bmi < 24.99) {
            result = "Thua can";
        } else {
            result = "Beo phi";
        }
        return result;
    }

}
