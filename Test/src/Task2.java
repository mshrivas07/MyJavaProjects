import java.util.HashSet;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "aaBabcDazddZ";//"Codility";
		Task2 t = new Task2();
		System.out.println("output:"+t.solution(str1));
	}
	
	HashSet<Character> charArr = new HashSet<>();
	
	public String solution(String S) {
		String ans = "NO";
		int count = 0;
		char[] ch  = S.toCharArray();
		int asc = 0;
		for(int i = 0; ch.length > i; i++){
			count = 1;
			for(int j = i+1; ch.length > j; j++){
				if(Character.toUpperCase(ch[i]) == Character.toUpperCase(ch[j]) && ch[i] != ' ') {  
                    count++;  
                    if(Character.isUpperCase(ch[j]) && Character.isLowerCase(ch[i])){
                    	ch[i] = Character.toUpperCase(ch[i]);
                    }
                    ch[j] = '0';  
                }  
			}
			if(count > 1 && ch[i] != '0' && ch[i] < 97){
				 System.out.println(ch[i]); 
				 if(ch[i] > asc){
					 asc = ch[i];
				 }
			}
		}

		if(asc == 0){
			return ans;
		}else{
			ans = String.valueOf((char)asc);
		}
		return ans;
    }

}
