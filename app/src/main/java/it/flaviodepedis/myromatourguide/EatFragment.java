package it.flaviodepedis.myromatourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by flavio.depedis on 04/09/2017.
 */

public class EatFragment extends Fragment {

    public EatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.eat_name_1), getString(R.string.eat_addres_1),
                getString(R.string.eat_short_desc_1), getString(R.string.eat_desc_1),
                R.drawable.ic_momo, getString(R.string.eat_url_1), getString(R.string.eat_location_1)));
        places.add(new Place(getString(R.string.eat_name_2), getString(R.string.eat_addres_2),
                getString(R.string.eat_short_desc_2), getString(R.string.eat_desc_2),
                R.drawable.ic_querida, getString(R.string.eat_url_2), getString(R.string.eat_location_2)));
        places.add(new Place(getString(R.string.eat_name_3), getString(R.string.eat_addres_3),
                getString(R.string.eat_short_desc_3), getString(R.string.eat_desc_3),
                R.drawable.ic_maisonnette, getString(R.string.eat_url_3), getString(R.string.eat_location_3)));
        places.add(new Place(getString(R.string.eat_name_4), getString(R.string.eat_addres_4),
                getString(R.string.eat_short_desc_4), getString(R.string.eat_desc_4),
                R.drawable.ic_tana, getString(R.string.eat_url_4), getString(R.string.eat_location_4)));
        places.add(new Place(getString(R.string.eat_name_5), getString(R.string.eat_addres_5),
                getString(R.string.eat_short_desc_5), getString(R.string.eat_desc_5),
                R.drawable.ic_moschino, getString(R.string.eat_url_5), getString(R.string.eat_location_5)));
        places.add(new Place(getString(R.string.eat_name_6), getString(R.string.eat_addres_6),
                getString(R.string.eat_short_desc_6), getString(R.string.eat_desc_6),
                R.drawable.ic_locanda, getString(R.string.eat_url_6), getString(R.string.eat_location_6)));
        places.add(new Place(getString(R.string.eat_name_7), getString(R.string.eat_addres_7),
                getString(R.string.eat_short_desc_7), getString(R.string.eat_desc_7),
                R.drawable.ic_pane, getString(R.string.eat_url_7), getString(R.string.eat_location_7)));
        places.add(new Place(getString(R.string.eat_name_8), getString(R.string.eat_addres_8),
                getString(R.string.eat_short_desc_8), getString(R.string.eat_desc_8),
                R.drawable.ic_birra, getString(R.string.eat_url_8), getString(R.string.eat_location_8)));
        places.add(new Place(getString(R.string.eat_name_9), getString(R.string.eat_addres_9),
                getString(R.string.eat_short_desc_9), getString(R.string.eat_desc_9),
                R.drawable.ic_myale, getString(R.string.eat_url_9), getString(R.string.eat_location_9)));
        places.add(new Place(getString(R.string.eat_name_10), getString(R.string.eat_addres_10),
                getString(R.string.eat_short_desc_10), getString(R.string.eat_desc_10),
                R.drawable.ic_twosize, getString(R.string.eat_url_10), getString(R.string.eat_location_10)));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        final PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(placeAdapter);

        // Set a click listener to call the activity detail when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                // Find the current place that was clicked on
                Place currentPlace = placeAdapter.getItem(i);

                // Create a new intent to view the place detail activity
                Intent intent = new Intent(getActivity(), PlaceDetailActivity.class);
                intent.putExtra("placeName", currentPlace.getPlaceName());
                intent.putExtra("placeAddress", currentPlace.getPlaceAddress());
                intent.putExtra("placeDescription", currentPlace.getPlaceDescription());
                intent.putExtra("placeShortDescription", currentPlace.getPlaceShortDescription());
                intent.putExtra("placeImage", currentPlace.getPlaceImageResourceID());
                intent.putExtra("placeUrl", currentPlace.getPlaceURL());
                intent.putExtra("placeLocation", currentPlace.getPlaceLocation());

                // Send the intent to launch a new activity
                startActivity(intent);
            }
        });

        return rootView;
    }

}
