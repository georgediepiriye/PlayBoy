package com.example.android.playboy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class StoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);


        ArrayList<Store> songs = new ArrayList<>();  //new store array of strings

        songs.add(new Store(R.drawable.adele, "Turning Tables", "Adele", "7655 downloads"));
        songs.add(new Store(R.drawable.yemi, "Go Down", "Yemi Alade", "7655 downloads"));
        songs.add(new Store(R.drawable.wizy, "Manya", "Wizkid", "3675 downloads"));
        songs.add(new Store(R.drawable.wande, "Super Woman", "Wande Coal", "1056 downloads"));
        songs.add(new Store(R.drawable.sultan, "Finally", "Sound Sultan", "2019 downloads"));
        songs.add(new Store(R.drawable.skales, "Shaku Shaku", "Skales", "8221 downloads"));
        songs.add(new Store(R.drawable.reminisce, "Diet", "Reminisce", "1123 downloads"));
        songs.add(new Store(R.drawable.mreazi, "Bad Vibe", "Mr Eazi", "8977 downloads"));
        songs.add(new Store(R.drawable.lara, "Show Up", "Lara George", "2233 downloads"));
        songs.add(new Store(R.drawable.alz, "Foreign", "Falz", "7753 downloads"));
        songs.add(new Store(R.drawable.boma, "Boma", "Mr 2K", "2167 downloads"));


        StoreAdapter adapter = new StoreAdapter(this, songs);  //new store adapter


        GridView gridView = findViewById(R.id.grid_);

        gridView.setAdapter(adapter);  //setting the adapter on the grid view
    }
}
