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

        }
    }


    private void addPlumbingItems()
    {
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

    private void addElectricalItems() {

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

    private void addMotorItems() {

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

    private void addMetalItems() {

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

    private void addGeneratorItems() {

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

    private void addChimneyItems() {
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

    private void addInverterItems() {

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

    private void showItems(String[] serviceName, String[] serviceCost, String[] serviceTime, String[] serviceDesc, int[] imagePath) {

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