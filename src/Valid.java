import java.util.*;


public class Valid {
     static boolean isValid(String s){
        Map <Character, Character> Slovar = new HashMap<>();
        Slovar.put(')','(');
        Slovar.put(']','[');
        Slovar.put('}','{');

        Deque<Character> stack = new LinkedList<>();
        for (Character c : s.toCharArray()){
            if (Slovar.containsValue(c)){
                stack.push(c);
            } else if (Slovar.containsKey(c)){
                if (stack.isEmpty() || stack.pop() != Slovar.get(c)){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}
