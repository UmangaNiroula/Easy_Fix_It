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

public class ServiceOptionConstruction extends BottomSheetDialogFragment implements View.OnClickListener {

    private CardView engineering;
    private CardView newHouse;
    private CardView renovation;
    private CardView masonry;
    private CardView waterProofing;
    private CardView parqueting;

    public ServiceOptionConstruction() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_service_option_construction, container, false);

        assignObject(view);
        setOnClickListenerManual();

        return view;
    }

    private void assignObject(View view) {

        engineering = view.findViewById(R.id.engineering);
        newHouse = view.findViewById(R.id.newHouse);
        renovation = view.findViewById(R.id.renovation);
        masonry = view.findViewById(R.id.masonry);
        waterProofing = view.findViewById(R.id.waterProofing);
        parqueting = view.findViewById(R.id.parqueting);

    }

    private void setOnClickListenerManual() {

        engineering.setOnClickListener(this);
        newHouse.setOnClickListener(this);
        renovation.setOnClickListener(this);
        masonry.setOnClickListener(this);
        waterProofing.setOnClickListener(this);
        parqueting.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(requireContext(), ServiceDetailPage.class);
        switch (v.getId())
        {
            case R.id.engineering:

                intent.putExtra("listen", "Engineering Services");
                startActivity(intent);
                break;

            case R.id.newHouse:
                intent.putExtra("listen", "New Building Construction");
                startActivity(intent);
                break;

            case R.id.renovation:

                intent.putExtra("listen", "Renovation Services");
                startActivity(intent);
                break;

            case R.id.masonry:

                intent.putExtra("listen", "Masonry Services");
                startActivity(intent);
                break;

            case R.id.waterProofing:

                intent.putExtra("listen", "Water Proofing Services");
                startActivity(intent);
                break;

            case R.id.parqueting:

                intent.putExtra("listen", "Parqueting Services");
                startActivity(intent);
                break;


        }

    }


}