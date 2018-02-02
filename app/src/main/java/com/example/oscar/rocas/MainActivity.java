package com.example.oscar.rocas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    public Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //La barra de herramienta ahora es un toolbar
        toolbar = (Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
    }

    public void ejecutar_info(View view){
        //Lo que quiero que ejecute, le paso este contesto y que ejecute este class
        Intent i = new Intent(this,InfoClass.class);
        startActivity(i);
    }
    public void salir(View vista){
        finish();
    }
    //Esto es para inflar el menu, depende del layaout menu_activity
    @Override
    public boolean onCreateOptionsMenu(Menu mimenu){
        getMenuInflater().inflate(R.menu.menu_activity,mimenu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem opcionMenu){
        int id = opcionMenu.getItemId();  //Obtengo el id pulsado
        if(id==R.id.configuracion){
            return true;
        }
        if(id==R.id.informacion){
            ejecutar_info(null);
        }
        return super.onOptionsItemSelected(opcionMenu);
    }
}
