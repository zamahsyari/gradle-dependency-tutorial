/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.company.transaction;

import com.company.common.Auth;
import com.company.search.Product;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Transaction");
        Auth auth = new Auth();
        System.out.println(auth.toString());
        Product product = new Product();
        System.out.println(product.toString());
    }
}
