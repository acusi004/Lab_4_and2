package com.example.lab_4_and2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class BlankFragment_bai2b extends Fragment {

    EditText editText;
    Button btn_send;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank_bai2b, container, false);
        editText = view.findViewById(R.id.edt_text);
        btn_send = view.findViewById(R.id.btn_send);


        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                FragmentManager fg = getActivity().getSupportFragmentManager();
                BlankFragment_bai_2a fg1 = (BlankFragment_bai_2a) fg.findFragmentById(R.id.fg1);
                fg1.textView.setText(text);
            }
        });
        return view;
    }
}