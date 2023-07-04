import java.util.Arrays;

/*
4. Реализуйте метод, принимающий в качестве аргументов два целочисленных
массива, и возвращающий новый массив, каждый элемент которого равен
частному элементов двух входящих массивов в той же ячейке. Если длины
массивов не равны, необходимо как-то оповестить пользователя.
Важно: При выполнении метода единственное исключение, которое
пользователь может увидеть - RuntimeException, т.е. ваше
*/
public class program4 {
    public static void main(String[] args) {
        int[] arr1 = {5,4,3,2,19,7};
//        int[] arr2 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,10,8};

        System.out.println(Arrays.toString(divisionArrays(arr1, arr2)));
    }

    public static double[] divisionArrays(int[] arr1, int[] arr2){

        if(arr1.length != arr2.length){
            throw new RuntimeException("Массивы разной длины");
        }

        for (int i = 0; i < arr2.length; i++) {
                if(arr2[i] == 0)
                    throw new RuntimeException("В массиве, элементы которого являются делителем обнаружен 0");
        }

        double[] resultArr = new double[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            resultArr[i] = (double)arr1[i]/(double)arr2[i];
        }
        return resultArr;
    }
}
