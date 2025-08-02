import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class group_anagram {
    public static void main(String[] args) {
        String[] group = { "act", "cat" };
        anagram_identifier(group);

    }

    static void anagram_identifier(String[] group) {
        ArrayList resultant_Array = new ArrayList<>();

        String[] a = { "abc" };
        String[] b = { "efg" };
        String[] c = { "hji", "klmo" };

        resultant_Array.add(a);
        resultant_Array.add(c);
        resultant_Array.add(b);


        System.out.println("Arraylist size: "+resultant_Array.size());

        // for (int i = 0; i < resultant_Array.length; i++) {
        // for (int j = 0; j < resultant_Array.length; j++) {
        // System.out.println(resultant_Array[i][j]);
        // }
        // }
    }
}
