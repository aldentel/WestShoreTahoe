package com.example.android.westshoretahoe;

/**
 * Created by Salome on 10/23/17.
 */

public class Tahoepicslist {

    /**
     * {@Link Tahoepicslist} Represents a specific place on the West Shore.
     *A picture of each place with an onClick to a picture and a link.
     * Created by Salome on 9/22/17.
     */
        /** Image resource ID for the place */
        private int mImageResourceID;



        public Tahoepicslist(int ImageResourceID){
            mImageResourceID = ImageResourceID;}

        /** Get image */
        public int getImageResourceID()
        {return mImageResourceID;}


    }
