import java.util.ArrayList;

public class grayodes {
    public static void main(String[] args) {
        sol(4,"",true);
        System.out.println(abc.toString());
    }
    public static ArrayList<String> abc= new ArrayList<>();
    public static void sol(int n,String path,boolean isLeft)
    {
        if(n==0)
        {
            abc.add(path);
            return;
        }
        if(isLeft)
        {
            sol(n-1,path+"0",true);
            sol(n-1,path+"1",false);
        }
        else
        {
            sol(n-1,path+"1",true);
            sol(n-1,path+"0",false);
        }


    }
}
/* 0000 0001 0011 0010 0110 0111 0101 0100 1100 1101 1111
  1110 1010 1011 1001 1000*/