package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by eksug on 1/25/2018.
 */

// TODO DONE (15) Add a class file called ForecastAdapter
// TODO DONE (22) Extend RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>
public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    // TODO DONE (23) Create a private string array called mWeatherData
    private String[] mWeatherData;
    // TODO DONE (47) Create the default constructor (we will pass in parameters in a later lesson)
    public ForecastAdapter () {}

    // TODO DONE (16) Create a class within ForecastAdapter called ForecastAdapterViewHolder
    // TODO DONE (17) Extend RecyclerView.ViewHolder
    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {
         // TODO DONE (18) Create a public final TextView variable called mWeatherTextView
        public final TextView mWeatherTextView;
        // TODO DONE (19) Create a constructor for this class that accepts a View as a parameter
        // TODO DONE (20) Call super(view) within the constructor for ForecastAdapterViewHolder
        // TODO DONE (21) Using view.findViewById, get a reference to this layout's TextView and save it to mWeatherTextView
        public ForecastAdapterViewHolder(View view) {
            super(view);
            mWeatherTextView = (TextView) view.findViewById(R.id.tv_weather_data);
        }
    }

    // TODO DONE (24) Override onCreateViewHolder
    // TODO DONE (25) Within onCreateViewHolder, inflate the list item xml into a view
    // TODO DONE (26) Within onCreateViewHolder, return a new ForecastAdapterViewHolder with the above view passed in as a parameter
    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.forecast_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        return new ForecastAdapterViewHolder(view);
    }

    // TODO DONE (27) Override onBindViewHolder
    // TODO DONE (28) Set the text of the TextView to the weather for this list item's position
    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position){
        String positionWeather = mWeatherData[position];
        holder.mWeatherTextView.setText(positionWeather);
    }
    // TODO DONE (29) Override getItemCount
    // TODO DONE (30) Return 0 if mWeatherData is null, or the size of mWeatherData if it is not null
    @Override
    public int getItemCount() {
        if(mWeatherData != null) {
            return mWeatherData.length;
        }
        return 0;
    }
    // TODO DONE (31) Create a setWeatherData method that saves the weatherData to mWeatherData
    // TODO DONE (32) After you save mWeatherData, call notifyDataSetChanged
    public void setWeatherData(String[] weatherData) {
        mWeatherData = weatherData;
        notifyDataSetChanged();
    }

}
