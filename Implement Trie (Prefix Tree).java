class Node {
    boolean isWord;
    Node[] children = new Node[26];
}

class Trie {
    Node root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new Node();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node curr = root;
        
        for (char c : word.toCharArray()) {
            
            if (curr.children[c - 'a'] == null) {
                curr.children[c - 'a'] = new Node();
            }
            
            curr = curr.children[c - 'a'];
        }
        
        curr.isWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node curr = root;
        
        for (char c : word.toCharArray()) {
            
            if (curr.children[c - 'a'] == null) {
                return false;
            }
            
            curr = curr.children[c - 'a'];
        }
        
        return (curr.isWord);
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node curr = root;
        
        for (char c : prefix.toCharArray()) {
            
            if (curr.children[c - 'a'] == null) {
                return false;
            }
            
            curr = curr.children[c - 'a'];
        }
        
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */