package com.tryouts.chris2pple.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import androidx.fragment.app.Fragment;

public class EntertaintmentFragment extends Fragment {
/*Required empty public constructor*/
    public EntertaintmentFragment (){

    }

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        /*Creates an array of Attractions*/
        ArrayList<Attraction>locations = new ArrayList<Attraction>();

        /*Add new objects with data to the array*/
        locations.add(new Attraction(getString(R.string.state_theater), R.drawable.state_theater,getString(R.string.theater_type)));
        locations.add(new Attraction(getString(R.string.movie_theater),R.drawable.movie_theater,getString(R.string.movie_theater)));
        locations.add(new Attraction(getString(R.string.vesper_church),R.drawable.vesper_church,getString(R.string.church_type)));
        locations.add(new Attraction(getString(R.string.weststadt_church),R.drawable.weststadt_church,getString(R.string.church_type)));
        locations.add(new Attraction(getString(R.string.youth_theater),R.drawable.youth_theater,getString(R.string.theater_type)));
        locations.add(new Attraction(getString(R.string.ZKM),R.drawable.cinema_multiplex,getString(R.string.movie_theater)));
        locations.add(new Attraction(getString(R.string.downtown_small_church),R.drawable.downtown_small_church,getString(R.string.church_type)));
        locations.add(new Attraction(getString(R.string.city_zoo),R.drawable.city_zoo,getString(R.string.zoo_type)));
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
