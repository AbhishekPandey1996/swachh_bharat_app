package example.abhishek.com.materialdesign;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import example.abhishek.com.materialdesign.adapters.NewsAdapter;
import example.abhishek.com.materialdesign.adapters.TestimonialsAdapter;

/**
 * Created by Abhishek on 28-02-2016.
 */
public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_list);
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        ListView lv = (ListView)findViewById(R.id.lvNews);
        NewsAdapter adapter = new NewsAdapter(this);
        lv.setAdapter(adapter);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            NavUtils.navigateUpFromSameTask(this);
        }
        return super.onOptionsItemSelected(item);
    }
}


