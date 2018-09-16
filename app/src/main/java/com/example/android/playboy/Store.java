package com.example.android.playboy;


/**
 * customized class of the app store
 */
public class Store {

    /**
     * image of the song
     */
    private int mImageResourceId;
    /**
     * name of the song
     */
    private String mSongName;

    /**
     * artist of the song
     */
    private String mArtistName;
    ;
    /**
     * number of song downloads
     */
    private String mDownloadsNumber;


    /**
     * constructor for store class
     */
    Store(int imageResourceId, String songName, String artistName, String downloadsNumber) {
        mImageResourceId = imageResourceId;
        mSongName = songName;
        mArtistName = artistName;
        mDownloadsNumber = downloadsNumber;


    }

    /**
     * get name of song
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * get image resource id
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * get name of artist
     */
    public String getArtistName() {
        return mArtistName;
    }


    /**
     * get number of song downloads
     */
    public String getDownloadsNumber() {
        return mDownloadsNumber;
    }
}
