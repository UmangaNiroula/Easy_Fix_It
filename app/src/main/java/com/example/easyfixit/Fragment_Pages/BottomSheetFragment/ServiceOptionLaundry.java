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


public class ServiceOptionLaundry extends BottomSheetDialogFragment implements View.OnClickListener {

    private CardView laundryService;

    public ServiceOptionLaundry() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_service_option_laundry, container, false);

        assignObject(view);
        setOnClickListenerManual();

        return view;
    }

    private void assignObject(View view) {

        laundryService = view.findViewById(R.id.laundryService);

    }

    private void setOnClickListenerManual() {

        laundryService.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(requireContext(), ServiceDetailPage.class);
        intent.putExtra("listen", "Laundry Services");
        startActivity(intent);

    }
}