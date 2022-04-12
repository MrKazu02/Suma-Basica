package mrkazu02.github.sumabasica;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView titulo;
    TextView operacion;
    Button boton1;
    Button boton2;
    Button boton3;
    int numero_a_operar1;
    int numero_a_operar2;
    int numero_opcion1;
    int numero_opcion2;
    int numero_opcion3;
    String operacionTexto;
    int random1;
    int random2;
    int random3;
    int numeroGuardado1;
    int numeroGuardado2;
    int numeroGuardado3;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titulo = findViewById(R.id.titulo);
        operacion = findViewById(R.id.operacion);
        boton1 = findViewById(R.id.boton1);
        boton2 = findViewById(R.id.boton2);
        boton3 = findViewById(R.id.boton3);

        numero_a_operar1 = (int) (Math.random() * 95 + 1);
        numero_a_operar2 = (int) (Math.random() * 95 + 1);

        operacionTexto = numero_a_operar1 + " + " + numero_a_operar2;
        operacion.setText(operacionTexto);

        numero_opcion1 = numero_a_operar1 + numero_a_operar2;
        numero_opcion2 = (int) (Math.random() * 100 + 1);
        numero_opcion3 = (int) (Math.random() * 100 + 1);

        random1 = (int) (Math.random() * 3 + 1);
        random2 = (int) (Math.random() * 3 + 1);
        random3 = (int) (Math.random() * 3 + 1);

        if(random1 == 1){
            boton1.setText(" "+numero_opcion1);
            numeroGuardado1 = numero_opcion1;
        }else if(random1 == 2){
            boton1.setText(" "+numero_opcion2);
            numeroGuardado1 = numero_opcion2;
        }else if(random1 == 3){
            boton1.setText(" "+numero_opcion3);
            numeroGuardado1 = numero_opcion3;
        }

        while(random2 == random1){

            random2 = (int) (Math.random() * 3 + 1);

        }

        if(random2 == 1){
            boton2.setText(" "+numero_opcion1);
            numeroGuardado2 = numero_opcion1;
        }else if(random2 == 2){
            boton2.setText(" "+numero_opcion2);
            numeroGuardado2 = numero_opcion2;
        }else if(random2 == 3){
            boton2.setText(" "+numero_opcion3);
            numeroGuardado2 = numero_opcion3;
        }

        while(random3 == random1 || random3 == random2){

            random3 = (int) (Math.random() * 3 + 1);

        }

        if(random3 == 1){
            boton3.setText(" "+numero_opcion1);
            numeroGuardado3 = numero_opcion1;
        }else if(random3 == 2){
            boton3.setText(" "+numero_opcion2);
            numeroGuardado3 = numero_opcion2;
        }else if(random3 == 3){
            boton3.setText(" "+numero_opcion3);
            numeroGuardado3 = numero_opcion3;
        }


        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(numeroGuardado1 == numero_opcion1){

                    mp = MediaPlayer.create(MainActivity.this,R.raw.correcto);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            mp.stop();
                        }
                    });
                    mp.start();
                    reiniciarActivity(MainActivity.this);
                }else{

                    mp = MediaPlayer.create(MainActivity.this,R.raw.incorrecto);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            mp.stop();
                        }
                    });
                    mp.start();
                    reiniciarActivity(MainActivity.this);

                }

            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(numeroGuardado2 == numero_opcion1){

                    mp = MediaPlayer.create(MainActivity.this,R.raw.correcto);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            mp.stop();
                        }
                    });
                    mp.start();
                    reiniciarActivity(MainActivity.this);
                }else{

                    mp = MediaPlayer.create(MainActivity.this,R.raw.incorrecto);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            mp.stop();
                        }
                    });
                    mp.start();
                    reiniciarActivity(MainActivity.this);

                }

            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(numeroGuardado3 == numero_opcion1){

                    mp = MediaPlayer.create(MainActivity.this,R.raw.correcto);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            mp.stop();
                        }
                    });
                    mp.start();
                    reiniciarActivity(MainActivity.this);
                }else{

                    mp = MediaPlayer.create(MainActivity.this,R.raw.incorrecto);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            mp.stop();
                        }
                    });
                    mp.start();
                    reiniciarActivity(MainActivity.this);

                }

            }
        });

    }

    public static void reiniciarActivity(Activity actividad){
        Intent intent=new Intent();
        intent.setClass(actividad, actividad.getClass());
        //llamamos a la actividad
        actividad.startActivity(intent);
        //finalizamos la actividad actual
        actividad.finish();
    }

}