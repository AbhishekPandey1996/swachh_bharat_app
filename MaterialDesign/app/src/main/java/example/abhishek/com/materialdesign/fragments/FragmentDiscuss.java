package example.abhishek.com.materialdesign.fragments;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


import example.abhishek.com.materialdesign.AboutAbhiyan;
import example.abhishek.com.materialdesign.CustomizeGallery.GalleryMainActivity;
import example.abhishek.com.materialdesign.R;
import example.abhishek.com.materialdesign.Volunteer_Form;
import example.abhishek.com.materialdesign.adapters.CustomAdapters;
import example.abhishek.com.materialdesign.tweets.MainActivity2;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentDiscuss#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentDiscuss extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    GridView gridView;
    final String[] categories={"About Abhiyan","Gallery","Events","Volunteer_Registration","Complain","Tweets"};
    int[] resId={R.drawable.x6,R.drawable.x5,R.drawable.x8,R.drawable.x2,R.drawable.x4,R.drawable.x1};
    String[] colorCodes ={"#e74c3c","#3498db","#e67e22","#9b59b6","#27ae60","#2c3e50"};

    public FragmentDiscuss() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentDiscuss.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentDiscuss newInstance(String param1, String param2) {
        FragmentDiscuss fragment = new FragmentDiscuss();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_discuss, container, false);
        gridView = (GridView) view.findViewById(R.id.gvcattest);

        CustomAdapters adapter= new CustomAdapters(view.getContext(),categories,resId,colorCodes);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(getContext(), AboutAbhiyan.class));
                        break;
                    case 1:
                        startActivity(new Intent(getContext(), GalleryMainActivity.class));
                        break;
                    case 2:
                        Toast.makeText(getContext(),"No Current Event going on",Toast.LENGTH_LONG).show();
                        break;

                    case 3:
                        startActivity(new Intent(getContext(), Volunteer_Form.class));
                        break;
                    case 4:
                        Toast.makeText(getContext(),"Redirecting to add Complain ",Toast.LENGTH_LONG).show();
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.complaintboard.in/complaints-reviews/swach-bharat-abhiyan-l420034.html")).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
                        break;
                    case 5:
                        Toast.makeText(view.getContext(),"Downloading Tweets, Please wait...",Toast.LENGTH_LONG).show();
                        startActivity(new Intent(getContext(), MainActivity2.class));
                        break;


                }

            }


        });
        return view;
    }

}
