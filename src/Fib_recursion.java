/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Fib_recursion {

    public static void main(String[] args) {
        System.out.println(fib(30));
    }

    public static int fib(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
