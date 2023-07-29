package com.example.lab_4_and2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class Adpter extends FragmentStateAdapter {

    public Adpter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position == 0) {
            return new BlankFragment_1();
        }
        return new BlankFragment_2();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
