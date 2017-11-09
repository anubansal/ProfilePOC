package com.anubansal.profilepoc.LocalFragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anubansal.profilepoc.R;

import java.util.ArrayList;

/**
 * Created by anubansal on 10/11/17.
 */

public class TestFragment extends Fragment {

    private View rootView;

//    public static TestFragment getInstance() {
//        TestFragment testFragment = new TestFragment();
//        return testFragment;
//    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.test_fragment, container, false);
        ArrayList<String> list = new ArrayList<>();
        for (int i=0 ;i<50; i++) {
            list.add("I am item number " + i);
        }
        TestAdapter adapter = new TestAdapter(getActivity(), list);
        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);
        return rootView;
    }
}
