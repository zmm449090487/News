package com.example.lenovo.news.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.lenovo.news.R;
import com.example.lenovo.news.bean.HomeHotInfo;

import java.util.ArrayList;

public class MyHomeHotAdapter extends RecyclerView.Adapter<MyHomeHotAdapter.ViewHolder> {
    private Context context;
    private ArrayList<HomeHotInfo.ContentsBean.ArticlesBean> list;

    public MyHomeHotAdapter(Context context, ArrayList<HomeHotInfo.ContentsBean.ArticlesBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.home_hot_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.title.setText(list.get(i).getTitle());
        Glide.with(context).load(list.get(i).getThumb()).into(viewHolder.img);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            img = itemView.findViewById(R.id.img);
        }
    }
}
