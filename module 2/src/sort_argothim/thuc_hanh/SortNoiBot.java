package sort_argothim.thuc_hanh;

public class SortNoiBot {
    public static void bubbleSort(int[] list){
        boolean needNextPass=true;
        for (int i = 1; i <list.length &&needNextPass; i++) {
            needNextPass=false;
            for (int j = 0; j <list.length-i ; j++) {
                    if (list[j]>list[j+1]){
                    int temp=   list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;

                    needNextPass=true;
                }
                
            }

        }
    }

    public static void main(String[] args) {
        int[ ]list={1,-1,5,2,7,8};
        bubbleSort(list);
        for (int a:list
             ) {
            System.out.println(a);

        }
    }

}
