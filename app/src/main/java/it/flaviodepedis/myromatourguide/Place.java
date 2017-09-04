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

    /**
     * Create a new Place object.
     *
     * @param mPlaceName is the name of the place
     * @param mPlaceAddress is the address of the place
     * @param mPlaceImageResourceID is the resource ID for the image file associated to this place
     * @param mPlaceDescription is teh description of the place
     * @param mPlaceUrl is the URL of the place
     * @param mPlaceLocation is the location of the place
     */
    /**
     * Constructor of the Place object without audio resource
     */
    public Place(String placeName, String placeAddress, String placeDescription, int placeImage, String placeUrl, String placeLocation) {
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
        mPlaceImageResourceID = placeImage;
        mPlaceDescription = placeDescription;
        mPlaceUrl = placeUrl;
        mPlaceLocation = placeLocation;
    }

    /**
     * Create a new Place object.
     *
     * @param mPlaceName is the name of the place
     * @param mPlaceAddress is the address of the place
     * @param mPlaceImageResourceID is the resource ID for the image file associated to this place
     * @param mPlaceDescription is teh description of the place
     * @param mPlaceUrl is the URL of the place
     * @param mPlaceLocation is the location of the place
     * @param mPlaceAudioResourceID is the audio of the place
     */
    /**
     * Constructor of the Place object with audio resource
     */
    public Place(String placeName, String placeAddress, String placeDescription, int placeImage, String placeUrl, String placeLocation, int placeAudio) {
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
        mPlaceImageResourceID = placeImage;
        mPlaceDescription = placeDescription;
        mPlaceUrl = placeUrl;
        mPlaceLocation = placeLocation;
        mPlaceAudioResourceID = placeAudio;
    }

    //Get the name of the place
    public String getPlaceName() {
        return mPlaceName;
    }

    //Get the address of the place
    public String getPlaceAddress() {
        return mPlaceAddress;
    }

    //Get the description of the place
    public String getPlaceDescription() {
        return mPlaceDescription;
    }

    //Get the image resource ID of the place
    public int getPlaceImageResourceID() {
        return mPlaceImageResourceID;
    }

    //Get the audio resource ID of the place
    public int getPlaceAudioResourceID() {
        return mPlaceAudioResourceID;
    }

    //Get the site URL of the place
    public String getPlaceURL() {
        return mPlaceUrl;
    }

    //Get the location coordinates of the place
    public String getPlaceLocation() {
        return mPlaceLocation;
    }
}
