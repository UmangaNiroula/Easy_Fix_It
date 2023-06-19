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

public class ServiceOptionSalon extends BottomSheetDialogFragment implements View.OnClickListener {

    private CardView salonForWomen;
    private CardView spaForWomen;

    public ServiceOptionSalon() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_service_option_salon, container, false);

        assignObject(view);
        setOnClickListenerManual();

        return view;
    }

    private void assignObject(View view) {

        salonForWomen = view.findViewById(R.id.salonForWomen);
        spaForWomen = view.findViewById(R.id.spaForWomen);

    }

    private void setOnClickListenerManual() {

        salonForWomen.setOnClickListener(this);
        spaForWomen.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(requireContext(), ServiceDetailPage.class);
        switch (v.getId()) {
            case R.id.salonForWomen:

                intent.putExtra("listen", "Salon For Women");
                startActivity(intent);
                break;

            case R.id.spaForWomen:
                intent.putExtra("listen", "Spa For Women");
                startActivity(intent);
                break;


        }

    }

}