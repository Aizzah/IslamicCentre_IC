package id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic.hadist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic.MainActivity;
import id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic.R;

public class hadist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadist);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        findViewById(R.id.buttonKebersihan).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(hadist.this, Kebersihan.class));
            }
        });

        findViewById(R.id.buttonNiat).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(hadist.this, Niat.class));
            }
        });

        findViewById(R.id.buttonMenutupAurat).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(hadist.this, MenutupAurat.class));
            }
        });

        findViewById(R.id.buttonAgama).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(hadist.this, Agama.class));
            }
        });

        findViewById(R.id.buttonMenuntutilmu).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(hadist.this, MenuntutIlmu.class));
            }
        });

        findViewById(R.id.buttonBerkataBaik).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(hadist.this, MenuntutIlmu.class));
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
