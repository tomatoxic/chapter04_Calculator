package com.example.chapter04_calculator;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // 자바 객체 생성
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnMod;
    TextView textResult;
    String num1, num2;
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.calculator);
        setTitle("초간단 계산기");

        // 자바 객체에 xml 객체 연결
        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnMod = (Button) findViewById(R.id.BtnMod);
        textResult = (TextView) findViewById(R.id.TextResult);

        // 클릭했을 때 이벤트 처리
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "숫자가 입력되지 않았습니다", Toast.LENGTH_SHORT).show();
                } else {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "숫자가 입력되지 않았습니다", Toast.LENGTH_SHORT).show();
                } else {
                    result = Double.parseDouble(num1) - Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "숫자가 입력되지 않았습니다", Toast.LENGTH_SHORT).show();
                } else {
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);

                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "숫자가 입력되지 않았습니다", Toast.LENGTH_SHORT).show();
                } else if (num1.equals("0") || num2.equals("0")) {
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다", Toast.LENGTH_SHORT).show();
                } else {
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);
                    // 소수점 첫째자리
                    result = ((int)(result*100))/100.0;
                    textResult.setText("계산 결과 : " + result.toString());

                }
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "숫자가 입력되지 않았습니다", Toast.LENGTH_SHORT).show();
                } else if (num1.equals("0") || num2.equals("0")) {
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다", Toast.LENGTH_SHORT).show();
                } else {
                    result = Double.parseDouble(num1) % Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

    }
}