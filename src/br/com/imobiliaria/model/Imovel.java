package br.com.imobiliaria.model;

public class Imovel extends Calculos {
    private String proprietario;
    private String cidade;
    private double area;


    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    public String obterDadosImovel(){
        return "Proprietário: " + this.proprietario + "\nCidade: " + this.cidade + "\nÁrea: " + this.area;
    }

}
