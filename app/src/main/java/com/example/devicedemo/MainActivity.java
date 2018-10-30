package com.example.devicedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.ref.WeakReference;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.v_info)
    TextView vInfo;
    @BindView(R.id.v_test)
    Button vTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initValue();
        initListener();
    }

    private void initListener() {
        vTest.setOnClickListener(this);
    }

    private void initValue() {
        String deviceId = DeviceUtil.getDeviceId();
        String displayMetrics = DeviceUtil.getDisplayMetrics();
        String format = "IMEI：%s\nDisplayMetrics：%s";
        vInfo.setText(String.format(format, deviceId, displayMetrics));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.v_test:
                test();
                break;
            default:
                break;
        }
    }

    private void test() {
        LogUtil.e("test", add());
    }

    private String add(){
        Log.e("add", "1+1");
        return "3";
    }
}
