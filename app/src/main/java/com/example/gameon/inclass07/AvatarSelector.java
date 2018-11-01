package com.example.gameon.inclass07;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gameon.inclass07.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link AvatarSelector.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link AvatarSelector#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AvatarSelector extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public AvatarSelector() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AvatarSelector.
     */
    // TODO: Rename and change types and number of parameters
    public static AvatarSelector newInstance(String param1, String param2) {
        AvatarSelector fragment = new AvatarSelector();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        getActivity().findViewById(R.id.f1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("image", "This is the image id " + R.drawable.avatar_f_1);
                //mListener.sendAvatar("avatar_f_1");
                MainFragment f = (MainFragment) getFragmentManager().findFragmentByTag("tag_main");
                final Bundle image = new Bundle();
                image.putInt("avatar", R.drawable.avatar_f_1);
                f.setArguments(image);
                getFragmentManager().beginTransaction()
                        .replace(R.id.linView, f, "tag_main")
                        .addToBackStack(null)
                        .commit();
           }
        });

        getActivity().findViewById(R.id.f2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainFragment f = (MainFragment) getFragmentManager().findFragmentByTag("tag_main");
                final Bundle image = new Bundle();
                image.putInt("avatar", R.drawable.avatar_f_2);
                f.setArguments(image);
                getFragmentManager().beginTransaction()
                        .replace(R.id.linView, f, "tag_main")
                        .addToBackStack(null)
                        .commit();
            }
        });

        getActivity().findViewById(R.id.f3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainFragment f = (MainFragment) getFragmentManager().findFragmentByTag("tag_main");
                final Bundle image = new Bundle();
                image.putInt("avatar", R.drawable.avatar_f_3);
                f.setArguments(image);
                getFragmentManager().beginTransaction()
                        .replace(R.id.linView, f, "tag_main")
                        .addToBackStack(null)
                        .commit();
            }
        });

        getActivity().findViewById(R.id.m1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainFragment f = (MainFragment) getFragmentManager().findFragmentByTag("tag_main");
                final Bundle image = new Bundle();
                image.putInt("avatar", R.drawable.avatar_m_1);
                f.setArguments(image);
                getFragmentManager().beginTransaction()
                        .replace(R.id.linView, f, "tag_main")
                        .addToBackStack(null)
                        .commit();
            }
        });

        getActivity().findViewById(R.id.m2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainFragment f = (MainFragment) getFragmentManager().findFragmentByTag("tag_main");
                final Bundle image = new Bundle();
                image.putInt("avatar", R.drawable.avatar_m_2);
                f.setArguments(image);
                getFragmentManager().beginTransaction()
                        .replace(R.id.linView, f, "tag_main")
                        .addToBackStack(null)
                        .commit();
            }
        });

        getActivity().findViewById(R.id.m3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainFragment f = (MainFragment) getFragmentManager().findFragmentByTag("tag_main");
                final Bundle image = new Bundle();
                image.putInt("avatar", R.drawable.avatar_m_3);
                f.setArguments(image);
                getFragmentManager().beginTransaction()
                        .replace(R.id.linView, f, "tag_main")
                        .addToBackStack(null)
                        .commit();
            }
        });


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_avatar_selector, container, false);


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
    public interface OnFragmentInteractionListener {
        void sendAvatar(String avatar);
    }
}
