package com.example.gameon.inclass07;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.gameon.inclass07.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MainFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
@SuppressWarnings("JavadocReference")
public class MainFragment extends Fragment  {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "image";
    private static View v;
    private String avatar;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private int mParam3;

    private OnFragmentInteractionListener mListener;

    public MainFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance(String param1, String param2, int param3) {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        args.putInt(ARG_PARAM3, param3);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //String image = getArguments().getString("avatar");
        //Log.d("N", "This is in the onCreate after image " + image);
        if (getArguments() != null) {

            mParam1 = getArguments().getString("avatar");
            mParam2 = getArguments().getString(ARG_PARAM2);
            mParam3 = getArguments().getInt("image");

        }
        Log.d("main", "THis is it " + mParam1);
        if ( mParam1 != null ) {
            ImageView iv = getActivity().findViewById(R.id.imageView);
            iv.setImageResource(R.drawable.avatar_f_1);
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        if ( null != mParam1 && mParam1.equals("avatar_f_1") ) {

        }


        getActivity().findViewById(R.id.imageView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.selectAvatar();
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        int image = 0;
        v = inflater.inflate(R.layout.fragment_main,container,false);
        try {
            Log.d("N", "This is in the onCreateView " + mParam1 + ", " + savedInstanceState.getString("avatar"));
        } catch (Exception e) {
            e.printStackTrace();
        }
         if (getArguments() != null) {

            image = getArguments().getInt("avatar");
            ImageView iv = v.findViewById(R.id.imageView);
            iv.setImageResource(image);

        }
        Log.d("main", "THis is it " + mParam1);
//        if ( image > 0 ) {
//
//        }
        // Inflate the layout for this fragment


        v.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            User user = new User();

            //get information
            TextInputLayout firstName = getActivity().findViewById(R.id.textInputLayout3);
            Log.d("main", "This is the et " + firstName);
            TextInputLayout lastName = getActivity().findViewById(R.id.textInputLayout2);
            TextInputLayout studentID = getActivity().findViewById(R.id.textInputLayout4);
            RadioGroup radioGroup = getActivity().findViewById(R.id.radioGroup);

            String fName = firstName.getEditText().getText().toString();
            String lName = lastName.getEditText().getText().toString();
            String sID = studentID.getEditText().getText().toString();
            String dep = ((RadioButton) getActivity().findViewById(radioGroup.getCheckedRadioButtonId())).getText().toString();

            Toast toast = Toast.makeText(getContext(),
                    "Your student ID is Invalid",
                    Toast.LENGTH_SHORT);

            if(fName ==""||fName ==null)

            {
                //error our firstname
                Log.e("Main activity:", "First Name is not set");

            }else if(lName ==""||lName ==null)

            {
                //error our lastName
                Log.e("Main activity:", "Last Name is not set");

            }else if(sID ==""||sID ==null)

            {
                System.out.print(studentID);
                //error our studentID
                Log.e("Main activity:", "Student Id is not set");

            }else if(dep ==""||dep ==null)

            {
                //error out department
                Log.e("Main activity:", "Department is not set");
            }

                try

            {
                int tempID = Integer.parseInt(sID);
                if (tempID > 0 && sID.length() == 9) {
                    user.setStudentId(tempID);
                } else {
                    toast.show();
                    return;
                }




            }catch(
            NumberFormatException e)

            {
                // student Id invalid
                toast.show();
                Log.e("Main activity:", "Student Id is invalid");
            }

                user.setFirstName(fName);
                user.setLastName(lName);
                user.setDepartment(dep);
                DisplayProfile f = new DisplayProfile();
                final Bundle u = new Bundle();
                u.putSerializable("user",  user);
                f.setArguments(u);
                getFragmentManager().beginTransaction()
                        .replace(R.id.linView, f, "tag_profile")
                        .addToBackStack(null)
                        .commit();
            }





        });

            return v;
        }






    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }



//    @Override
//    public String sendAvatar(String avatar) {
//        this.avatar = avatar;
//        ImageView iv = getActivity().findViewById(R.id.imageView);
//        int image = getArguments().getInt("avatar");
//        iv.setImageResource(image);
//    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void selectAvatar();
    }
}
