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


public class ServiceOptionComputer extends BottomSheetDialogFragment implements View.OnClickListener {

    private CardView pabx;
    private CardView computer;
    private CardView printer;
    private CardView networking;

    public ServiceOptionComputer() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_service_option_computer, container, false);

        assignObject(view);
        setOnClickListenerManual();

        return view;
    }

    private void assignObject(View view) {

        pabx = view.findViewById(R.id.pabx);
        computer = view.findViewById(R.id.computer);
        printer = view.findViewById(R.id.printer);
        networking = view.findViewById(R.id.networking);

    }

    private void setOnClickListenerManual() {

        pabx.setOnClickListener(this);
        computer.setOnClickListener(this);
        printer.setOnClickListener(this);
        networking.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(requireContext(), ServiceDetailPage.class);
        switch (v.getId())
        {
            case R.id.pabx:

                intent.putExtra("listen", "PABX Services");
                startActivity(intent);
                break;

            case R.id.computer:
                intent.putExtra("listen", "Computer Services");
                startActivity(intent);
                break;

            case R.id.printer:

                intent.putExtra("listen", "Printer Services");
                startActivity(intent);
                break;

            case R.id.networking:

                intent.putExtra("listen", "Networking Services");
                startActivity(intent);
                break;


        }

    }

}