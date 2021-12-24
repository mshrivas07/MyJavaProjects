/*
 * Maskify.Maskify("4556364607935616"); // should return "############5616"
Maskify.Maskify("64607935616");      // should return "#######5616"
Maskify.Maskify("1");                // should return "1"
Maskify.Maskify("");                 // should return ""

// "What was the name of your first pet?"
Maskify.Maskify("Skippy");                                   // should return "##ippy"
Maskify.Maskify("Nananananananananananananananana Batman!"); // should return "####################################man!"
 */
public class Maskify {
	public static String Maskify(String str, int last){
		if(str.length() > last){
			String str1 = str.substring(str.length() - last);
			String[] str2 = str.split(str1);
			String str3 = str2[0].replaceAll(".", "#").concat(str1);
			return str3;
		}else{
			return str;
		}
		
	}
	
	public static void main(String[] args) {
		Maskify m = new Maskify();
		System.out.println(m.Maskify("",4));
		         //012345678
	}

}
