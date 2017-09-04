package it.flaviodepedis.myromatourguide;

/**
 * Created by flavio.depedis on 04/09/2017.
 */

public class Place {

    //The name of the place
    private String mPlaceName;

    //The address of the place
    private String mPlaceAddress;

    //The description of the place
    private String mPlaceDescription;

    //The ID of the image resource of the place
    private int mPlaceImageResourceID;

    //The ID of the audio resource of the place
    private int mPlaceAudioResourceID;

    //The site URL of the place
    private String mPlaceUrl;

    //The location coordinates of the place
    private String mPlaceLocation;


    //Public constructor of the Place object with no audio resource
    public Place (String placeName, String placeAddress, String placeDescription, int placeImage, String placeUrl, String placeLocation){
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
        mPlaceImageResourceID = placeImage;
        mPlaceDescription = placeDescription;
        mPlaceUrl = placeUrl;
        mPlaceLocation = placeLocation;
    }

    //Public constructor of the Place object with audio resource
    public Place (String placeName, String placeAddress, String placeDescription, int placeImage, String placeUrl, String placeLocation, int placeAudio){
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
        mPlaceImageResourceID = placeImage;
        mPlaceDescription = placeDescription;
        mPlaceUrl = placeUrl;
        mPlaceLocation = placeLocation;
        mPlaceAudioResourceID = placeAudio;
    }

    //Get the name of the place
    public String getName(){
        return mPlaceName;
    }

    //Get the address of the place
    public String getAddress(){
        return mPlaceAddress;
    }

    //Get the description of the place
    public String getDescription(){
        return mPlaceDescription;
    }

    //Get the image resource ID of the place
    public int getImageResourceID(){
        return mPlaceImageResourceID;
    }

    //Get the audio resource ID of the place
    public int getAudioResourceID(){
        return mPlaceAudioResourceID;
    }

    //Get the site URL of the place
    public String getSiteURL(){
        return mPlaceUrl;
    }

    //Get the location coordinates of the place
    public String getLocation(){
        return mPlaceLocation;
    }
}
