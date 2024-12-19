public class floor {
    public static void main(String[] args) {
        int[]arr={23,43,55,67,88,99,100};
        int target=87;
        int num=ceiling(arr, target);
        System.out.println(num);
    }
    static int ceiling(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(target<arr[mid]){
              end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }

        }
        return end;
    }

}
