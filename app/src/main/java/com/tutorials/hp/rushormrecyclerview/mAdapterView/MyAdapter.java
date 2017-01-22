package com.tutorials.hp.rushormrecyclerview.mAdapterView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tutorials.hp.rushormrecyclerview.R;
import com.tutorials.hp.rushormrecyclerview.mDB.Spacecraft;

import java.util.List;

/**
 * Created by Oclemy on 12/15/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context c;
    List<Spacecraft> spacecrafts;
    Spacecraft spacecraft;

    public MyAdapter(Context c, List<Spacecraft> spacecrafts) {
        this.c = c;
        this.spacecrafts = spacecrafts;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(c).inflate(R.layout.model,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.nameTxt.setText(spacecrafts.get(position).getName());
        holder.propTxt.setText(spacecrafts.get(position).getPropellant());


        holder.setLongClickListener(new MyLongClickListener() {
            @Override
            public void onItemLongClick() {
                spacecraft= spacecrafts.get(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return spacecrafts.size();
    }


    public Spacecraft getSelectedSpacecraft()
    {
        return spacecraft;
    }

}
