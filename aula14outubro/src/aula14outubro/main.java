package aula14outubro;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

		private static ArrayList<Carro> Carros = new ArrayList<>();

	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        int opcao;

	        do {
	            System.out.println("1- Comprar \n2- Vender \n3- Listar Totos \n4- Sair");
	            opcao = entrada.nextInt();

	            switch (opcao) {
	                case 1:
	                    compra_carro();
	                    break;
	                case 2:
	                    vender_carro();
	                    break;
	                case 3:
	                    listar();
	                    break;
	                default:
	                    if (opcao != 4) {
	                        System.out.println("Opcao invalida");
	                    }
	            }
	        } while (opcao != 4);

	    }

	    public static void compra_carro() {
	        Scanner entrada = new Scanner(System.in);
	        String placa;
	        String cor;
	        String fabricante;
	        String modelo;
	        double motorizacao;
	        double preco_compra;
	        
	        System.out.println("Digite uma Placa: ");
	        placa = entrada.nextLine();
	        if(verificar_placa(placa)== true)
	        {
	            System.out.println("Placa ja cadastrada");
	            return ;
	        }            
	        
	        System.out.println("Informe a Cor: ");
	        cor = entrada.nextLine();
	        System.out.println("Informe o Fabricante: ");
	        fabricante = entrada.nextLine();
	        System.out.println("Informe o Modelo: ");
	        modelo = entrada.nextLine();
	        System.out.println("Informe a Motorizacao: ");
	        motorizacao = entrada.nextDouble();
	        System.out.println("Informe a Preco da Compra: ");
	        preco_compra = entrada.nextDouble();
	        
	        Carro Cadastros = new Carro();
	        Cadastros.setPlaca(placa);
	        Cadastros.setCor(cor);
	        Cadastros.setFabricante(fabricante);
	        Cadastros.setModelo(modelo);
	        Cadastros.setMotorizacao(motorizacao);
	        Cadastros.setPreco_compra(preco_compra);
	        Carros.add(Cadastros);
	        
	    }

	    public static void vender_carro() {
	        Scanner entrada = new Scanner(System.in);
	        String placa;
	        double preco_venda;
	        double lucro;
	        double venda;
	        System.out.println("Digite uma Placa: ");
	        placa = entrada.nextLine();
	        if(verificar_placa(placa)== true)
	        {
	            Carro c1 = null;
	            for (int i = 0; i < Carros.size(); i++) {
	            if (Carros.get(i).getPlaca().equals(placa)) {
	                c1 = Carros.get(i);
	                break;
	            }
	            }
	            System.out.println("Informe o preco de venda: ");
	            preco_venda = entrada.nextDouble();
	            if(preco_venda < c1.getPreco_compra()){
	                System.out.println("Venda nao atorizada valor de venda menor que o de compra");
	            }else{
	                c1.setPreco_venda(preco_venda);
	                lucro = c1.calculalucro();
	                System.out.println("Seu lucro foi: "+ lucro);
	            }
	        }
	        System.out.println("Placa nao Cadastrada!!!!");
	        
	    }

	    public static void listar() {
	            for (int i = 0; i < Carros.size(); i++) {
	                System.out.println(Carros.get(i).Imprimir());
	            }
	    }

	    public static boolean verificar_placa(String placa) {
	        for (int i = 0; i < Carros.size(); i++) {
	            if (Carros.get(i).getPlaca().equals(placa)) {
	                return true;
	            }
	        }
	        return false;
	    }
	}

	


