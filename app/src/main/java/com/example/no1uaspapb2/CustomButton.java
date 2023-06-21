package com.example.no1uaspapb2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.res.ResourcesCompat;

public class CustomButton extends AppCompatButton {
    boolean mBoolean = false;

    Drawable right_path, left_path;

    public CustomButton(Context context) {
        super(context);
    }

    public CustomButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        right_path = ResourcesCompat.getDrawable(getResources(),
                R.drawable.ic_baseline_chevron_right_24, null);

        left_path = ResourcesCompat.getDrawable(getResources(),
                R.drawable.ic_baseline_chevron_left_24, null);

        setCompoundDrawablesWithIntrinsicBounds(right_path, null, left_path, null);

        setBackgroundColor(Color.RED);
        setTextColor(Color.WHITE);

        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mBoolean == true){
                    mBoolean = false;
                    setBackgroundColor(Color.RED);
                } else {
                    mBoolean = true;
                    setBackgroundColor(Color.BLUE);
                }
            }
        });
    }
}
