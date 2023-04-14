package br.com.fag;

public class Pizza {
    private int codigo;
    private String sabor;
    private String tipo;
    private float valor;
    private String mista;

    public Pizza(int codigo, String sabor, String tipo, float valor) {
        this.codigo = codigo;
        this.sabor = sabor;
        this.tipo = tipo;
        this.valor = valor;
        this.mista = tipo;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getSabor() {
        return sabor;
    }
    public String getTipo() {
        return tipo;
    }
    public float getValor() {
        return valor;
    }
    public String getMista() { return tipo;}
    public static Pizza[] getPizzas(){
        Pizza[] pizzas = {
                new Pizza(1, "Calabresa", "salgada", 33.0f),
                new Pizza(2, "Margherita", "salgada", 31.0f),
                new Pizza(3, "Frango com catupiry", "salgada", 37.0f),
                new Pizza(4, "Quatro queijos", "salgada", 37.0f),
                new Pizza(5, "Portuguesa", "salgada", 41.0f),
                new Pizza(6, "Pepperoni", "salgada", 39.0f),
                new Pizza(7, "Atum", "salgada", 45.0f),
                new Pizza(8, "Bacon", "salgada", 36.0f),
                new Pizza(9, "Palmito", "salgada", 35.0f),
                new Pizza(10, "Napolitana", "salgada", 39.0f),
                new Pizza(11, "Chocolate", "doce", 34.0f),
                new Pizza(12, "Banana com canela", "doce", 37.0f),
                new Pizza(13, "Romeu e Julieta", "doce", 42.0f),
                new Pizza(14, "Brigadeiro", "doce", 37.0f),
                new Pizza(15, "Prestígio", "doce", 43.0f),
                new Pizza(16, "Morango com leite condensado", "doce", 39.0f),
                new Pizza(17, "Abacaxi com coco", "doce", 47.0f),
                new Pizza(18, "Nutella com morango", "doce", 53.0f),
                new Pizza(19, "Doce de leite com ameixa", "doce", 44.0f),
                new Pizza(20, "Maçã com canela", "doce", 40.0f),
                new Pizza(21, "Calabresa", "mista", 33.0f),
                new Pizza(22, "Margherita", "mista", 31.0f),
                new Pizza(23, "Frango com catupiry e nutella e morango", "mista", 37.0f),
                new Pizza(24, "Quatro queijos e chocolate", "mista", 37.0f),
                new Pizza(25, "Portuguesa e morango com leite condensado", "mista", 41.0f),
                new Pizza(26, "Pepperoni e banana com canela", "mista", 39.0f),
                new Pizza(27, "Atum e prestigio", "mista", 45.0f),
                new Pizza(28, "Bacon e abacaxi com coco", "mista", 36.0f),
                new Pizza(29, "Palmito e doce de leite com ameixa", "mista", 35.0f),
                new Pizza(30, "Napolitana e maça com canela", "mista", 39.0f),
                new Pizza(31, "Chocolate", "mista", 34.0f),
                new Pizza(32, "Banana com canela", "mista", 37.0f),
                new Pizza(33, "Romeu e Julieta", "mista", 42.0f),
                new Pizza(34, "Brigadeiro", "mista", 37.0f),
                new Pizza(35, "Prestígio", "mista", 43.0f),
                new Pizza(36, "Morango com leite condensado", "mista", 39.0f),
                new Pizza(37, "Abacaxi com coco", "mista", 47.0f),
                new Pizza(38, "Nutella com morango", "mista", 53.0f),
                new Pizza(39, "Doce de leite com ameixa", "mista", 44.0f),
                new Pizza(40, "Maçã com canela", "mista", 40.0f)
        };
        return pizzas;
    }


}