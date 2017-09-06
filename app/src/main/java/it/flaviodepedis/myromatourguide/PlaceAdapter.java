package it.flaviodepedis.myromatourguide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by flavio.depedis on 04/09/2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

   private Context context = getContext();

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
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        ViewHolder holder;
        if (listItemView != null) {
            holder = (ViewHolder) listItemView.getTag();
        } else {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            holder = new ViewHolder(listItemView);
            listItemView.setTag(holder);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID place_text_view
        // Get the place name from the current Place object and set this text on the name TextView
        /** TextView tvPlace = (TextView) listItemView.findViewById(R.id.tv_place); */
        holder.tvPlace.setText(currentPlace.getPlaceName());

        // Find the TextView in the list_item.xml layout with the ID place_address_text_view
        // Get the place address from the current Place object and set this text on the name TextView
        /** TextView tvShortDesc = (TextView) listItemView.findViewById(R.id.tv_short_desc); */
        holder.tvShortDesc.setText(currentPlace.getPlaceShortDescription());

        // Find the ImageView in the list_item.xml layout with the ID place_item_icon
        // Get the image resource ID from the current Place object and set the image to ImageView
        /** ImageView imgPlace = (ImageView) convertView.findViewById(R.id.place_item_icon); */
        // Check if an image is provided for this place or not
        if (currentPlace.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            holder.imgPlace.setImageResource(currentPlace.getPlaceImageResourceID());
            // Make sure the view is visible
            holder.imgPlace.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            holder.imgPlace.setVisibility(View.GONE);
        }

        // Create a new intent to view the place detail activity
        /** ---- Important!!! ----
         *  Insert in this point the call to intent instead in each Fragment class
         */
        final Intent intent = new Intent(context, PlaceDetailActivity.class);
        intent.putExtra("placeName", currentPlace.getPlaceName());
        intent.putExtra("placeAddress", currentPlace.getPlaceAddress());
        intent.putExtra("placeDescription", currentPlace.getPlaceDescription());
        intent.putExtra("placeShortDescription", currentPlace.getPlaceShortDescription());
        intent.putExtra("placeImage", currentPlace.getPlaceImageResourceID());
        intent.putExtra("placeUrl", currentPlace.getPlaceURL());
        intent.putExtra("placeLocation", currentPlace.getPlaceLocation());

        //Start the intent if the user taps on the list item
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(intent);
            }
        });

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

    static class ViewHolder {
        @BindView(R.id.tv_place) TextView tvPlace;
        @BindView(R.id.tv_short_desc) TextView tvShortDesc;
        @BindView(R.id.place_item_icon) ImageView imgPlace;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}