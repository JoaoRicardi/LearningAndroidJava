package com.example.fragmentscommunication;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.example.fragmentscommunication.interfaces.FragmentSendListener;

public class FragmentSend extends Fragment {

    //TODO quem enviar usa como atributo a interface
    private FragmentSendListener listener;

    private EditText infoDigitada;
    private Button btnSend;

    public FragmentSend() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.send_fragment,container,false);
        infoDigitada =  (EditText) v.findViewById(R.id.send_info_edit_text);
        btnSend = (Button) v.findViewById(R.id.btn_enviar);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String infoToSend =  infoDigitada.getText().toString();
                listener.sendInput(infoToSend);
            }
        });


        return  v;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    @Override
    public void onAttach(Context ct) {
        super.onAttach(ct);
        if(ct instanceof  FragmentSendListener){
            listener =(FragmentSendListener) ct;
        }else{
            throw  new RuntimeException(ct.toString());
        }
    }
}
