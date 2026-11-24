package com.example.advancedandroid;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class TabsPagerAdapter extends FragmentStateAdapter {

    public TabsPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) return TabFragment.newInstance("First", "Welcome to the First tab.");
        if (position == 1) return TabFragment.newInstance("Second", "This is the Second tab.");
        return TabFragment.newInstance("Third", "This is the Third tab.");
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
