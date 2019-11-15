import org.omg.CORBA.MARSHAL;

public class general {
    public static void main(String[] args) {
     //   System.out.println(sumofdigits(253));
     int []arr={2,3,6};
        System.out.println(ropeCut(5,arr,0));


    }

    static int sumofdigits(int n) {
        if (n == 0)
            return 0;
        else
            return (sumofdigits(n / 10) + n % 10);
    }

    static int ropeCut(int n, int[] arr, int ans) {
        if (n == 0)
            return ans;
        if (n < 0)
            return -1;
        int maxans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= n) {
                maxans = Math.max(maxans, ropeCut(n - arr[i], arr, ans + 1));
            }
        }
        return maxans;
    }
}