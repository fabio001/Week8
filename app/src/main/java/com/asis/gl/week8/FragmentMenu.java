package com.asis.gl.week8;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by gL on 15.04.2016.
 */
public class FragmentMenu extends Fragment {

    ListView list_androidVersion;
    ArrayAdapter<String> adapter;
    String[] versions;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_menu,container,false);
        list_androidVersion = (ListView) view.findViewById(R.id.list_menu_item);
        versions = getResources().getStringArray(R.array.android_versions);
        adapter = new ArrayAdapter<String>(getActivity(),
                R.layout.fragment_listviewlayout,
                R.id.txtlist_items,
                versions);
        list_androidVersion.setAdapter(adapter);
        return view;
    }
}
