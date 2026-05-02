public static void Range (int [] nums) {
    int small = nums [0];
    int large = nums [0];

for (int numbers : nums){
    if (numbers < small) small = numbers;  
    if (numbers > large ) large = numbers;
        }
System.out.println (large - small);
    }
public static void main (String [] args){
    int [] nums = {2, 5, 7, 9, 20};
 Range(nums);
}
