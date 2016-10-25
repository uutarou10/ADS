/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uutarou
 */
public class HelloWorld {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ") " + "Hello World!");
            if (i == 2 || i == 7) {
                System.out.print("(" + i + "回目だよ)");
            }
            System.out.print("\n");
        }
    }
    
}
