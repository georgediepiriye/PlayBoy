package com.example.android.playboy;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {


    //constructor for the song adapter
    public SongAdapter(Activity context, ArrayList<Song> songs) {


        super(context, 0, songs);

    }


    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        //check if the existing view is being reused,else inflate the view
        View ListItemView = convertView;
        if (ListItemView == null) {
            ListItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        //get the song object located at this position on the list
        Song currentSong = getItem(position);

        // find the text view in the list.xml file with ID song_name
        TextView songNameTextView = ListItemView.findViewById(R.id.song_name);
        //get the song name from the current song object and set this text on the song name text view
        songNameTextView.setText(currentSong.getSongName());


        // find the text view in the list.xml file with ID artist_name
        TextView artistNameTextView = ListItemView.findViewById(R.id.artist_name);
        //gets the artist name from the current song object and set this text on the artist name text view
        artistNameTextView.setText(currentSong.getArtistName());

        ImageView imageView = ListItemView.findViewById(R.id.image);
        imageView.setImageResource(currentSong.getImageResourceId());

        // find the text view in the list.xml file with ID song_length
        TextView songLengthTextView = ListItemView.findViewById(R.id.song_length);
        songLengthTextView.setText(currentSong.getSongLength());


        //return the whole item layout containing three text views
        return ListItemView;
    }
}