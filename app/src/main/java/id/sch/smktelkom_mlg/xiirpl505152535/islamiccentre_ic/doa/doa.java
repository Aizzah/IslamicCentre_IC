package id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic.doa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic.R;

public class doa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa);

        findViewById(R.id.sblmmkn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(doa.this, sebelummakan.class));
            }
        });
        findViewById(R.id.ssdhmkn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(doa.this, sesudahmakan.class));
            }
        });
        findViewById(R.id.sblmtdr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(doa.this, sebelumtidur.class));
            }
        });
        findViewById(R.id.ssdhtdr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(doa.this, sesudahtidur.class));
            }
        });
        findViewById(R.id.mskwc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(doa.this, masukwc.class));
            }
        });
        findViewById(R.id.klrwc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(doa.this, keluarwc.class));
            }
        });
        findViewById(R.id.aknmndi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(doa.this, akanmandi.class));
            }
        });
        findViewById(R.id.bercermin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(doa.this, bercermin.class));
            }
        });
        findViewById(R.id.mskrmh).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(doa.this, masukrumah.class));
            }
        });
        findViewById(R.id.klrrmh).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(doa.this, keluarrumah.class));
            }
        });
        findViewById(R.id.sblmwudhu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(doa.this, sebelumwudhu.class));
            }
        });
    }
}
