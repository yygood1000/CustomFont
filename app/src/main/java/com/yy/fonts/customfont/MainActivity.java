package com.yy.fonts.customfont;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private boolean isMale = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  通过代码设置字体
        final TextView btn = findViewById(R.id.btn);
        final TextView tv = findViewById(R.id.text);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                    Typeface typeface;
                    if (isMale) {
                        typeface = getResources().getFont(R.font.font_merriweather);
                        isMale = false;
                    } else {
                        typeface = getResources().getFont(R.font.font_mali);
                        isMale = true;
                    }
                    tv.setTypeface(typeface);
                }
            }
        });
    }
}
