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

public class fragment2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vi = inflater.inflate(R.layout.fragment2,container,false);
        final Button frag2 = (Button)vi.findViewById(R.id.frag2);
        frag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),frag2.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
        return vi;
    }
}
