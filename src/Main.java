public class Main
{
    public static void main(String[] args) {
        int []a={1,1,2,3,3};
        int e=a[0];
        for(int i=1;i<a.length;i++)
        {
            e=e^a[i];
        }
        System.out.println(e);
    }
}
