package com.example.no1uaspapb2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;

public class CustomButton extends AppCompatButton {



    boolean mBoolean = false;

    public CustomButton(Context context) {
        super(context);
    }

    public CustomButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

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

    public CustomButton(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

}
