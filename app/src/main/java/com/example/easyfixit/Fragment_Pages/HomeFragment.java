package com.example.easyfixit.Fragment_Pages;



import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.easyfixit.Fragment_Pages.BottomSheetFragment.ServiceOptionAppliances;
import com.example.easyfixit.Fragment_Pages.BottomSheetFragment.ServiceOptionCar;
import com.example.easyfixit.Fragment_Pages.BottomSheetFragment.ServiceOptionCarpentry;
import com.example.easyfixit.Fragment_Pages.BottomSheetFragment.ServiceOptionCelebration;
import com.example.easyfixit.Fragment_Pages.BottomSheetFragment.ServiceOptionCleaning;
import com.example.easyfixit.Fragment_Pages.BottomSheetFragment.ServiceOptionComputer;
import com.example.easyfixit.Fragment_Pages.BottomSheetFragment.ServiceOptionConstruction;
import com.example.easyfixit.Fragment_Pages.BottomSheetFragment.ServiceOptionGardening;
import com.example.easyfixit.Fragment_Pages.BottomSheetFragment.ServiceOptionHealth;
import com.example.easyfixit.Fragment_Pages.BottomSheetFragment.ServiceOptionHeater;
import com.example.easyfixit.Fragment_Pages.BottomSheetFragment.ServiceOptionHome;
import com.example.easyfixit.Fragment_Pages.BottomSheetFragment.ServiceOptionLaundry;
import com.example.easyfixit.Fragment_Pages.BottomSheetFragment.ServiceOptionMover;
import com.example.easyfixit.Fragment_Pages.BottomSheetFragment.ServiceOptionPainting;
import com.example.easyfixit.Fragment_Pages.BottomSheetFragment.ServiceOptionSalon;
import com.example.easyfixit.Fragment_Pages.BottomSheetFragment.ServiceOptionVet;
import com.example.easyfixit.R;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment implements View.OnClickListener{

    private ImageSlider imageSlider;

    private List<String> optionsList;

    private CardView houseRepairService;
    private CardView paintingService;
    private CardView computerService;
    private CardView waterHeaterService;
    private CardView carpentryService;
    private CardView constructionService;
    private CardView acService;
    private CardView partyService;
    private CardView cleaningService;
    private CardView laundryService;
    private CardView vetService;
    private CardView healthService;
    private CardView CarService;
    private CardView gardeningService;
    private CardView moversService;
    private CardView salonService;

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        assignService(view);

        clickOnServiceAction();

        return view;
    }

    public void assignService(View view)
    {
        houseRepairService =  view.findViewById(R.id.houseRepairService);
        paintingService = view.findViewById(R.id.paintingService);
        computerService = view.findViewById(R.id.computerService);
        waterHeaterService = view.findViewById(R.id.waterHeaterService);
        carpentryService = view.findViewById(R.id.carpentryService);
        constructionService = view.findViewById(R.id.constructionService);
        acService = view.findViewById(R.id.acService);
        partyService = view.findViewById(R.id.partyService);
        cleaningService = view.findViewById(R.id.cleaningService);
        laundryService = view.findViewById(R.id.laundryService);
        vetService = view.findViewById(R.id.vetService);
        healthService = view.findViewById(R.id.healthService);
        CarService = view.findViewById(R.id.CarService);
        gardeningService = view.findViewById(R.id.gardeningService);
        moversService = view.findViewById(R.id.moversService);
        salonService = view.findViewById(R.id.salonService);
    }

    private void clickOnServiceAction() {

        houseRepairService.setOnClickListener(this);
        paintingService.setOnClickListener(this);
        computerService.setOnClickListener(this);
        waterHeaterService.setOnClickListener(this);
        carpentryService.setOnClickListener(this);
        constructionService.setOnClickListener(this);
        acService.setOnClickListener(this);
        partyService.setOnClickListener(this);
        cleaningService.setOnClickListener(this);
        laundryService.setOnClickListener(this);
        vetService.setOnClickListener(this);
        healthService.setOnClickListener(this);
        CarService.setOnClickListener(this);
        gardeningService.setOnClickListener(this);
        moversService.setOnClickListener(this);
        salonService.setOnClickListener(this);

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imageSlider = view.findViewById(R.id.imageSlider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.slide1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slide2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slide3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slide4, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.houseRepairService:
                ServiceOptionHome bottomSheetFragment = new ServiceOptionHome();
                bottomSheetFragment.show(getChildFragmentManager(), bottomSheetFragment.getTag());
                break;

            case R.id.paintingService:
                ServiceOptionPainting bottomSheetFragmentPaint = new ServiceOptionPainting();
                bottomSheetFragmentPaint.show(getChildFragmentManager(), bottomSheetFragmentPaint.getTag());
                break;

            case R.id.computerService:
                ServiceOptionComputer bottomSheetFragmentComputer = new ServiceOptionComputer();
                bottomSheetFragmentComputer.show(getChildFragmentManager(), bottomSheetFragmentComputer.getTag());
                break;

            case R.id.carpentryService:
                ServiceOptionCarpentry bottomSheetFragmentCarpentry = new ServiceOptionCarpentry();
                bottomSheetFragmentCarpentry.show(getChildFragmentManager(), bottomSheetFragmentCarpentry.getTag());
                break;

            case R.id.constructionService:
                ServiceOptionConstruction bottomSheetFragmentConstruction = new ServiceOptionConstruction();
                bottomSheetFragmentConstruction.show(getChildFragmentManager(), bottomSheetFragmentConstruction.getTag());
                break;

            case R.id.acService:
                ServiceOptionAppliances bottomSheetFragmentAppliances = new ServiceOptionAppliances();
                bottomSheetFragmentAppliances.show(getChildFragmentManager(), bottomSheetFragmentAppliances.getTag());
                break;

            case R.id.partyService:
                ServiceOptionCelebration bottomSheetFragmentCelebrate = new ServiceOptionCelebration();
                bottomSheetFragmentCelebrate.show(getChildFragmentManager(), bottomSheetFragmentCelebrate.getTag());

                break;

            case R.id.cleaningService:
                ServiceOptionCleaning bottomSheetFragmentCleaning = new ServiceOptionCleaning();
                bottomSheetFragmentCleaning.show(getChildFragmentManager(), bottomSheetFragmentCleaning.getTag());

                break;

            case R.id.laundryService:
                ServiceOptionLaundry bottomSheetFragmentLaundry = new ServiceOptionLaundry();
                bottomSheetFragmentLaundry.show(getChildFragmentManager(), bottomSheetFragmentLaundry.getTag());

                break;
            case R.id.vetService:
                ServiceOptionVet bottomSheetFragmentVet = new ServiceOptionVet();
                bottomSheetFragmentVet.show(getChildFragmentManager(), bottomSheetFragmentVet.getTag());
                break;

            case R.id.healthService:
                ServiceOptionHealth bottomSheetFragmentHealth = new ServiceOptionHealth();
                bottomSheetFragmentHealth.show(getChildFragmentManager(), bottomSheetFragmentHealth.getTag());
                break;

            case R.id.CarService:
                ServiceOptionCar bottomSheetFragmentCar = new ServiceOptionCar();
                bottomSheetFragmentCar.show(getChildFragmentManager(), bottomSheetFragmentCar.getTag());
                break;

            case R.id.gardeningService:
                ServiceOptionGardening bottomSheetFragmentGardening = new ServiceOptionGardening();
                bottomSheetFragmentGardening.show(getChildFragmentManager(), bottomSheetFragmentGardening.getTag());
                break;

            case R.id.moversService:
                ServiceOptionMover bottomSheetFragmentMover = new ServiceOptionMover();
                bottomSheetFragmentMover.show(getChildFragmentManager(), bottomSheetFragmentMover.getTag());
                break;

            case R.id.salonService:
                ServiceOptionSalon bottomSheetFragmentSalon = new ServiceOptionSalon();
                bottomSheetFragmentSalon.show(getChildFragmentManager(), bottomSheetFragmentSalon.getTag());
                break;

            case R.id.waterHeaterService:
                ServiceOptionHeater bottomSheetFragmentHeater = new ServiceOptionHeater();
                bottomSheetFragmentHeater.show(getChildFragmentManager(), bottomSheetFragmentHeater.getTag());
                break;
        }

    }

   }