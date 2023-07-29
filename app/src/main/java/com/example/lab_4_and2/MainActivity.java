package com.example.lab_4_and2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    TabLayout tab;
    Button btn_f1, btn_f2;
    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_f1 = findViewById(R.id.btn_f1);
        btn_f2 = findViewById(R.id.btn_f2);
        viewPager2 = findViewById(R.id.viewPager);
        tab = findViewById(R.id.Tablayout);
        Adpter adpter = new Adpter(this);
        viewPager2.setAdapter(adpter);

        new TabLayoutMediator(tab, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0: tab.setText("fragment 1");
                    break;
                    case 1: tab.setText("fragment 2");
                    break;
                    default:
                        break;
                }
            }
        }).attach();


        btn_f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fa = getSupportFragmentManager();
                BlankFragment_1 bl1 = new BlankFragment_1();
                fa.beginTransaction().add(R.id.frame, bl1).commit();
            }
        });
        btn_f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fa = getSupportFragmentManager();
                BlankFragment_2 bl2 = new BlankFragment_2();
                fa.beginTransaction().add(R.id.frame, bl2).commit();
            }
        });
    }


}