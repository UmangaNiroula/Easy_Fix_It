package com.example.easyfixit.Fragment_Pages.BottomSheetFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.easyfixit.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class ServiceOptionPainting extends BottomSheetDialogFragment {

    public ServiceOptionPainting() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_service_option_painting, container, false);
    }

}