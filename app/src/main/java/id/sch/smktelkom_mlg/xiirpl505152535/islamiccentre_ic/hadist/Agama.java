package id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic.hadist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic.R;
public class Agama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agama);

        findViewById(R.id.buttonBackAgama).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                onBackPressed();
            }
        });
    }
}
