package com.example.mealscatalogue;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.BitSet;

public class ListFoodAdapter extends RecyclerView.Adapter<ListFoodAdapter.ListViewHolder> {

    private Context context;

    public ListFoodAdapter(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    private ArrayList<Food> listFood;

    public ArrayList<Food> getListFood() {
        return listFood;
    }

    public void setListFood(ArrayList<Food> listFood) {
        this.listFood = listFood;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_item, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        holder.tvName.setText(getListFood().get(position).getName());
        holder.tvOrigin.setText(getListFood().get(position).getOrigin());
        Glide.with(context)
            .load(getListFood().get(position).getImage())
            .apply(new RequestOptions().override(55, 55))
            .into(holder.ivPhoto);
    }

    @Override
    public int getItemCount() {
        return listFood.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView ivPhoto;
        TextView tvName, tvOrigin;
        ListViewHolder(View itemView) {
            super(itemView);
            ivPhoto         = itemView.findViewById(R.id.food_image);
            tvName          = itemView.findViewById(R.id.food_name);
            tvOrigin        = itemView.findViewById(R.id.food_origin);
        }
    }

}