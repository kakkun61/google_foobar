package com.google.challenges;

public class Answer {
    public static String answer(String str) {
        StringBuilder addStack = new StringBuilder();
        StringBuilder multipleStack = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        for (char c : str.toCharArray()) {
            switch (c) {
                case '+':
                    ans.append(multipleStack);
                    multipleStack.setLength(0);
                    addStack.append(c);
                    break;
                case '*':
                    multipleStack.append(c);
                    break;
                default:
                    ans.append(c);
                    break;
            }
        }
        ans.append(multipleStack);
        ans.append(addStack);

        return ans.toString();
    }
}
