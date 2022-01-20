
public class EvenIndex {
	  public static int findEvenIndex(int[] arr) {
		    int result = -1;
		    int leftSum = 0;
		    int rightSum = 0;
		    for(int i=0;i<arr.length;i++){
		    	rightSum = 0;
		    	leftSum = 0;
		    		for(int j=i+1;j<arr.length;j++){
		    			rightSum += arr[j];
		    		}
		    		if(i>0){
		    		  for(int k=i-1; k>=0;k--){
		    				leftSum += arr[k];
		    			}
		    		}
		    	if(leftSum == rightSum){
		    		return i;
		    	}
		    }
		    return result;
	}

//      assertEquals(1,Kata.findEvenIndex(new int[] {1,100,50,-51,1,1}));
//      assertEquals(-1,Kata.findEvenIndex(new int[] {1,2,3,4,5,6}));
//      assertEquals(3,Kata.findEvenIndex(new int[] {20,10,30,10,10,15,35}));
//      assertEquals(-1,Kata.findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
//      assertEquals(1,Kata.findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
//      assertEquals(6,Kata.findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));

	  
	  public static void main(String[] args) {
		  System.out.println("Ans:"+findEvenIndex(new int[] {1,2,3,4,3,2,1}));
		  System.out.println("Ans1:"+findEvenIndex(new int[] {1,100,50,-51,1,1}));
		  System.out.println("Ans2:"+findEvenIndex(new int[] {1,2,3,4,5,6}));
	}
	

}
