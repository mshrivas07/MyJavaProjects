
public class Numerology {
	
	public static void main(String[] args) {
		String str = "9203";
		System.out.println("Your no. is: "+numberRecursive(str));
	}
	
	public static int numberRecursive(String str){
		int j = 0;
		for(int i = 0; str.length() > i; i++){
			int k = Character.getNumericValue(str.charAt(i));
			j += k;
			if(j > 9){
				j = numberRecursive(String.valueOf(j));
			}
		}
		return j;
	}

}
