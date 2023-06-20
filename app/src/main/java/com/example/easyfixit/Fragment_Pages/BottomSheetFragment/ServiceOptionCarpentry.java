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

public class ServiceOptionCarpentry extends BottomSheetDialogFragment implements View.OnClickListener{

    private CardView carpentry;
    private CardView sofa;
    private CardView aluminium;
    private CardView glass;


    public ServiceOptionCarpentry() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_service_option_carpentry, container, false);

        assignObject(view);
        setOnClickListenerManual();

        return view;
    }

    private void assignObject(View view) {

        carpentry = view.findViewById(R.id.carpentry);
        sofa = view.findViewById(R.id.sofa);
        aluminium = view.findViewById(R.id.aluminium);
        glass = view.findViewById(R.id.glass);


    }

    private void setOnClickListenerManual() {

        carpentry.setOnClickListener(this);
        sofa.setOnClickListener(this);
        aluminium.setOnClickListener(this);
        glass.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(requireContext(), ServiceDetailPage.class);
        switch (v.getId())
        {
            case R.id.carpentry:

                intent.putExtra("listen", "Carpentry Services");
                startActivity(intent);
                break;

            case R.id.sofa:
                intent.putExtra("listen", "Sofa Services");
                startActivity(intent);
                break;

            case R.id.aluminium:

                intent.putExtra("listen", "Aluminium Services");
                startActivity(intent);
                break;

            case R.id.glass:
                intent.putExtra("listen", "Glass Glazing Services");
                startActivity(intent);
                break;

        }

    }
}