import java.util.ArrayList;
import java.util.List;

class Solution {
    public static String longestCommonPrefix(String[] strs) {// { "bat", "bag", "vi", "vii", "yoyo", "bank", "band",
                                                             // "yo" }
                                                             // 4-ba
                                                             // vi, vii,yoyo,yo

        List<String> prefixes = new ArrayList<>();
        boolean remaining = true;
        String common_str = "";
        List<Integer> different_prefixes = new ArrayList<>();
        different_prefixes.add(0);
        // ba
        // 0
        // bag
        do {

            char[] focused_char = strs[different_prefixes.getFirst()].toCharArray();
            int i = 0;

            while (i < strs.length()) {

                char[] element_char = strs[i + 1].toCharArray();

                if (focused_char[0] == element_char[0]) {
                    different_prefixes.add(i);
                    continue;
                }

                int j=0;
                
                while ((focused_char.length() >= j) && (element_char.length() >= j)) {

                    if (  focused_char[j] == element_char[j]) {
                        common_str += element_char[j++];
                    } else {
                        break;
                    }

                }

            }

            prefixes.add(common_str);
            prefixes.removeFirst();
        } while (different_prefixes.size() != 0);

        return "a";
    }

    public static void main(String[] args) {
        String[] strs = { "bat", "bag", "vi", "vii", "yoyo", "bank", "band", "yo" };
        String output = longestCommonPrefix(strs);
        System.out.println(output);
    }
}
