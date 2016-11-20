package id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic.hadist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic.MainActivity;
import id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic.R;

public class hadist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadist);

        findViewById(R.id.buttonKeutamaansenyum).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(hadist.this, KeutamaanSenyum.class));
            }
        });

    }
}
