import java.util.ArrayList;
import java.util.List;

class Solution {
    public static String longestCommonPrefix(String[] strs) {

        List<String> prefixes = new ArrayList<>();
        prefixes.add(strs[0]);
        boolean remaining = true;
        String common_str = "";

        while (remaining) {
            remaining = false;

            for (int i = 1; i < strs.length; i++) {
                char[] focused_char = prefixes.get(i - 1).toCharArray();
                char[] element_char = strs[i].toCharArray();

                if (focused_char[0] == element_char[0]) {
                    while (1) {
                        if (focused_char[i] == element_char[i]) {
                            common_str += element_char[i];
                            remaining = true;
                        } else {
                            prefixes.set(i - 1, common_str);
                            break;
                        }
                    }
                } else {
                    prefixes.add(strs[i]);
                    remaining = true;
                }
            }

        }

        return "a";
    }

    public static void main(String[] args) {
        String[] strs = { "bat", "bag", "vi", "vii", "yoyo", "bank", "band", "yo" };
        String output = longestCommonPrefix(strs);
        System.out.println(output);
    }
}
