import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MatchGenerator;

public class maxPowerSum {
    public static void main(String[] args) {
        int x=100;
        int n=2;
        System.out.println(  solve(x,n,0,1));


    }
    public static int solve( int x, int n,int cs,int ci)
    {
        if(cs>x)
            return 0;
        if(cs==x)
            return 1;
        int rans=0;
        int ma=0;
        for (int i = ci; Math.pow(i,n)<=x-cs; i++) {
            rans+=solve(x,n, (int) (cs+Math.round(Math.pow(i,n))),i+1);
        }

return Math.max(rans,ma);
    }
}
