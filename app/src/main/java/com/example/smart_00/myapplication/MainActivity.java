package com.example.smart_00.myapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1;
    View dialogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("사용자 정보 입력");
        button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1> 인플레이트로 가져오기
                dialogView =(View) View.inflate(MainActivity.this,
                        R.layout.dialog1, null);
                //LayoutInflater inflater = getInflater();
                // View dialogView = inflater.inflate(.., , ,);

                //2> AlertDialog 생성하기
                AlertDialog.Builder dlg=new AlertDialog.Builder(MainActivity.this);


                //3> 창 조절하기
                dlg.setTitle("사용자 정보 입력창");
                //4> setView로 연결하기==>setMessage, setItems 대신에 내가만든 xml 로
                dlg.setView(dialogView);
                dlg.setPositiveButton("확인",null);
                dlg.setNegativeButton("취소",null);

                //5> 보여주기
                dlg.show();
            }
        });



    }


    }
