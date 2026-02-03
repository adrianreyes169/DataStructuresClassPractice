package arrayPrac;

public class arrays {  

    public static  int binarySearch(int[] array, int target){
    int low = 0;
    int high = array.length -1;
    while(low <= high){
        int mid = (low + high) / 2;
        if (array[mid] == target){
            return mid;
        }

        if (array[mid] < target){
            low  = mid + 1;
        }

        if (array[mid] > target){
            high = mid - 1;
        }
    }
    return -1;
        
} 
 public static void main(String[] args) {
    
        int[] nums = {3,4,20,23,44,54,56,78};
        System.out.println(binarySearch(nums,23));
    }
}
