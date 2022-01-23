import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFilter {


	public static List filterList(final List list) {
		List<Integer> integerList = new ArrayList<Integer>();
		for (Object obj : list) {
			if (!obj.getClass().equals(String.class)) {
				integerList.add((Integer) obj);
			}
		}
		return integerList;
	}
	

	public static void main(String[] args) {
		System.out.println(ListFilter.filterList(Arrays.asList(1, 2, "a", "b")));
		System.out.println(ListFilter.filterList(Arrays.asList(1, 2, "a", "b", 0, 15))); //  Arrays.asList(1,2,0,15)
		System.out.println(ListFilter.filterList(Arrays.asList(1, 2, "a", "b", "aasf", "1", "123", 231))); // => 
																											// Arrays.asList(1,
																											// 2,
																											// 231)
	}
}
