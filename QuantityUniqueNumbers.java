package homework6;

public class QuantityUniqueNumbers {


    public static void main(String[] args) {


            int array[] = {1, 2, 1, 3, 6, 7, 2, 4, 2, 4, 5, 46, 2, 1};
            //sort
            int destinationSize = 0;
            int[] destinationArray = new int[array.length];
            for (int n = 0; n < array.length; n++) {

                // Ищем место для вставки
                int insertIndex = 0;
                if (destinationSize > 0) {
                    while (insertIndex < destinationSize && destinationArray[insertIndex] < array[n]) {
                        insertIndex++;
                    }
                }

                // Вставка
                for (int m = destinationSize - 1; m >= insertIndex; m--) {
                    destinationArray[m + 1] = destinationArray[m];
                }
                destinationArray[insertIndex] = array[n];
                destinationSize++;
            }


            int uniqueNumber = destinationArray.length; // создаём переменную с начальным значение, равным размеру массива (предолагаем, что все уникальны значения)
            for (int i = 1; i < destinationArray.length; i++) { // пробегаемся по массиву
                if (destinationArray[i - 1] == destinationArray[i])
                    uniqueNumber--; // если смежные элементы равны, то значение uniqueNumber уменьшаем на единицу
            }
        System.out.println(uniqueNumber);



    }
}
