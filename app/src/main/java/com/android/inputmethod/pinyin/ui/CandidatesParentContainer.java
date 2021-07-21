package com.android.inputmethod.pinyin.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import com.android.inputmethod.pinyin.R;

/**
 * Created by qiujiejun on 2021/07/21.
 */
public class CandidatesParentContainer extends RelativeLayout {

    private CandidatesContainer mCandidatesContainer;

    public CandidatesParentContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void init() {
        mCandidatesContainer = findViewById(R.id.real_candidate);
    }

    public CandidatesContainer getCandidatesContainer() {
        return mCandidatesContainer;
    }

}
