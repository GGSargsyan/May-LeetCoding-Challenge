class Solution {
    public String removeKdigits(String num, int k) {
	    // Base cases
        if (k == 0) {
            return num;
        }
        if (num.length() == k) {
            return "0";
        }
        
        int N = num.length();
        int windowSize = k + 1;
        
        LinkedList<Integer> queue = new LinkedList<>();
                
        for (int i = 0; i < windowSize - 1; i++) {
            int digit = (int) (num.charAt(i)-'0');
            
            while (!queue.isEmpty() && digit < queue.getLast()) {
                queue.removeLast();
            }
            
            queue.addLast(digit);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = windowSize-1; i < N; i++) {
            int digit = (int)(num.charAt(i)-'0');
            
            while (!queue.isEmpty() && digit < queue.getLast()) {
                queue.removeLast();
            }
            
            queue.addLast(digit);                        
            sb.append(queue.removeFirst());                                    
        }
        
		// Remove leading zeroes
        int index = 0;
        while (index + 1 < sb.length() && sb.charAt(index) == '0') {
            index++;
        }
        
        return sb.toString().substring(index, sb.length());
    }
}