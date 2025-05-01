package com.strategy;

public class Strategy {
    public static void main(String[] args) {
        MediaStrategy estrategia = new Aritmetica(); 
        Disciplina d = new Disciplina(estrategia);

        d.setNome("Padrões de Desenvolvimento");
        d.setP1(10);
        d.setP2(5);
        d.calcularMedia();

        System.out.printf("P1: %.2f  P2: %.2f  Media: %.2f  Situacao: %s%n",
                d.getP1(), d.getP2(), d.getMedia(), d.getSituacao());
    }
}
