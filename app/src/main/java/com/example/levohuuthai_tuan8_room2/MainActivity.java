package com.example.levohuuthai_tuan8_room2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText edtAdress;
    Button btnSave;
    RecyclerView recyclerView;
    AdressAdapter adressAdapter;
    List<Adress> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtAdress = findViewById(R.id.edtAdress);
        btnSave = findViewById(R.id.btnSave);
        recyclerView = findViewById(R.id.recycle);
        adressAdapter = new AdressAdapter();
        list = new ArrayList<>();
        adressAdapter.setData(list);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adressAdapter);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strAdress = edtAdress.getText().toString().trim();
                if(TextUtils.isEmpty(strAdress)){
                    return;
                }
                Adress adress = new Adress(strAdress);
                AdressDatabase.getInstance(MainActivity.this).adressDAO().insertAdress(adress);
                Toast.makeText(MainActivity.this,"thanh cong",Toast.LENGTH_SHORT).show();

                list = AdressDatabase.getInstance(MainActivity.this).adressDAO().getListAdress();
                adressAdapter.setData(list);
            }
        });

    }
}