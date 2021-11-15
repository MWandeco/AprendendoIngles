package com.example.aprendendoingles.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.aprendendoingles.R;


public class NumerosFragment extends Fragment implements View.OnClickListener {

    private ImageButton btnUm,btnDois,btnTres,
    btnQuatro,btnCinco,btnSeis;

    private MediaPlayer mediaPlayer;

    public NumerosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_numeros, container, false);

        btnUm = view.findViewById(R.id.imgNumeroUm);
        btnDois = view.findViewById(R.id.imgNumeroDois);
        btnTres = view.findViewById(R.id.imgNumeroTres);
        btnQuatro = view.findViewById(R.id.imgNumeroQuatro);
        btnCinco = view.findViewById(R.id.imgNumeroCinco);
        btnSeis = view.findViewById(R.id.imgNumeroSeis);

        //colocar eventos de clique

        btnUm.setOnClickListener(this);
        btnDois.setOnClickListener(this);
        btnTres.setOnClickListener(this);
        btnQuatro.setOnClickListener(this);
        btnCinco.setOnClickListener(this);
        btnSeis.setOnClickListener(this);




        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.imgNumeroUm:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.one);
                tocarSom();
                break;
            case R.id.imgNumeroDois:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.two);
                tocarSom();
                break;
            case R.id.imgNumeroTres:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.three);
                tocarSom();
                break;
            case R.id.imgNumeroQuatro:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.four);
                tocarSom();
                break;
            case R.id.imgNumeroCinco:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.five);
                tocarSom();
                break;
            case R.id.imgNumeroSeis:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.six);
                tocarSom();
                break;
        }

    }

    public void tocarSom(){
        if(mediaPlayer != null){
            mediaPlayer.start();

            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer.release();
                }
            });
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

}