package com.example.fragmentscommunication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ReciveFragment extends Fragment {
    private TextView infoTextView;


    public ReciveFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.recive_fragment,container,false);
        infoTextView = (TextView) v.findViewById(R.id.info_recebida_text_view);

        return  v;
    }
    public void useText(String info){
        infoTextView.setText(info);
    }



    @Override
    public void onDetach() {super.onDetach();}


}
