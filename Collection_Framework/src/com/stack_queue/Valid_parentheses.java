package com.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Valid_parentheses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(valid(str));
    }

    static boolean valid(String str){
        Stack<Character> stack=new Stack<>();
        for(char ch:str.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push( ch);
            }else{
                if(ch==')'){
                    if(stack.isEmpty()  || stack.pop()!='('){
                        return false;
                    }
                }

                if(ch=='}'){
                    if(stack.isEmpty()  || stack.pop()!='{'){
                        return false;
                    }
                }

                if(ch==']'){
                    if(stack.isEmpty()  || stack.pop()!='['){
                        return false;
                    }
                }


            }
        }
        return stack.isEmpty();
    }
}
