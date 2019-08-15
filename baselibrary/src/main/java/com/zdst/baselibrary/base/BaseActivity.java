package com.zdst.baselibrary.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Description: 基础Activity <br/>
 * Author: Z.J. <br/>
 * Date: 2019-06-14 11:17
 */
public abstract class BaseActivity extends AppCompatActivity {
    protected String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        ARouter.getInstance().inject(this);

        onInitView();
    }

    @LayoutRes
    protected abstract int getLayoutId();

    protected void onInitView() {

    }
}
