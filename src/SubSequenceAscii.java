import java.util.ArrayList;

public class SubSequenceAscii {
    public static void subseqascii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqascii(p + ch, up.substring(1));
        subseqascii(p, up.substring(1));
        subseqascii(p + (ch+0), up.substring(1));
    }

    public static void main(String[] args) {
        subseqascii("", "abc");
    }
}
