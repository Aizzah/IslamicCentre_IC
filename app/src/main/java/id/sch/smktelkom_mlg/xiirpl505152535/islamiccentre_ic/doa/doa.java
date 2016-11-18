package id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic.doa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic.R;

public class doa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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
        findViewById(R.id.slswudhu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(doa.this, selesaiwudhu.class));
            }
        });
        findViewById(R.id.bacaquran).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(doa.this, akanmembacaquran.class));
            }
        });
        findViewById(R.id.mlhtkilat).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(doa.this, melihatkilat.class));
            }
        });
        findViewById(R.id.mndgrpetir).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(doa.this, mendengarpetir.class));
            }
        });
        findViewById(R.id.orgskt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(doa.this, menjengukorangsakit.class));
            }
        });
        findViewById(R.id.mndptmimpibaik).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(doa.this, mendapatmimipibaik.class));
            }
        });
        findViewById(R.id.trnhjn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(doa.this, turunhujan.class));
            }
        });
        findViewById(R.id.stlhhjn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(doa.this, setelahhujan.class));
            }
        });
        findViewById(R.id.adaangin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(doa.this, adaangin.class));
            }
        });
        findViewById(R.id.sblmbljr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(doa.this, sebelumbelajar.class));
            }
        });
        findViewById(R.id.ssdhbljr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(doa.this, sesudahbelajar.class));
            }
        });
        findViewById(R.id.pagihari).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(doa.this, pagihari.class));
            }
        });
        findViewById(R.id.sorehari).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(doa.this, sorehari.class));
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
