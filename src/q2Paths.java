
import java.util.Scanner;

public class q2Paths {
    public static void main(String[] args) {
Scanner s= new Scanner(System.in);
    int t=s.nextInt();
    while(t>0)
    {
        t=t-1;
      int m=s.nextInt();
      int n=s.nextInt();
      char [][]a= new char[m][n];
      for(int i=0;i<m;i++)
      {
          for(int j=0;j<n;j++)
          {
              a[i][j]=(char)('A'+i*n+j);
          }
      }
     StringBuilder sb= new StringBuilder();
   solvePaths(a,m,n,0,0,sb);
   System.out.println(count);
   count=0;
    }
    }
 static int count =0;
    private static void solvePaths(char[][] a, int m, int n, int i, int j,StringBuilder sb) {
    if(i==m-1&&j==n-1)
    {
        System.out.print(sb.toString()+a[i][j]+"    ");//coz not including last
        count++;
    }
    if(i<0||j<0||i>=m||j>=n)
    {
        return;
    }
    sb=sb.append(a[i][j]);
    solvePaths(a,m,n,i,j+1,sb);
    solvePaths(a,m,n,i+1,j,sb);
    sb.deleteCharAt(sb.indexOf(a[i][j]+""));
    }
}
