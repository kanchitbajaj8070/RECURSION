import java.util.Scanner;

public class FloodFill {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        while (t>0)
        { t--;
           int n=s.nextInt();
           int m=s.nextInt();
           int [][]a=new int[n][m];
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j < m ; j++) {
                    a[i][j]=s.nextInt();

                }
            }
            int x=s.nextInt();
            int y=s.nextInt();
            int newk=s.nextInt();
            int oldk=a[x][y];
            pixelChange(a,n,m,x,y,oldk,newk);
            print(a,n,m);
        }

    }
    public static void print(int[][]a,int n,int m)
    {
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]+" ");
            }
        }
        System.out.println();
    }
    public static void pixelChange(int[][]a,int n,int m,int x,int y,int oldk,int newk)
    {
        if(x>=n||y>=m||x<0||y<0)
            return;
        if(a[x][y]!=oldk)
            return;
        a[x][y]=newk;
        pixelChange(a,n,m,x+1,y,oldk,newk);
        pixelChange(a,n,m,x,y+1,oldk,newk);
        pixelChange(a,n,m,x-1,y,oldk,newk);
        pixelChange(a,n,m,x,y-1,oldk,newk);

    }

}
