public class missing {
    public static int  ram(int []arr) {
        int n=arr.length;
        int x=0;
       int sum=(n+1)*(n+2)/2;
       for(int i=0;i<arr.length;i++){
           x +=arr[i];
       }
      int missing =(sum-x);

return missing;
    }

    public static void main(String[] args) {
        int []arr={1,2,4,5,6,7,8};
        int missing=ram(arr);
        System.out.println(missing);
    }
}
