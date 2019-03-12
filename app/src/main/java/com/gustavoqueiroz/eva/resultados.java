package com.gustavoqueiroz.eva;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class resultados extends AppCompatActivity {

    private TextView vp;
    private TextView vc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        vp = findViewById(R.id.rVpr);
        vc = findViewById(R.id.rVC);

        // recuperar dados enviados
        Bundle dados = getIntent().getExtras();
        String str1 = dados.getString("vp");
        String str2 = dados.getString("va");

        vp.setText(str1);
        vc.setText(str2);

    }
}
