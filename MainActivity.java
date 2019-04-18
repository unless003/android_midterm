package com.example.midterm_exam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText edtFirstNumber;
    EditText edtSecondNumber;
    Button btnEquals;
    TextView tvResult;
    ListView listViews;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtFirstNumber = (EditText)findViewById(R.id.edtFirstNumber);
        edtSecondNumber = (EditText)findViewById(R.id.edtSecondNumber);
        btnEquals = (Button)findViewById(R.id.btnEquals);
        listViews = (ListView)findViewById(R.id.listViews);

        final ArrayList arrayList = new ArrayList<String>();
        final ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listViews.setAdapter(arrayAdapter);

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edtFirstNumber.getText().toString().equals("") || edtSecondNumber.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Làm Ơn Nhập Sô", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    float number1 = Integer.parseInt(edtFirstNumber.getText().toString());
                    float number2 = Integer.parseInt(edtSecondNumber.getText().toString());
                    float ketqua = number1/number2;

                    arrayList.add(edtFirstNumber.getText() + " / " +edtSecondNumber.getText() + " = " + ketqua );
                    arrayAdapter.notifyDataSetChanged();
                }
            }
        });

    }
}
