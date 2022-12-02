## ANNOTATION

# Bubble Sort
 __Bubble Sort__ - Алгоритм для сортування масиву. А саме у поданому наборі даних 
 (списку чи масиві) порівнюються два сусідні елементи. Якщо один з елементів, не 
 відповідає критерію сортування (є більшим, або ж, навпаки, меншим за свого сусіда), 
 то ці два елементи міняються місцями. Прохід по списку продовжується доти, доки дані
 не будуть відсортованими. Алгоритм отримав свою назву від того, що процес сортування 
 за ним нагадує поведінку бульбашок повітря у резервуарі з водою. Оскільки для роботи
 з елементами масиву він використовує лише порівняння, це сортування на основі 
 порівнянь. 
 
    public int[] main(String[] args){
    int [] array = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

# Insert Sort
 __Insert Sort__ - алгоритм для сортування масиву. На кожному кроці алгоритму ми 
 вибираємо один з елементів вхідних даних і вставляємо його на потрібну позицію у вже 
 відсортованому списку доти, доки набір вхідних даних не буде вичерпано. Метод вибору
 чергового елементу з початкового масиву довільний; може використовуватися практично 
 будь-який алгоритм вибору. Зазвичай (і з метою отримання стійкого алгоритму 
 сортування), елементи вставляються за порядком їх появи у вхідному масиві.

    public int[] main(String[] args) {
    int [] arr = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }

        for (int i = 1; i < arr.length; i++){
            int actual = arr[i];
            int j = i;
            while (j > 0 && arr[j -1] > actual) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = actual;
        }
        return arr;
    }

# Main
__Main__ - у класі __Main__ викликаються функції сортування та виводиться їх результат.

    public static void main(String[] args) {
           
        BubbleSorted bubbleSorted = new BubbleSorted();
        int [] array = bubbleSorted.main(args);

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] +" ");
        }

        System.out.println(" ");
          
        InsertSort insertSort = new InsertSort();
        int [] arr = insertSort.main(args);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }