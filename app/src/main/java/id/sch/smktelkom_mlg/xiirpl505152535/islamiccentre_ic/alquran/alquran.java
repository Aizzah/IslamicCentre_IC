package id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic.alquran;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic.MainActivity;
import id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic.R;

public class alquran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alquran);

        findViewById(R.id.a).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this, a_alfatihah.class));
            }
        });
    }
}
