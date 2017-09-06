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

public class AttractionFragment extends Fragment {

    public AttractionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.attr_name_1), getString(R.string.attr_addres_1),
                getString(R.string.attr_short_desc_1), getString(R.string.attr_desc_1),
                R.drawable.ic_colosseo, getString(R.string.attr_url_1), getString(R.string.attr_location_1)));
        places.add(new Place(getString(R.string.attr_name_2), getString(R.string.attr_addres_2),
                getString(R.string.attr_short_desc_2), getString(R.string.attr_desc_2),
                R.drawable.ic_pantheon, getString(R.string.attr_url_2), getString(R.string.attr_location_2)));
        places.add(new Place(getString(R.string.attr_name_3), getString(R.string.attr_addres_3),
                getString(R.string.attr_short_desc_3), getString(R.string.attr_desc_3),
                R.drawable.ic_roman, getString(R.string.attr_url_3), getString(R.string.attr_location_3)));
        places.add(new Place(getString(R.string.attr_name_4), getString(R.string.attr_addres_4),
                getString(R.string.attr_short_desc_4), getString(R.string.attr_desc_4),
                R.drawable.ic_trevi, getString(R.string.attr_url_4), getString(R.string.attr_location_4)));
        places.add(new Place(getString(R.string.attr_name_5), getString(R.string.attr_addres_5),
                getString(R.string.attr_short_desc_5), getString(R.string.attr_desc_5),
                R.drawable.ic_arch, getString(R.string.attr_url_5), getString(R.string.attr_location_5)));
        places.add(new Place(getString(R.string.attr_name_6), getString(R.string.attr_addres_6),
                getString(R.string.attr_short_desc_6), getString(R.string.attr_desc_6),
                R.drawable.ic_basilic, getString(R.string.attr_url_6), getString(R.string.attr_location_6)));
        places.add(new Place(getString(R.string.attr_name_7), getString(R.string.attr_addres_7),
                getString(R.string.attr_short_desc_7), getString(R.string.attr_desc_7),
                R.drawable.ic_vittorio, getString(R.string.attr_url_7), getString(R.string.attr_location_7)));
        places.add(new Place(getString(R.string.attr_name_8), getString(R.string.attr_addres_8),
                getString(R.string.attr_short_desc_8), getString(R.string.attr_desc_8),
                R.drawable.ic_vatican, getString(R.string.attr_url_8), getString(R.string.attr_location_8)));
        places.add(new Place(getString(R.string.attr_name_9), getString(R.string.attr_addres_9),
                getString(R.string.attr_short_desc_9), getString(R.string.attr_desc_9),
                R.drawable.ic_colonna, getString(R.string.attr_url_9), getString(R.string.attr_location_9)));
        places.add(new Place(getString(R.string.attr_name_10), getString(R.string.attr_addres_10),
                getString(R.string.attr_short_desc_10), getString(R.string.attr_desc_10),
                R.drawable.ic_colle, getString(R.string.attr_url_10), getString(R.string.attr_location_10)));


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

        return rootView;
    }

}
