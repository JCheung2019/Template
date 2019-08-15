package com.zdst.template;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.zdst.module.route.main.MainParamKey;
import com.zdst.module.route.main.MainRoutePath;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initialize();
    }

    private void initialize() {
        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(MainRoutePath.MAIN_ACTIVITY)
                        .withInt(MainParamKey.ID, 100)
                        .withString(MainParamKey.NAME, "模板")
                        .navigation();
            }
        });
    }
}
