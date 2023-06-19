package com.example.easyfixit.Fragment_Pages.BottomSheetFragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.easyfixit.R;
import com.example.easyfixit.ServiceDetailPage;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class ServiceOptionCleaning extends BottomSheetDialogFragment implements View.OnClickListener {

    private CardView tank;
    private CardView septic;
    private CardView household;
    private CardView pest;
    private CardView glassCleaning;

    public ServiceOptionCleaning() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_service_option_cleaning, container, false);

        assignObject(view);
        setOnClickListenerManual();

        return view;
    }


    private void assignObject(View view) {

        tank = view.findViewById(R.id.tank);
        septic = view.findViewById(R.id.septic);
        household = view.findViewById(R.id.household);
        pest = view.findViewById(R.id.pest);
        glassCleaning = view.findViewById(R.id.glassCleaning);

    }

    private void setOnClickListenerManual() {

        tank.setOnClickListener(this);
        septic.setOnClickListener(this);
        household.setOnClickListener(this);
        pest.setOnClickListener(this);
        glassCleaning.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(requireContext(), ServiceDetailPage.class);
        switch (v.getId())
        {
            case R.id.tank:

                intent.putExtra("listen", "Water Tank Cleaning");
                startActivity(intent);
                break;

            case R.id.septic:
                intent.putExtra("listen", "Septic Tank Cleaning");
                startActivity(intent);
                break;

            case R.id.household:

                intent.putExtra("listen", "Household Cleaning");
                startActivity(intent);
                break;

            case R.id.pest:

                intent.putExtra("listen", "Pest Control Services");
                startActivity(intent);
                break;

            case R.id.glassCleaning:

                intent.putExtra("listen", "Glass Cleaning Services");
                startActivity(intent);
                break;


        }

    }


}