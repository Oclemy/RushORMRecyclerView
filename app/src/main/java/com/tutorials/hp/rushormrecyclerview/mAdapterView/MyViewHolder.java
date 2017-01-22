package com.tutorials.hp.rushormrecyclerview.mAdapterView;

import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.TextView;

import com.tutorials.hp.rushormrecyclerview.R;


/**
 * Created by Oclemmy on 16/12/2016 for ProgrammingWizards Channel and http://www.Camposha.com.
 */
public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnLongClickListener,View.OnCreateContextMenuListener {

    TextView nameTxt,propTxt;
    MyLongClickListener longClickListener;

    public MyViewHolder(View v) {
        super(v);
        nameTxt= (TextView) v.findViewById(R.id.nameTxt);
        propTxt= (TextView) v.findViewById(R.id.propellantTxt);

        v.setOnLongClickListener(this);
        v.setOnCreateContextMenuListener(this);
    }

    @Override
    public boolean onLongClick(View v) {
        this.longClickListener.onItemLongClick();
        return false;
    }

    public void setLongClickListener(MyLongClickListener longClickListener)
    {
        this.longClickListener=longClickListener;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.setHeaderTitle("Action : ");
        menu.add(0, 0, 0, "NEW");
        menu.add(0,1,0,"EDIT");
        menu.add(0,2,0,"DELETE");


    }
}
