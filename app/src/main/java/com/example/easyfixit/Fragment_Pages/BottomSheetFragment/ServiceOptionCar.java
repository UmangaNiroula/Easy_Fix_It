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

public class ServiceOptionCar extends BottomSheetDialogFragment implements View.OnClickListener {

    private CardView driver;
    private CardView carWash;

    public ServiceOptionCar() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_service_option_car, container, false);

        assignObject(view);
        setOnClickListenerManual();

        return view;
    }


    private void assignObject(View view) {

        driver = view.findViewById(R.id.driver);
        carWash = view.findViewById(R.id.carWash);

    }

    private void setOnClickListenerManual() {

        driver.setOnClickListener(this);
        carWash.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(requireContext(), ServiceDetailPage.class);
        switch (v.getId())
        {
            case R.id.driver:

                intent.putExtra("listen", "Driver Services");
                startActivity(intent);
                break;

            case R.id.carWash:
                intent.putExtra("listen", "Car Wash Services");
                startActivity(intent);
                break;

        }

    }
}