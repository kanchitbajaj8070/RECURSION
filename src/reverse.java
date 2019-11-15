public class reverse {
    public static void main(String[] args) {
        String a="aabaa";
        String b="geeks";
        System.out.println(palinCheck(a));
        System.out.println(palinCheck(b));
    }

    private static boolean palinCheck(String a) {
        if(a.length()==0||a.length()==1)
            return true;
        if(a.charAt(0)!=a.charAt(a.length()-1))
            return false;
            return palinCheck(a.substring(1,a.length()-1));
    }
}
