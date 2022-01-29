public class MoveZeroes {
    public static void main(String[] args) {
        int arr[] = {73348,66106,-85359,53996,18849,-6590,-53381,-86613,-41065,83457,0};
        int R = 0, temp = 0, L = 0;
        while (R < arr.length) {
            if (arr[R] == 0 && L == R) {
                L = R;
            }
            if (arr[R] != 0) {
                temp = arr[R];
                arr[R] = arr[L];
                arr[L] = temp;
                L += 1;
            }
            R += 1;
        }
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
}
