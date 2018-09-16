package com.example.android.playboy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PlayListActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);


        final ArrayList<Song> songs = new ArrayList<>();  // new Array of songs


        songs.add(new Song("All of Me", "John Legend", R.drawable.johnlegend, "3:66"));
        songs.add(new Song("Mad Over You", "Run Town", R.drawable.runtown, "4:16"));
        songs.add(new Song("Pana", "Tekno", R.drawable.tekno, "3:22"));
        songs.add(new Song("Ma lo", "Tiwa Savage & Wizkid", R.drawable.malo, "4:00"));
        songs.add(new Song("Someone Like You", "Flavour", R.drawable.flavour, "3:00"));
        songs.add(new Song("Fall", "Davido", R.drawable.davido, "4:10"));
        songs.add(new Song("Come Closer", "Wizkid", R.drawable.wizkid, "3:22"));
        songs.add(new Song("Mama", "Maryorkun", R.drawable.mayorkun, "4:21"));
        songs.add(new Song("Rich And Famous", "Praiz", R.drawable.praiz, "3:53"));
        songs.add(new Song("I am Taken", "Cynthia Morgan", R.drawable.cynthia, "3:77"));
        songs.add(new Song("Joromi", "Simi", R.drawable.simi, "3:31"));
        songs.add(new Song("This is Nigeria", "falz", R.drawable.falz, "4:20"));


        SongAdapter adapter = new SongAdapter(this, songs); // new array adapter


        ListView listView = findViewById(R.id.list_);

        listView.setAdapter(adapter);  //set adapter on the list view


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(PlayListActivity.this, NowPlayingActivity.class);
                startActivity(i);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu); // set your file name
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.store) {
            Intent i = new Intent(PlayListActivity.this, StoreActivity.class);
            startActivity(i);
            //do something
            return true;
        }
        if (id == R.id.search) {

            //do something
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
