import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

class BinaryGap {


    public static void main(String[] args){
        BinaryGap sol = new BinaryGap();
//        System.out.println("New Input:"+Integer.parseInt("100", 2));
        int input = 2147483647;
        System.out.println("in:"+input);
        System.out.println("out:"+sol.solution(input));
    }
    
    public int solution(int N) {
        // write your code in Java SE 8
        boolean isZero = false;
        int retVal = 0;
        int longestGap = 0;
        String binStr =  Integer.toBinaryString(N);
        System.out.println("bin Str:"+binStr);
        ArrayList<Integer> gaps =  new ArrayList<Integer>();
        for(int i=0;binStr.length()>i;i++){
        	if(binStr.charAt(i) == '0'){
        		isZero = true;
        		longestGap++;
        	}else if(binStr.charAt(i) == '1'){
        		if(isZero){
        			gaps.add(longestGap);
        			longestGap = 0;
        		}
        		isZero = false;
        	}
        }
        
        if(!gaps.isEmpty()){
        	retVal = Collections.max(gaps);
        }
        return retVal;
    }
    

}
