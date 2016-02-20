package com.example.noa.laboratorio_61_1;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements enviarMensaje {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        //Appbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        //Appbar page filter
        Spinner cmbToolbar = (Spinner) findViewById(R.id.CmbToolbar);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getSupportActionBar().getThemedContext(),
                R.layout.appbar_filter_title,
                new String[]{"Opción 1 ", "Opción 2 ", "Opción 3 "});
        adapter.setDropDownViewResource(R.layout.appbar_filter_list);
        cmbToolbar.setAdapter(adapter);
        cmbToolbar.setOnItemSelectedListener(
            new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view,
                                           int i, long l) {
                    //... Acciones al seleccionar una opción de la lista
                    Log.i("Toolbar 3", "Seleccionada opción " + i);
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {
                    //... Acciones al no existir ningún elemento seleccionado
                }
            });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean showToastMessageSettings(MenuItem item) {
        String texto = "Se presionó SETTINGS";
        Toast toast = Toast.makeText(getApplicationContext(), texto, Toast.LENGTH_SHORT);
        toast.show();
        return true;
    }

    public boolean showToastMessageSearch(MenuItem item) {
        String texto = "Se presionó SEARCH";
        Toast toast = Toast.makeText(getApplicationContext(), texto, Toast.LENGTH_SHORT);
        toast.show();
        return true;
    }

    public boolean showToastMessageNew(MenuItem item) {
        String texto = "Se presionó NEW";
        Toast toast = Toast.makeText(getApplicationContext(), texto, Toast.LENGTH_SHORT);
        toast.show();
        return true;
    }

    public void enviarDatos(String mensaje) {
        Derecha derecha = (Derecha) getSupportFragmentManager().findFragmentById(R.id.derecho);
        derecha.obtenerDatos(mensaje);
    }





}




































