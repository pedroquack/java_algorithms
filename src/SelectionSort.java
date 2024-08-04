
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {3,6,4,11,1,65,89,32,76,43,32,96,112};
        List<Integer> list = new ArrayList<Integer>();
        for (Integer i : array) {
            list.add(i);
        }
        System.out.println(selection_sort(list));
    }

    public static Integer get_lowest(List<Integer> list){
        Integer lower = list.get(0);
        Integer lower_index = 0;
        for (int i = 0; i < list.size() -1; i++) {
            if(list.get(i) > lower){
                lower = list.get(i);
                lower_index = i;
            }
        }
        return lower_index;
    }

    public static List<Integer> selection_sort(List<Integer> list){
        List<Integer> ordered_list = new ArrayList<Integer>();

        for (Integer i : list) {
            Integer lower_index = get_lowest(list);
            ordered_list.add(lower_index, i);
        }
        return ordered_list;
    }
}
