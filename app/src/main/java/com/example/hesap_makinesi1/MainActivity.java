package com.example.hesap_makinesi1;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.hesap_makinesi1.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText sonuc;
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,
            arti,eksi,carpma,bolme,virgul,esittir,temizle;

    Float deger1 , deger2;
    Boolean topla =false, cikarma=false, carp=false, bol=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        virgul = (Button)findViewById(R.id.virgul);
        button0 = (Button)findViewById(R.id.button0);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        esittir = (Button)findViewById(R.id.esittir);
        arti = (Button)findViewById(R.id.arti);
        eksi = (Button)findViewById(R.id.eksi);
        carpma = (Button)findViewById(R.id.carpma);
        bolme = (Button)findViewById(R.id.bolme);
        sonuc = (EditText)findViewById(R.id.sonuc);
        temizle = (Button)findViewById(R.id.temizle);

        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                sonuc.setText(sonuc.getText()+"0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                sonuc.setText(sonuc.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                sonuc.setText(sonuc.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                sonuc.setText(sonuc.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                sonuc.setText(sonuc.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                sonuc.setText(sonuc.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                sonuc.setText(sonuc.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                sonuc.setText(sonuc.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                sonuc.setText(sonuc.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                sonuc.setText(sonuc.getText()+"9");
            }
        });

        virgul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                sonuc.setText(sonuc.getText()+",");
            }
        });

        temizle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                sonuc.setText("");
            }
        });

        arti.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                if(sonuc==null){
                    sonuc.setText("");
                }else{
                    deger1=Float.parseFloat(sonuc.getText()+"");
                    topla=true;
                    sonuc.setText(null);
                }
            }
        });

        eksi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                deger1=Float.parseFloat(sonuc.getText()+"");
                cikarma=true;
                sonuc.setText(null);
            }
        });

        carpma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                deger1=Float.parseFloat(sonuc.getText()+"");
                carp=true;
                sonuc.setText(null);
            }
        });

        bolme.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                deger1=Float.parseFloat(sonuc.getText()+"");
                bol=true;
                sonuc.setText(null);
            }
        });

        esittir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                deger2=Float.parseFloat(sonuc.getText()+"");

                if(topla==true){
                    sonuc.setText(deger1 + deger2 +"");
                    topla=false;
                }
                if(cikarma==true){
                    sonuc.setText(deger1 - deger2 +"");
                    cikarma=false;
                }
                if(bol==true){
                    sonuc.setText(deger1 / deger2 +"");
                    bol=false;
                }
                if(carp==true){
                    sonuc.setText(deger1 * deger2 +"");
                    carp=false;
                }
            }
        });
    }
}
