package sort_argothim.thuc_hanh;

public class InsertionSort {
    public static void insertionSort(int[] list){
        for (int i = 1; i <list.length ; i++) {
            int currentElement=     list[i];
            int k;
            for (k=i-1;k>=0&&list[k]>currentElement;k--){
                list[k+1]=list[k];
            }
            list[k+1]=currentElement;

        }
    }

    public static void main(String[] args) {
        int[] list={1,5,3,6,-1};

        insertionSort(list);
        for (int a:list
             ) {
            System.out.println(a);

        }
    }

}
