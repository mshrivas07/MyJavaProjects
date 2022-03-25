import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Test1 {
	
	
	//["Matt","Jon","Lisa","Jim","Jon","Matt"]  ==> Matt2 Jon2 Lisa1 Jim1
	
	
	public static void main(String[] args) {
		
		String[] strArr = {"Matt","Jon","Lisa","Jim","Jon","Matt"};
		HashSet<String> uniqSet = new HashSet<String>();
		HashMap<String,Integer> result =  new HashMap<String,Integer>();
		for(int i = 0; i < strArr.length; i++){
			if(!result.isEmpty() && result.containsKey(strArr[i])){
				result.put(strArr[i], result.get(strArr[i]) + 1);
			}else if(!result.containsKey(strArr[i])){
				result.put(strArr[i], 1);
			}
		}
		
		System.out.println("Result:"+result);

		
		
		List<Integer> myInts = Arrays.asList(9, 4, 5, 6, 0 , -1, 7, 1); 
		
		Collections.sort(myInts);  
		Integer[] arr1 = {9, 4, 5, 6, 0 , -1, 7, 1};
		Integer a[]={1,2,5,6,3,2};  
		Integer b[]={44,66,99,77,33,22,55};  
		int temp = 0;
		for(int i = 0; i < arr1.length; i++){
			if((i+1!=arr1.length) && arr1[i] > arr1[i+1]){
				temp = arr1[i];
				arr1[i] = arr1[i+1];
				arr1[i+1] = temp;
			}
		}
		
		System.out.println("ArrayList:"+Arrays.asList(arr1).toString());
		
		
	}
	

}
