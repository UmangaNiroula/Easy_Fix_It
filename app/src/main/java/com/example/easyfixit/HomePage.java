package com.example.easyfixit;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.easyfixit.Fragment_Pages.BookingFragment;
import com.example.easyfixit.Fragment_Pages.HomeFragment;
import com.example.easyfixit.Fragment_Pages.ProductsFragment;
import com.example.easyfixit.Fragment_Pages.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.navigation.NavigationBarView;


public class HomePage extends AppCompatActivity {

    BottomNavigationView eBottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    BookingFragment bookingFragment = new BookingFragment();
    ProductsFragment productsFragment = new ProductsFragment();
    ProfileFragment profileFragment = new ProfileFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        eBottomNavigationView = findViewById(R.id.bottomNavigationView);

        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout6, homeFragment).commit();

        eBottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.homeNav:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout6, homeFragment).commit();
                        return true;

                    case R.id.bookNav:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout6, bookingFragment).commit();
                        return true;

                    case R.id.products:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout6, productsFragment).commit();
                        return true;

                    case R.id.profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout6, profileFragment).commit();
                        return true;
                }

                return false;
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.search:
                Toast.makeText(this, "Search Click", Toast.LENGTH_SHORT).show();
                break;

            case R.id.notify:
                Toast.makeText(this, "Notify Clickss", Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}