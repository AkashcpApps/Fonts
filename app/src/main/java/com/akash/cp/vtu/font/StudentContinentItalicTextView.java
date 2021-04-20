package com.akash.cp.vtu.font;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;

public class StudentContinentItalicTextView extends AppCompatTextView {
    public StudentContinentItalicTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public StudentContinentItalicTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public StudentContinentItalicTextView(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            //Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/arbutus.ttf");
            Typeface tf = ResourcesCompat.getFont(getContext(), R.font.abeezee);
            setTypeface(tf,Typeface.ITALIC);
        }
    }
}
