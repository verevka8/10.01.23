package com.example.a100123;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RootFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RootFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "login";
    private static final String ARG_PARAM2 = "password";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RootFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RootFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RootFragment newInstance(String param1, String param2) {
        RootFragment fragment = new RootFragment();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_root, container, false);
        Button btn = view.findViewById(R.id.button2);
        TextView tv_user_login = view.findViewById(R.id.user_login);
        TextView tv_user_password = view.findViewById(R.id.user_password);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle bundle = new Bundle();
                bundle.putString(ARG_PARAM1,tv_user_login.getText().toString());
                bundle.putString(ARG_PARAM2,tv_user_password.getText().toString());
                Navigation.findNavController(view).navigate(R.id.action_rootFragment_to_resultFragment,bundle);
            }
        });

        return view;
    }
}