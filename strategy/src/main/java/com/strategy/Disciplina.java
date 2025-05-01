package com.strategy;

public class Disciplina {
    private String nome, situacao;
    private double p1, p2, media;
    private MediaStrategy estrategia;

    // Constructor

    public Disciplina(MediaStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularMedia(){
        return media = estrategia.calcularMedia(p1, p2);
    }

    // Getters

    public String getNome() {
        return nome;
    }

    public String getSituacao() {
        return situacao = estrategia.verificarSituacao(media);
    }

    public double getP1() {
        return p1;
    }

    public double getP2() {
        return p2;
    }

    public double getMedia() {
        return media;
    }

    public MediaStrategy getEstrategia() {
        return estrategia;
    }

    // Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void setEstrategia(MediaStrategy estrategia) {
        this.estrategia = estrategia;
    }
}
