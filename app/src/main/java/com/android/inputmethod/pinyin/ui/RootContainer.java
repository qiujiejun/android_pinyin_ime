package com.android.inputmethod.pinyin.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.widget.RelativeLayout;

import com.android.inputmethod.pinyin.InputModeSwitcher;
import com.android.inputmethod.pinyin.PinyinIME;
import com.android.inputmethod.pinyin.R;

/**
 * Created by qiujiejun on 2021/07/20.
 */
public class RootContainer extends RelativeLayout {

    private Context context;
    private SkbContainer mSkbContainer;

    public RootContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    public void init(PinyinIME ime, InputModeSwitcher switcher, GestureDetector gestureDetector) {
        mSkbContainer = findViewById(R.id.real_container);
        mSkbContainer.setService(ime);
        mSkbContainer.setInputModeSwitcher(switcher);
        mSkbContainer.setGestureDetector(gestureDetector);
    }

    public SkbContainer getSkbContainer() {
        return mSkbContainer;
    }

}
