package com.sds.study.navimenu.navi;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.AdapterView;

import com.sds.study.navimenu.R;

/**
 * Created by seon on 2016-11-28.
 */

public class DrawItemClickListener implements AdapterView.OnItemClickListener {

    NaviActivity naviActivity;
    String title;

    public DrawItemClickListener(NaviActivity naviActivity) {
        this.naviActivity = naviActivity;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        selectItem(i);
    }

    public void selectItem(int i){
        Fragment fragment = new TestFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(TestFragment.STRING_TEXT_TEST,i);
        fragment.setArguments(bundle);

        FragmentManager manager = fragment.getFragmentManager();
        manager.beginTransaction().replace(R.id.content_frame,fragment).commit();
        naviActivity.menuList.setItemChecked(i,true);

        setTitle(naviActivity.menuTest[i]);


    }


    public void setTitle(String title) {
        this.title = title;
        naviActivity.getActionBar().setTitle(title);
    }
}
