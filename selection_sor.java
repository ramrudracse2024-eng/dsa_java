public class selection_sor {
    public static int [] ram(int []arr){
        int n = arr.length;
        for(int i=0;i<n;i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[]={5,3,7,33,88,3,9,0};
        int ss[]=ram(arr);
        for(int ele:arr){
            System.out.println(ele);
        }
    }
}
