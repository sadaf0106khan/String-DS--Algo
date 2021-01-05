package string;

import java.util.Stack;

public class PlaindromicIsPossibleOrNot {
	public static void main(String[] args) {
		Stack<Character> stack1 = new Stack<Character>();
		Stack<Character> stack2 = new Stack<Character>();
		String str = "cabb";
		for (int i = 0; i < str.length(); i++) {
			if (!stack1.contains(str.charAt(i))) {
				stack1.add(str.charAt(i));
			} else {
				for (int j = 0; j < stack1.size(); j++) {
					if (stack1.peek() == str.charAt(i)) {
						stack1.pop();
					} else {
						stack2.push(stack1.pop());
					}
				}
				for (int j = 0; j < stack2.size(); j++)
					stack1.push(stack2.pop());
			}
		}

		if (stack1.size()==1 || stack1.isEmpty())
			System.out.println("possible");
		else
			System.out.println("not possible");

	}
}
