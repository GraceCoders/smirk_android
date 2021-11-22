package com.smirk.customView;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class PoppinsBoldTextView extends androidx.appcompat.widget.AppCompatTextView {

    public PoppinsBoldTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public PoppinsBoldTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PoppinsBoldTextView(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Poppins-Bold.ttf");
            setTypeface(tf);
        }
    }
}