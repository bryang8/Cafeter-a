package com.lab1.bryan_g8.cafedeldia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FacturaActivity extends AppCompatActivity {
    TextView txtPedidos = null;
    TextView txtTotal = null;
    Button btnRegresar = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura);
        txtPedidos =(TextView)findViewById(R.id.mtextPedido);
        txtTotal = (TextView)findViewById(R.id.mtextTotal);
        btnRegresar = (Button)findViewById(R.id.btnRegresar);
        Bundle bundle = getIntent().getExtras();
        Integer tazas = Integer.parseInt(bundle.getString("tazas"));
        txtPedidos.setText(tazas.toString());
        Double total = tazas*7.5;
        txtTotal.setText("Q"+total.toString());
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FacturaActivity.this,MainActivity.class));
            }
        });
    }
}
