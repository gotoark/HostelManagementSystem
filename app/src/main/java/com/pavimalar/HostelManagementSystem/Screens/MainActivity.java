package com.pavimalar.HostelManagementSystem.Screens;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.pavimalar.HostelManagementSystem.Adapter.RecyclerViewAdapter;
import com.pavimalar.HostelManagementSystem.Model.DataModel;
import com.pavimalar.HostelManagementSystem.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.ItemListener {

    RecyclerView recyclerView;
    ArrayList arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        arrayList = new ArrayList();
        arrayList.add(new DataModel("Rooms", R.drawable.user, "#09A9FF"));
        arrayList.add(new DataModel("Students 2", R.drawable.user, "#3E51B1"));
        arrayList.add(new DataModel("Attendance", R.drawable.user, "#673BB7"));
        arrayList.add(new DataModel("Stationary", R.drawable.user, "#4BAA50"));
        arrayList.add(new DataModel("Electricity", R.drawable.user, "#F94336"));
        //arrayList.add(new DataModel("Item 6", R.drawable.user, "#0A9B88"));

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, arrayList, this);
        recyclerView.setAdapter(adapter);


        /**
         AutoFitGridLayoutManager that auto fits the cells by the column width defined.
         **/

        /*AutoFitGridLayoutManager layoutManager = new AutoFitGridLayoutManager(this, 500);
        recyclerView.setLayoutManager(layoutManager);*/


        /**
         Simple GridLayoutManager that spans two columns
         **/
        GridLayoutManager manager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
    }

    @Override
    public void onItemClick(DataModel item) {

        Toast.makeText(getApplicationContext(), item.text + " is clicked", Toast.LENGTH_SHORT).show();


    }
}
