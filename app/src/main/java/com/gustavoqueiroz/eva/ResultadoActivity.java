package com.gustavoqueiroz.eva;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.text.DecimalFormat;

public class ResultadoActivity extends AppCompatActivity {

    private TextView vp, va, cr, vpr, vc, idc, sts1, idp, sts2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        vp = findViewById(R.id.r_vp);
        va = findViewById(R.id.r_va);
        cr = findViewById(R.id.r_cr);

        vpr = findViewById(R.id.vpr);
        vc = findViewById(R.id.vc);
        idc = findViewById(R.id.idc);
        sts1 = findViewById(R.id.status1);
        idp = findViewById(R.id.idp);
        sts2 = findViewById(R.id.status2);

        // recuperar os dados enviados.
        Bundle dados = getIntent().getExtras();

        double d1 = Double.parseDouble(dados.getString("vp"));
        double d2 = Double.parseDouble(dados.getString("va"));
        double d3 = Double.parseDouble(dados.getString("cr"));

        DecimalFormat df = new DecimalFormat("#,##0.00");

        String vvp = "VP = R$ " + String.valueOf(df.format(d1));
        String vva = "VA = R$ " + String.valueOf(df.format(d2));
        String vcr = "CR = R$ " + String.valueOf(df.format(d3));

        vp.setText(vvp);
        va.setText(vva);
        cr.setText(vcr);

        vpr.setText("VPr = R$ " + String.valueOf(df.format(d2-d1)));
        vc.setText("VC = R$ " + String.valueOf(df.format(d2-d3)));
        idc.setText("IDC = " + String.valueOf(df.format(d2/d3)));

        if (d2/d3 > 1 ){
            sts1.setText("Status = Projeto abaixo do orçamento (mais barato)");
        } else if (d2/d3 < 1){
            sts1.setText("Status = Projeto acima do orçamento (mais caro)");
        } else {
            sts1.setText("Status = Projeto no orçamento");
        }

        idp.setText("IDP = " + String.valueOf(df.format(d2/d1)));

        if (d2/d1 > 1 ){
            sts2.setText("Status = Projeto adiantado");
        } else if (d2/d1 < 1){
            sts2.setText("Status = Projeto atrasado");
        } else {
            sts2.setText("Status = Projeto no prazo");
        }

    }
}
