package com.example.anuj.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgramAdapter extends RecyclerView.Adapter<ProgramAdapter.ProgramViewHolder>{

    private String[] friends;
    private String[] desc;
    private int[] img;
    public ProgramAdapter(String[] friends,String[] desc,int[] img) {
        this.friends=friends;
        this.desc=desc;
        this.img=img;
    }

    @NonNull
    @Override
    public ProgramViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.friends_info_layout,viewGroup,false);

        return new ProgramViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgramViewHolder holder, int i) {
        String title= friends[i];
        String Desc= desc[i];
        int Img= img[i];
        holder.textName.setText(title);
        holder.textDesc.setText(Desc);
        holder.imageView.setImageResource(Img);
    }

    @Override
    public int getItemCount() {
        return friends.length;
    }

    public class ProgramViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textName;
        TextView textDesc;

        public ProgramViewHolder(View view)
        {
            super(view);
            imageView = view.findViewById(R.id.img);
            textName = view.findViewById(R.id.Name);
            textDesc = view.findViewById(R.id.description);
        }
    }
}
