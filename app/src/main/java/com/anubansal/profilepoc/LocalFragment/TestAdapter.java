package com.anubansal.profilepoc.LocalFragment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.anubansal.profilepoc.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anubansal on 10/11/17.
 */

public class TestAdapter extends RecyclerView.Adapter {

    private static final String TAG = TestAdapter.class.getSimpleName();

    Context mContext;
    List<String> mList = new ArrayList<>();

    TestAdapter(Context context, List list) {
        this.mList = list;
        this.mContext = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(mContext).inflate(R.layout.forward_fragment_item, null);
        return new TestViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder for position : " + position);
        TestViewHolder holder1 = (TestViewHolder) holder;
        String item = mList.get(position);
        holder1.text.setText(item);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class TestViewHolder extends RecyclerView.ViewHolder {

        TextView text;

        TestViewHolder(View view) {
            super(view);
            text = (TextView) view.findViewById(R.id.test_item);
        }
    }
}
