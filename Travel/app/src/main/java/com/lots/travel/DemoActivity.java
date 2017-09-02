package com.lots.travel;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import com.lots.travel.base.BaseActivity;
import com.lots.travel.util.ContextUtil;
import com.lots.travel.util.SystemBarCompat;

/**
 * Created by nalanzi on 2017/9/2.
 */

public class DemoActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        final View rlMain = findViewById(R.id.rl_main);
        SystemBarCompat.tint(DemoActivity.this,rlMain);

        ToggleButton btnToggle = (ToggleButton) findViewById(R.id.btn_toggle);
        btnToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                rlMain.setBackgroundColor(ContextUtil.getColor(
                        DemoActivity.this, isChecked ? R.attr.color_divider:R.attr.color_main));
            }
        });
    }
}
