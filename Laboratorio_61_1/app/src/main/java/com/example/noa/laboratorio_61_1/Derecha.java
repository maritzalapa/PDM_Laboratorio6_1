package com.example.noa.laboratorio_61_1;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by noa on 19/02/16.
 */
public class Derecha extends Fragment{
    View rootView;
    TextView txt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView= inflater.inflate (R.layout.derecha, container, false);
        txt = (TextView) rootView.findViewById(R.id.textViewRight);
        return rootView;
    }

    public void obtenerDatos(String mensaje){
        txt.setText(mensaje);
    }
}








































