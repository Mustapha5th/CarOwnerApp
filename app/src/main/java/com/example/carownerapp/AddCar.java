package com.example.carownerapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddCar extends AppCompatActivity {
    Button btnAdd;
    EditText etName, etRegNum, etPhoneNum, etCarName,etModel,etPlateNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car);
        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle("Add New Car");
        btnAdd = findViewById(R.id.btnAdd);
        etName = findViewById(R.id.etName);
        etRegNum = findViewById(R.id.etRegNum);
        etPhoneNum = findViewById(R.id.etPhoneNum);
        etCarName = findViewById(R.id.etCarName);
        etModel = findViewById(R.id.etModel);
        etPlateNum = findViewById(R.id.etPlateNum);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etName.getText().toString().isEmpty() ||
                        etRegNum.getText().toString().isEmpty() ||
                        etPhoneNum.getText().toString().isEmpty() ||
                        etCarName.getText().toString().isEmpty() ||
                        etModel.getText().toString().isEmpty() ||
                        etPlateNum.getText().toString().isEmpty()){
                    Toast.makeText(AddCar.this, "Please enter correct information in all fields", Toast.LENGTH_SHORT).show();

                }else{
                    Car car = new Car(etCarName.getText().toString().trim(),etModel.getText().toString().trim(),
                            etName.getText().toString().trim(),
                            etRegNum.getText().toString().trim(),
                            etPlateNum.getText().toString().trim(),
                            etPhoneNum.getText().toString().trim());
                    ApplicationClass.cars.add(car);
                    setResult(RESULT_OK);
                    AddCar.this.finish();
                }
            }
        });
    }
}