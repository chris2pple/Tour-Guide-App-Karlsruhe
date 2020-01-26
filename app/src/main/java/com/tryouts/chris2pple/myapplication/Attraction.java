package com.tryouts.chris2pple.myapplication;

/*Custom class for information about the attraction location*/

public class Attraction {
/*Name of the attraction location variable*/
    private String mPlaceName;
    /*Image of the attraction location variable*/
    private int mPlaceImage;
    /*TYpe of the attraction location variable*/
    private String mPlaceType;

    /*Creating an object from the Attraction class*/
    public Attraction(String mPlaceName, int mPlaceImage, String mPlaceType) {
        this.mPlaceName = mPlaceName;
        this.mPlaceImage = mPlaceImage;
        this.mPlaceType = mPlaceType;
    }
/*Get the name of the attraction location*/
    public String getmPlaceName() {
        return mPlaceName;
    }
    /*Get the image of the attraction location*/
    public int getmPlaceImage() {
        return mPlaceImage;
    }
    /*Get the type of the attraction location*/
    public String getmPlaceType() {
        return mPlaceType;
    }
}
