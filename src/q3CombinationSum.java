import java.util.*;

public class q3CombinationSum {
    static int count=0;
    public static ArrayList<ArrayList<Integer>> resultOfQuestion=new ArrayList<>();
    public static HashSet<ArrayList<Integer>>  set= new HashSet<>();
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            t--;
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            int sum = s.nextInt();
            Arrays.sort(arr);
            ArrayList<Integer> mr = new ArrayList<>();
            solveCombinationSum(arr, 0, sum, mr,0);
            if(count==0) {
                System.out.println("Empty");
        continue;
            }
            count=0;
            set.clear();
            System.out.println();


        }
    }

    public static void solveCombinationSum(int[] arr, int i, int sum, ArrayList<Integer> res,int cs) {

        if (cs>sum|| i >= arr.length) {
            return ;
        }
        if (sum == cs) {
            count++;
          /*  if(set.contains(res))
                return;*/
            System.out.print("(");
            for(int i1=0;i1<res.size();i1++) {
              int a=res.get(i1);
                if(i1==res.size()-1)
                {
                    System.out.print(a+")");
                    continue;
                }
                System.out.print(a+" ");
            }
            set.add(res);
            return;

        }
        solveCombinationSum(arr,i+1,sum,res,cs);
        if (cs+arr[i]<=sum) {
            res.add(arr[i]);
            solveCombinationSum(arr, i+1, sum, res, cs + arr[i]);
            res.remove(res.size()-1);
        }

        }
    }



