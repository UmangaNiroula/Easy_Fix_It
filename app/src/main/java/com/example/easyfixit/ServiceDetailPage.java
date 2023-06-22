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
import com.example.easyfixit.ListPage.Item;
import com.example.easyfixit.ListPage.ProductItem;

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
        String[] serviceName = {"32 inch TV Repair",
                "40 inch  TV Repair",
                "43 inch Tv Repair",
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

        String[] serviceDesc = {"Repair, replacement, installation, or removal of 32 inch Television.",
                "Repair, replacement, installation, or removal of 40 inch Television.",
                "Repair, replacement, installation, or removal of 43 inch Television.",
                "A highly experienced handyman in Television repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.ttinchtv,
                R.drawable.foinchtevelision,
                R.drawable.ftinchtelevison,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addInductionItems() {
        String[] serviceName = {"Induction Issues",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement of fan, board, sensor issues, and many more.",
                "A highly experienced handyman in Induction repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.induction,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addGasItems() {
        String[] serviceName = {"Lighter Gas Stove",
                "Automatic Gas Stove",
                "Marble/Granite Gas Stove",
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

        String[] serviceDesc = {"Repair or replacement of Lighter Gas Stove.",
                "Repair or replacement of Automatic Gas Stov.",
                "Repair or replacement of Marble/Granite Gas Stove.",
                "A highly experienced handyman in Gas Stove repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.lightergasstove,
                R.drawable.automaticgasstove,
                R.drawable.marbelgasstove,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addGeyserItems() {
        String[] serviceName = {"Gas Geyser",
                "Electric Geyser",
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

        String[] serviceDesc = {"Repair, replacement, installation, or removal of Gas Geyser.",
                "Repair, replacement, installation, or removal of Electric Geyser.",
                "A highly experienced handyman in Geyser repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.gasgeyser,
                R.drawable.geyser,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }


    //Car Related Services
    public void addDriverItems() {
        String[] serviceName = {"Inside Valley",
                "Outside Valley",
                "Annual Contract",
        };

        String[] serviceCost = {"Estimated Price: Rs. 2000 Per Day",
                "Estimated Price: Rs. 3000 Per Day",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: 12 hrs",
                "Time: 12 hrs",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Highly experienced driver for one day inside valley.",
                "Highly experienced driver for one day outside valley.",
                "Highly experienced driver on contract.",
        };

        int[] imagePath =  {R.drawable.driveronedayinside,
                R.drawable.driveroutside,
                R.drawable.contractdriver
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addCarWashItems() {
        String[] serviceName = {"Small Car",
                "SUV & Mini SUV",
                "Hiace & Bus",
                "Looking For Something Else?"
        };

        String[] serviceCost = {"Estimated Price: Rs. 3800",
                "Estimated Price: Rs. 4800",
                "Estimated Price: Rs. 680 Per Seat",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: 2 hrs",
                "Time: 2 hrs",
                "Time: 4 hrs",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Detailed Cleaning of the total exterior and interior sections such as seat, roof, door mat, floor, dashboard, and ceiling cleaned by premium cleaning chemicals.",
                "Detailed Cleaning of the total exterior and interior sections such as seat, roof, door mat, floor, dashboard, and ceiling cleaned by premium cleaning chemicals.",
                "Detailed Cleaning of the total exterior and interior sections such as seat, roof, door mat, floor, dashboard, and ceiling cleaned by premium cleaning chemicals.",
                "A highly experienced Car washer will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.smallcar,
                R.drawable.suv,
                R.drawable.hiace,
                R.drawable.carwash
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }


    //Carpentry Related Services
    public void addCarpentryItems() {
        String[] serviceName = {"Wooden Furniture Repair",
                "Wooden Furniture Fabrication",
                "Hydraulic Chair Repair",
                "Dinning Chair Repair",
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

        String[] serviceDesc = {"Expert wooden furniture repair services to bring new life to your cherished pieces.",
                "Expert craftsmanship and quality materials come together in our wooden furniture fabrication service, creating exquisite and durable pieces that elevate your living spaces.",
                "Expert hydraulic chair repair services to fix and enhance the functionality of your hydraulic chairs, ensuring optimal comfort and usability.",
                "Expert dining chair repair services to revitalize and extend the lifespan of your cherished furniture",
                "A highly experienced carpenter will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.woodenfurniturerepair,
                R.drawable.woodenfurniturefabrication,
                R.drawable.hydraulicchairrepair,
                R.drawable.diningchairrepair,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addSofaItems() {
        String[] serviceName = {"Sofa Repair/Order",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Repair or replacement of sofa covers and any other damaged parts along side order for customized Sofa.",
                "A highly experienced carpenter will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.sofa,
                R.drawable.experthandyman
        };

       showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addAluminiumItems() {
        String[] serviceName = {"Aluminium Repair",
                "Door Fabrication",
                "Window Fabrication",
                "Partition Fabrication",
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

        String[] serviceDesc = {"Expert aluminium repair services to fix and restore the integrity of your aluminium structures, ensuring durability and longevityt.",
                "Expert fabrication of high-quality aluminium doors tailored to your specific needs, combining durability, aesthetics, and functionality.",
                "Expert aluminum window fabrication services for durable, stylish, and energy-efficient windows tailored to your specific needs.",
                "Expert aluminum partition fabrication services tailored to meet your specific needs, providing functional and aesthetically pleasing solutions for your space",
                "A highly experienced carpenter will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.aluminiumrepair,
                R.drawable.doorfabrication,
                R.drawable.windowfabrication,
                R.drawable.partationfabrication,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addGlassItems() {
        String[] serviceName = {"Tinted Glass Glazing",
                "Plain Glass Glazing",
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

        String[] serviceDesc = {"High-quality tinted glass solutions offer privacy, reduce glare, and provide energy efficiency while adding a touch of elegance to the exterior of your building.",
                "Enhance the aesthetics and functionality of your building's exterior with our high-quality plain glass glazing service.",
                "A highly experienced carpenter will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.tintedglazing,
                R.drawable.plainglazing,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }


    //Celebration Related Services
    public void addPhotoItems() {

        String[] serviceName = {"Wedding Package",
                "Bratabandha",
                "Pasni Ceremony",
                "Birthday",
                "New Born/Maternity",
                "Other Events?"
        };

        String[] serviceCost = {"Estimated Price: Rs. 100,000 - Rs. 150,000",
                "Estimated Price: Rs. 40,000 Per Ceremony",
                "Estimated Price: Rs. 40,000 Per Ceremony",
                "Estimated Price: Rs. 15,000 Per Part",
                "Estimated Price: Rs. 15,000 Per Photoshoot",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Including Both Photo & Video Coverage of Engagement, Mehendi, & Wedding.",
                "Including Photo & Video Service for whole day.",
                "Including Photo & Video Service for whole day.",
                "Including Photo & Video Service for whole day..",
                "Including Photo & Video Service for whole day..",
                "A highly experienced Photo and Videographer will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.weddingpackage,
                R.drawable.bratabhanda,
                R.drawable.pasni,
                R.drawable.birthday,
                R.drawable.newboarn,
                R.drawable.photography
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addCookItems() {

        String[] serviceName = {"Cook On Call",
                "Looking For Something Else?"
        };

        String[] serviceCost = {"Estimated Price: Depends on Amount of Food",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Convenient and hassle-free Cook On Call service providing skilled and experienced chefs who prepare delicious meals in the comfort of your home.",
                "A highly experienced Cook and a Consultant will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.cookservice,
                R.drawable.cookexperience
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addEventItems() {
        String[] serviceName = {"Wedding Events",
                "Pasni",
                "Baby Shower",
                "Corporate Events",
                "Birthday",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Rs. 60,000 to 4,50,000 Package",
                "Estimated Price: Rs. 12,000 to 100,000 Package",
                "Estimated Price: Rs. 12,000 to 100,000 Package",
                "Estimated Price: Rs. 18,000 to 80,000 Package",
                "Estimated Price: Rs. 10,000 to 50,000 Package",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Planning and executing unforgettable weddings.",
                "Planning and executing unforgettable pasni.",
                "Planning and executing unforgettable baby shower.",
                "Expertly orchestrating professional gatherings and experiences for businesses to achieve their goals, enhance relationships, and cultivate success.",
                "Planning and executing unforgettable Birthday.",
                "A highly experienced handyman in inverter, batteries, & UPS repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.weddingpackage,
                R.drawable.pasni,
                R.drawable.babyshower,
                R.drawable.corporateevents,
                R.drawable.birthday,
                R.drawable.eventmanagerservice
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }


    //Cleaning Services
    public void addWaterTankItems() {

        String[] serviceName = {"Reserve Tank Cleaning",
                "Over Head Tank Cleaning",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Rs. 3200 Per Unit",
                "Estimated Price: Rs. 1500 Per Unit",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: 6 hrs",
                "Time: 2 hrs",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Reserve tank Cleaning with advance machinery & UV treatment (For 8000 liters Tank, price will decrease with the size of Tank).",
                "Tank Cleaning with advance machinery & UV treatment (For 1000 liters Tank, price will increase with the size of Tank).",
                "A highly experienced handyman in Tank cleaning will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.groundtank,
                R.drawable.tank,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addSepticItems() {
        String[] serviceName = {"Septic Tank Cleaning",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Septic Tank Cleaning with advance machinery.",
                "A highly experienced handyman in Septic Tank cleaning will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.septictank,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addHouseholdItems() {
        String[] serviceName = {"Basic Cleaning",
                "Carpet Cleaning",
                "Furniture Cleaning",
                "Title/Marble/Granite Cleaning",
                "Window Cleaning",
                "Toilet Cleaning",
                "Chimney Cleaning",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: 3400 Per Unit",
                "Estimated Price: Rs 17 Per Sq.ft.",
                "Estimated Price: Mentioned in Description",
                "Estimated Price: 12 Per Sq.ft.",
                "Estimated Price: 12 per Sq.ft.",
                "Estimated Price: 2260 Per Unit",
                "Estimated Price: 2500 Per Pc",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: 4 hrs",
                "Time: 3 hrs",
                "Time: 6 hrs",
                "Time: 4 hrs",
                "Time: 5 hrs",
                "Time: Upon Inspection",
                "Time: 2 hrs",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Cleaning of entire 1BHK apartment with professional tools (The price will increase with the number of rooms).",
                "Deep Cleaning of Normal carpet (Nepali Galaicha Cleaning will cost Rs. 23 Per Sq.ft.).",
                "Deep Cleaning of Dining Chairs (Rs. 400 Per Pc) and Sofa (Rs. 680 Per Unit).",
                "Marble/Title/Cheeps/Granite/Parqueting Deep Cleaning (Polishing will cost Rs. 70 Per Sq.ft.).",
                "Indoor Window cleaning (Outdoor windows will cost Rs. 23 Per Sq.ft.).",
                "Deep Cleaning of Toilet (Price Depends on the size of the Toilet and number of Commode and Urinals).",
                "Deep Cleaning of Domestic Chimney (Commercial Chimney will  cost Rs. 3500 Per Pc).",
                "A highly experienced handyman in Household cleaning will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.appartmentcleaning,
                R.drawable.carpetcleaning,
                R.drawable.sofacleaning,
                R.drawable.tilescleaning,
                R.drawable.windowscleaning,
                R.drawable.toiletcleaning,
                R.drawable.chimneycleaning,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addPestItems() {
        String[] serviceName = {"Mosquito/Dengue Control",
                "Termite Control",
                "Cockroach Control",
                "Bed Bug Control",
                "Flea & Ticks Control",
                "Rodent Control",
                "Birds Control",
                "General Pest Management",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Rs. 2000 Per Floor",
                "Estimated Price: Rs. 25 Per Sq.ft",
                "Estimated Price: Rs. 5000 Per Unit",
                "Estimated Price: Rs. 6000 Per Unit",
                "Estimated Price: Rs. 2000 Upto 300 Sq.ft.",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: 3 hrs",
                "Time: 3 hrs",
                "Time: 8 hrs",
                "Time: 3 hrs",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: 1 hrs",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Indoor Fogging and Spray (Price may vary for large BHK / Outdoor service will cost Rs. 3500 Per area below 1 acres).",
                "Combining advanced technology and expert techniques to ensure long-term protection.",
                "Cutting-edge technology and proven techniques to target cockroaches at all stages of their life cycle for 1 BHK (Price will increase with the number of room).",
                "Utilizing advanced techniques and safe insecticides, our solution targets bed bugs at all stages of their life cycle for 1 Bedroom (Price will increase with the number of room).",
                "Inspection and identification of infested areas, followed by precise application of specialized insecticides that effectively eradicate fleas and ticks while minimizing risks to humans and pets.",
                "Inspection to determine the extent of the infestation and identify entry points and eliminate rodents.",
                "3 - 5 Line Spike and Bird Net installation service to keep the braids away.",
                "Inspection and identification of other general crawling & flying pests.",
                "A highly experienced handyman in Pest Control will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.mosquitocontrol,
                R.drawable.termitecontrol,
                R.drawable.cockroachcontrol,
                R.drawable.bedbugcontrol,
                R.drawable.fleatickcontrol,
                R.drawable.rodantcontrol,
                R.drawable.birdscontrol,
                R.drawable.generalpestcontrol,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addGlassCleaningItems() {
        String[] serviceName = {"Normal Glass Cleaning",
                "Rope Access Glass Cleaning",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Rs. 25 Per Sq.ft.",
                "Estimated Price: Rs. 35 Per Sq.ft.",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: 6 hrs",
                "Time: 6 hrs",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Cleaning commercial inside & outside windows without rope access.",
                "Cleaning commercial inside & outside windows with rope access.",
                "A highly experienced handyman in windows cleaning will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.windowcleaningwithout,
                R.drawable.windowcleaningwithropeaccess,
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
        String[] serviceName = {"2D Designs",
                "3D Rendering",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Rs. 50000 Upto 800 Sq.ft.",
                "Estimated Price: 25000 Economic Package",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: 4 hrs",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"2D municipal drawing as per the guidelines of municipality and support for municipality drawing approval (Price will increase depending on the size).",
                "Cutting-edge solution for visualizing and presenting engineering designs with stunning realism and detail (Price will increase depending on the package).",
                "A highly experienced Engineer will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.designs,
                R.drawable.renderingthreed,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addBuildingItems() {
        String[] serviceName = {"Consultation from Engineer",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Knowledgeable professionals will work closely to understand vision, goals, and budget, ensuring that every aspect of the project is meticulously planned and executed.",
                "A highly experienced Engineer will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.constructionhouse,
                R.drawable.experthandyman
        };

       showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addRenovationItems() {
        String[] serviceName = {"Interior Renovation",
                "Exterior Renovation",
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

        String[] serviceDesc = {"Offers expert guidance and practical solutions for renovation project.",
                "Offers expert guidance and practical solutions for renovation project.",
                "A highly experienced Engineer will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.interiorrenovationservice,
                R.drawable.exteriorrenobationservice,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addMasonryItems() {
        String[] serviceName = {"Title/Marble/Granite Installation",
                "Skirting",
                "Molding",
                "Wall Construction",
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

        String[] serviceDesc = {"Top-quality craftsmanship and meticulous attention to detail for your flooring or counter top needs.",
                "Professional and high-quality solution for enhancing the aesthetic appeal and functionality of your space.",
                "Professional molding service is designed to add elegance, sophistication, and visual appeal to your living or working space.",
                "Professional and reliable solutions for creating durable and visually appealing walls.",
                "A highly experienced handyman in Masonry work will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.tilesinstallation,
                R.drawable.skirtingservice,
                R.drawable.molding,
                R.drawable.wallconstructuion,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addProofingItems() {
        String[] serviceName = {"Basement Area",
                "Terrace and Slope Roof",
                "Washroom & Bathroom",
                "Injection Grouting System",
                "HY-Series Membrane Treatment",
                "Expansion Joint Treatment",
                "Anti-termite Treatment",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Reliable basement waterproofing solutions to keep basement dry and protected.",
                "Reliable service ensures protection against water damage and leakage, keeping property safe and dry.",
                "Reliable service ensures effective waterproofing solutions for your washroom and bathroom.",
                "Reliable waterproofing through advanced injection grouting system.",
                "Reliable waterproofing through advanced HY-Series membrane treatment.",
                "Reliable waterproofing through advanced expansion joint treatment.",
                "Reliable waterproofing through advanced anti-termite treatment.",
                "A highly experienced handyman in Waterproofing will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.waterproofingbasemntarea,
                R.drawable.terraceandslopearea,
                R.drawable.toiletproofingwater,
                R.drawable.injectiongrouting,
                R.drawable.bitumenmambrane,
                R.drawable.expensionjointfiller,
                R.drawable.antitermitetreatment,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addParquetingItems() {
        String[] serviceName = {"New Parqueting Installation",
                "Parqueting Repair",
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

        String[] serviceDesc = {"Expert installation of beautiful new parquet flooring.",
                "Professional parqueting repair services to restore the beauty and functionality of flooring.",
                "A highly experienced handyman in Parqueting installation and repair will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.parqueting,
                R.drawable.parquetingrepair,
                R.drawable.experthandyman
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }


    //Gardening Related Services
    public void addGardeningItems() {
        String[] serviceName = {"Garden Maintenance",
                "Garden Design",
                "Garden Setup",
                "Looking For Something Else?"
        };

        String[] serviceCost = {"Estimated Price: Rs. 1500 Per Garden",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: 12 hrs",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"The service is provided by one maintenance person for entire day(The price may increase with number of maintenance person and days).",
                "2D and 3D designs for the garden.",
                "Setting up a new garden from a highly experienced gardener.",
                "A highly experienced Gardener will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.gardenmaintanence,
                R.drawable.design,
                R.drawable.gardensetup,
                R.drawable.gardenerprofessional
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }


    //Health at Home Related Services
    public void addHealthHomeItems() {
        String[] serviceName = {"Dengue Test",
                "Covid-19 Test",
                "Blood Test",
                "Urine Test",
                "Stool Test",
                "Unknown Problems?"
        };

        String[] serviceCost = {"Estimated Price: Rs. 1500 Per Test",
                "Estimated Price: Rs. 1500 Per Test",
                "Estimated Price: Depends on Type of Test",
                "Estimated Price: Depends on Type of Test",
                "Estimated Price: Depends on Type of Test",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"The service typically involves a healthcare professional or a testing kit being dispatched to the individual's location.",
                "The service typically involves a healthcare professional or a testing kit being dispatched to the individual's location.",
                "The service typically involves a healthcare professional or a testing kit being dispatched to the individual's location.",
                "The service typically involves a healthcare professional or a testing kit being dispatched to the individual's location.",
                "The service typically involves a healthcare professional or a testing kit being dispatched to the individual's location.",
                "A highly experienced healthcare professional will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.denguetest,
                R.drawable.covidtest,
                R.drawable.bloodtest,
                R.drawable.urinetest,
                R.drawable.stooltest,
                R.drawable.helathcareprofessionals
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }


    //Home Salon Service
    public void addSalonItems() {
        String[] serviceName = {"Bridal Package",
                "Hair Care",
                "Nail Care",
                "MakeUp",
                "Looking For Something Else?"
        };

        String[] serviceCost = {"Estimated Price: Rs. 16000 Per Person",
                "Estimated Price: Rs. 1500 Per Person",
                "Estimated Price: Rs. 3000 Per Person",
                "Estimated Price: Rs. 3000 to 5000 Per Person",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: 2 hrs",
                "Time: 2 hrs",
                "Time: 4 hrs",
                "Time: Upon Inspection",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Services such as Bridal makeup, hairstyle,and saree draping will be provided.",
                "Styling Hair according to occasion (Price may depend on the hairstyle).",
                "Stylish and attractive nail care and extension.",
                "Simple party makeup or photoshop makeup.",
                "A highly experienced Makeup artist will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.bridalmakeup,
                R.drawable.haircare,
                R.drawable.nailcare,
                R.drawable.makeup,
                R.drawable.makeupartist
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }

    public void addSpaItems() {
        String[] serviceName = {"Hair Massage",
                "Body Massage",
                "Looking For Something Else?"
        };

        String[] serviceCost = {"Estimated Price: Rs. 750 Per 45 minutes",
                "Estimated Price: Rs. 2000 Per Person",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: 45 minutes",
                "Time: 1 hrs",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Our skilled therapists will provide a soothing scalp massage, promoting blood circulation and relieving stress.",
                "Our skilled therapists will bring the spa experience to your doorstep, providing soothing and rejuvenating massages that melt away stress and tension.",
                "A highly experienced Therapists will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.hairmassage,
                R.drawable.spaforwomen,
                R.drawable.therepist
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }


    //Laundry Services
    public void addLaundryItems() {
        String[] serviceName = {"Express Wash",
                "Normal Clothes",
                "Heavy Clothes",
                "Household Clothes",
                "Party Wear",
                "Looking For Something Else?"
        };

        String[] serviceCost = {"Estimated Price: Rs. 1000 Per 5Kgs",
                "Estimated Price: Rs. 40 Per Pc",
                "Estimated Price: Rs. 150 to 270 Per Pc",
                "Estimated Price: Rs. 500 Per 5Kgs",
                "Estimated Price: Rs. 150 to 350 Per Pc",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: 8 hrs",
                "Time: 48 hrs",
                "Time: 48 hrs",
                "Time: 48 hrs",
                "Time: 48 hrs",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Fast and efficient laundry service including dry cleaning, ironing, and folding.",
                "Laundry service for T-shirt, Pant, Shirt including dry cleaning, ironing, and folding.",
                "Laundry service for Down, Silicon, Woolen Jackets including dry cleaning, ironing, and folding.",
                "Laundry service for Bed Sheet, Blanket Cover, Pillow Case, Curtains, and Single & Double Fiber Blanket including dry cleaning, ironing, and folding.",
                "Laundry service for Suit, Daura Suruwal, Lehenga, Kurthi, Saree including dry cleaning, ironing, and folding.",
                "A highly experienced Laundry washer will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.fastwashlaundy,
                R.drawable.normallaundry,
                R.drawable.downjaket,
                R.drawable.bedhseetlaundry,
                R.drawable.suitlaundry,
                R.drawable.laundryperson
        };

        showItems(serviceName,serviceCost,serviceTime,serviceDesc,imagePath);
    }


    //Movers & Packers Services
    public void addMoversItems() {
        String[] serviceName = {"Residential Shifting",
                "Corporate Shifting",
                "Looking For Something Else?"
        };

        String[] serviceCost = {"Estimated Price: Rs. 4300 Per Trip excluding Packaging charge",
                "Estimated Price: Rs. 4300 Per Trip excluding Packaging charge",
                "Estimated Price: Upon Inspection"
        };

        String[] serviceTime = {"Time: 4 hrs",
                "Time: 4 hrs",
                "Time: Upon Inspection"
        };

        String[] serviceDesc = {"Shifting within 10KM range inside valley (Rs. 2000 extra charge on additional per KM).",
                "Shifting within 10KM range inside valley (Rs. 2000 extra charge on additional per KM).",
                "A highly experienced handyman in Packaging and Shifting will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.packermover,
                R.drawable.packermover,
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
        String[] serviceName = {"Vaccination",
                "General Checkup",
                "Grooming",
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

        String[] serviceDesc = {"Convenient in-home pet vaccinations done by very professional Vets.",
                "Convenient veterinary care for your beloved pet, right at your doorstep.",
                "Convenient in-home pet grooming service done based on given instructions.",
                "A highly experienced Veterinarian will be sent as soon as possible."
        };

        int[] imagePath =  {R.drawable.vaccination,
                R.drawable.generalcheckup,
                R.drawable.grooming,
                R.drawable.vetformypetdoctor
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

    @Override
    public void onItemClicked(ProductItem item) {

    }
}