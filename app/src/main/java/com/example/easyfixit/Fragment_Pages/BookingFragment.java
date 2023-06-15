package com.example.easyfixit.Fragment_Pages;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.easyfixit.Adaptation.VPBookingAdapter;
import com.example.easyfixit.R;
import com.example.easyfixit.Fragment_Pages.BookingFragment_Pages.CurrentFragment;
import com.example.easyfixit.Fragment_Pages.BookingFragment_Pages.HistoryFragment;
import com.google.android.material.tabs.TabLayout;


public class BookingFragment extends Fragment {

    private TabLayout eTabLayout;
    private ViewPager eViewPager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_booking, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        eTabLayout = view.findViewById(R.id.tabLayout);
        eViewPager = view.findViewById(R.id.viewPager);

        eTabLayout.setupWithViewPager(eViewPager);

        VPBookingAdapter vpBookingAdapter = new VPBookingAdapter(getActivity().getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpBookingAdapter.addFragment(new CurrentFragment(), "CURRENT");
        vpBookingAdapter.addFragment(new HistoryFragment(), "HISTORY");

        eViewPager.setAdapter(vpBookingAdapter);


    }
}