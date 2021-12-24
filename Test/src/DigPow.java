
public class DigPow {
	public static void main(String[] args) {
		System.out.println(">>"+digPowMd(695, 2));
		System.out.println(">>"+digPowMd(92, 1));
		System.out.println(">>"+digPowMd(3456789, 1));
	}
	
	public static int digPowMd(int n, int p){
		int i = -1;
		int dig = 0;
		System.out.println("n:"+n+" p:"+p);

		String noStr = String.valueOf(n);
		char[] noArr = noStr.toCharArray();
		for(int j = 0;noArr.length > j; j++){
			dig = dig + (int)Math.pow(Double.valueOf(String.valueOf(noArr[j])),p);
			System.out.println("dig:"+dig);
			p++;
		}
		if((dig/n) > 0){
			i = dig/n;
		}
		return i;
	}

}
