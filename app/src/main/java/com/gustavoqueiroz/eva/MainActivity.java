package com.gustavoqueiroz.eva;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText vp; // Valor previsto
    private EditText va; // Valor agregado
    private EditText cr; // Custo Real
    private TextView vpr; // Variação de progresso
    private TextView vc; // Variação de custo
    private TextView idc; // Índice de desempenho de custo
    private TextView idp; // Índice de desempenho de prazo
    private TextView status1; // Status IDC
    private TextView status2; // Status IDP


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = findViewById(R.id.vp);
        va = findViewById(R.id.va);
        cr = findViewById(R.id.cr);
        vpr = findViewById(R.id.vpr);
        vc = findViewById(R.id.vc);
        idc = findViewById(R.id.idc);
        idp = findViewById(R.id.idp);
        status1 = findViewById(R.id.status1);
        status2 = findViewById(R.id.status2);

    }

    public void alterarTexto(View view){

        // recuperar valores digitados
        String vlrPrevisto = vp.getText().toString();
        String vlrAgregado = va.getText().toString();
        String cstReal = cr.getText().toString();

        // validar campos digitados
        boolean camposValidados = this.validarCampos(vlrPrevisto, vlrAgregado, cstReal);

        if (camposValidados) {
            // cálculos
            double va = Double.parseDouble(vlrAgregado);
            double vp = Double.parseDouble(vlrPrevisto);
            double cr = Double.parseDouble(cstReal);

            double varProg = va - vp;
            double varCusto = va - cr;
            double idCusto = va / cr;
            double idPrazo = va / vp;

            String sts1;
            String sts2;

            DecimalFormat df = new DecimalFormat("#,##0.00");

            if (idCusto > 1){
                sts1 = "Projeto abaixo do orçamento (mais barato)";
            } else if (idCusto < 1) {
                sts1 = "Projeto acima do orçamento (mais caro)";
            } else {
                sts1 = "Projeto no orçamento";
            }

            if (idPrazo > 1){
                sts2 = "Projeto adiantado";
            } else if (idPrazo < 1){
                sts2 = "Projeto atrasado";
            } else {
                sts2 = "Projeto no prazo";
            }

            vpr.setText("VPr = R$ " + String.valueOf(df.format(varProg)));
            vc.setText("VC = R$ " + String.valueOf(df.format(varCusto)));
            idc.setText("IDC = " + String.valueOf(df.format(idCusto)));
            idp.setText("IDP = " + String.valueOf(df.format(idPrazo)));
            status1.setText("Status = " + sts1);
            status2.setText("Status = " + sts2);

        }

    }

    public boolean validarCampos(String vPrev, String vAgreg, String cReal){

        Boolean camposValidados = true;

        // validar campos
        if (vPrev == null || vPrev.equals("")){
            camposValidados = false;
        } else if (vAgreg == null || vAgreg.equals("")) {
            camposValidados = false;
        } else if (cReal == null || cReal.equals("")) {
            camposValidados = false;
        }

        return camposValidados;

    }

}
