package com.tryouts.chris2pple.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;

public class FoodFragment extends Fragment {

    public FoodFragment(){

    }

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        /*Creates an array of Attractions*/

        ArrayList<Attraction>locations = new ArrayList<Attraction>();
        /*Add new objects with data to the array*/
        locations.add(new Attraction(getString(R.string.china_restaurant),R.drawable.china_restaurant,getString(R.string.fast_food_type)));
        locations.add(new Attraction(getString(R.string.city_restaurant),R.drawable.city_restaurant,getString(R.string.restaurant_type)));
        locations.add(new Attraction(getString(R.string.dammerstock_restaurant),R.drawable.dammerstock_restaurant,getString(R.string.restaurant_type)));
        locations.add(new Attraction(getString(R.string.fast_food_bakery),R.drawable.fast_food_bakery,getString(R.string.restaurant_type)));
        locations.add(new Attraction(getString(R.string.ice_cream_shop),R.drawable.ice_cream_shop,getString(R.string.restaurant_type)));
        locations.add(new Attraction(getString(R.string.sea_food),R.drawable.sea_food_fast_food,getString(R.string.fast_food_type)));
        locations.add(new Attraction(getString(R.string.street_pizzeria),R.drawable.street_pizzeria,getString(R.string.fast_food_type)));
        locations.add(new Attraction(getString(R.string.train_station_mcdonalds),R.drawable.train_station_mcdonalds,getString(R.string.fast_food_type)));
        locations.add(new Attraction(getString(R.string.train_station_pub),R.drawable.train_station_pub,getString(R.string.fast_food_type)));

        /*Inflates the current View object in the places_list xml*/
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        /*Creates an AttractionArrayAdapter object in current activity for the data from attraction array*/
        AttractionArrayAdapter locationsAttractions = new AttractionArrayAdapter(getActivity(), locations);

        /*Creates the ListView object in places_list.xml and sets the locationsAttraction object to it*/
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(locationsAttractions);

        /*Returns the current View object with the data*/
        return rootView;
    }
}
