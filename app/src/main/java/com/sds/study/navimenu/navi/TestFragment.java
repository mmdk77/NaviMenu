package com.sds.study.navimenu.navi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.sds.study.navimenu.R;

import java.util.Locale;

/**
 * Created by seon on 2016-11-28.
 */

public class TestFragment extends Fragment {
    public static final String STRING_TEXT_TEST="menu_test";
    public TestFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test,container,false);
        int i = getArguments().getInt(STRING_TEXT_TEST);
        String test = getResources().getStringArray(R.array.menu_test)[i];
        int imgId= getResources().getIdentifier(test.toLowerCase(Locale.getDefault()),"drawable",getActivity().getPackageName());
        ((ImageView) view.findViewById(R.id.image)).setImageResource(imgId);
        getActivity().setTitle(test);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
