import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class group_anagram {
    public static void main(String[] args) {
        String[] group = { "act", "cat" };
        anagram_identifier(group);

    }

    static void anagram_identifier(String[] group) {

        ArrayList<String[]> resultant_Array = new ArrayList<>();

        String[] a = { "abc" };

        for (int i = 0; i < group.length; i++) {

            char[] toFocus = group[i].toCharArray();

            for (int j = 0; j < group.length; j++) {

                if (i == j)
                    continue;
        
                    char[] toCheck = group[j].toCharArray();

                if (toFocus.length == toCheck.length) {
                    boolean found = false;


















                    for (int k = 0; k < toCheck.length; k++) {

                        for (int k2 = 0; k2 < toCheck.length; k2++) {

                            if (toFocus[k] == toCheck[k2] && toFocus[i] != '-') {
                                found = true;
                                toFocus[i] = '-';
                                toCheck[j] = '-';
                            }
                        }



                        if (!found) {
                            break;
                        }
                    }
                }
            }
        }

        resultant_Array.add(a);

        String[][] result = resultant_Array.toArray(new String[0][]);
        for (String[] strings : result) {

            for (String strings2 : strings) {

                System.out.print(strings2);
            }
            System.out.println();
        }

    }
}
