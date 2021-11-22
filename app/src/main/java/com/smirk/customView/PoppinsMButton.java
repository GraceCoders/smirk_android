package com.smirk.customView;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class PoppinsMButton extends androidx.appcompat.widget.AppCompatButton {

    public PoppinsMButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public PoppinsMButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PoppinsMButton(Context context) {
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