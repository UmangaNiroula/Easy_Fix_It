package com.example.easyfixit.Fragment_Pages.BottomSheetFragment;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.easyfixit.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class ServiceOptionHome extends BottomSheetDialogFragment {

    public ServiceOptionHome() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_service_option_home, container, false);
    }
}