public class Main {

    public static void main(String[] args) {
        System.out.println("TRIES");

        //AGENDA -
        // 1> Creation of Tries data structure
        // 2> Insertion of string into TRIE
        // 3> Finding a given string into TRIE
        // 4> Deletion of a given string from TRIE

        Trie trie = new Trie();
        trie.Insert("abc");
        trie.Insert("abgl");
        trie.Insert("cdf");
        trie.Insert("abcd");
        trie.Insert("lmn");

        trie.Insert("an");
        trie.Insert("ant");
        trie.Insert("ants");

        //Insert strings into the Trie
        System.out.println(trie.toString());

        //Search a given string in the TRIE

        System.out.println("abc" + " isPresent " + trie.Search("abc"));
        System.out.println("hahaha" + " isPresent " + trie.Search("hahaha"));
        System.out.println("abgl" + " isPresent " + trie.Search("abgl"));
        System.out.println("cdf" + " isPresent " + trie.Search("cdf"));
        System.out.println("abcd" + " isPresent " + trie.Search("abcd"));
        System.out.println("cd" + " isPresent " + trie.Search("cd"));

        System.out.println("Best match for antsb - " + trie.FindBestMatch("antsb"));
        System.out.println("Best match for antb - " + trie.FindBestMatch("antb"));
        System.out.println("Best match for anx - " + trie.FindBestMatch("anx"));
        System.out.println("Best match for a - " + trie.FindBestMatch("a"));
        System.out.println("Best match for hallooo - " + trie.FindBestMatch("hallooo"));
        System.out.println("Best match for abcdef - " + trie.FindBestMatch("abcdef"));
    }
}
