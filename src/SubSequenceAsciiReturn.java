import java.util.ArrayList;

public class SubSequenceAsciiReturn {
    public static ArrayList<String> subseqasciiret(String p, String up)
    {
        if(up.isEmpty()) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> l=subseqasciiret(p+ch,up.substring(1));
        ArrayList<String> r=subseqasciiret(p,up.substring(1));
        ArrayList<String> f=subseqasciiret(p+(ch+0),up.substring(1));
        l.addAll(r);
        l.addAll(f);
        return  l;
    }
    public static void main(String[] args) {
        System.out.println(subseqasciiret("","abc"));
    }
}
