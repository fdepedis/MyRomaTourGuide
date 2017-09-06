package it.flaviodepedis.myromatourguide;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by flavio.depedis on 06/09/2017.
 */
public class PlaceDetailActivity extends AppCompatActivity {

    private TextView tvPlaceName;
    private TextView tvPlaceDesc;
    private TextView tvPlaceShortDesc;
    private TextView tvPlaceLocation;
    private ImageView ivPlaceImage;
    private ImageView ivPlaceImageUrl;

    // Constant value that represents no image was provided for this place
    private static final int NO_IMAGE_PROVIDED = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_detail);

        // get the intent
        Bundle makeIntent = getIntent().getExtras();

        // set the name of the place
        tvPlaceName = (TextView) findViewById(R.id.tv_name);
        tvPlaceName.setText(makeIntent.getString("placeName"));

        // set the image of the place
        int placeImage = makeIntent.getInt("placeImage");
        ivPlaceImage = (ImageView) findViewById(R.id.place_item_icon);

        // verify if there is or not an image to receive from Intent
        if(placeImage != NO_IMAGE_PROVIDED){
            ivPlaceImage.setVisibility(View.VISIBLE);
            ivPlaceImage.setBackgroundResource(placeImage);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            ivPlaceImage.setVisibility(View.GONE);
        }

        // set the description of the place
        tvPlaceDesc = (TextView) findViewById(R.id.tv_description);
        tvPlaceDesc.setText(makeIntent.getString("placeDescription"));

        // set the short description of the place
        tvPlaceShortDesc = (TextView) findViewById(R.id.tv_short_description);
        tvPlaceShortDesc.setText(makeIntent.getString("placeShortDescription"));

        // set the location of the place
        tvPlaceLocation = (TextView) findViewById(R.id.tv_location);
        tvPlaceLocation.setText(makeIntent.getString("placeLocation"));

        // set the site URL of the place
        final String siteUrl = makeIntent.getString("placeUrl");

        // set the link URL of the place
        ivPlaceImageUrl = (ImageView) findViewById(R.id.link);
        ivPlaceImageUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(siteUrl));
                startActivity(intent);
            }
        });

    }
}
