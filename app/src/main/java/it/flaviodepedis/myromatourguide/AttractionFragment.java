package it.flaviodepedis.myromatourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

        // Create a list of words
        final ArrayList<Place> places = new ArrayList<Place>();
        //placeName, placeAddress, placeDescription, placeShortDesc, placeImage, placeUrl, placeLocation
        places.add(new Place("Colosseo", "Via dei Fori Imperiali", "Descrizione Monumneto",
                "Monumento Storico", R.mipmap.ic_launcher, "www.colosseo.it", "Roma"));
        places.add(new Place("Colosseo", "Via dei Fori Imperiali", "Descrizione Monumneto",
                "Monumento Storico", R.mipmap.ic_launcher, "www.colosseo.it", "Roma"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(placeAdapter);


        return rootView;
    }

}
