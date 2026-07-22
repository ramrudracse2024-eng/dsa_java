public class wave_array {
    public static int[] ram(int []arr){
        int i=0,j=1;
        while(j<arr.length){
            if(arr[i]<arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i+=2;
                j+=2;
            }
            else{
                i+=2;
                j-=2;

            }
          }
return arr;
}
public static void main(String[] args) {
    int []arr={1,2,3,4,5,6,7};
    int []rot=ram(arr);
    for(int ele:arr){
        System.out.println(ele);
    }

}
}

