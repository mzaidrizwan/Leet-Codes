public class a {
    public static void main(String[] args) {
        String[] group = { "act", "cat" };
        String[] result = anagram_identifier(group);
    }

    static String[] anagram_identifier(String[] group) {

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
                            // int count=0;

                            if (toFocus[k] == toCheck[k2] && toFocus[i] != '-') {
                                found = true;
                                toFocus[i] = '-';
                                toCheck[j] = '-';
                            }

                            if (!found) {
                                break;
                            }
                        }
                        if (!found) {
                            break;
                        }
                    }
                }
            }
        }

        return group;
    }
}
