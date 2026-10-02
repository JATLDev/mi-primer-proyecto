package com.jorge;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

    String texto = "Hola Jorge";

    System.out.println(texto.toUpperCase());
    System.out.println(StringUtils.isNotBlank(texto));
    System.out.println("Proyecto Maven con Git");
    List<String> nombres = Arrays.asList("Jorge", "Ana", "Luis");

System.out.println(CollectionUtils.isNotEmpty(nombres));
}
}
