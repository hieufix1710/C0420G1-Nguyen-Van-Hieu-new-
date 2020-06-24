package searching_argothim.bai_tap;

import javax.xml.bind.annotation.XmlID;

public class TestSearchingArgothim {
    public static int searchingArgothim(int[] list,int  value){
        int low=0;
        int high=list.length-1;

        while (high>=low){
            int mid=(low+high)/2;
            if (value==mid)
                return mid;
            else if(value<list[mid]){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list={1,5,6,4,2,3,4,8};
        System.out.println(searchingArgothim(list,5));
    }

}
