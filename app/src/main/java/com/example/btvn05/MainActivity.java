package com.example.btvn05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButtonTachHoTen;
    private EditText mTextHoTen;
    private TextView mTextHo, mTextTen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        addAction();
    }

    private void addAction() {
        mButtonTachHoTen.setOnClickListener(this);
    }

    private void initView() {
        mButtonTachHoTen = findViewById(R.id.button_TachHoTen);
        mTextHoTen = findViewById(R.id.editText_HoTen);
        mTextHo = findViewById(R.id.textView_Ho);
        mTextTen = findViewById(R.id.textView_Ten);
    }

    @Override
    public void onClick(View view) {
        String hoTen = mTextHoTen.getText().toString();
        int i = hoTen.lastIndexOf(" ");
        String hoDem = "";
        String ten = "";
        if(i > 0){
            hoDem = hoTen.substring(0, i).toString();
            ten = hoTen.substring(i).toString();
        }
        else
            hoDem = hoTen;
        mTextHo.setText("Họ đệm là: " + hoDem);
        mTextTen.setText("Tên là: " + ten);
    }
}
