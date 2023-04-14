package br.com.fag;

public class Bebida {
    private String nome;
    private String tipo;
    private float valor;


    public Bebida(String nome, String tipo, float valor) {
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;

    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public float getValor() {
        return valor;
    }
    public static Bebida[] getBebidas() {
        Bebida[] bebidas = {

                new Bebida("Água com gás", "Água", 3.50f),
                new Bebida("Água sem gás", "Água", 3.00f),
                new Bebida("Coca-cola", "Refrigerante", 5.00f),
                new Bebida("Guaraná", "Refrigerante", 4.50f),
                new Bebida("Sprite", "Refrigerante", 4.50f),
                new Bebida("Fanta Uva", "Refrigerante", 4.50f),
                new Bebida("Fanta Laranja", "Refrigerante", 4.50f),
                new Bebida("Branco", "Vinho", 60.00f),
                new Bebida("Tinto", "Vinho", 50.00f),
                new Bebida("Licoroso", "Vinho", 40.00f),
                new Bebida("Rosé", "Vinho", 42.00f),
                new Bebida("Espumante", "Vinho", 46.00f),
                new Bebida("Laranja", "Sucos", 7.00f),
                new Bebida("Abacaxi com hortelã", "Sucos", 7.00f),
                new Bebida("Limão", "Sucos", 7.00f),
                new Bebida("Uva", "Sucos", 7.00f),
                new Bebida("Morango", "Sucos", 7.00f),
                new Bebida("Blueberry", "Sucos", 7.00f),
        };
        return bebidas;
    }
}