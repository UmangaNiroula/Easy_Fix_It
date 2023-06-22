package com.example.easyfixit.Fragment_Pages.BottomSheetFragment;

import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;

import com.example.easyfixit.R;
import com.example.easyfixit.ServiceDetailPage;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class ServiceOptionHome extends BottomSheetDialogFragment implements View.OnClickListener{

    private CardView plumber;
    private CardView electrical;
    private CardView motor;
    private CardView metal;
    private CardView generator;
    private CardView chimney;
    private CardView inverter;

    public ServiceOptionHome() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_service_option_home, container, false);

        assignObject(view);
        setOnClickListenerManual();

        return view;
    }

    private void assignObject(View view) {

        plumber = view.findViewById(R.id.plumber);
        electrical = view.findViewById(R.id.electrical);
        motor = view.findViewById(R.id.motor);
        metal = view.findViewById(R.id.metal);
        generator = view.findViewById(R.id.generator);
        chimney = view.findViewById(R.id.chimney);
        inverter = view.findViewById(R.id.inverter);
    }

    private void setOnClickListenerManual() {

        plumber.setOnClickListener(this);
        electrical.setOnClickListener(this);
        motor.setOnClickListener(this);
        metal.setOnClickListener(this);
        generator.setOnClickListener(this);
        chimney.setOnClickListener(this);
        inverter.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(requireContext(), ServiceDetailPage.class);
        switch (v.getId())
        {
            case R.id.plumber:

                intent.putExtra("listen", "Plumbing Services");
                startActivity(intent);
                break;

            case R.id.electrical:
                intent.putExtra("listen", "Electrical Services");
                startActivity(intent);
                break;

            case R.id.motor:
                intent.putExtra("listen", "Motor Services");
                startActivity(intent);
                break;

            case R.id.metal:
                intent.putExtra("listen", "Metal Services");
                startActivity(intent);
                break;

            case R.id.generator:
                intent.putExtra("listen", "Generator Services");
                startActivity(intent);
                break;

            case R.id.chimney:
                intent.putExtra("listen", "Chimney Services");
                startActivity(intent);
                break;

            case R.id.inverter:
                intent.putExtra("listen", "Inverter Services");
                startActivity(intent);
                break;

        }

    }
}