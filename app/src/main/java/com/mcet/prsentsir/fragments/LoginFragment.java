package com.mcet.prsentsir.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.mcet.prsentsir.R;
import com.mcet.prsentsir.SessionManager;

public class LoginFragment extends Fragment {
    public View view;
    public TextView unameTv,pwdTv;
    public Button loginBt,fbBt,gogleBt;
    private SessionManager session;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_login, container, false);
        session = new SessionManager(getActivity().getApplicationContext());
        bindViews();
        onOperation();
        return view;
    }

    private void bindViews() {
        unameTv =view.findViewById(R.id.email);
        pwdTv = view.findViewById(R.id.password);
        loginBt = view.findViewById(R.id.login_bt);
        fbBt = view.findViewById(R.id.bt_fb);
        gogleBt = view.findViewById(R.id.bt_ggl);
    }
    private void onOperation() {
        loginBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("Hustle","Hey yo");
            }
        });

    }

}
