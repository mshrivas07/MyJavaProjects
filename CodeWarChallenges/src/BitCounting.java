import java.util.stream.Stream;

public class BitCounting {

	public static void main(String[] args) {
		int i = 1234;
		System.out.println("i:" + i + " bits:" + countBits(i));
		i = 4;
		System.out.println("i:" + i + " bits:" + countBits(i));
		i = 7;
		System.out.println("i:" + i + " bits:" + countBits(i));
		i = 9;
		System.out.println("i:" + i + " bits:" + countBits(i));
		i = 10;
		System.out.println("i:" + i + " bits:" + countBits(i));
	}

	public static int countBits(int n) {
		String b1 = Integer.toBinaryString(n);
		Stream<String> bitsStream = Stream.of(b1.split(""));
		int cnt = (int) bitsStream.filter(e -> e.equals("1")).count();
		return cnt;
	}

}
