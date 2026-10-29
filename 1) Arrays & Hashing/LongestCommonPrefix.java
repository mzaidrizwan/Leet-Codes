import java.util.ArrayList;
import java.util.List;

class Solution {
    public static String longestCommonPrefix(String[] strs) {

        List<String> filtered_prefixes = new ArrayList<>();// stores nitially complete copy of data then filters prefixes present in data
        for (int i = 0; i < strs.length; i++) {
            filtered_prefixes.add(strs[i]);
        }
        List<Integer> score = new ArrayList<>();// repition tracker, give score to each prefix as per repetition

        for (int i = 0; i < filtered_prefixes.size(); i++) {// pick a focused element to compare with all next elements 
            int repition = 1;
            char[] focused_element = filtered_prefixes.get(i).toCharArray();

            for (int j = i + 1; j < filtered_prefixes.size(); j++) { // pick next elements
                char[] element = filtered_prefixes.get(j).toCharArray();
                String common_str = "";
                int n;

                if (element.length < focused_element.length)
                    n = element.length;
                else
                    n = focused_element.length;

                for (int k = 0; k < n; k++) { // compares each character of words

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

            score.add(repition);// tracking repetition of each prefix 

        }

        int highlyRepeated = 0;
        boolean diff_scores = false;

        for (int i = 0; i < filtered_prefixes.size() - 1; i++) { // filters the highest number of repetition

            if (score.get(highlyRepeated) < score.get(i + 1)) {
                highlyRepeated = i + 1;
                diff_scores = true;
            }

        }

        if (diff_scores) {
            return filtered_prefixes.get(highlyRepeated);
        } else {
            return "";
        }

    }

    public static void main(String[] args) {
        String[] strs = { "at","v", "bag", "vi", "yo","yog","vii", "yoyo", "bank", "band", "yo"};
        System.out.println(longestCommonPrefix(strs));
    }
}