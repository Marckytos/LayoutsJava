package org.example;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana extends Frame {
    private Label lblEtiqueta1;
    private Label lblEtiqueta2;
    private TextField txtcuadro1;
    private TextField txtcuadro2;
    private Button boton1;
    private FlowLayout layout;

    public Ventana(String title) throws HeadlessException {
        super(title);
        layout= new FlowLayout(FlowLayout.LEFT);
        this.setLayout(layout);

        lblEtiqueta1 = new Label("Etiqueta 1");
        this.add(lblEtiqueta1);
        txtcuadro1= new TextField(30);
        this.add(txtcuadro1);

        lblEtiqueta2 = new Label("Etiqueta 2");
        this.add(lblEtiqueta2);
        txtcuadro2= new TextField(30);
        this.add(txtcuadro2);

        this.setSize(800,600);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
