package com.nexuslink.mydiary.presenter;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.nexuslink.mydiary.model.DiaryModel;
import com.nexuslink.mydiary.model.IModel;
import com.nexuslink.mydiary.model.ModelImple;
import com.nexuslink.mydiary.view.IView;

/**
 * Created by Rye on 2016/12/3.
 */

public class PresenterImpl implements IPresenter{
    private IView iView;
    public PresenterImpl(IView iView) {
        this.iView = iView;
    }

    @Override
    public void changeFragment(Fragment fragment) {
        iView.change(fragment);
    }

}
