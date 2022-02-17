package com.capgemini.exr2;

import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("informe a senha: ");
        String senha = scan.next();
        boolean reg = senha.matches(".*\\W.*");
        boolean regS = senha.matches(".*[A-Z].*");
        boolean insec = false;
        if (senha.length() < 6) {
            System.err.println("SENHA INSEGURA/!\\");
            insec = true;
            System.err.println("Sua senha precisa de mais " + (6 - senha.length()) + " caracteres");
        }

        if(!reg) {
            if (!insec){
                System.err.println("SENHA INSEGURA/!\\");
                insec = true;
            }
            System.err.println("insira pelo menos um carácter especial na senha");
        }

        if(!regS) {
            if (!insec) {
                System.err.println("SENHA INSEGURA/!\\");
                insec = true;
            }
            System.out.println("insira pelo menos uma Letra maiúscula na senha");
        }
        if (!insec){
            System.out.println("SENHA SEGURA!!!");
        }
    }
}
