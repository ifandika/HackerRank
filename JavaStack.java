import java.util.*;

public class JavaStack {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            System.out.println(checkValid(input));
		}
	}

	static boolean checkValid(String value) {
		Stack<Character> stack = new Stack<>();
        for(int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);    
            }
            else if(c == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return false;
               }
            }
            else if(c == ']') {
                if(stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }
            else if(c == '}') {
                if(stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}