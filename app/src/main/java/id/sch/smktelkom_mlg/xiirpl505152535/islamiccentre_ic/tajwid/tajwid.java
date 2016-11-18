package id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic.tajwid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic.R;
import id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic.doa.doa;
import id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic.doa.sebelummakan;

public class tajwid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tajwid);

        findViewById(R.id.idgmbgnh).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tajwid.this, idghambigunah.class));
            }
        });

        findViewById(R.id.idgmblgnh).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tajwid.this, idghombilaghunah.class));
            }
        });

        findViewById(R.id.idzhr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tajwid.this, Idzhar.class));
            }
        });

        findViewById(R.id.iqlb).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tajwid.this, Iqlab.class));
            }
        });

        findViewById(R.id.ikhfa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tajwid.this, Ikhfa.class));
            }
        });

        findViewById(R.id.idghmmm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tajwid.this, idghommimi.class));
            }
        });
}
}
