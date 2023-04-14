package br.com.fag;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class Main {

    public static void main(String args[]) {




        //Boa professor, nunca tinha mexido com java antes e acabei gostando depois desse trabalho, tive q aprender bastante coisa pra fazer esse projeto.
        //Precisei usar stackoverflow, baeldung, dev media,  videos no youtube, chat gpt e outros lugares para conseguir realizar o projeto.


        String nome = "";
        String endereco = "";
        String telefone = "";
        String email = "";
        Cliente cliente = new Cliente(nome, endereco, telefone, email);
        Scanner scanner = new Scanner(System.in);

        Document.alert("Bem vindo a pizzaria da FAG!");
        System.out.println("Qual tamanho de pizza deseja? (P, M, G ou Mista)");
        System.out.println(("Digite exatamente como está pedindo."));
        String tamanho = scanner.next();

        double preco = 0.0;
        switch (tamanho.toUpperCase()) {
            case "P":
                System.out.println("Você escolheu uma pizza pequena.");
                preco = 25.0;
                break;
            case "M":
                System.out.println("Você escolheu uma pizza média.");
                preco = 32.0;
                break;
            case "G":
                System.out.println("Você escolheu uma pizza grande.");
                preco = 34.0;
                break;
            case "MISTA":
                System.out.println("Você escolheu uma pizza mista. Escolha o primeiro sabor: (Chocolate, Nutella com morango, Abacaxi com canela,Brigadeiro, Prestígio )");
                String sabor1 = scanner.next();
                System.out.println("Escolha o segundo sabor: (Pepperoni, Quatro Queijos, Calabresa, Atum, Frango catupiry)");
                String sabor2 = scanner.next();
                System.out.println("Qual tamanho de pizza você deseja? (P, M, G)");
                String tamanhoMista = scanner.next();
                switch (tamanhoMista.toUpperCase()) {
                    case "Chocolate":
                        preco = 30.0;
                        break;
                    case "Nutella com morango":
                        preco = 37.0;
                        break;
                    case "Abacaxi com canela":
                        preco = 34.0;
                        break;
                    case "Brigadeiro":
                        preco = 36.0;
                        break;
                    case "Prestígio":
                        preco = 37.0;
                        break;
                }
                if (sabor1.contains("Chocolate")) {
                    preco += 3.0;
                }
                if (sabor1.contains("Nutella com morango")) {
                    preco += 4.0;
                }
                if (sabor1.contains("Abacaxi com canela")) {
                    preco += 2.0;
                }
                if (sabor1.contains("Brigadeiro")) {
                    preco += 5.0;
                }
                if (sabor1.contains("Prestígio")) {
                    preco += 5.0;
                }
                if (sabor2.contains("Pepperoni")) {
                    preco += 3.0;
                }
                if (sabor2.contains("Quatro Queijos")) {
                    preco += 4.0;
                }
                if (sabor2.contains("Calabresa")) {
                    preco += 2.0;
                }
                if (sabor2.contains("Atum")) {
                    preco += 5.0;
                }
                if (sabor2.contains("Frango Catupiry")) {
                    preco += 5.0;
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        if (preco > 0.0) {
            System.out.printf("O preço da pizza %s é R$37.00", tamanho.toUpperCase(), preco);
        }

        Object [] tipoPedido = {"Delivery", "Retirar no Balcao", "La carte"};

        Object scanTipo = JOptionPane.showInputDialog(null, "Tipo do pedido", "Pizzaria", 3, null, tipoPedido, "");


        String tipo = null;



        if(scanTipo.equals("Delivery")){

            Document.alert("Você escolheu Delivery! Vamos precisar fazer um cadastro breve. ");
            nome = Document.prompt("Por favor, informe o seu nome");
            endereco = Document.prompt("Agora, informe o seu endereco");
            telefone = Document.prompt("Informe o seu telefone");
            email = Document.prompt("E por ultimo informe o seu email");

            cliente.setNome(nome);
            cliente.setEndereco(endereco);
            cliente.setTelefone(telefone);
            cliente.setEmail(email);

            tipo = "Delivery";


        } else if(scanTipo.equals("Retirar no Balcao")) {

            Document.alert("Você escolheu Reitrar no Balcao! Será necessário fazer um cadastro. ");
            nome = Document.prompt("Por favor, informe o seu nome");
            endereco = Document.prompt("Agora informe o seu endereco");
            telefone = Document.prompt("Informe o seu telefone");
            email = Document.prompt("E por ultimo informe o seu email");

            cliente.setNome(nome);
            cliente.setEndereco(endereco);
            cliente.setTelefone(telefone);
            cliente.setEmail(email);

            tipo = "Retirada no Balcao";


        } else if(scanTipo.equals("La carte")) {

            Document.alert("Você escolheu La carte");
            tipo = "La carte";
        }


        Pedido pedido = new Pedido(1, tipo, cliente.getNome(), "", "não", "");



        float taxa = 0;

        if(tipo.equals("Delivery")) {

            Delivery delivery = new Delivery(5.50f, pedido);
            taxa = delivery.getTaxa();

        } else if(tipo.equals("Retirar no Balcao")) {

            RetiradaBalcao retiradaBalcao = new RetiradaBalcao(nome, pedido);

        }


        Object [] tipoPizza = {"Salgada", "Doce",};
        int scanTipoSabor = JOptionPane.showOptionDialog(null, "Escolha o tipo da pizza:", "Pizzaria", 0, 3, null, tipoPizza, "");



        Pizza[] pizzas = Pizza.getPizzas();

        if(scanTipoSabor == 0) {
            Document.writee("Pizzas salgadas:");
            for (Pizza pizza : pizzas) {
                if (pizza.getTipo().equals("salgada")) {
                    System.out.println(pizza.getCodigo() + " - " + pizza.getSabor() + " (" + pizza.getTipo() + "): R$" + pizza.getValor());
                }
            }
        }
        if (scanTipoSabor == 1){
            Document.writee("Pizzas doces:");
            for (Pizza pizza : pizzas) {
                if (pizza.getTipo().equals("doce")) {
                    System.out.println(pizza.getCodigo() + " - " + pizza.getSabor() + " (" + pizza.getTipo() + "): R$" + pizza.getValor());
                }
            }

        }

        String pizzaSelecionada = null;
        float precoPizza = 0;

        while(pizzaSelecionada==null) {

            String scanCod;
            scanCod = JOptionPane.showInputDialog(null, "Veja a lista de pizzas no console e escolha o número a qual você prefirir:");


            for(Pizza pizza: pizzas) {


                if(pizza.getCodigo() == Integer.parseInt(scanCod)) {

                    pizzaSelecionada = pizza.getSabor();
                    precoPizza = pizza.getValor();
                    break;
                }
            }


        }


        int scanBebidaSN = JOptionPane.showConfirmDialog(null, "Deseja adicionar uma bebida?");
        Object scanBebida = null;
        if(scanBebidaSN == 0) {
            Object [ ] bbds = {"Refrigerantes", "Água", "Sucos", "Vinho"};
            Object scanBbds = JOptionPane.showInputDialog(null, "Bebidas:", "Pizzaria", 3, null, bbds, "");
            if(scanBbds.equals("Refrigerantes")) {
                Object [ ] refris = {"Coca-cola", "Guaraná", "Fanta Uva", "Fanta Laranja",};
                scanBebida = JOptionPane.showInputDialog(null, "Refrigerantes:", "Pizzaria", 3, null, refris, "");
            } else if (scanBbds.equals("Água")) {
                Object [ ] aguas = {"Água com gás", "Água sem gás"};
                scanBebida = JOptionPane.showInputDialog(null, "Bebidas:", "Pizzaria", 3, null, aguas, "");
            } else if (scanBbds.equals("Sucos")) {
                Object [ ] sucos = {"Laranja", "Abacaxi com hortelã", "Limão", "Uva", "Morango", "Blueberry"};
                scanBebida = JOptionPane.showInputDialog(null, "Bebidas:", "Pizzaria", 3, null, sucos, "");
            } else if (scanBbds.equals("Vinho")) {
                Object [ ] vinhos = {"Branco", "Tinto", "Licoroso", "Rosé", "Espumante"};
                scanBebida = JOptionPane.showInputDialog(null, "Bebidas:", "Pizzaria", 3, null, vinhos, "");
            }

            Bebida[] bebidas = Bebida.getBebidas();
            String bebidaSelecionada = null;

            for(Bebida Bebida : bebidas) {
                if(Bebida.getNome().equals(scanBebida)) {
                    bebidaSelecionada = Bebida.getNome();
                    break;
                }
            }
            pedido.setBebida(bebidaSelecionada);
            Document.alert("A bebida selecionada é: " + bebidaSelecionada);
        }






        Object [ ] tipoPay = {"Pix", "Cartão de crédito", "Cartão de débito"};
        int scanPay = JOptionPane.showOptionDialog(null, "Escolha a forma de pagamento", "Pizzaria", 0, 3, null, tipoPay, "" );
        String pay = "";
        if(scanPay==0) {
            pay = "Pix";
        } else if(scanPay==1) {
            pay = "Cartão de crédito";
        } else if(scanPay==2) {
            pay = "Cartão de débito";
        }
        pedido.setPagamento(pay);



        Document.alert("Verifique os dados do pedido no console!");

        Document.writee("\n\nDados do pedido:");

        Document.writee("Código: "+ pedido.getCodigo());
        Document.writee("Cliente: "+ pedido.getCliente());
        Document.writee("Endereco: "+ cliente.getEndereco());
        Document.writee("Telefone: "+ cliente.getNome());
        Document.writee("Email: "+ cliente.getEmail());
        Document.writee("Tipo de Pedido: "+ pedido.getTipo());
        Document.writee("Pizza: sabor "+ pedido.getPizza());
        Document.writee("Bebida: "+ pedido.getBebida());
        Document.writee("Forma de Pagamento: "+ pedido.getPagamento());
        Document.writee("Preço da Pizza: "+ precoPizza);
        Document.writee("Taxa: "+ taxa);

        Document.writee("\nTotal a pagar: "+ (precoPizza+taxa));

        if(tipo.equals("Retirada no Balcao")) {
            Document.writee("\n"+ pedido.getCliente() +"! Seu pedido está pronto, venha no balcão !");
        }

        Scanner scannere = new Scanner(System.in);
        String scanConfirm = null;

        while(scanConfirm == null) {
            Document.writee("Para confirmar a compra digite \"sim\", digite \"nao\" para cancelar.");
            scanConfirm = scannere.nextLine();

            if(scanConfirm.equals("sim")) {
                Document.alert("Compra concluída! Muito obrigado, volte sempre!");
            } else if(scanConfirm.equals("nao")) {
                Document.alert("Compra cancelada! Que pena...");
            } else if(scanConfirm != "sim" && scanConfirm != "nao") {
                Document.alert("É...dado errado! Digite exatamente como o exemplo no enunciado!");
            }
        }


    }
}
