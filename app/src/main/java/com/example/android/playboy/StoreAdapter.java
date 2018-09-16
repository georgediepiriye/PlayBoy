package com.example.android.playboy;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * new store adapter for the music store
 */
public class StoreAdapter extends ArrayAdapter<Store> {


    //constructor for the store adapter
    StoreAdapter(Activity context, ArrayList<Store> songs) {


        super(context, 0, songs);

    }


    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        //check if the existing view is being reused,else inflate the view
        View ListItemView = convertView;
        if (ListItemView == null) {
            ListItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.store_list_item, parent, false);
        }


        //get the song object located at this position on the list
        Store currentSong = getItem(position);


        ImageView imageView = ListItemView.findViewById(R.id.pic);
        imageView.setImageResource(currentSong.getImageResourceId());

        // find the text view in the store_list.xml file with ID song_name
        TextView songNameTextView = ListItemView.findViewById(R.id.store_song_name);
        //get the song name from the current song object and set this text on the song name text view
        songNameTextView.setText(currentSong.getSongName());


        // find the text view in the store_list.xml file with ID artist_name
        TextView artistNameTextView = ListItemView.findViewById(R.id.store_artist_name);
        //gets the artist name from the current song object and set this text on the artist name text view
        artistNameTextView.setText(currentSong.getArtistName());


        // find the text view in the store_list.xml file with ID song_length
        TextView downloadsNumberTextView = ListItemView.findViewById(R.id.downloads_number);
        downloadsNumberTextView.setText(currentSong.getDownloadsNumber());


        //return the whole item layout
        return ListItemView;
    }
}