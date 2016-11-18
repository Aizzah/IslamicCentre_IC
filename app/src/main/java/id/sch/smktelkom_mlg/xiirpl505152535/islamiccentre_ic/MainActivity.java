package id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic.doa.doa;
import id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic.doa.sebelummakan;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonAlquran).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, alquran.class));
            }
        });
        findViewById(R.id.buttonTajwid).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Tajwid.class));
            }
        });
        findViewById(R.id.buttonHijaiyah).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Hijaiyah.class));
            }
        });
        findViewById(R.id.buttonAsmaulhusna).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Asmaulhusna.class));
            }
        });
        findViewById(R.id.buttonHadist).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, hadist.class));
            }
        });
        findViewById(R.id.buttonDoa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, doa.class));
            }
        });

    }
}
