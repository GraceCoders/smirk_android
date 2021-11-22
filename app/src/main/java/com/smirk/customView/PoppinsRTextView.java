package com.smirk.customView;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class PoppinsRTextView extends androidx.appcompat.widget.AppCompatTextView {

    public PoppinsRTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public PoppinsRTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PoppinsRTextView(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Poppins-Regular.ttf");
            setTypeface(tf);
        }
    }
}