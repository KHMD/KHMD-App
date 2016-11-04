package in.co.khmd.khmdapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by gautam on 04/11/16.
 */
public class WatchFragment extends android.support.v4.app.Fragment{

@Nullable
@Override
public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        View v=inflater.inflate(R.layout.watch_fragment,container,false);
        return v;
        }
}
