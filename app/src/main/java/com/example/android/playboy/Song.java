package com.example.android.playboy;

/**
 * contains name of the song and name of the artist
 */
public class Song {

    /**
     * name of the song
     */
    private String mSongName;

    /**
     * artist of the song
     */
    private String mArtistName;

    /**
     * image of the song
     */
    private int mImageResourceId;
    /**
     * length of the song
     */
    private String mSongLength;


    /**
     * constructor for song class
     */
    Song(String songName, String artistName, int imageResourceId, String songLength) {
        mSongName = songName;
        mArtistName = artistName;
        mImageResourceId = imageResourceId;
        mSongLength = songLength;

    }

    /**
     * get name of song
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * get name of artist
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * get image resource id
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * get length of song
     */
    public String getSongLength() {
        return mSongLength;
    }
}
