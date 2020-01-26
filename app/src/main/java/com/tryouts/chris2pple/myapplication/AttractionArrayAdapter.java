package com.tryouts.chris2pple.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/*AttractionArrayAdapter is the ArrayAdapter that provides the layout for each list item
* populated by a data source that is a list of Attraction objects
* */
public class AttractionArrayAdapter extends ArrayAdapter<Attraction>
{
/*Create a new AttractionArrayAdapter object
* where the context is the current context that the adapter is being created in
* and object is the list of Attraction objects to be displayed
* */
    public AttractionArrayAdapter(Context context, List<Attraction> object) {
        super(context, 0, object);
    }

    /*The view for the AdapterView
    *position is The position in the list of data that should be displayed in the list item view.
    * convertView is The recycled view to populate.
    * parent is The parent ViewGroup that is used for inflation.
    * return convertView is the View for the position in the AdapterView
    * */
    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView,@NonNull ViewGroup parent )
        {
            if(convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            }


/*Get the Attraction object located at this position in the list */
            Attraction currentAttraction = (Attraction)getItem(position);
            /*Find the TextView in the layout resource file list_item and set it to the place name*/
            TextView leftTextView = convertView.findViewById(R.id.textleft);
            leftTextView.setText(currentAttraction.getmPlaceName());
            /*Find the ImageView in the layout resource file list_item and set it to the image*/
            ImageView ImageView = convertView.findViewById(R.id.imageView);
            ImageView.setImageResource(currentAttraction.getmPlaceImage());
            /*Find the TextView in the layout resource file list_item and set it to the type name*/
            TextView rightTextView = convertView.findViewById(R.id.textright);
            rightTextView.setText(currentAttraction.getmPlaceType());

            return convertView;


        }
    }

