package com.cappcitate.dayanavaio.proyectotransmilenio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class CompartirInfoBus extends ActionBarActivity {

    private Spinner ListaDesplegable;
    private List<String> lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compartir_info_bus);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_compartir_info_bus, menu);
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

    private void DatosPorDefecto() {
        ListaDesplegable = (Spinner) findViewById(R.id.ListadodeTransmis);
        lista = new ArrayList<String>();
        ListaDesplegable = (Spinner) this.findViewById(R.id.ListadodeTransmis);
        lista.add("H74 Portal Usme");
        lista.add("H15 Portal Tunal");
        lista.add("B70 Portal Norte");
        lista.add("L80 Portal 20 de Julio");
        lista.add("M82 Santa Barbara");
        lista.add("F1 Portal Americas");
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ListaDesplegable.setAdapter(adaptador);
    }
}
