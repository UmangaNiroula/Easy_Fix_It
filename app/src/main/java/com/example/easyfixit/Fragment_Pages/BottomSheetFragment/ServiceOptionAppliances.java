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


public class ServiceOptionAppliances extends BottomSheetDialogFragment implements View.OnClickListener {

    private CardView air;
    private CardView fridge;
    private CardView solar;
    private CardView washing;
    private CardView oven;
    private CardView tv;
    private CardView induction;
    private CardView gas;
    private CardView geyser;

    public ServiceOptionAppliances() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_service_option_appliances, container, false);

        assignObject(view);
        setOnClickListenerManual();

        return view;
    }

    private void assignObject(View view) {

        air = view.findViewById(R.id.air);
        fridge = view.findViewById(R.id.fridge);
        solar = view.findViewById(R.id.solar);
        washing = view.findViewById(R.id.washing);
        oven = view.findViewById(R.id.oven);
        tv = view.findViewById(R.id.tv);
        induction = view.findViewById(R.id.induction);
        gas = view.findViewById(R.id.gas);
        geyser = view.findViewById(R.id.geyser);
    }

    private void setOnClickListenerManual() {

        air.setOnClickListener(this);
        fridge.setOnClickListener(this);
        solar.setOnClickListener(this);
        washing.setOnClickListener(this);
        oven.setOnClickListener(this);
        tv.setOnClickListener(this);
        induction.setOnClickListener(this);
        gas.setOnClickListener(this);
        geyser.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(requireContext(), ServiceDetailPage.class);
        switch (v.getId())
        {
            case R.id.air:

                intent.putExtra("listen", "Air Conditioner Services");
                startActivity(intent);
                break;

            case R.id.fridge:
                intent.putExtra("listen", "Refrigerator Services");
                startActivity(intent);
                break;

            case R.id.solar:
                intent.putExtra("listen", "Solar Panel Services");
                startActivity(intent);
                break;

            case R.id.washing:
                intent.putExtra("listen", "Washing Machine Services");
                startActivity(intent);
                break;

            case R.id.oven:
                intent.putExtra("listen", "Oven/Microwave Services");
                startActivity(intent);
                break;

            case R.id.tv:
                intent.putExtra("listen", "Television Services");
                startActivity(intent);
                break;

            case R.id.induction:
                intent.putExtra("listen", "Induction Services");
                startActivity(intent);
                break;

            case R.id.gas:
                intent.putExtra("listen", "Gas Stove Services");
                startActivity(intent);
                break;

            case R.id.geyser:
                intent.putExtra("listen", "Geyser Services");
                startActivity(intent);
                break;

        }

    }
}
