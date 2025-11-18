public class CountGreaterThanAverage {

    public static int countGreater(int[] arr) {
        if (arr == null || arr.length < 2) return 0;

        int count = 0;
        long sum = arr[0];  

        for (int i = 1; i < arr.length; i++) {
            double avg = (double) sum / i;   

            if (arr[i] > avg) {
                count++;
            }

            sum += arr[i];  
        }

        return count;
    }

    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};

        System.out.println(countGreater(responseTimes)); 
    }
}
