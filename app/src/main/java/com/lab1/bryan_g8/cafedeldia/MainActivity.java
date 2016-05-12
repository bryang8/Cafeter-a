package com.lab1.bryan_g8.cafedeldia;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtPedido=null;
    private Button btnPedido=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtPedido = (EditText)findViewById(R.id.txtPedido);
        btnPedido = (Button) findViewById(R.id.btnPedido);
        btnPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Click en Pedido", Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}
