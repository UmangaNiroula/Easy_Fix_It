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


public class ServiceOptionCelebration extends BottomSheetDialogFragment implements View.OnClickListener {

    private CardView photo;
    private CardView cook;
    private CardView event;

    public ServiceOptionCelebration() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_service_option_celebration, container, false);

        assignObject(view);
        setOnClickListenerManual();

        return view;
    }


    private void assignObject(View view) {

        photo = view.findViewById(R.id.photo);
        cook = view.findViewById(R.id.cook);
        event = view.findViewById(R.id.event);


    }

    private void setOnClickListenerManual() {

        photo.setOnClickListener(this);
        cook.setOnClickListener(this);
        event.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(requireContext(), ServiceDetailPage.class);
        switch (v.getId())
        {
            case R.id.photo:

                intent.putExtra("listen", "Photo & Video Services");
                startActivity(intent);
                break;

            case R.id.cook:
                intent.putExtra("listen", "Cook Services");
                startActivity(intent);
                break;

            case R.id.event:

                intent.putExtra("listen", "Event Management Services");
                startActivity(intent);
                break;


        }

    }
}