/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных
массива, и возвращающий новый массив, каждый элемент которого равен
разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить
пользователя.
*/
import java.util.Arrays;

public class program3 {
    public static void main(String[] args) {
        int[] arr1 = {5,4,3,2,1};
//        int[] arr2 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5,9};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(differenceArrays(arr1, arr2)));

    }

    public static int[] differenceArrays(int[] arr1, int[] arr2){

        if(arr1.length != arr2.length){
            throw new RuntimeException("Массивы разной длины");
        }

        int[] resultArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            resultArr[i] = arr1[i]-arr2[i];
        }
        return resultArr;
    }

}
