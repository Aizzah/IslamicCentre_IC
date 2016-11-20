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
                startActivity(new Intent(hadist.this, BerkataBaik.class));
            }
        });

        findViewById(R.id.buttonMalu).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(hadist.this, Malu.class));
            }
        });

        findViewById(R.id.buttonMenyebarkanSalam).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(hadist.this, MenyebarkanSalam.class));
            }
        });

        findViewById(R.id.buttonKemuliaanIbu).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(hadist.this, KemuliaanIbu.class));
            }
        });

        findViewById(R.id.buttonKeutamaanBelajarAlquran).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(hadist.this, KeutamaanBelajarAlquran.class));
            }
        });

        findViewById(R.id.buttonMahaIndah).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(hadist.this, MahaIndah.class));
            }
        });

        findViewById(R.id.buttonSholatTepatWaktu).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(hadist.this, SholatTepatWaktu.class));
            }
        });

        findViewById(R.id.buttonKeutamaanDoa).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(hadist.this, KeutamaanDoa.class));
            }
        });

        findViewById(R.id.buttonTolongMenolong).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(hadist.this, TolongMenolong.class));
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
