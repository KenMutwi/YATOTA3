package com.ken.yatota.Adapters;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ken.yatota.Models.DownloadModel;
import com.ken.yatota.R;

import java.util.List;


public class DownloadAdapter extends RecyclerView.Adapter<DownloadAdapter.ViewHolder> {

    private List<DownloadModel> dataSet;
    private Context context;

    public DownloadAdapter(
            List<DownloadModel> dataSet, Context context) {
        this.dataSet = dataSet;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.download_item_layout, parent, false);
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder,
                                 final int position) {
        holder.number.setText(dataSet.get(position).getId());
        holder.time1.setText(dataSet.get(position).getDate());
        holder.total.setText(dataSet.get(position).getTotalneckroll());
        holder.chairone.setText(dataSet.get(position).getBarber1used());
        holder.chairtwo.setText(dataSet.get(position).getBarber2used());
        holder.chairthree.setText(dataSet.get(position).getBarber3used());

    }


    @Override
    public int getItemCount() {
        return dataSet.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        TextView number,time1,total,chairone,chairtwo,chairthree;


        ViewHolder(final View itemView) {
            super(itemView);
            number = itemView.findViewById(R.id.idNumber);
            time1=itemView.findViewById(R.id.date1);
            total=itemView.findViewById(R.id.totalN);
            chairone= itemView.findViewById(R.id.chair1);
            chairtwo= itemView.findViewById(R.id.chair2);
            chairthree= itemView.findViewById(R.id.chair3);

        }

    }



}
