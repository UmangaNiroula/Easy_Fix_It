package com.example.easyfixit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.easyfixit.Adaptation.MyAdapter;
import com.example.easyfixit.Interface.SelectListener;
import com.example.easyfixit.ServiceDetails.Item;

import java.util.ArrayList;
import java.util.List;

public class ServiceDetailPage extends AppCompatActivity implements SelectListener {

    public RecyclerView recyclerView;

    public List<Item> items;

    String value;
    private TextView header11;
    private ImageView backServiceButton;
    private Button backButton,nextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_detail_page);

        value = getIntent().getStringExtra("listen");

        initializeObject();

        recyclerView = findViewById(R.id.recyclerView);

        items = new ArrayList<Item>();

        setItemValues(value);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items, this));

    }

    private void initializeObject() {


        header11 = findViewById(R.id.header11);

        backServiceButton = findViewById(R.id.backServiceButton);

        backButton = findViewById(R.id.backButton);

        nextButton = findViewById(R.id.nextButton);

        setActionObject();
    }

    private void setActionObject() {

        header11.setText(value);

        backServiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ServiceDetailPage.this, HomePage.class);
                startActivity(intent);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ServiceDetailPage.this, HomePage.class);
                startActivity(intent);
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ServiceDetailPage.this, "Service Added", Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void setItemValues(String value) {

        switch (value)
        {
            case "Plumbing Services":
                addPlumbingItems();
                break;

            case "Electrical Services":
                addElectricalItems();
                break;

            case "Motor Services":
                addMotorItems();
                break;

            case "Metal Services":
                addMetalItems();
                break;

            case "Generator Services":
                addGeneratorItems();
                break;

            case "Chimney Services":
                addChimneyItems();
                break;

            case "Inverter Services":
                addInverterItems();
                break;

            case "Air Conditioner Services":
                addAirItems();
                break;

            case "Refrigerator Services":
                addFridgeItems();
                break;

            case "Solar Panel Services":
               addSolarItems();
                break;

            case "Washing Machine Services":
               addWashingItems();
                break;

            case "Oven/Microwave Services":
                addOvenItems();
                break;

            case "Television Services":
               addTvItems();
                break;

            case "Induction Services":
                addInductionItems();
                break;

            case "Gas Stove Services":
                addGasItems();
                break;

            case "Geyser Services":
                addGeyserItems();
                break;

            case "Driver Services":
                addDriverItems();
                break;

            case "Car Wash Services":
                addCarWashItems();
                break;

            case "Carpentry Services":
                addCarpentryItems();
                break;

            case "Sofa Services":
                addSofaItems();
                break;

            case "Aluminium Services":
                addAluminiumItems();
                break;

            case "Glass Glazing Services":
                addGlassItems();
                break;

            case "UPVC Services":
                addUPVCItems();
                break;

            case "Toughened Glass Services":
               addToughenedItems();
                break;

            case "Photo & Video Services":
               addPhotoItems();
                break;

            case "Cook Services":
                addCookItems();
                break;

            case "Event Management Services":
                addEventItems();
                break;

            case "Water Tank Cleaning":
               addWaterTankItems();
                break;

            case "Septic Tank Cleaning":
                addSepticItems();
                break;

            case "Household Cleaning":
                addHouseholdItems();
                break;

            case "Pest Control Services":
                addPestItems();
                break;

            case "Glass Cleaning Services":
                addGlassCleaningItems();
                break;

            case "PABX Services":
                addPABXItems();
                break;

            case "Computer Services":
                addComputerItems();
                break;

            case "Printer Services":
                addPrinterItems();
                break;

            case "Networking Services":
                addNetworkingItems();
                break;

            case "Engineering Services":
                addEngineeringItems();
                break;

            case "New Building Construction":
                addBuildingItems();
                break;

            case "Renovation Services":
                addRenovationItems();
                break;

            case "Masonry Services":
                addMasonryItems();
                break;

            case "Water Proofing Services":
                addProofingItems();
                break;

            case "Parqueting Services":
                addParquetingItems();
                break;

            case "Gardening Services":
                addGardeningItems();
                break;

            case "Health at Home Services":
                addHealthHomeItems();
                break;

            case "Hilltake Geyser Services":
                addHilltakeItems();
                break;

            case "Crompton Geyser Services":
                addCromptonItems();
                break;

            case "Salon For Women":
                addSalonItems();
                break;

            case "Spa For Women":
                addSpaItems();
                break;

            case "Laundry Services":
               addLaundryItems();
                break;

            case "Packers & Movers Services":
               addMoversItems();
                break;

            case "Painting Services":
                addPaintingItems();
                break;

            case "Pet Care Services":
                addPetItems();
                break;
        }
    }

    //House Related Services
    public void addPlumbingItems() {
        String[] serviceName = {"Wash Basin Repair",
                "Water Tap Repair",
                "Commode Repair",
                "Roof Tank Repair",
                "PipeLine Repair",
                "Washing Machine",
                "Electric Geyser",
                "Solar Tube",
                "Water Motor",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Labour Price: Rs. 550",
                "Estimated Price: Rs. 450",
                "Estimated Price: Rs. 700",
                "Estimated Price: Rs. 1000",
                "Estimated Price: Rs. 1000",
                "Estimated Price: Rs. 300",
                "Estimated Price: Rs. 200",
                "Estimated Price: Rs. 550",
                "Estimated Price: Rs. 550",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: 2hrs",
                "Time: 2hrs",
                "Time: 2hrs",
                "Time: 1hrs",
                "Time: 1hrs",
                "Time: 1hrs",
                "Time: 1hrs",
                "Time: 1hrs",
                "Time: 1hrs",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement of any damaged material related to wash basin.",
                "Repair or replacement of any type of taps.",
                "Repair or replacement of commode, urinal, Indian style toilet .",
                "Repair or replacement of roof tanks including cleaning.",
                "Repair or replacement of pipe line including drainage system.",
                "Install or replace washing machine.",
                "Install or replace electric geyser.",
                "Install or replace solar tube.",
                "Install or replace water motor.",
                "A highly experienced plumber will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.washbasinfaucetleakage,
                R.drawable.tapleakage,
                R.drawable.commodeleakage,
                R.drawable.tank,
                R.drawable.plumbing,
                R.drawable.machine,
                R.drawable.geyser,
                R.drawable.solarimage,
                R.drawable.motor,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);


    }

    public void addElectricalItems() {

        String[] serviceName = {"Light Bulb Repair",
                "Switch Board Repair",
                "Networking Socket/Rack",
                "MCBs & MCCBs",
                "Sub-Meter Repair",
                "Wiring Service",
                "DB & panel Boards",
                "Earthing",
                "Load balance",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Labour Price: Rs. 550",
                "Estimated Price: Rs. 450",
                "Estimated Price: Rs. 450",
                "Estimated Price: Rs. 500",
                "Estimated Price: Rs. 350",
                "Estimated Price: Rs. 900",
                "Estimated Price: Rs. 500",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: 2hrs",
                "Time: 2.5hrs",
                "Time: 2hrs",
                "Time: 2hrs",
                "Time: 1hrs",
                "Time: 2hrs",
                "Time: 1hrs",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement of all kinds of light bulbs and its holders.",
                "Installment or replacement of switch board including for renovated or newly build buildings.",
                "Repair or replacement of networking sockets for telephone, wifi, or T/V.",
                "Repair or replacement of MCBs & MCCBs with complete safety checkup.",
                "Repair or replacement of sub-meters.",
                "Repair or replacement of faulty wires also for new buildings.",
                "Install or replace of DB and Panel Board with complete safety checkup.",
                "Installation of rod wire for new and old buildings.",
                "Inspection and safety checkup of building's electrical load.",
                "A highly experienced electrician will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.lightbulb,
                R.drawable.switchboard,
                R.drawable.networkingsocketrack,
                R.drawable.mcbmccb,
                R.drawable.submeterrepair,
                R.drawable.wiringservice,
                R.drawable.panelboard,
                R.drawable.earthingservice,
                R.drawable.loadbalance,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addMotorItems() {

        String[] serviceName = {"Re-Winding Service",
                "Capacitor Repair",
                "Bearing Repair",
                "Impeller Repair",
                "Wires Repair",
                "Nozzle Repair",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Labour Price: Rs. 550",
                "Estimated Price: Rs. 450",
                "Estimated Price: Rs. 450",
                "Estimated Price: Rs. 500",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: 2hrs",
                "Time: 2.5hrs",
                "Time: 2hrs",
                "Time: 2hrs",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement of coil along with re-winding service.",
                "Repair or replacement of capacitor for all type of motors.",
                "Repair or replacement of bearing for all type of motors.",
                "Repair or replacement of Impeller for all type of motors.",
                "Repair or replacement of faulty wires for all type of motors.",
                "Repair or replacement of nozzle for all type of motors.",
                "A highly experienced handyman in motor repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.rewindingmotor,
                R.drawable.capacitor,
                R.drawable.bearingmotor,
                R.drawable.impellerofmotor,
                R.drawable.motorwithwire,
                R.drawable.nozzle,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addMetalItems() {

        String[] serviceName = {"Repairing Service",
                "Fabrication Service",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"General welding and replacement or repair of metal products by welding.",
                "Creating Metal Gates, Fence, Railing, Tank Stand, Window Grill, and many more.",
                "A highly experienced metalsmith will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.weldingserviceformetaloption,
                R.drawable.metalgates,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addGeneratorItems() {

        String[] serviceName = {"Generator Repair",
                "Generator Servicing",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement of Diesel and Petrol generators.",
                "Servicing for any generators of any power capacity.",
                "A highly experienced handyman in generator repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.generatorservicing,
                R.drawable.generatorrepairservice,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addChimneyItems() {
        String[] serviceName = {"Household Chimney",
                "Commercial Chimney",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement of household chimney.",
                "Repair or replacement of commercial chimney.",
                "A highly experienced handyman in chimney repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.chimney,
                R.drawable.commercialchemney,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addInverterItems() {

        String[] serviceName = {"Inverter Service",
                "Batteries Service",
                "UPS Service",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair, replacement, or installment of inverter's of any power.",
                "Services such as boosting batteries, shifting batteries and inverter to a new place, distill water filling.",
                "Repairing, maintenance, or installment of any type of UPS.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);

    }


    //Appliance Related Services
    public void addAirItems() {

        String[] serviceName = {"A/C Servicing",
                "A/C Installation & Removal",
                "A/C Repair",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: 5 hrs",
                "Time: 4 hrs",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Professional servicing of A/C of any kind (price is determined by the A/C type).",
                "Installation and Removal of any type of A/C.",
                "Repair or replacement of any damaged parts of A/C.",
                "A highly experienced handyman in A/C repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.acservicing,
                R.drawable.acinstallationremoval,
                R.drawable.acrepair,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);

    }

    public void addFridgeItems() {
        String[] serviceName = {"Cooling Issue",
                "Ice Formation",
                "Refrigerator Light Issue",
                "Door Issue",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement of dirty condenser coils, a malfunctioning thermostat, a faulty fan, or a blocked airflow.",
                "Checking and adjusting the temperature settings, ensuring proper door seals, clearing blocked vents or drainage tubes, and periodically defrosting the freezer section.",
                "Repair or replacement of issues related to Refrigerator Light Issue.",
                "Repair or replacement of Door Issue.",
                "A highly experienced handyman in fridge repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.coolingrepairinfriedge,
                R.drawable.iceformationinfridge,
                R.drawable.fridgelights,
                R.drawable.fridgedoor,
                R.drawable.experthandyman
        };

       showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addSolarItems() {
        String[] serviceName = {"Solar Tube Heater",
                "Solar Panel Heater",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement of solar tube including cleaning, installation, removal, and servicing.",
                "Repair or replacement of solar panel including cleaning, installation, removal, and servicing.",
                "A highly experienced handyman in solar tubes and panels repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.solarimage,
                R.drawable.solarpanel,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addWashingItems() {
        String[] serviceName = {"Noise Issue",
                "Water Leakage/Supply Issue",
                "Power Supply Issue",
                "Washing Machine Installation",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Rs 1000 per unit",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: 2 hrs",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Identify and maintain the noise issues of any kind of Washing Machine.",
                "Repair or replacement of water supply/leakage issues in any kind of Washing Machine.",
                "Repair or replacement of power supply issues for any kind of Washing Machine.",
                "Installation of any kind of Washing Machine including water and power supply.",
                "A highly experienced handyman in Washing Machine repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.noiseissues,
                R.drawable.waterleakagewashingmachine,
                R.drawable.switchboard,
                R.drawable.washingmachineinstallation,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addOvenItems() {
        String[] serviceName = {"Heating Issue",
                "Microwave Plate Issue",
                "Touch Pad Issues",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Identifying and Solving the issues causing the device to not heat or overheat.",
                "Repair or replacement of Microwave plate.",
                "Repair or replacement of oven touch pad.",
                "A highly experienced handyman in Oven/Microwave repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.ovenoverheating,
                R.drawable.microwaveplate,
                R.drawable.touchpadmicrowave,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addTvItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addInductionItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addGasItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addGeyserItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }


    //Car Related Services
    public void addDriverItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addCarWashItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }


    //Carpentry Related Services
    public void addCarpentryItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addSofaItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

       showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addAluminiumItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addGlassItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addUPVCItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addToughenedItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }



    //Celebration Related Services
    public void addPhotoItems() {

        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addCookItems() {

        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addEventItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }


    //Cleaning Services
    public void addWaterTankItems() {

        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addSepticItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addHouseholdItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addPestItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addGlassCleaningItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    //Computer Services
    public void addPABXItems() {
        String[] serviceName = {"PABX Service",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair, replacement, or installment of a PABX system of any range.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.pabx,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addComputerItems() {
        String[] serviceName = {"Laptop Hinge Repair",
                "Slow Computer Problem",
                "Display Issues",
                "Keyboard Issues",
                "Audio/Sound Issues",
                "Hard Disk Issues",
                "Fan Issues",
                "Online Consultant",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: 2300 per Device",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: 48 hrs",
                "Time: Upon Inspection",
                "Time: 48 hrs",
                "Time: 12 hrs",
                "Time: 12 hrs",
                "Time: 48 hrs",
                "Time: Upon Inspection",
                "Time: 3hr",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement of Hinge after proper inspection (price is for both side).",
                "Laptop/Desktop Servicing alongside installation of windows OS, Anti-Virus, and SSD Upgrade.",
                "Repair or replacement of Laptop/Desktop screen.",
                "Repair or replacement of Keyboard for any type of Laptops.",
                "Repair or replacement of Audio/Sound port for any Laptops.",
                "Repair or replacement of Hardware of any Laptops/Desktops.",
                "Repair or replacement of Fans of any Laptops/Desktops.",
                "Use of remote software to access device and try to solve the problem as much as possible.",
                "A highly experienced handyman in computer repairs will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.brokenlaptophinges,
                R.drawable.slowcomputer,
                R.drawable.displayimageissues,
                R.drawable.keyboard,
                R.drawable.audiosound,
                R.drawable.hardrive,
                R.drawable.fanissues,
                R.drawable.onlineconsultant,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addPrinterItems() {
        String[] serviceName = {"Printer Repair",
                "Photocopy Machine",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: 48 hrs",
                "Time: 48 hrs",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement of any damaged parts of all kinds of Printers.",
                "Repair or replacement of any damaged parts of all kinds of Photocopy Machine.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.printerrepair,
                R.drawable.photocopy,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addNetworkingItems() {
        String[] serviceName = {"On-Site Networking Service",
                "Event/Conference Basis Support",
                "Online Networking Service",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Basic and Advance networking Troubleshooting, IT support, Consultation, and Design & Implementation.",
                "Event/Conference basis Basic and Advance networking Troubleshooting, IT support, Consultation, and Design & Implementation.",
                "Online basis Basic and Advance networking Troubleshooting, IT support, Consultation, and Design & Implementation.",
                "A highly experienced handyman in networking will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.onsitenetworking,
                R.drawable.meetingconsult,
                R.drawable.onlineconsultant,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }


    //Construction Service
    public void addEngineeringItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addBuildingItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

       showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addRenovationItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addMasonryItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addProofingItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addParquetingItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }


    //Gardening Related Services
    public void addGardeningItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }


    //Health at Home Related Services
    public void addHealthHomeItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }


    //Heater Related Service
    public void addHilltakeItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

       showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addCromptonItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }


    //Home Salon Service
    public void addSalonItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addSpaItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }


    //Laundry Services
    public void addLaundryItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }


    //Movers & Packers Services
    public void addMoversItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    //Painting Service
    public void addPaintingItems() {
        String[] serviceName = {"House Inspection & Consultant",
                "Interior Painting",
                "Exterior Painting",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Rs. 30 per sq.ft.",
                "Estimated Price: Rs. 30 per sq.ft.",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Professional Inspection of wall condition and the color type.",
                "Services such as putting, enamel, and painting (color chargers are exclusive).",
                "Services such as putting, damp proofing, and painting (color chargers are exclusive).\"",
                "A highly experienced painter will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inspectionforwall,
                R.drawable.interirorpainting,
                R.drawable.exterirorpainting,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }


    //Pet Service
    public void addPetItems() {
        String[] serviceName = {"",
                "",
                "",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement.",
                "Repair or replacement.",
                "Repair or replacement.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.inverters,
                R.drawable.batteriesinverter,
                R.drawable.upsinverter,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }


    public void showItems(String[] serviceName, String[] serviceCost, String[] serviceTime, String[] serviceDesc, int[] imagePath) {

        for(int i = 0; i < serviceName.length; i++)
        {
            items.add(new Item(serviceName[i],serviceCost[i],serviceTime[i],serviceDesc[i],imagePath[i]));
        }

    }

    @Override
    public void onItemClicked(Item item) {
        Toast.makeText(this, item.getServiceName(), Toast.LENGTH_SHORT).show();
    }
}