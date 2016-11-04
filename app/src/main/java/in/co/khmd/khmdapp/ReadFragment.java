package in.co.khmd.khmdapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

/**
 * Created by gautam on 04/11/16.
 */
public class ReadFragment extends android.support.v4.app.Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.read_fragment, container, false);

        List<String> urls = Arrays.asList("http://hackaday.com/", "http://www.instructables.com/", "https://makezine.com/", "https://slashdot.org/", "http://www.paulgraham.com/vb.html");
        final ListView listview = (ListView) v.findViewById(R.id.webviewlist);
        ArrayAdapter<String> list = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, urls);
        listview.setAdapter(list);

        return v;
    }


}