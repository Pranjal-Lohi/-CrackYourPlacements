public class PrintAnagramsTogether {
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        HashMap<String, List<String>> map = new HashMap<>();
        for(String word : string_list) {
            char[] characters = word.toCharArray();
            Arrays.sort(characters);
            String sortedWord = new String(characters);
            if(!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
