package com.gustavoqueiroz.eva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText vp;
    private EditText va;
    private EditText cr;
    private Button calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = findViewById(R.id.vp);
        va = findViewById(R.id.va);
        cr = findViewById(R.id.cr);

        calc = findViewById(R.id.calc);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);

                // passar dados
                intent.putExtra("vp", vp.getText().toString());
                intent.putExtra("va", va.getText().toString());
                intent.putExtra("cr", cr.getText().toString());

                startActivity(intent);

            }
        });

    }
}
