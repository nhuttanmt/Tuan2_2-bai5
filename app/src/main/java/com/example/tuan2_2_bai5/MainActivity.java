package com.example.tuan2_2_bai5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edtID, edtName;
    CheckBox cbxFtime, cbxPtime;
    Button btnNhap;
    ListView lv;
    Employee employee;
    ArrayList<Employee> employeeArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        employeeArray = new ArrayList<Employee>();
        final ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, employeeArray);

        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtName.getText().toString();
                String id = edtID.getText().toString();
            if(cbxFtime.isChecked())
            {
                employee = new FulltimeEmployee();
            }
            else if(cbxPtime.isChecked()){
                employee = new ParttimeEmployee();
            }

            employee.setId(id);
            employee.setName(name);
            employeeArray.add(employee);
            adapter.notifyDataSetChanged();
            }
        });
        lv.setAdapter(adapter);

    }



    public void AnhXa(){
        edtID = findViewById(R.id.editTextID);
        edtName = findViewById(R.id.editTextname);
        btnNhap = findViewById(R.id.button2);
        cbxFtime = findViewById(R.id.checkBoxFulltime);
        cbxPtime = findViewById(R.id.checkBoxPartime);
        lv = findViewById(R.id.listview);
    }
}
