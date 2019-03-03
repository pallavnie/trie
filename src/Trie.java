import java.util.*;

public class Trie {

    private TrieNode root;

    @Override
    public String toString() {
        return "Trie{" +
                "root=" + root +
                '}';
    }

    Trie() {
        root = new TrieNode();
    }

    public void Insert(String s) {
        TrieNode curr = root;

        //For each of the entered char in the string we need to do the needful to insert it in the trie data str.
        for (int i = 0; i < s.length(); i++) {
            //if the charcter is found
            if (curr.nodeMap.get(s.charAt(i)) != null) {
                curr = curr.nodeMap.get(s.charAt(i));
            } else//character is not found
            {
                TrieNode temp;
                if (i == s.length() - 1) {
                    temp = new TrieNode(true);
                    curr.nodeMap.put(s.charAt(i),temp );
                    curr = temp;

                }
                else {
                    temp = new TrieNode(false);
                    curr.nodeMap.put(s.charAt(i), temp );
                    curr = temp;
                }

            }
        }
        //No matter what the for the last char, the EOW will be set to be true
        curr.setEOW(true);
    }

    public Boolean Search(String s)
    {
        TrieNode curr = root;

        //For each of the entered char in the string we need to do the needful travesrs and do needful to search it in the trie data str.
        for (int i = 0; i < s.length(); i++) {
            //if the charcter is found
            if (curr.nodeMap.get(s.charAt(i)) != null) {
                curr = curr.nodeMap.get(s.charAt(i));
            } else//character is not found
            {
                return false;
            }
        }
        //if it doesn't enter the else above
        if(curr.isEOW) {
            return true;
        }
        else
            return false;
    }

    public String FindBestMatch(String s)
    {
        TrieNode curr = root;
        String bestMatchtillNow = "";

        //For each of the entered char in the string we need to do the needful travesrs and do needful to search it in the trie data str.
        for (int i = 0; i < s.length(); i++) {
            //if the charcter is found
            if (curr.nodeMap.get(s.charAt(i)) != null) {
                bestMatchtillNow += s.charAt(i);
                curr = curr.nodeMap.get(s.charAt(i));
            } else if(curr.isEOW == true)//character is not found
            {
                return bestMatchtillNow;
            }
        }
         return "";
    }
    private class TrieNode {

        private Map<Character, TrieNode> nodeMap;
        private Boolean isEOW;

        TrieNode() {
            nodeMap = new HashMap<>();
            isEOW = false;
        }

        TrieNode(Boolean isEOW) {
            nodeMap = new HashMap<>();
            this.isEOW = isEOW;
        }

        public void setEOW(Boolean EOW) {
            isEOW = EOW;
        }

        @Override
        public String toString() {
            return "TrieNode{" +
                    "nodeMap=" + nodeMap +
                    ", isEOW=" + isEOW +
                    '}';
        }
    }
}
