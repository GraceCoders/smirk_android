package com.smirk.customView;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class PoppinsMediumEditText extends androidx.appcompat.widget.AppCompatEditText {

    public PoppinsMediumEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public PoppinsMediumEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PoppinsMediumEditText(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Poppins-Medium.ttf");
            setTypeface(tf);
        }
    }
}