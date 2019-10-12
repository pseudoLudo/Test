package com.example.sunshine.ui.main;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sunshine.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;
    String[] f_data = {"Today-sunny-88/63","Tommorow-sunny-88/63","Friday-sunny-88/63","Saturday-sunny-88/63","Sunday-sunny-88/63","Monday-sunny-88/63"};
    ArrayAdapter ForecastAdapter;
    ListView listView;


    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //creating arraylist of fake data
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(f_data));

        View rootView = inflater.inflate(R.layout.main_fragment, container, false);
        ForecastAdapter = new  ArrayAdapter<String>(getActivity(),R.layout.list_item_forecast,R.id.list_item_forcast_view,weekForecast);
        listView = (ListView)rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(ForecastAdapter);

        return inflater.inflate(R.layout.main_fragment, container, false);





    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        // TODO: Use the ViewModel
    }

}
