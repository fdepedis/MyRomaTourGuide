package it.flaviodepedis.myromatourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PlaceDetailActivity extends AppCompatActivity {

    private TextView tvPlaceName;
    private TextView tvPlaceDescription;
    private TextView tvPlaceLocation;
    private ImageView tvPlaceImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_detail);

        // get the intent
        Intent makeIntent = getIntent();

        // set the name of the place
        tvPlaceName = (TextView) findViewById(R.id.textView_Name);
        tvPlaceName.setText(makeIntent.getStringExtra("placeName"));

        // set the description of the place
        tvPlaceDescription = (TextView) findViewById(R.id.textView_Desc);
        tvPlaceDescription.setText(makeIntent.getStringExtra("placeDescription"));

        // set the location of the place
        tvPlaceLocation = (TextView) findViewById(R.id.textView_Location);
        tvPlaceLocation.setText(makeIntent.getStringExtra("placeLocation"));
    }
}
