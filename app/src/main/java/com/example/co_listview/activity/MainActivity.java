package com.example.co_listview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.co_listview.R;
import com.example.co_listview.adapter.CustomAdapter;
import com.example.co_listview.model.College;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] colleges;
    String[] collegesEst;
    int[] logos;
    ListView lvColleges;
    CustomAdapter adapter;
    List<College> listNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listNames = new ArrayList<College>();
        colleges = getResources().getStringArray(R.array.ustColleges);
        collegesEst = getResources().getStringArray(R.array.collegeEst);
        lvColleges = (ListView) findViewById(R.id.collegeList);
        logos = new int[] {R.drawable.iics, R.drawable.pharmacy, R.drawable.eng, R.drawable.education, R.drawable.med};

        for(int i = 0; i < colleges.length; i++){
            listNames.add(new College(logos[i], colleges[i], collegesEst[i]));
        }

//        adapter = new ArrayAdapter<String>(this, R.layout.row_layout, colleges);
        adapter = new CustomAdapter(this, listNames);
        lvColleges.setAdapter(adapter);


        lvColleges.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String msg = "You clicked " + colleges[i];
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
