package aula14outubro;

import java.awt.SystemTray;

public class Carro {
	/*
	placa
	cor
	fabricante
	modelo
	motorizacao
	preco_compra
	preco_venda
	
	funcao pra imprimir os dados 
	funcao pra calcular o lucro (venda-compra)
	*/
	private String placa;
	private String cor;
	private String fabricante;
	private String modelo;
	private double motorizacao;
	private double preco_compra;
	private double preco_venda;
	private double lucro;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMotorizacao() {
        return motorizacao;
    }

    public void setMotorizacao(double motorizacao) {
        this.motorizacao = motorizacao;
    }

    public double getPreco_compra() {
        return preco_compra;
    }

    public void setPreco_compra(double preco_compra) {
        this.preco_compra = preco_compra;
    }

    public double getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(double preco_venda) {
        this.preco_venda = preco_venda;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public String Imprimir(){
	
	String print="";
    return "Placa : "+this.placa+"\nCor: "+this.cor+"\nFabricante: "+this.fabricante+"\nModelo: "+this.modelo+"\nMotorizacao: "+this.motorizacao+"\nPreco de Compra: "+this.preco_compra+"\nSeu Lucro: "+calculalucro();
}

    public double calculalucro(){
        return preco_venda - preco_compra;
    }
}