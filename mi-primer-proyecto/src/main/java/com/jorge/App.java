package com.jorge;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

    String texto = "   ";

    System.out.println(texto.toUpperCase());
    System.out.println(StringUtils.isNotBlank(texto));
}
}
