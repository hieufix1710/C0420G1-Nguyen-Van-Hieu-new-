package searching_argothim.thuc_hanh;

public class LinearSearching {
    public  int linerSearching(int[] list,int value){
        for (int i = 0; i <list.length ; i++) {
            if (list[i]==value)
                return i;
        }
        return -1;

    }
}
