package com.example.fragmentscommunication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.fragmentscommunication.interfaces.FragmentSendListener;

public class MainActivity extends AppCompatActivity implements FragmentSendListener {

    private FragmentSend sendFragment;
    private  ReciveFragment reciveFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         sendFragment = new FragmentSend();
         reciveFragment = new ReciveFragment();

        setUpFragment(sendFragment,R.id.container_fragment_send);
        setUpFragment(reciveFragment,R.id.container_fragment_recive);

    }

    public void setUpFragment(Fragment fragment,int layout){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(layout, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void sendInput(String input) {
        reciveFragment.useText(input);


    }
}
