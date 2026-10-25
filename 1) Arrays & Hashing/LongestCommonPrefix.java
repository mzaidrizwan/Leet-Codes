import java.util.ArrayList;
import java.util.List;

class Solution {
    public static String longestCommonPrefix(String[] strs) { // { "at", "bag", "vi", "vii", "yoyo", "bank", "band",
                                                              // "yo" }

        List<String> prefixes = new ArrayList<>();
        String common_str = "";
        List<Integer> different_prefixes = new ArrayList<>();
        different_prefixes.add(0);
        different_prefixes.add(1);
        int iteration = strs.length;
        //
        //
        //
        //
        do {

            int i = 1;
            char[] focused_char = strs[different_prefixes.get(i - 1)].toCharArray();

            while (i < iteration) {

                char[] element_char = strs[different_prefixes.get(i)].toCharArray();

                if (focused_char[0] != element_char[0]) {
                    different_prefixes.add(i++);
                    continue;
                }

                int j = 0;

                while ((focused_char.length >= j) && (element_char.length >= j)) {

                    if (focused_char[j] == element_char[j]) {
                        common_str += element_char[j++];
                    } else {
                        break;
                    }

                }
                ++i;

            }

            if (common_str != "") {
                prefixes.add(common_str);
                different_prefixes.removeFirst();
            } else {
                different_prefixes.add(i - iteration);
            }
            iteration = different_prefixes.size();

        } while (different_prefixes.size() != 0);

        return "a";
    }

    public static void main(String[] args) {
        String[] strs = { "bat", "bag", "vi", "vii", "yoyo", "bank", "band", "yo" };
        String output = longestCommonPrefix(strs);
        System.out.println(output);
    }
}
