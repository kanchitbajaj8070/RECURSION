import java.util.ArrayList;
import java.util.Scanner;
public class q4SpecialKeyboard {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n < 7) {
            System.out.println(n);
        }
        else
        {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            a.add(i + 1);
        }
        int o = 6;
        int max = Integer.MIN_VALUE;
        for (int i = 6; i < n; i++)
        {   int maxj=0;
            for (int j = 1; j < i; j++) {
                int m1 = 0;
                if(j==1)
                    m1=a.get(i - j) + 1;
                else
                    m1=j*a.get(i-j-1);
                maxj=Math.max(maxj,m1);
            }
            a.add(maxj);
            max=Math.max(max,maxj);
        }
        System.out.println(max);    }
}}
