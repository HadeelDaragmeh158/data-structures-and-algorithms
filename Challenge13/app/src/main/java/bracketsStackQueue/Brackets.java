package bracketsStackQueue;

public class Brackets {
    private String brackets;

    public Brackets(String string) {
        brackets = string;
    }

    public boolean validateBrackets() {
        boolean result = true;
        Stack<Character> stack = new Stack<Character>();
        char thisChar, previousChar;
        for(int i = 0; i < this.brackets.length(); i++) {
            thisChar = this.brackets.charAt(i);
            if(thisChar == '(' || thisChar == '[' || thisChar == '{') {
                stack.push(thisChar);
            } else if(thisChar == ')' || thisChar == ']' || thisChar == '}') {
                if(stack.isEmpty()) {
                    result = false;
                } else {
                    previousChar = stack.peek();
                    if((thisChar == ')' && previousChar == '(') || (thisChar == ']' && previousChar == '[') || (thisChar == '}' && previousChar == '{')) {
                        stack.pop();
                    } else {
                        result = false;
                    }
                }
            }
        }
        if(!stack.isEmpty()) {
            result = false;
        }
        return result;
    }


}
