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

import com.example.easyfixit.Adaptation.MyAdapter;
import com.example.easyfixit.ServiceDetails.Item;

import java.util.ArrayList;
import java.util.List;

public class ServiceDetailPage extends AppCompatActivity {

    public RecyclerView recyclerView;

    public List<Item> items;

    String value;
    private TextView header11;
    private ImageView backServiceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_detail_page);

        getIntentValue();

        initializeObject();

        recyclerView = findViewById(R.id.recyclerView);

        items = new ArrayList<Item>();

        setItemValues(value);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));

    }

    private void getIntentValue() {
        value = getIntent().getStringExtra("listen");
    }

    private void initializeObject() {

        header11 = findViewById(R.id.header11);

        header11.setText(value);

        backServiceButton = findViewById(R.id.backServiceButton);

        backServiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ServiceDetailPage.this, HomePage.class);
                startActivity(intent);
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
        items.add(new Item("Wash Basin Repair", "Estimated Labour Price: Rs. 550", "Time: 2hrs",
                "Repair or replacement of any damaged material related to wash basin", R.drawable.washbasinfaucetleakage));

        items.add(new Item("Water Tap Repair", "Estimated Price: Rs. 450", "Time: 2hrs",
                "Repair or replacement of any type of taps.", R.drawable.tapleakage));

        items.add(new Item("Commode Repair", "Estimated Price: Rs. 700", "Time: 2hrs",
                "Repair or replacement of commode, urinal, Indian style toilet .", R.drawable.commodeleakage));

        items.add(new Item("Roof Tank Repair", "Estimated Price: Rs. 1000", "Time: 1hrs",
                "Repair or replacement of roof tanks including cleaning.", R.drawable.tank));

        items.add(new Item("PipeLine Repair", "Estimated Price: Rs. 1000", "Time: 1hrs",
                "Repair or replacement of pipe line including drainage system.", R.drawable.plumbing));

        items.add(new Item("Washing Machine", "Estimated Price: Rs. 300", "Time: 1hrs",
                "Install or replace washing machine.", R.drawable.machine));

        items.add(new Item("Electric Geyser", "Estimated Price: Rs. 200", "Time: 1hrs",
                "Install or replace electric geyser.", R.drawable.geyser));

        items.add(new Item("Solar Tube", "Estimated Price: Rs. 550", "Time: 1hrs",
                "Install or replace solar tube.", R.drawable.solarimage));

        items.add(new Item("Water Motor", "Estimated Price: Rs. 550", "Time: 1hrs",
                "Install or replace water motor.", R.drawable.motor));
    }

    private void addElectricalItems() {
    }

    private void addMotorItems() {
    }

    private void addMetalItems() {
    }

    private void addGeneratorItems() {
    }

    private void addChimneyItems() {
    }

    private void addInverterItems() {
    }


}