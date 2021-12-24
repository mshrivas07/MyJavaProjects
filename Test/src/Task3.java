import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task3 task3 = new Task3();
		System.out.println(task3.solution("SMS messages are really very very short and a fruitful conversation can now end here.", 12));
		System.out.println(task3.solution("This is some sample text and has to be splited properly", 12));
		System.out.println(task3.solution("Thisissomesampletextandhas to be splited properly", 12));

	}
	
	public int solution(String S, int K) {
	    List<String> output = new ArrayList<String>();
	    try{
	    int start = 0;
	    while (start + K < S.length())
	    {
	      int end = start + K;
	      while (!Character.isWhitespace(S.charAt(end--)));
	      output.add(S.substring(start, end + 1));
	      start = end + 2;
	    }
	    output.add(S.substring(start));
	    }catch(Exception e){
	    	return -1;
	    }
	    return output.size();
    }
	

}
