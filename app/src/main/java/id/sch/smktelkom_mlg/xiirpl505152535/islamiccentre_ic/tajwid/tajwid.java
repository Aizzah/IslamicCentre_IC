package id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic.tajwid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic.R;

public class tajwid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tajwid);

        findViewById(R.id.aa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tajwid.this, idghombighunah.class));
            }
        });

        findViewById(R.id.ab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tajwid.this, idghombilaghunah.class));
            }
        });

        findViewById(R.id.ac).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tajwid.this, idzhar.class));
            }
        });

        findViewById(R.id.ad).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tajwid.this, iqlab.class));
            }
        });

        findViewById(R.id.ae).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tajwid.this, ikhfa.class));
            }
        });

        findViewById(R.id.af).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tajwid.this, idghommimi.class));
            }
        });

        findViewById(R.id.ag).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tajwid.this, ikhfasafawi.class));
            }
        });

        findViewById(R.id.ah).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tajwid.this, idzharsafawi.class));
            }
        });

        findViewById(R.id.ai).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tajwid.this, idghommutamatsilain.class));
            }
        });

        findViewById(R.id.aj).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tajwid.this, idghommutajanisain.class));
            }
        });

        findViewById(R.id.ak).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tajwid.this, idghommutaqorribain.class));
            }
        });

    }
}
