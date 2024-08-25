// a program to count and display vowels and consonants
import java.util.*;

class  VowelConsonantCounter{
    public static void main(String[] args) {
        String s, st, str = "", p;
        char c, ch;
        int i, j, m, n, t = 0, vol, con;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence terminated by '.' or '?'");
        
        s = in.nextLine();
        m = s.length();

        

        if (s.charAt(m - 1) == '.' || s.charAt(m - 1) == '?') {
            for (i = 0; i < m; i++) {
                c = s.charAt(i);
                if (c == ' ' || c == '.' || c == '?') {
                    p = s.substring(t, i);
                    st = Character.toUpperCase(p.charAt(0)) + p.substring(1);
                    str = str + ' ' + st;
                    t = i + 1;
                }
            }

            System.out.println(str);
            p = "";
            System.out.println("Words\t" + "Vowels\t" + "Consonants");

            str = str.trim();
            str = str + ' ';
            m = str.length();
            
            for (i = 0; i < m; i++) {
                c = str.charAt(i);
                if (c != ' ') {
                    p = p + c;
                } else {
                    n = p.length();
                    vol = 0;
                    for (j = 0; j < n; j++) {
                        ch = p.charAt(j);
                        if ("AEIOUaeiou".indexOf(ch) >= 0) {
                            vol++;
                        }
                    }
                    con = n - vol;
                    System.out.println(p + "\t" + vol + "\t" + con);
                    p = "";
                }
            }
        } else {
            System.out.println("Invalid Input!!");
        }
    }
}
