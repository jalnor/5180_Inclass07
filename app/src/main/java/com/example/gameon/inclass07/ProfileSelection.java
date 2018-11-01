//package com.example.gameon.inclass07;
//
//import android.app.Activity;
//import android.app.Fragment;
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//
//public class ProfileSelection extends Fragment {
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_profile_selection);
//
//        findViewById(R.id.f1).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent returnIntent = new Intent();
//                returnIntent.putExtra("result", 1);
//                setResult(Activity.RESULT_OK,returnIntent);
//                finish();
//            }
//        });
//
//        findViewById(R.id.f2).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent returnIntent = new Intent();
//                returnIntent.putExtra("result", 2);
//                setResult(Activity.RESULT_OK,returnIntent);
//                finish();
//            }
//        });
//
//        findViewById(R.id.f3).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent returnIntent = new Intent();
//                returnIntent.putExtra("result", 3);
//                setResult(Activity.RESULT_OK,returnIntent);
//                finish();
//            }
//        });
//
//        findViewById(R.id.m1).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent returnIntent = new Intent();
//                returnIntent.putExtra("result", 4);
//                setResult(Activity.RESULT_OK,returnIntent);
//                finish();
//            }
//        });
//
//        findViewById(R.id.m2).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent returnIntent = new Intent();
//                returnIntent.putExtra("result", 5);
//                setResult(Activity.RESULT_OK,returnIntent);
//                finish();
//            }
//        });
//
//        findViewById(R.id.m3).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent returnIntent = new Intent();
//                returnIntent.putExtra("result", 6);
//                setResult(Activity.RESULT_OK,returnIntent);
//                finish();
//            }
//        });
//
//    }
//}
//
