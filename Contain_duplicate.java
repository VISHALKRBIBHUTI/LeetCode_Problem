import java.util.HashSet;


public class Contain_duplicate{

    public static boolean Duplicate(int[] nums){
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
} 
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(Duplicate(nums)); 
    }
}