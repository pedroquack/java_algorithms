

public class BinarySearch {
    public static void main(String[] args) throws Exception {
        int[] list = {1,4,7,10,12,16,21,29,36,46,52,69};
        Integer search = (binary_search(list, 21));
        System.out.println(search);
        System.out.println(list[search]);
    }
    public static Integer binary_search(int[] list, Integer target){

        Integer top = list.length;
        Integer bottom = 0;
        while (bottom <= top) {
            Integer middle = (bottom + top) / 2;
            Integer kick = list[middle];

            if(kick == target){
                return middle;
            }
            if(kick > target){
                top = middle - 1;
            }else{
                bottom = middle + 1;
            }
        }
        

        return null;
    }
}
