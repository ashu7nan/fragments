package com.ashu.fragments.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.ashu.fragments.R;

/**
 * Created by ashu on 15-03-2018.
 */

public class fragment1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vi = inflater.inflate(R.layout.fragment1,container,false);
        final Button frag1 = (Button)vi.findViewById(R.id.frag1);
        frag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),frag1.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
        return vi;
    }
}
