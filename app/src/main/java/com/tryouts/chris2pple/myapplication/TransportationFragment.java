package com.tryouts.chris2pple.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;

public class TransportationFragment extends Fragment {

    public TransportationFragment(){

    }

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        /*Creates an array of Attractions*/
        ArrayList<Attraction>locations = new ArrayList<Attraction>();

        /*Add new objects with data to the array*/
        locations.add(new Attraction(getString(R.string.albtal_train_st),R.drawable.albtal_train_station,getString(R.string.tram_station_type)));
        locations.add(new Attraction(getString(R.string.bus_stop),R.drawable.bus_stop,getString(R.string.bus_station_type)));
        locations.add(new Attraction(getString(R.string.train_station),R.drawable.train_station,getString(R.string.central_trainst_type)));

        /*Inflates the current View object in the places_list xml*/
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        /*Creates an AttractionArrayAdapter object in current activity for the data from attraction array*/
        AttractionArrayAdapter locationsAttractions = new AttractionArrayAdapter(getActivity(), locations);

        /*Creates the ListView object in places_list.xml and sets the locationsAttraction object to it*/
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(locationsAttractions);

        /*Returns the current View object with the date*/
        return rootView;
    }
}
