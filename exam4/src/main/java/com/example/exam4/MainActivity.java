package com.example.exam4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        //tv_quickReg是快速注册文本框的id；login是弹出的快速注册对话框的布局文件名
        TextView tv_quickReg = findViewById(R.id.tv_quickReg);
        tv_quickReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout loginForm = (LinearLayout) getLayoutInflater()
                        .inflate(R.layout.register, null);
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setIcon(R.drawable.hat)
                        .setView(loginForm)
                        .setNegativeButton("取消", null)
                        .setPositiveButton("确定", null)
                        .create().show();
            }
        });
        //btn_exit是退出按钮的id
        Button btn_exit = findViewById(R.id.btn_exit);
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setIcon(R.drawable.alert)
                        .setTitle("退出?")
                        .setMessage("确定要退出吗？")
                        .setNegativeButton("取消", null)
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .create().show();
            }
        });
    }
}
