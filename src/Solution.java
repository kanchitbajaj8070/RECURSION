import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the crosswordPuzzle function below.
    static String[] crosswordPuzzle(String[] crossword, String words) {
        String [] newWords=words.split(";");
        ArrayList<String> newWordsi=new ArrayList<String>();
        for(String abc:newWords)
            newWordsi.add(abc);
        solveUtil(crossword,crossword.length,crossword[0].length(),0,0,newWordsi,0);
return crossword;
    }
    static boolean isValid(int i ,int j,    String []crossword)
    {
        if(i>=0&&i<crossword.length&&j>=0&&j<crossword[0].length())
        return true;
        return false;
    }
    static void solveUtil(String[] crossword , int n , int m, int i ,int j,ArrayList<String> words,int ca)
    {
        if(!isValid(i,j,crossword))
        return;
        if(isValid(i,j,crossword)&&crossword[i].charAt(j)=='-'&&words.size()>0)
        {
            solveUtil(crossword,n,m,i+1,j,words,ca+1);
            for(String w:words)
            {
                if(w.length()==ca)
                {
                    for(int k=0;k<w.length();k++)
                    {
                        crossword[i-k].replace(crossword[i-k].charAt(j),w.charAt(w.length()-1-k));
                    }
                    words.remove(w);
                    continue;
                }
            }
            solveUtil(crossword,n,m,i,j+1,words,ca+1);
            {
                for(String w:words)
                {
                    if(w.length()==ca)
                    {
                        for(int k=0;k<w.length();k++)
                        {
                            crossword[i].replace(crossword[i].charAt(j+k),w.charAt(k));
                        }
                        words.remove(w);
                        continue;
                    }
                }
            }
        }
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] crossword = new String[10];

        for (int i = 0; i < 10; i++) {
            String crosswordItem = scanner.nextLine();
            crossword[i] = crosswordItem;
        }

        String words = scanner.nextLine();

        String[] result = crosswordPuzzle(crossword, words);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

