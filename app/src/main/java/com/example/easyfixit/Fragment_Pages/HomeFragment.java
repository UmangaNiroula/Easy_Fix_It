package com.example.easyfixit.Fragment_Pages;



import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

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
import com.example.easyfixit.Fragment_Pages.BottomSheetFragment.ServiceOptionHome;
import com.example.easyfixit.Fragment_Pages.BottomSheetFragment.ServiceOptionLaundry;
import com.example.easyfixit.Fragment_Pages.BottomSheetFragment.ServiceOptionMover;
import com.example.easyfixit.Fragment_Pages.BottomSheetFragment.ServiceOptionPainting;
import com.example.easyfixit.Fragment_Pages.BottomSheetFragment.ServiceOptionSalon;
import com.example.easyfixit.Fragment_Pages.BottomSheetFragment.ServiceOptionVet;
import com.example.easyfixit.ProductSaleDescription;
import com.example.easyfixit.R;
import com.example.easyfixit.ServiceDetailPage;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment implements View.OnClickListener{

    private ImageSlider imageSlider;

    private List<String> optionsList;

    private CardView houseRepairService;
    private CardView paintingService;
    private CardView computerService;
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

    private ImageView eventManagementServiceImage;
    private ImageView laundryServiceImage;
    private ImageView driverOnCallServiceImage;
    private ImageView photographyServiceImage;

    private ImageView solarProduct;
    private ImageView gyserProduct;
    private ImageView basinProduct;
    private ImageView purifierProduct;

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
        eventManagementServiceImage = view.findViewById(R.id.eventManagementServiceImage);
        laundryServiceImage = view.findViewById(R.id.laundryServiceImage);
        driverOnCallServiceImage = view.findViewById(R.id.driverOnCallServiceImage);
        photographyServiceImage = view.findViewById(R.id.photographyServiceImage);
        solarProduct = view.findViewById(R.id.solarProduct);
        gyserProduct = view.findViewById(R.id.gyserProduct);
        basinProduct = view.findViewById(R.id.basinProduct);
        purifierProduct = view.findViewById(R.id.purifierProduct);
    }

    private void clickOnServiceAction() {

        houseRepairService.setOnClickListener(this);
        paintingService.setOnClickListener(this);
        computerService.setOnClickListener(this);
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
        eventManagementServiceImage.setOnClickListener(this);
        laundryServiceImage.setOnClickListener(this);
        driverOnCallServiceImage.setOnClickListener(this);
        photographyServiceImage.setOnClickListener(this);
        solarProduct.setOnClickListener(this);
        gyserProduct.setOnClickListener(this);
        basinProduct.setOnClickListener(this);
        purifierProduct.setOnClickListener(this);
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

        Intent intent = new Intent(requireContext(), ServiceDetailPage.class);
        Intent intentNew = new Intent(requireContext(), ProductSaleDescription.class);

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

            case R.id.eventManagementServiceImage:
                intent.putExtra("listen", "Event Management Services");
                startActivity(intent);
                break;

            case R.id.laundryServiceImage:
                intent.putExtra("listen", "Laundry Services");
                startActivity(intent);
                break;

            case R.id.driverOnCallServiceImage:
                intent.putExtra("listen", "Driver Services");
                startActivity(intent);
                break;

            case R.id.photographyServiceImage:
                intent.putExtra("listen", "Photo & Video Services");
                startActivity(intent);
                break;

            case R.id.solarProduct:
                intentNew.putExtra("listen", "Solar Water Heater");
                startActivity(intentNew);
                break;

            case R.id.gyserProduct:
                intentNew.putExtra("listen", "Sizzle Electric Geyser");
                startActivity(intentNew);
                break;

            case R.id.basinProduct:
                intentNew.putExtra("listen", "Wash Basin");
                startActivity(intentNew);
                break;

            case R.id.purifierProduct:
                intentNew.putExtra("listen", "Water Purifier");
                startActivity(intentNew);
                break;

        }

    }

   }