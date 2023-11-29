package br.com.imobiliaria.controller;

import br.com.imobiliaria.model.Calculos;
import br.com.imobiliaria.model.Imovel;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;

public class JFXImobiliaria {
    public TextField tfProprietario;
    public TextField tfCidade;
    public TextField tfArea;
    public Button bQuadrado;
    public Button bRetangulo;
    public Button bTriangulo;
    public Button bCirculo;
    public Button bLosango;
    public Button bSalvar;
    public Button bFechar;

    Calculos calculos = new Calculos();
    Imovel imovel = new Imovel();


    public void calcularQuadrado(ActionEvent actionEvent) {
        double lado = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o lado"));
        tfArea.setText(String.valueOf(calculos.calcularAreaQuadrado(lado)));
    }

    public void calcularRetangulo(ActionEvent actionEvent) {
        double base = Double.parseDouble(JOptionPane.showInputDialog(null,"informe a base"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe a altura"));
        tfArea.setText(String.valueOf(calculos.calcularAreaRetangulo(base, altura)));
    }

    public void calcularTriangulo(ActionEvent actionEvent) {
        double base = Double.parseDouble(JOptionPane.showInputDialog(null,"informe a base"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe a altura"));
        tfArea.setText(String.valueOf(calculos.calcularAreaTriangulo(base, altura)));
    }

    public void calcularCirculo(ActionEvent actionEvent) {
        double raio = Double.parseDouble(JOptionPane.showInputDialog(null,"informe o raio"));
        tfArea.setText(String.valueOf(calculos.calcularAreaCirculo(raio)));
    }

    public void calcularLosango(ActionEvent actionEvent) {
        double diagonalMenor = Double.parseDouble(JOptionPane.showInputDialog(null,"informe a diagonal menor"));
        double diagonalMaior = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe a diagonal maior"));
        tfArea.setText(String.valueOf(calculos.calcularAreaLosango(diagonalMenor, diagonalMaior)));
    }

    public void salvar(ActionEvent actionEvent) {
        imovel.setProprietario(tfProprietario.getText());
        imovel.setCidade(tfCidade.getText());
        imovel.setArea(Double.parseDouble(tfArea.getText()));
        String dados = imovel.obterDadosImovel();

        JOptionPane.showMessageDialog(null, dados);
    }

    public void fechar(ActionEvent actionEvent) {
        // finaliza uma operação. Comando vinculado ao evento click do botão
        System.exit(0);
    }

}
