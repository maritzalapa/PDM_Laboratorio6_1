package com.example.noa.laboratorio_61_1;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by noa on 19/02/16.
 */
public class Izquierda extends Fragment {
    View rootView;
    Button boton;
    EditText campo;
    enviarMensaje EM;

    public Izquierda(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView= inflater.inflate (R.layout.izquierda, container, false);
        campo = (EditText) rootView.findViewById(R.id.editTextLeft);
        boton= (Button) rootView.findViewById(R.id.buttonLeft);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje;
                mensaje = campo.getText().toString();
                EM.enviarDatos(mensaje);
            }
        });

        return rootView;
    }

    public void onAttach(Context context){
        super.onAttach(getActivity());
        try{
            EM = (enviarMensaje) getActivity();
        } catch (ClassCastException e) {
            throw new ClassCastException ("Necesitas implementar mensaje");
        }
    }
}


