package com.tryouts.chris2pple.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;

public class ShoppingFragment extends Fragment {

    public ShoppingFragment(){

    }

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        /*Creates an array of Attractions*/
        ArrayList<Attraction>locations = new ArrayList<Attraction>();

        /*Add new objects with data to the array*/
        locations.add(new Attraction(getString(R.string.mall),R.drawable.ettlinger_tor_mall,getString(R.string.bigmall_type)));
        locations.add(new Attraction(getString(R.string.dm_city),R.drawable.dm_city,getString(R.string.drug_store_type)));
        locations.add(new Attraction(getString(R.string.ettlinger_tor_mall),R.drawable.ettlinger_tor_mall,getString(R.string.mall_type)));
        locations.add(new Attraction(getString(R.string.h_and_m),R.drawable.sea_food_fast_food,getString(R.string.brand_store_type)));
        locations.add(new Attraction(getString(R.string.lidl_store),R.drawable.lidl_store,getString(R.string.groceries_shop_type)));
        locations.add(new Attraction(getString(R.string.piano_store),R.drawable.piano_store,getString(R.string.specialty_shop_type)));
        locations.add(new Attraction(getString(R.string.storearcade),R.drawable.store_arcade,getString(R.string.general_goods_type)));
        locations.add(new Attraction(getString(R.string.store_street),R.drawable.store_street,getString(R.string.street_stores)));
        locations.add(new Attraction(getString(R.string.street_stores),R.drawable.street_stores,getString(R.string.street_shops_type)));
        locations.add(new Attraction(getString(R.string.train_station_arcade_stores),R.drawable.train_station_arcade_stores,getString(R.string.store_arcade_type)));
        locations.add(new Attraction(getString(R.string.turkish_quarter_store),R.drawable.turkish_quarter_store,getString(R.string.turkish_store_type)));

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
