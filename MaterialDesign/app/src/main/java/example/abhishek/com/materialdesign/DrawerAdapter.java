package example.abhishek.com.materialdesign;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Collections;
import java.util.List;

import example.abhishek.com.materialdesign.CustomizeGallery.GalleryMainActivity;

/**
 * Created by Abhishek on 10-12-2015.
 */
public class DrawerAdapter extends RecyclerView.Adapter<DrawerAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    Context context;
    List<DrawerInformation> data = Collections.emptyList();
    public DrawerAdapter(Context context, List<DrawerInformation> data){
        this.context = context;
        inflater  = LayoutInflater.from(context);
        this.data = data;
    }

    public void delete(int position){
        data.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.custom_row,parent,false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        DrawerInformation current = data.get(position);
        holder.title.setText(current.title);
        holder.icon.setImageResource(current.iconId);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView title;
        ImageView icon;
        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.listtext);
            icon = (ImageView) itemView.findViewById(R.id.listicon);
            icon.setOnClickListener(this);
            title.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
           switch (getPosition()){
               case 0:
                   Intent i = new Intent(v.getContext(),AboutAbhiyan.class);
                   context.startActivity(i);
                   break;
               case 1:
                   Intent j = new Intent(v.getContext(),GalleryMainActivity.class);
                   context.startActivity(j);
                   break;
               case 2:
                   Toast.makeText(context, "No Current event going on", Toast.LENGTH_SHORT).show();
                   break;
               case 3:
                   Intent l = new Intent(v.getContext(),AboutUs.class);
                   context.startActivity(l);
                   break;
               case 4:
                    Intent k = new Intent(v.getContext(),FeedbackActivity.class);
                   context.startActivity(k);
                   break;

           }
        }
    }
}
