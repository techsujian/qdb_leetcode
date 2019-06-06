import java.util.Map;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s==null || s.equals("")){
            return s;
        }
        char[] ch=s.toCharArray();
        int len = ch.length;
        /**
         * 找回文串
         */
        int max=1;
        int begin=0;
        int end=0;
        for (int inter_i=0;inter_i<len;inter_i++){
            /**
             * 模式一
             */
            int temp_max=1;
            int temp_begin=inter_i;
            int temp_end=inter_i;
            if (inter_i+1<len && ch[inter_i]==ch[inter_i+1]){
                temp_max=2;
                temp_begin=inter_i;
                temp_end=inter_i+1;
                while (temp_begin-1>-1 && temp_end+1<len && ch[temp_begin-1]==ch[temp_end+1]){
                    temp_begin--;
                    temp_end++;
                    temp_max+=2;
                }
                if (temp_max>max){
                    max = temp_max;
                    begin=temp_begin;
                    end=temp_end;
                }
            }
            /**
             * 模式二
             */
            if (inter_i-1>-1 && inter_i+1<len && ch[inter_i-1]==ch[inter_i+1]){
                temp_max=1;
                temp_begin=inter_i;
                temp_end=inter_i;
                while (temp_begin-1>-1 && temp_end+1<len && ch[temp_begin-1]==ch[temp_end+1]){
                    temp_begin--;
                    temp_end++;
                    temp_max+=2;
                }
                if (temp_max>max){
                    max = temp_max;
                    begin=temp_begin;
                    end=temp_end;
                }
            }
        }
        return s.substring(begin,end+1);
    }

    public static void main(String[] args){
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("aaaa"));
    }
}
