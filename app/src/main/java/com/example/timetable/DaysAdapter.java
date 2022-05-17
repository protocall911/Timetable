package com.example.timetable;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DaysAdapter extends RecyclerView.Adapter<DaysAdapter.DaysHolder> {

    private Context context;
    private ArrayList<Days> days;

    public DaysAdapter(Context context, ArrayList<Days> days){
        this.context = context;
        this.days = days;
    }

    @NonNull
    @Override
    public DaysHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.days_layout,
                parent,false);
        return new DaysHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DaysAdapter.DaysHolder holder, int position) {
        Days day = days.get(position);
        holder.SetDetails(day);
    }

    @Override
    public int getItemCount() {
        return days.size();
    }

    class DaysHolder extends RecyclerView.ViewHolder{

        private TextView txtName, class_1, class_2, class_3, class_4,
                class_5, class_6;

        public DaysHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtDay);
            class_1 = itemView.findViewById(R.id.class_1);
            class_2 = itemView.findViewById(R.id.class_2);
            class_3 = itemView.findViewById(R.id.class_3);
            class_4 = itemView.findViewById(R.id.class_4);
            class_5 = itemView.findViewById(R.id.class_5);
            class_6 = itemView.findViewById(R.id.class_6);
        }

        void SetDetails(Days days){
            txtName.setText(days.getDayName());
            class_1.setText(days.getClass_1());
            class_2.setText(days.getClass_2());
            class_3.setText(days.getClass_3());
            class_4.setText(days.getClass_4());
            class_5.setText(days.getClass_5());
            class_6.setText(days.getClass_6());
        }
    }
}
