//A program to count the number of words and consonants
import java.util.*;

class TheString {
    String str;
    int len, wordcount, cons;

    TheString() {
        str = "";
        len = 0;
        wordcount = 0;
        cons = 0;
    }

    TheString(String ds) {
        str = ds;
    }
    //method to count number of words and number of consonants
    void countFreq() {
        char c;
        str = str + ' ';
        len = str.length();
        for (int i = 0; i < len; i++) {
            c = str.charAt(i);
            if (c == ' ') {
                wordcount++;
            } else if ("AEIOUaeiou".indexOf(c) >= 0) {
                continue;
            } else {
                cons++;
            }
        }
    }

    void display() {
        System.out.println("Original string: " + str);
        System.out.println("Frequency of words: " + wordcount);
        System.out.println("Frequency of consonants: " + cons);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = in.nextLine();
        TheString ob = new TheString(s);
        ob.countFreq();
        ob.display();
    }
}
