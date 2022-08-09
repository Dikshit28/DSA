package ArshSheet.strings;

import java.util.*;

public class simplifyPath31 {
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) != '/') {
                int a = i;
                while (i < path.length() && path.charAt(i) != '/')
                    i++;
                String str = path.substring(a, i);
                if (str.equals("..") && !stack.empty())
                    stack.pop();
                else if (!str.equals(".") && !str.equals("..") && !str.equals(","))
                    stack.push(path.substring(a, i));
            }
        }

        if (stack.empty())
            return "/";

        String res = "";
        while (!stack.empty())
            res = "/" + stack.pop() + res;

        return res;
    }

    public static void main(String[] args) {
        String path = "/home/.../foo/";
        System.out.println(simplifyPath(path));
    }
}
