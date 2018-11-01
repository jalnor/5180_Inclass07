//package com.example.gameon.inclass07;
//
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//public class ProfileDisplay extends AppCompatActivity {
//
//    private User user;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_profile_display);
//
//        this.user = new User();
//        Bundle bundle = getIntent().getExtras();
//
//        user.setFirstName(bundle.getString("firstName"));
//        user.setLastName(bundle.getString("lastName"));
//        user.setStudentId(bundle.getInt("studentID"));
//        user.setDepartment(bundle.getString("department"));
//        user.setProfile(bundle.getInt("avatar"));
//
//        //set everything here
//
//        ((TextView)findViewById(R.id.name)).setText(user.getFirstName() + user.getLastName());
//        ((TextView)findViewById(R.id.studentid)).setText("" + user.getStudentId());
//        ((TextView)findViewById(R.id.department)).setText(user.getDepartment());
//
//        ImageView img = (ImageView) findViewById(R.id.imageView2);
//        switch (user.getProfile()) {
//            case 1:
//                img.setImageResource(R.drawable.avatar_f_1);
//                break;
//
//            case 2:
//                img.setImageResource(R.drawable.avatar_f_2);
//                break;
//
//            case 3:
//                img.setImageResource(R.drawable.avatar_f_3);
//                break;
//
//            case 4:
//                img.setImageResource(R.drawable.avatar_m_1);
//                break;
//
//            case 5:
//                img.setImageResource(R.drawable.avatar_m_2);
//                break;
//
//            case 6:
//                img.setImageResource(R.drawable.avatar_m_3);
//                break;
//
//        }
//
//
//        //edit button
//        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(ProfileDisplay.this, MainActivity.class);
//                Bundle info = new Bundle();
//                info.putString("firstName", user.getFirstName());
//                info.putString("lastName", user.getLastName());
//                info.putInt("studentID", user.getStudentId());
//                info.putString("department", user.getDepartment());
//                info.putInt("avatar", user.getProfile());
//                intent.putExtras(info);
//                startActivity(intent);
//                finish();
//            }
//        });
//    }
//}
