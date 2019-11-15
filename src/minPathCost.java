import java.util.Scanner;

public class minPathCost {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        int[][] m=new int[n][n];
        int [][] dp=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                m[i][j]=s.nextInt();
                dp[i][j]=m[i][j];
            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                int a=Integer.MAX_VALUE;
                int b=Integer.MAX_VALUE;
                int c=Integer.MAX_VALUE;
                if(i-1>=0)
                    a=dp[i-1][j];
                if(j-1>=0)
                    b=dp[i][j-1];
                if(i-1>=0&&j-1>=0)
                    c=dp[i-1][j-1];
                int d=Math.min(Math.min(a,b),c);
                 if(d!=Integer.MAX_VALUE)
                     dp[i][j]+=d;

            }
        }
        System.out.println("path sum" + dp[n-1][n-1]);
    }
}
