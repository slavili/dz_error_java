/*
2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут
сможете получить?
*/

public class program2 {
    public static void main(String[] args) {

    }

    public static int sum2d(String[][] arr){
        // исключение при передачи null
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {// исключение выход за границы массива, т.к. здесь используется магическое число
                int val = Integer.parseInt(arr[i][j]);// исключение невозможность конверации строки в integer
                sum+=val;
            }
        }
        return sum;
    }
}
