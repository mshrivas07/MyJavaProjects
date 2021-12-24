
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,-5};
		Task1 t = new Task1();
		System.out.println("printing output:"+t.solution(arr));
	}
	
	
    public int solution(int[] A) {
        // write your code in Java SE 8
    	int j =  0;
    	int negetives = 0;
    	for (int i : A) {
    		if(i == 0){
    			return j;
    		}else if(i < 0){
    			negetives++;
    		}
		}
    	if(negetives%2 == 0){
    		j = 1;
    	}else{
    		j = -1;
    	}
    	return j;
    }

}
