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

public class ShopFragment extends Fragment {

    public ShopFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.shop_name_1), getString(R.string.shop_addres_1),
                getString(R.string.shop_short_desc_1), getString(R.string.shop_desc_1),
                R.drawable.ic_euroma2, getString(R.string.shop_url_1), getString(R.string.shop_location_1)));
        places.add(new Place(getString(R.string.shop_name_2), getString(R.string.shop_addres_2),
                getString(R.string.shop_short_desc_2), getString(R.string.shop_desc_2),
                R.drawable.ic_galleria, getString(R.string.shop_url_2), getString(R.string.shop_location_2)));
        places.add(new Place(getString(R.string.shop_name_3), getString(R.string.shop_addres_3),
                getString(R.string.shop_short_desc_3), getString(R.string.shop_desc_3),
                R.drawable.ic_auchan, getString(R.string.shop_url_3), getString(R.string.shop_location_3)));
        places.add(new Place(getString(R.string.shop_name_4), getString(R.string.shop_addres_4),
                getString(R.string.shop_short_desc_4), getString(R.string.shop_desc_4),
                R.drawable.ic_parco_da_vinci, getString(R.string.shop_url_4), getString(R.string.shop_location_4)));
        places.add(new Place(getString(R.string.shop_name_5), getString(R.string.shop_addres_5),
                getString(R.string.shop_short_desc_5), getString(R.string.shop_desc_5),
                R.drawable.ic_parco_leonardo, getString(R.string.shop_url_5), getString(R.string.shop_location_5)));
        places.add(new Place(getString(R.string.shop_name_6), getString(R.string.shop_addres_6),
                getString(R.string.shop_short_desc_6), getString(R.string.shop_desc_6),
                R.drawable.ic_granai, getString(R.string.shop_url_6), getString(R.string.shop_location_6)));
        places.add(new Place(getString(R.string.shop_name_7), getString(R.string.shop_addres_7),
                getString(R.string.shop_short_desc_7), getString(R.string.shop_desc_7),
                R.drawable.ic_roma_est, getString(R.string.shop_url_7), getString(R.string.shop_location_7)));
        places.add(new Place(getString(R.string.shop_name_8), getString(R.string.shop_addres_8),
                getString(R.string.shop_short_desc_8), getString(R.string.shop_desc_8),
                R.drawable.ic_porta_di_roma, getString(R.string.shop_url_8), getString(R.string.shop_location_8)));
        places.add(new Place(getString(R.string.shop_name_9), getString(R.string.shop_addres_9),
                getString(R.string.shop_short_desc_9), getString(R.string.shop_desc_9),
                R.drawable.ic_romanina, getString(R.string.shop_url_9), getString(R.string.shop_location_9)));
        places.add(new Place(getString(R.string.shop_name_10), getString(R.string.shop_addres_10),
                getString(R.string.shop_short_desc_10), getString(R.string.shop_desc_10),
                R.drawable.ic_anagnina, getString(R.string.shop_url_10), getString(R.string.shop_location_10)));

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
