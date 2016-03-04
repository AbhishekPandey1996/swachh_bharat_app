package example.abhishek.com.materialdesign;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by Abhishek on 28-02-2016.
 */
public class AboutAbhiyan extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setContentView(R.layout.aboutabhiyan);
    }
}
