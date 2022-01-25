
public class SearchInsert {

    public static void main(String args[]) {
        int arr[] = {1, 3, 5, 6};
        int mid, target = 7, l = 0, r = arr.length - 1;

        while (l <= r) {
            mid = l + (r - l) / 2;
            if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
            
        }
System.out.println(r+1);
    }
}
