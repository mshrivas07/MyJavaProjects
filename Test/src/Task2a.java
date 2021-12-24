
public class Task2a {
	
	public static void main(String[] args) {
		System.out.println(Task2a.solution("aaabcazdd"));
	}

	
	public static String solution(String S) {
	    boolean[] upperC = new boolean[26];
	    boolean[] lowerC = new boolean[26];

	    char[] arr = S.toCharArray();
	    
	    for(char c : arr) {
	        if(Character.isLowerCase(c))
	            lowerC[c-'a'] = true;

	        if(Character.isUpperCase(c))
	            upperC[c-'A'] = true;
	    }

	    for(int i = 25; i>= 0; i--){
	        if(upperC[i] && lowerC[i]){
	            return(char)(i + 'A') + "";
	        }
	    }

	    return "NO";
	}

}
