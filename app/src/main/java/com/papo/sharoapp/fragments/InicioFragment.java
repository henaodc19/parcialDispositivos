package com.papo.sharoapp.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.papo.sharoapp.R;
import com.papo.sharoapp.interfaces.IComunicaFragments;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InicioFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InicioFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    View vista;
    Activity actividad;

    CardView cardCrearCredito, cardRealizarAbono, cardCartera, cardEstadoCredito;

    IComunicaFragments interfaceFragments;
    private OnFragmentInteractionListener mListener;

    public InicioFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InicioFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static InicioFragment newInstance(String param1, String param2) {
        InicioFragment fragment = new InicioFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment_inicio, container, false);

        cardCrearCredito = vista.findViewById(R.id.crearCredito);
        cardCrearCredito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interfaceFragments.crearCredito();
            }
        });

        cardRealizarAbono = vista.findViewById(R.id.abono);
        cardRealizarAbono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interfaceFragments.realizarAbono();
            }
        });

        return vista;
    }

    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof Activity) {
           actividad = (Activity) context;
            interfaceFragments = (IComunicaFragments) actividad;
        }

        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString() + "must implement");
        }
    }

    public interface OnFragmentInteractionListener {
    }
}
