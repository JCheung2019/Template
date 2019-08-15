package com.zdst.module.main;

import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.zdst.baselibrary.base.BaseActivity;
import com.zdst.module.route.main.MainParamKey;
import com.zdst.module.route.main.MainRoutePath;

@Route(path = MainRoutePath.MAIN_ACTIVITY)
public class MainActivity extends BaseActivity {

    @Autowired(name = MainParamKey.ID)
    public int id;
    @Autowired(name = MainParamKey.NAME)
    public String name;

    @Override
    protected int getLayoutId() {
        return R.layout.main_activity_main;
    }

    @Override
    protected void onInitView() {
        ((TextView) findViewById(R.id.tv_id)).setText(String.valueOf(id));
        ((TextView) findViewById(R.id.tv_name)).setText(name);
    }
}
