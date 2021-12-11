public class Bubble {
    public static void main(String[] args) {
        int[] nums = {65, 225, 66, 178, 735, 361, 497};
        char t;
        int a;
        int b;  //цикл
        int size = 7;   //количество сортируемых элементов

        //Отображение исходного массива
        System.out.println("Исходный массив: ");
        for (int i : nums)
            System.out.println(" " + i);
        System.out.println();

        //Аогоритм сортировки пузырьком
        for(a = 1; a < size; a++)
            for (b = size-1; b >= a; b--){
            if (nums[b-1] > nums[b]){
                //если требуемый порядок не соблюдается,
                //поменять элементы местами
                t = (char) nums[b-1];
                nums[b-1] = nums[b];
                nums[b] = t;
            }
        }
        // fgsdfgsd
        //Отобразить отсортированный массив
        System.out.println("Осортированный массив: ");
        for (int i = 0; i < size; i++) System.out.println(nums[i]);
        System.out.println(5);
    }
}
