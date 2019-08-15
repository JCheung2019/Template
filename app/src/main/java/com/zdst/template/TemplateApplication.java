package com.zdst.template;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Description: TODO <br/>
 * Author: Z.J. <br/>
 * Date: 2019-06-14 15:45
 */
public class TemplateApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initARouter();
    }

    /**
     * 初始化阿里路由框架
     */
    private void initARouter() {
        if (BuildConfig.DEBUG) {
            // 打印日志
            ARouter.openLog();
            // 开启调试模式
            ARouter.openDebug();
        }

        ARouter.init(this);
    }
}
