import java.util.ArrayList;
import java.util.List;

class Solution {
    public static String longestCommonPrefix(String[] strs) { // { "at", "bag", "vi", "vii", "yoyo", ("bank"),
                                                              // "band","yo" }

        List<String> filtered_prefixes = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            filtered_prefixes.add(strs[i]);
        }

        for (int i = 0; i < filtered_prefixes.size(); i++) {
            int repition = 1;
            char[] focused_element = filtered_prefixes.get(i).toCharArray();

            for (int j = i + 1; j < filtered_prefixes.size(); j++) {
                char[] element = filtered_prefixes.get(j).toCharArray();
                String common_str = "";
                int n;

                if (element.length < focused_element.length)
                    n = element.length;
                else
                    n = focused_element.length;

                for (int k = 0; k < n; k++) {

                    if (focused_element[k] == element[k]) {
                        common_str += element[k];
                    } else {
                        break;
                    }

                }

                if (common_str != "") {
                    repition++;
                    filtered_prefixes.remove(j);
                    filtered_prefixes.set(i, common_str);
                    focused_element = common_str.toCharArray();
                    --j;
                }
            }

            filtered_prefixes.set(i, repition + filtered_prefixes.get(i));

        }

        for (int i = 0; i < filtered_prefixes.size(); i++) {
            System.out.println(filtered_prefixes.get(i)+'\n');
        }

        return "a";
    }

    public static void main(String[] args) {
        String[] strs = { "at", "bag", "vi", "vii", "yoyo", "bank", "band", "yo" };
        String output = longestCommonPrefix(strs);
        System.out.println(output);
    }
}
