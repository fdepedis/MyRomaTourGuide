package it.flaviodepedis.myromatourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by flavio.depedis on 04/09/2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

   //private Context context = getContext();

    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID place_text_view
        // Get the place name from the current Place object and set this text on the name TextView
        TextView tvPlace = (TextView) listItemView.findViewById(R.id.tv_place);
        tvPlace.setText(currentPlace.getPlaceName());

        // Find the TextView in the list_item.xml layout with the ID place_address_text_view
        // Get the place address from the current Place object and set this text on the name TextView
        TextView tvShortDesc = (TextView) listItemView.findViewById(R.id.tv_short_desc);
        tvShortDesc.setText(currentPlace.getPlaceShortDescription());

        // Find the ImageView in the list_item.xml layout with the ID place_item_icon
        // Get the image resource ID from the current Place object and set the image to ImageView
        ImageView imgPlace = (ImageView) listItemView.findViewById(R.id.place_item_icon);
        // Check if an image is provided for this place or not
        if (currentPlace.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imgPlace.setImageResource(currentPlace.getPlaceImageResourceID());
            // Make sure the view is visible
            imgPlace.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imgPlace.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}