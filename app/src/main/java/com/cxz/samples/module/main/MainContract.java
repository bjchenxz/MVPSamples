package com.cxz.samples.module.main;

import com.cxz.samples.base.mvp.IModel;
import com.cxz.samples.base.mvp.IPresenter;
import com.cxz.samples.base.mvp.IView;
import com.cxz.samples.bean.WeatherInfo;
import com.cxz.samples.event.MessageEvent;

import io.reactivex.Flowable;
import io.reactivex.Observable;

/**
 * Created by chenxz on 2017/12/2.
 */

public interface MainContract {

    interface View extends IView {
        void updateWeather(WeatherInfo weatherInfo);

        void setMessage(MessageEvent messageEvent);
    }

    interface Presenter extends IPresenter {
        void loadWeatherData(String cityId);
    }

    interface Model extends IModel {
        Flowable<WeatherInfo> loadWeatherData(String cityId);

        Flowable<WeatherInfo> loadWeatherData(String cityId, boolean isUpdate);
    }

}
