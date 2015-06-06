package mswift42.com.github.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<String> mockStrings = new ArrayList<String>() {{
        add("Today - Sunny - 88 - 63");
        add("Tomorrow - Foggy - 70 / 46");
        add("Weds - Cloudy - 72 / 63");
        add("Thurs - Rainy - 64 / 51");
        add("Fri - Foggy - 60 / 48");
        add("Sat - Sunny - 76 / 68");}
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_forecast,
                R.id.list_item_forecast_textview, mockStrings);
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
