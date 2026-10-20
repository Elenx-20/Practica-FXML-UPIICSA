package com.elena.ejerciciodinero;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtDinero;

    @FXML
    private Label lbl500, lbl200, lbl100, lbl50, lbl20;
    
    @FXML
    private Label lbl10, lbl5, lbl2, lbl1, lblMensaje;

    @FXML
    private void desglosar() {

        try {
            int dinero = Integer.parseInt(txtDinero.getText().trim());

            if (dinero < 0) {
                lblMensaje.setText("Ingresa una cantidad positiva.");
                return;
            }

            int billete500 = dinero / 500;
            dinero = dinero % 500;
            int billete200 = dinero / 200;
            dinero = dinero % 200;
            int billete100 = dinero / 100;
            dinero = dinero % 100;
            int billete50 = dinero / 50;
            dinero = dinero % 50;
            int billete20 = dinero / 20;
            dinero = dinero % 20;
            int moneda10 = dinero / 10;
            dinero = dinero % 10;
            int moneda5 = dinero / 5;
            dinero = dinero % 5;
            int moneda2 = dinero / 2;
            dinero = dinero % 2;
            int moneda1 = dinero;

            lbl500.setText(String.valueOf(billete500));
            lbl200.setText(String.valueOf(billete200));
            lbl100.setText(String.valueOf(billete100));
            lbl50.setText(String.valueOf(billete50));
            lbl20.setText(String.valueOf(billete20));
            lbl10.setText(String.valueOf(moneda10));
            lbl5.setText(String.valueOf(moneda5));
            lbl2.setText(String.valueOf(moneda2));
            lbl1.setText(String.valueOf(moneda1));

            lblMensaje.setText("Desglose realizado correctamente.");

        } catch (NumberFormatException e) {
            lblMensaje.setText("Escribe una cantidad entera válida.");
        }
    }

    @FXML
    private void limpiar() {
        txtDinero.clear();

        lbl500.setText("0");
        lbl200.setText("0");
        lbl100.setText("0");
        lbl50.setText("0");
        lbl20.setText("0");
        lbl10.setText("0");
        lbl5.setText("0");
        lbl2.setText("0");
        lbl1.setText("0");

        lblMensaje.setText("");
    }
}
