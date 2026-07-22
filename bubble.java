import com.sun.security.jgss.GSSUtil;

public class bubble {
    public static int[] ram(int []arr) {
        int n = arr.length;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n - j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={2,1,3,6,44,9,0,1,-99};
        int bbl[]=ram(arr);
 for(int ele:arr){
     System.out.println(ele);
 }
    }
}
