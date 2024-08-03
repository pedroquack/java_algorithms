import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] unorded_list = { 6, 3, 1, 19, 26, 99, 43, 132, 8, 35, 54, 69 };
        System.out.println(Arrays.toString(unorded_list));
        System.out.println(Arrays.toString(selection_sort(unorded_list)));
    }


    public static int lower_search(int[] list){
        Integer lower = list[0];
        Integer lower_index = 0;
        for(int i = 0; i < list.length; i++){
            if (list[i] < lower) {
                lower = list[i];
                lower_index = i;
            }
        }
        return lower_index;
    }

    public static int[] selection_sort(int[] list){
        int[] ordered_list = new int[list.length];
        for(int i = 0; i < list.length; i++){
            int lower = lower_search(list);
            ordered_list[i] = list[lower];
            System.out.println(list[i]);
        }
        return ordered_list;
    }
}
