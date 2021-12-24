public class DigPow {
	
	public static void main(String[] args) {
		DigPow digPow = new DigPow();
		System.out.println(digPow.digPow(3456789, 1));
	}
	public static long digPow(int n, int p) {
		int i = -1;
		int dig = 0;
		System.out.println("n:"+n+" p:"+p);

		String noStr = String.valueOf(n);
		char[] noArr = noStr.toCharArray();
		for(int j = 0;noArr.length > j; j++){
			dig = dig + (int)Math.pow(Double.valueOf(String.valueOf(noArr[j])),p);
			System.out.println("pow:"+p);
			p++;
		}
		if((dig/n) > 0 && (dig%n) == 0){
			i = dig/n;
		}
		return i;
	}
		
		

	
}
