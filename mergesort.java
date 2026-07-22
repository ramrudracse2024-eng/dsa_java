class mergesort{
    public static void main(String[] args) {
        int []arr={1,3,5,7};
        int []brr={2,4,6,8};
        int a=arr.length;
        int b=brr.length;
        int [] krr=new int[a+b];
        int i=0,j=0,k=0;
        while(i<a && j<b){
            if(arr[i]<brr[j]){
                krr[k]=arr[i];
                i++;
                k++;
            }
            else{
                krr[k]=brr[j];
                j++;
                k++;
            }
        }
        while(i<a){
            krr[k]=arr[i];
            i++; k++;
        }
        while(j<b){
            krr[k]=brr[j];
            j++;k++;
        }
        for(int ele:krr){
            System.out.println(ele);
        }
    }
}