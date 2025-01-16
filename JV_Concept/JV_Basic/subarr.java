import java.util.*;

class Result {
    public static int sub(int maxSum,int k,int[] arr) {
        int count=0;
        for (int i=0;i<=arr.length-k;i++) {
            int sum=0;
            for (int j=i;j<i+k;j++) {
                sum+=arr[j];
            }
            if (sum<=maxSum) {
                count++;
            }
        }
        return count;
    }
}

public class subarr {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n=scan.nextInt();
            int k=scan.nextInt();
            
            int maxSum=scan.nextInt();
            int[] arr=new int[n];
            for (int i=0; i<n; i++) {
                arr[i]=scan.nextInt();
            }
            for (int i=0;i<arr.length;i++) {
                if (arr[i]%2==0) {
                    arr[i]-=1; // Modifies the actual array element
                }
            }
            System.out.println("Modified array: " + Arrays.toString(arr));
            
            int result = Result.sub(maxSum, k, arr);
            System.out.println(result);
        }
    }
}
