package com.example.vitbhopal.adapters;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vitbhopal.R;
import com.example.vitbhopal.models.facultyInfoModelClass;

import java.util.List;

public class facultyInfoAdapters extends RecyclerView.Adapter<facultyInfoAdapters.ViewHolder> {

    private List<facultyInfoModelClass> userList;

    public facultyInfoAdapters(List<facultyInfoModelClass> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public facultyInfoAdapters.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.faculty_info_item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull facultyInfoAdapters.ViewHolder holder, int position) {

        String name = userList.get(position).getName();

        holder.setData(name);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.namearea);
        }

        public void setData(String name){
            textView.setText(name);
        }
    }

}
