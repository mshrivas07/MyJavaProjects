import java.util.Arrays;

public class AnagramTest {

	public static void main(String[] args) {
		System.out.println("Match:"+isAnagram("foefet", "toffee"));
		System.out.println("Match:"+isAnagram("Buckethead", "DeathCubeK"));
		System.out.println("Match:"+isAnagram("apple", "pale"));
	}
	
	  public static boolean isAnagram(String test, String original) {
		    if(test.equals(original)) return true;
		    if(test.length() == original.length()) {
		    	char[] firstArray = test.toLowerCase().toCharArray();
		    	char[] secondArray = original.toLowerCase().toCharArray();
		    	Arrays.sort(firstArray);
		    	Arrays.sort(secondArray);
		    	return Arrays.equals(firstArray, secondArray);
		    }
		    return false;
		  }
}
