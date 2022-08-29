import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        HashMap<Character, Integer> hm = 
                    new HashMap<Character, Integer>();

        int n = str.length();
        int result = 0;
        int start = 0;
        //O(n) Time Complexity
        for(int end = 0; end < n; end++){
            if(hm.containsKey(str.charAt(end))){
                start = Math.max(start, hm.get(str.charAt(end)) + 1);
            }
            hm.put(str.charAt(end), end);
            result = Math.max(result, end - start + 1);
        }
        System.out.print(result);
    }
}