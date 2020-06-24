package searching_argothim.thuc_hanh;

public class BinarySearching {
    public static int binarySearching(int[] list, int key){
        int low=0;
        int high=list.length-1;
        while (high>=low){
            int mid=(low+high)/2;
            if (key<list[mid]){
                high=mid-1;                           // not use de quy

            }
            else if (key==list[mid]){
                return mid;
            }
            else
                low=mid+1;
        }
        return -1;//not found
    }

    public static int binarySearchingg(int[] list,int low,int high,int key){
        low=0;
        high=list.length-1;
        int mid=(low+high)/2;
        if (high>=low){
            if (list[mid]==key){
                return mid;
            }
            if (key<list[mid]){
               return binarySearchingg(list,low,mid-1,key);
            }
            if (key>list[mid]){
                return binarySearchingg(list,mid+1,high,key);
            }
        }
        return -1;//not found


    }
}
