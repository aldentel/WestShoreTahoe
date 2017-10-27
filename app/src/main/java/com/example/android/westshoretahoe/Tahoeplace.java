package com.example.android.westshoretahoe;

/**
 * {@Link Tahoeplace} Represents a specific place on the West Shore.
 * It creates a picture, description and a link for each place.
 * Created by Salome on 9/22/17.
 */

public class Tahoeplace {
    /** Image resource ID for the place */
    private int mImageResourceID;

    /** Description of the place */
    private String mPlaceDescription;

    /** Miwok translation for the word */
    private String mPlaceLink;

    public Tahoeplace(int ImageResourceID, String PlaceDescription, String PlaceLink){
        mImageResourceID = ImageResourceID;
        mPlaceDescription = PlaceDescription;
        mPlaceLink = PlaceLink;}

    /** Get image */
    public int getImageResourceID(){return mImageResourceID;}

    /** Get the description */
    public String getPlaceDescription() {
        return mPlaceDescription;
    }

    /** Get the link */
    public String getPlaceLink() {
        return mPlaceLink;
    }

    @Override
    public String toString() {
        return "TahoePlace{" +
                "mPlaceDescription='" + mPlaceDescription + '\'' +
                ", mPlaceLink='" + mPlaceLink + '\'' +
                '}';
    }
}