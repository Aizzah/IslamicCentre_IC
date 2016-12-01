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
        findViewById(R.id.b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this, b_albaqarah.class));
            }
        });
        findViewById(R.id.c).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this, c_alimran.class));
            }
        });
        findViewById(R.id.d).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this, d_annisa.class));
            }
        });
        findViewById(R.id.e).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this, e_almaaidah.class));
            }
        });
        findViewById(R.id.f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this, f_alanam.class));
            }
        });
        findViewById(R.id.g).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this, g_alaraf.class));
            }
        });
        findViewById(R.id.h).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this,h_alanfal.class));
            }
        });
        findViewById(R.id.i).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this, i_attawbah.class));
            }
        });
        findViewById(R.id.j).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this, j_yunus.class));
            }
        });
        findViewById(R.id.k).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this, k_hud.class));
            }
        });
        findViewById(R.id.l).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this, l_yusuf.class));
            }
        });
        findViewById(R.id.m).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this,m_arrad.class));
            }
        });
        findViewById(R.id.n).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this, n_ibrahim.class));
            }
        });
        findViewById(R.id.o).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this, o_alhijr.class));
            }
        });
        findViewById(R.id.p).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this, p_annahl.class));
            }
        });
        findViewById(R.id.q).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this, q_alisra.class));
            }
        });
        findViewById(R.id.r).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this, r_alkahfi.class));
            }
        });
        findViewById(R.id.s).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this, s_maryam.class));
            }
        });
        findViewById(R.id.t).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this, t_taha.class));
            }
        });
        findViewById(R.id.u).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this,u_alanbiya.class));
            }
        });
        findViewById(R.id.v).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this, v_alhajj.class));
            }
        });
        findViewById(R.id.w).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this, w_almuminun.class));
            }
        });
        findViewById(R.id.x).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this,x_annur.class));
            }
        });
        findViewById(R.id.y).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this,y_alfurqan.class));
            }
        });
        findViewById(R.id.z).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this,z_asysyuara.class));
            }
        });
        findViewById(R.id.aa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this, aa_annaml.class));
            }
        });
        findViewById(R.id.ab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this, ab_alqossos.class));
            }
        });
        findViewById(R.id.ac).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this, ac_alankabut.class));
            }
        });
        findViewById(R.id.ad).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(alquran.this,ad_arrum.class));
            }
        });
    }
}
