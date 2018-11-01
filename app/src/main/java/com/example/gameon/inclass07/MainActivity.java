package com.example.gameon.inclass07;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


import junit.framework.Test;

import org.w3c.dom.Text;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainFragment.OnFragmentInteractionListener, AvatarSelector.OnFragmentInteractionListener {

    private User user;
    private String avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        MainFragment f = new MainFragment();
//        FragmentTransaction ft = getFragmentManager().beginTransaction();
//        ft.add(R.id.linView, f, "main").commit();
        getFragmentManager().beginTransaction()
                .add(R.id.linView, new MainFragment(), "tag_main")
                .commit();



    }

    @Override
    public void onBackPressed() {
        if ( getFragmentManager().getBackStackEntryCount() > 0 ) {
            getFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void selectAvatar() {
        getFragmentManager().beginTransaction()
                .replace(R.id.linView, new AvatarSelector(), "avatar")
                .addToBackStack(null)
                .commit();
    }

    @Override
    public String sendAvatar(String avatar) {

        this.avatar = avatar;
        Fragment f = new MainFragment();
        Bundle b = new Bundle();
        b.putString("avatar", avatar);
        f.setArguments(b);
        Log.d("main", "Did I amke it here?");
        getFragmentManager().beginTransaction()
                .replace(R.id.linView, new MainFragment(), "first")
                .commit();
        return null;
    }
}
