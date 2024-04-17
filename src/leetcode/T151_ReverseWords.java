package leetcode;

public class T151_ReverseWords {
    public String reverseWords(String s) {
        StringBuffer sb = removeSpace(s);
        reverse(sb,0,sb.length());
        int slow = 0, fast = 0;
        boolean need = false;
        for (; fast < sb.length(); fast++) {
            if (sb.charAt(fast) == ' ') {
                reverse(sb, slow, fast);
                need = true;
                continue;
            }
            if (need) {
                if (sb.charAt(fast) != ' ') {}
            }
        }



        return s;
    }
    public StringBuffer removeSpace(String s) {
        int fast = 0, slow = 0;
        StringBuffer sb = new StringBuffer();
        boolean need = false;
        for (; fast < s.length(); fast++) {
            if (!" ".equals(s.charAt(fast))) {
                sb.append(s.charAt(fast));
                need = true;
                continue;
            }
            if (need) {
                sb.append(" ");
                need = false;
            }
        }
        if (" ".equals( sb.charAt( sb.length() -1 ))) {
            sb.delete(sb.length() - 1,sb.length());

        }
        return sb;
    }
    private void reverse(StringBuffer sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start ++;
            end --;
        }
    }

        public static void main(String[] args) {

    }
}
