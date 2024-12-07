package Homework_3;

public class Homework {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int index = 9;

        try {
            int element = array[index];
            System.out.println("ამ ინდექსზე არის: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("მასივის მაქსიმალურ ინდექს გადაცდი");
        }





        int[] array1 = {10, 20, 40, 40, 50};
        int[] array2 = {2, 0, 5, 13, 0};

        for (int i = 0; i < array1.length; i++) {
            try {
                int result = array1[i] / array2[i];
                System.out.println(result);
            } catch (ArithmeticException ae) {
                System.out.println(array2[i] = 0);  //მასწავლებელს ვკითხო!  + "ნულზე გაყოფაა"  - შეცდომა გამოიტანა
            }
        }







    }
}
