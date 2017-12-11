package com.example.android.westshoretahoe;

import android.content.res.Resources;
import android.support.annotation.StringRes;

/**
 * {@Link Tahoeplace} Represents a specific place on the West Shore.
 * It creates a picture, description and a link for each place.
 * Created by Salome on 9/22/17.
 */

public class Tahoeplace {
    /** Image resource ID for the place */
    private int mImageResourceID;

    /** Description of the place */
    private int mPlaceDescription;

    /** Miwok translation for the word */
    private int mPlaceLink;

    public Tahoeplace(int ImageResourceID, int PlaceDescription, int PlaceLink){
        mImageResourceID = ImageResourceID;
        mPlaceDescription = PlaceDescription;
        mPlaceLink = PlaceLink;}

    /** Get image */
    public int getImageResourceID(){return mImageResourceID;}

    /** Get the description */
    public int getPlaceDescription() {
        return mPlaceDescription;
    }

    /** Get the link */
    public int getPlaceLink() {
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