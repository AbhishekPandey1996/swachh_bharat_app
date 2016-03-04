package example.abhishek.com.materialdesign.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import example.abhishek.com.materialdesign.R;
import example.abhishek.com.materialdesign.fragments.RoundedImageView;

/**
 * Created by Abhishek on 28-02-2016.
 */
public class NewsAdapter extends BaseAdapter {

    Context context;
    String[] celebLinks = {"http://www.thehindu.com/multimedia/dynamic/02174/Modi_2174086f.jpg","http://ste.india.com/sites/default/files/2014/10/03/279222-clean.jpg","http://cdn.narendramodi.in/cmsuploads/557961afd1232.jpg","http://economictimes.indiatimes.com/thumb/msid-50478915,width-310,resizemode-4/karnataka-cm-siddaramaiah-criticises-swachh-bharat-cess.jpg","http://i.ndtvimg.com/i/2015-12/bill-gates_700x431_81449228993.jpg"};
    String[] newscontent = {"On October 2, Mr. Modi launched this ambitious campaign.\n\"A clean India would be the best tribute India could pay to Mahatma Gandhi while celebrating his 150 birth anniversary in 2019,\" Prime Minister Narendra Modi had said as he launched this mission October 2, 2014.","New Delhi: Wielding the broom, Prime Minister Narendra Modi on Thursday launched the country's biggest-ever cleanliness drive that is expected to cost over Rs 62,000 crore, asserting that the \"Swachh Bharat\" mission is \"beyond politics\" and inspired by patriotism.He stated that \"I am not talking politics...This is beyond politics. This is inspired my patriotism not politcs. We do not have to do with an eye on politics...I say that with a clean heart... If we paint this again with a brush of politics, we will again do a disservice to mother India.\"","The Prime Minister, Shri Narendra Modi, today reviewed the progress of the Swachh Bharat Mission at a high-level meeting comprising top officers of the Ministries of Urban Development, Drinking Water Supply and Sanitation, NITI Aayog and PMO.Reviewing efforts at generating awareness and attitudinal change towards cleanliness, the Prime Minister said spiritual leaders should be associated with such efforts, especially during major congregational events such as the Jagannath Yatra and the Kumbh Mela. He said motivational incentives such as awards should also be instituted through official channels. In rural areas, the Prime Minister suggested quiz competitions among students to promote awareness.",
    "BENGALURU:Chief minister Siddaramaiah has criticised the Swachh Bharat cess imposed by the Centre on November 15, 2014 on all services, which has effectively raised the peak rate of tax to 14.5 from 14%. \nHe pointed out that the Swachh Bharat programme was actually just a renamed central government programme that the UPA used to called Nirmal Bharat.","NEW DELHI:  Microsoft founder and philanthropist Bill Gates today promised to extend all support to Centre's efforts to expand the reach and effectiveness of sustainable sanitation services under the Swachh Bharat Mission.\n" +
            "\n" +"Urban Development Minister M Venkaiah Naidu and Mr Gates, who is Co-Chair of Bill & Melinda Gates Foundation, discussed at length implementation of the sanitation campaign in urban areas of the country.\n" +
            "\n" +"\"Foundation's cooperation with India to promote safe and sustainable sanitation services to all is one of its best partnerships,\" Mr Gates said after the meeting.\n" +
            "\n" +"The foundation had signed a Memorandum of Cooperation with the UD Ministry to promote sanitation services in January this year.\n"};
    String[] newsheadline = {"Swacch Bharat Mission","it's patriotism not politics","PM reviews progress of “Swachh Bharat Mission”","Karnataka CM Siddaramaiah criticises Swachh Bharat cess","Bill Gates Says Swachh Bharat Partnership With India One of the Best"};
   //String[] newscontent = {"Cricketer"};

    public NewsAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return newsheadline.length;
    }

    @Override
    public Object getItem(int position) {
        return newsheadline[position];
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
            convertView = inflater.inflate(R.layout.news_single, parent, false);
            holder.celebImg = (ImageView) convertView.findViewById(R.id.news_img);
            holder.headline = (TextView) convertView.findViewById(R.id.tvNewsHeadline);
            holder.news = (TextView) convertView.findViewById(R.id.tvNewsContent);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Picasso.with(context).load(celebLinks[position]).fit().into(holder.celebImg);

        /*Ion.with(context)
                .load(celebLinks[position])
                .intoImageView(holder.celebImg);*/
        holder.headline.setText(newsheadline[position]);
        holder.news.setText(newscontent[position]);

        return convertView;
    }

    class ViewHolder{
        ImageView celebImg;
        TextView headline,news;
    }

}


