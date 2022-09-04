public class FindOdd {


    public static int[] SpOdd(int[] arr){
        int len = arr.length;
        int indx = 0;
        //Save odd element into the original array
        for(int i = 0;i<len;i++){
            if((arr[i]%2)!=0){
                arr[indx] = arr[i];
                indx++;
            }
        }
        //Transfer odd elements from original array to new array with fixed size (num of odds)
        int[] odd = new int[indx];
        for(int i = 0;i<indx;i++){
            odd[i] = arr[i];
        }
        return odd;
    }

    public static void main(String[] args){
        //test case
        int[] nums = new int[]{3,8,5,7,1,9,2};
        int[] odd = SpOdd(nums);
        for(int num: odd){
            System.out.print(num + " ");
        }
    }

}
