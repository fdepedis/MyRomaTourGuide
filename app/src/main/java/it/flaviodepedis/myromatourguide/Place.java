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

    //The short description of the place
    private String mPlaceShortDescription;

    //The ID of the image resource of the place
    private int mPlaceImageResourceID = NO_IMAGE_PROVIDED;

    //The site URL of the place
    private String mPlaceUrl;

    //The location coordinates of the place
    private String mPlaceLocation;

    // Constant value that represents no image was provided for this place
    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * Create a new Place object.
     *
     * @param mPlaceName is the name of the place
     * @param mPlaceAddress is the address of the place
     * @param mPlaceDescription is the description of the place
     * @param mPlaceShortDescription is the short description of the place
     * @param mPlaceUrl is the URL of the place
     * @param mPlaceLocation is the location of the place
     */
    /**
     * Constructor of the Place object without audio and image resource
     */
    public Place(String placeName, String placeAddress, String shortDescription,
                 String placeDescription, String placeUrl, String placeLocation) {
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
        mPlaceDescription = placeDescription;
        mPlaceShortDescription = shortDescription;
        mPlaceUrl = placeUrl;
        mPlaceLocation = placeLocation;
    }

    /**
     * Create a new Place object.
     *
     * @param mPlaceName is the name of the place
     * @param mPlaceAddress is the address of the place
     * @param mPlaceImageResourceID is the resource ID for the image file associated to this place
     * @param mPlaceDescription is the description of the place
     * @param mPlaceShortDescription is the short description of the place
     * @param mPlaceUrl is the URL of the place
     * @param mPlaceLocation is the location of the place
     */
    /**
     * Constructor of the Place object without audio resource
     */
    public Place(String placeName, String placeAddress, String shortDescription,
                 String placeDescription, int placeImage, String placeUrl, String placeLocation) {
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
        mPlaceImageResourceID = placeImage;
        mPlaceDescription = placeDescription;
        mPlaceShortDescription = shortDescription;
        mPlaceUrl = placeUrl;
        mPlaceLocation = placeLocation;
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

    //Get the short description of the place
    public String getPlaceShortDescription() {
        return mPlaceShortDescription;
    }

    //Get the image resource ID of the place
    public int getPlaceImageResourceID() {
        return mPlaceImageResourceID;
    }

    //Get the site URL of the place
    public String getPlaceURL() {
        return mPlaceUrl;
    }

    //Get the location coordinates of the place
    public String getPlaceLocation() {
        return mPlaceLocation;
    }

    // Returns whether or not there is an image for this place.
    public boolean hasImage() {

        if (mPlaceImageResourceID != NO_IMAGE_PROVIDED){
            return true;
        }
        else{
            return false;
        }
    }
}
