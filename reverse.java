public class reverse {
    public static int []  ram(int []arr){
        int i=0,j=arr.length-1;
       while(i<j){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
       }
return arr ;
    }

    public static void main(String[] args) {
        int arr[]={8,7,6,5,4,3,2,1};
        int rev[] =ram(arr);
        for(int ele:arr){
            System.out.println(ele);
        }
    }
}
