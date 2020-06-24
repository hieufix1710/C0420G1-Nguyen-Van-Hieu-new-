package searching_argothim.bai_tap;

public class SetSearchingArgothim {
    public static int searchingArgothim(int[] list,int key){
        int low=0;
        int high=list.length-1;
        while (high>=low){
            int mid=(high+low)/2;
            if (key==mid)
                return mid;
            else if (key<mid){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list={1,2,3,4,9,7,8,6};
        System.out.println( searchingArgothim(list,3));
    }
}
