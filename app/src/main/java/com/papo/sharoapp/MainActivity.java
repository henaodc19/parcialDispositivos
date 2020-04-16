package com.papo.sharoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.papo.sharoapp.acciones.CrearCreditoActivity;
import com.papo.sharoapp.fragments.CrearCreditoFragment;
import com.papo.sharoapp.fragments.InicioFragment;
import com.papo.sharoapp.interfaces.IComunicaFragments;

public class MainActivity extends AppCompatActivity implements IComunicaFragments, InicioFragment.OnFragmentInteractionListener {

    Fragment fragmentInicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentInicio = new InicioFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragment,fragmentInicio).commit();

    }

    @Override
    public void crearCredito() {
        //Toast.makeText(getApplicationContext(),"Se ingresa credito", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, CrearCreditoActivity.class);
        startActivity(intent);

    }

    @Override
    public void realizarAbono() {
        Toast.makeText(getApplicationContext(),"Se ingresa abono", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void cartera() {
        Toast.makeText(getApplicationContext(),"Se ingresa cartera", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void EstadoCredito() {
        Toast.makeText(getApplicationContext(),"Se ingresa estado credito", Toast.LENGTH_SHORT).show();
    }

}
