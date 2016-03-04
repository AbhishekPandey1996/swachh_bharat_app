package example.abhishek.com.materialdesign.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.lang.reflect.Array;

import example.abhishek.com.materialdesign.R;
import example.abhishek.com.materialdesign.fragments.RoundedImageView;

/**
 * Created by Abhishek on 28-02-2016.
 */
public class TestimonialsAdapter  extends BaseAdapter {

    Context context;
    String[] celebLinks = {"https://pbs.twimg.com/profile_images/638604223920254976/HFibH6lv_bigger.jpg","https://pbs.twimg.com/profile_images/648447720676397056/odMw74L6_bigger.jpg","https://pbs.twimg.com/profile_images/540570964350627841/rEK-5VLW_bigger.jpeg", "https://pbs.twimg.com/profile_images/669808107527102464/dqglhEVt_400x400.jpg","https://pbs.twimg.com/profile_images/672756538562375680/6PswWyel_bigger.jpg","https://pbs.twimg.com/profile_images/675578380855578624/EyQVvVm__bigger.jpg","https://pbs.twimg.com/profile_images/677821492436951041/ojJKVWNN_bigger.jpg","https://pbs.twimg.com/profile_images/467207061441241088/vD_zFYix_bigger.jpeg","https://pbs.twimg.com/profile_images/669169495710285824/IEwUKATS_bigger.png","https://pbs.twimg.com/profile_images/438656822723887104/FLbXXm9t_bigger.jpeg","https://pbs.twimg.com/profile_images/695609973489823744/LLGyrFfP_bigger.jpg"};
    String[] celebTesti = {"Major setback to #Modi 's #SwachhBharat , no toilet at govt school in PM's hometown\n" +"http://www.indiasamvad.co.in/States/Major-setback-to-Modis-Swachh-Bharat-no-toilet-at-govt-school-in-PMs-hometown-11471 … ","PM Modi saluting & felicitating 104 Years old Maa Kunwar Bai for her exemplary contribution to #SwachhBharat - https://www.youtube.com/watch?v=c_Ce0RCn11U","Swachh Bharat: Muslim leaders meet Narendra Modi; pledge to build toilets near Ganga via @indiacom http://www.india.com/news/india/swachh-bharat-muslim-leaders-meet-narendra-modi-pledge-to-build-toilets-near-ganga-989416/","Sincere thnx to rajapalayam residents.recvd more than 3lacs towards sanitation project.had a great meetin. More to come.#SwachhBharat gb","#SwachhBharat mission can only become a revolution when we start taking the initiative ourselves! RT if you agree. "
    ,"PM @narendramodi touches the feet of an old lady for her exemplary contribution to #SwachhBharat.","For making #MyCleanIndia a reality, we need to march forward keeping faith in  #SwachhBharat mission. pic.twitter.com/1X7Ltc4JqX","In Chhattisgarh, PM Modi touches the feet of 104-yr-old woman who sold her goats to build toilets - #SwachhBharat  http://m.timesofindia.com/india/In-Chhattisgarh-PM-Modi-touches-the-feet-of-104-yr-old-woman-who-sold-her-goats-to-build-toilets/articleshow/51079511.cms","RT ShramdaanBharat: Willing to contribute towards #SwachhBharat #MyCleanIndia - Join us","To clean Garbage once has to identify the pollutants first .Thats whats happening in India at the moment #SwachhBharat","Mtg of #WasteManagement operatrs org by @FollowCII cant help bt b disillusioned by apathy of country abt waste. Hoping for a #SwachhBharat"};
    String[] celebNames = {"India Samvad","BJP","Suman s Bhatt","Vishal","Swachh Bharat Urban","BJP","Narendra Modi","Vijay","Neha","Lalit Advani","Saurabh Shah"};
    String[] celebDesgn = {"@india_samvad","@BJP4India","@SbSdesi", "@VishalKOfficial","@SwachhBharatGov","@BJP4India","@narendramcdi","@centerofright","@NehaBJP","@lalitadvani","@shasha2003"};

    public TestimonialsAdapter(Context context,String[] texttweets , String[] imageurl,String[] name, String[] subname) {
        this.context = context;
        if(texttweets!=null){
            celebTesti= texttweets.clone();
            celebLinks=imageurl.clone();
            celebNames=name.clone();
            celebDesgn=subname.clone();
        }

    }

    @Override
    public int getCount() {
        return celebNames.length;
    }

    @Override
    public Object getItem(int position) {
        return celebNames[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.testi_item, parent, false);
            holder.celebImg = (RoundedImageView) convertView.findViewById(R.id.testi_img);
            holder.testi = (TextView) convertView.findViewById(R.id.tvTestDesc);
            holder.name = (TextView) convertView.findViewById(R.id.tvTestiCeleb);
            holder.dsg = (TextView) convertView.findViewById(R.id.tvTestiCelebDesg);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Picasso.with(context).load(celebLinks[position]).fit().into(holder.celebImg);

        /*Ion.with(context)
                .load(celebLinks[position])
                .intoImageView(holder.celebImg);*/
        holder.testi.setText(celebTesti[position]);
        holder.name.setText(celebNames[position]);
        holder.dsg.setText(celebDesgn[position]);

        return convertView;
    }

    class ViewHolder{
        RoundedImageView celebImg;
        TextView testi,name,dsg;
    }

}

