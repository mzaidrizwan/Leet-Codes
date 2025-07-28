/*
Given two strings s and t, return true if the two strings are anagrams of each other, otherwise 
return false.

(An anagram is a string that contains the exact same characters
as another string, but the order of the characters can be different.)
*/
public class Valid_Anagram {
    public static void main(String[] args) {
        String a = "racecarr", b = "carracee";
        boolean valid_anagram = true;
        char[] inp1 = a.toCharArray(), inp2 = b.toCharArray();

        int iterateLimit = inp1.length;

        if (iterateLimit == b.length()) {

            for (int i = 0; i < iterateLimit; i++) {
                for (int j = 0; j < iterateLimit; j++) {
                    if (inp1[i] == inp2[j]) {
                        inp1[i] = '-';
                        inp2[j] = '-';
                        break;
                    }
                }
            }

            for (int i = 0; i < iterateLimit; i++) {
                if (inp2[i] != '-') {
                    System.out.println("Not Valid.");
                    valid_anagram = false;
                    break;
                }
            }

            if (valid_anagram) {
                System.out.println("Valid Anagram!");
            }

        } else {
            System.out.println("Inputs are not equal");
        }
    }
}