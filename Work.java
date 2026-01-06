package Eduson; //тест коменетариев 


class Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.print("Прямой порядок: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Обратный порядок: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}


class MinMax {
    public static void main(String[] args) {
        int[] array = {1, 7, 15, 8, 21, 3};
        if (array.length == 0) {
            System.out.println("Массив пуст");
            return;
        }
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }
}


class MinMaxIndex{
    public static void main (String[]args){
        int[] array = {1, 7, 15, 8, 21, 3};
        if (array.length == 0) {
            System.out.println("Массив пуст");
            return;
        }
        int minValue = array [0];
        int maxValue = array [0];
        int minIndex = 0;
        int maxIndex = 0;

        for ( int i = 1; i < array.length; i++){
            if (array[i] < minValue){
                minValue = array[i];
                minIndex = i;
            }
            if (array[i] > maxValue){
                maxValue = array[i];
                maxIndex = i;
            }
        }
    System.out.println("Минимальное число: "+ minValue + "; Индекс: " + minIndex);
    System.out.println("Максимальное число: " + maxValue + "; Индекс: " + maxIndex);

    }
}


class CounterZero{
    public static void main (String[] args){
        int[] array = {1, 0, 4, 0, 0, 7, 6};
        int CountZero = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                CountZero++;
                }
            }
        if (CountZero == 0) {
            System.out.println("Нулевых элементов нет");
        } else {
            System.out.println("Количество нулевых элементов: " + CountZero);
        }
    }
}


class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Массив: ");
        printArray(arr);

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("Развёрнтый массив: ");
        printArray(arr);
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}


class IncreasingTheSequence {
    public static boolean IncreasingTheSequence(int[] arr) {
        if (arr.length <= 1) {
            return true;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] test = {1, 3, 5, 7, 9};
        int[] test1 = {6, 5, 4, 3, 2};
        System.out.println(IncreasingTheSequence(test));
        System.out.println(IncreasingTheSequence(test1));
    }

}

