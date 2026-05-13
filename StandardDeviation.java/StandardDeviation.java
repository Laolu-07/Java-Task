public class StandardDeviation {

    public static void main(String[] args) {
        double[] data = {2, 4, 4, 4, 5, 5, 7, 9};

        double mean = mean(data);
        double variance = variance(data, mean);
        double stdDev = standardDeviation(variance);

        System.out.println("Mean: " + mean);
        System.out.println("Variance: " + variance);
        System.out.println("Std Dev: " + stdDev);
    }
    public static double mean(double[] nums) {
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum / nums.length;
    }
    public static double sumSquaredDiff(double[] nums, double mean) {
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            double diff = nums[i] - mean;
            sum += diff * diff;
        }
        return sum;
    }
    public static double variance(double[] nums, double mean) {
        double sumSqDiff = sumSquaredDiff(nums, mean);
        return sumSqDiff / (nums.length - 1);
    }

    public static double standardDeviation(double variance) {
        return Math.sqrt(variance);
    }
}
