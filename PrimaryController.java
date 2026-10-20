package com.elena.ejerciciogastos;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtDia;

    @FXML
    private TextField txtGasto;

    @FXML
    private TextArea txtRegistro;

    @FXML
    private Label lblMensaje;

    @FXML
    private Label lblTotal;

    private double total = 0;

    @FXML
    private void registrarGasto() {
        try {
            String dia = txtDia.getText().trim();
            double gasto = Double.parseDouble(txtGasto.getText());

            if (dia.isEmpty() || gasto < 0) {
                lblMensaje.setText(
                    "Escribe un día y una cantidad válida."
                );
                return;
            }

            txtRegistro.appendText(
                dia + ": $" + String.format("%.2f", gasto) + "\n"
            );

            total += gasto;

            lblTotal.setText(
                "Total gastado: $" + String.format("%.2f", total)
            );

            lblMensaje.setText("Gasto registrado.");

            txtDia.clear();
            txtGasto.clear();

        } catch (NumberFormatException e) {
            lblMensaje.setText("Ingresa una cantidad válida.");
        }
    }

    @FXML
    private void limpiar() {
        txtDia.clear();
        txtGasto.clear();
        txtRegistro.clear();

        total = 0;

        lblTotal.setText("Total gastado: $0.00");
        lblMensaje.setText("");
    }
}
