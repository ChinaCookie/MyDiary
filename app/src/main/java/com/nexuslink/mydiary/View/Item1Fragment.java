package com.nexuslink.mydiary.View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nexuslink.mydiary.R;

/**
 * Created by Rye on 2016/12/3.
 */

public class Item1Fragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_item1,container,false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.item1_recycler);
        recyclerView.setAdapter(new DiaryRecyclerAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }

    private class DiaryRecyclerAdapter extends RecyclerView.Adapter<DiaryRecyclerViewHoder> {
        @Override
        public DiaryRecyclerViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(getContext()).inflate(R.layout.item_diary,parent,false);
            return new DiaryRecyclerViewHoder(view);
        }

        @Override
        public void onBindViewHolder(DiaryRecyclerViewHoder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 20;
        }
    }

    private class DiaryRecyclerViewHoder extends RecyclerView.ViewHolder{
        public DiaryRecyclerViewHoder(View itemView) {
            super(itemView);
        }
    }
}