import java.lang.reflect.Array;
import java.util.ArrayList;

public class permuteStrings {
    public static void main(String[] args) {
        System.out.println(ps("abc").toString());

    }
   public static ArrayList<String> permutations= new ArrayList<>();
    public static ArrayList<String> ps(String a) {
        if (a.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char c = a.charAt(0);
        String ros = a.substring(1);
     ArrayList<String> myres= new ArrayList<>();
     ArrayList<String> rrR= ps(ros);
        for (int i = 0; i < rrR.size(); i++) {
            myres.add(rrR.get(i)+c);
            for (int j = 0; j < rrR.get(i).length() ; j++) {
                myres.add(rrR.get(i).substring(0,j)+c+rrR.get(i).substring(j,rrR.get(i).length()));
            }
        }
        return myres;
    }

    }

