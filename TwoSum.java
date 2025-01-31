public class TwoSum {

    public static int[] Sum(int[] arr,int target){
        int[] newArr = new int[2];
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
               if(arr[i]+arr[j] == target){
                newArr[0] = i;
                newArr[1] = j;
               }
            }
        }
        return newArr;
    }
    
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target =9;
        int[] result = Sum(arr, target);
        System.out.println("["+result[0]+","+result[1]+"]"); 
    }
}
