package com.hiwallet.aptdemo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.swg.annotation.BindView;
import com.swg.library.BindViewTools;

/**
 * @author : Owen
 * @FileName : MainActivity
 * @date : 2020/9/10 16:30
 * @description :
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv)
    TextView mTv;
    @BindView(R.id.btn)
    Button mBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BindViewTools.bind(this);
        mTv.setText("bind TextView success");
        mBtn.setText("bind Button success");
    }
}
