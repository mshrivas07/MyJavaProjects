
public class TenMinWalk {
	
	public static void main(String[] args) {
		System.out.println(TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
		System.out.println(TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
		System.out.println(TenMinWalk.isValid(new char[] {'w'}));
		System.out.println(TenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
	}
	
	  public static boolean isValid(char[] walk) {
            if(walk.length != 10 ){
            	return false;
            }
            
            int north = 0;
            int south = 0;
            int east = 0;
            int west = 0;
		   
            for(int i = 0; i < walk.length; i++){
            	switch (walk[i]) {
				case 'n':
					north++;
					break;
				case 's':
					south++;
					break;
				case 'e':
					east++;
					break;
				case 'w':
					west++;
					break;					
				default:
					System.out.println("invalid direction");
					return false;
				}

            }
            
        	if(north == south && east == west)
        		return true;
		  
		    return false;
		  }

}
