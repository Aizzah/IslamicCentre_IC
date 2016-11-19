package id.sch.smktelkom_mlg.xiirpl505152535.islamiccentre_ic;

        import android.media.Image;
        import android.media.MediaPlayer;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageButton;
        import android.widget.Toast;

public class Asmaulhusna extends AppCompatActivity {
            private static final String isPlaying = "Media is Playing";
            private MediaPlayer player;
            private ImageButton imageButtona;
            private ImageButton imageButtonb;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_asmaulhusna);


                imageButtona = (ImageButton)this.findViewById(R.id.imageButtona);
                imageButtona.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(1);
                    }
                });
                imageButtonb = (ImageButton)this.findViewById(R.id.imageButtonb);
                imageButtonb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        playSound(2);
                    }
                });
            }
    @Override
    public void onPause(){
        try{
            super.onPause();
            player.pause();
        }catch (Exception e){
        }
    }
    private void playSound(int arg){
        try {
            if (player.isPlaying()){
                player.stop();
                player.release();
            }
        }catch (Exception e){
            Toast.makeText(this, "Masuk Exception", Toast.LENGTH_LONG).show();
        }
        if (arg==1){
            Toast.makeText(this,isPlaying+" AsmaulHusna", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.a);
        }  else if (arg==2){
            Toast.makeText(this,isPlaying+" AsmaulHusna", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.b);
        }
        player.setLooping(false);
        player.start();
    }
}


