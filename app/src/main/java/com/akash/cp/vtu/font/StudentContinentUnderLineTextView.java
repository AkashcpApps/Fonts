package com.akash.cp.vtu.font;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;

public class StudentContinentUnderLineTextView extends AppCompatTextView {
    private boolean m_modifyingText = false;

    public StudentContinentUnderLineTextView(Context context) {
        super(context);
        init();
    }

    public StudentContinentUnderLineTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public StudentContinentUnderLineTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (m_modifyingText)
                    return;

                underlineText();
            }
        });

        underlineText();
    }

    private void underlineText() {
        if (m_modifyingText)
            return;
        m_modifyingText = true;
        Typeface tf = ResourcesCompat.getFont(getContext(), R.font.abeezee);
        setTypeface(tf, Typeface.BOLD);
        SpannableString content = new SpannableString(getText());
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
        setText(content);
        m_modifyingText = false;
    }
}