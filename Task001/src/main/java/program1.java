/*
1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
*/
public class program1 {
    public static void main(String[] args) {

        System.out.println(divideFunc(27,3));//вторым параметром введите 0

        //String s = "w456";
        //String s = "0";
        String s = "456";

        System.out.println(divideFunc(27000,stringToInt(s)));

        int[] ints = {1,2,3,4,5};

        printArray(ints);

    }

    public static int divideFunc(int i, int j){
        return i/j;//исключение деление на ноль
    }

    public static int stringToInt(String string){
        return Integer.parseInt(string);// исключение невозможности конвертации
    }

    public static void printArray(int[] arr){
        for (int i = 0; i <= arr.length; i++) {// исключение выход за границы массива
            System.out.println(arr[i]);
        }
    }

}
