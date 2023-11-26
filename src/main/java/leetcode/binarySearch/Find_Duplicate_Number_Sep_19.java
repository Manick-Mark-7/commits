package leetcode.binarySearch;

public class Find_Duplicate_Number_Sep_19 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,3,2};
        int ans = findDuplicate(arr);
        System.out.println(ans);
    }

    private static int findDuplicate(int[] arr) {
        //using slow fast pointer approach
        int slow=arr[0],fast = arr[0];
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow!=fast);

        slow = arr[0];
        while(slow!=fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;

    }
}
