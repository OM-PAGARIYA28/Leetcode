class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> rootSet = new HashSet<>(dictionary);
        // Split the sentence into words
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String replacement = word;
            for (int i = 1; i <= word.length(); i++) {
                String prefix = word.substring(0, i);
                if (rootSet.contains(prefix)) {
                    replacement = prefix;
                    break;
                }
            }
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(replacement);
        }
        return result.toString();
    }
}