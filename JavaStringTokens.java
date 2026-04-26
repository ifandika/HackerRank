/**
 * 
 * 
 */
public class JavaStringTokens {

	public static void main(String[] args) {

		String s = "           YES      leading spaces        are valid,    problemsetters are         evillllll";

		String[] result = s.split("[, ?_,.'!@]+");
        
        int length = 0;
        for(int i = 0; i < result.length; i++) {
            if(result[i] != "") {
            	length++;
            }
        }

        System.out.println(length);
        for(int i = 0; i < result.length; i++) {
            if(result[i] != "") {
            	System.out.println(result[i]);
            }
        }
	}
}