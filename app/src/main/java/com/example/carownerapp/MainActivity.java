package com.example.carownerapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements CarAdapter.ItemClicked{
    Button btnCarInfo, btnOwnerInfo, btnCheckout;

    ImageView ivMake;
    TextView tvModel,tvPlateNumber,tvName,tvPhoneNumber,tvRegNumber;
    FragmentManager fragmentManager;
    Fragment buttonFrag, listFrag, carInfoFrag, ownerInfoFrag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Car Owner App");

        setContentView(R.layout.activity_main);

        btnCarInfo = findViewById(R.id.btnCarInfo);
        btnOwnerInfo = findViewById(R.id.btnOwnerInfo);
        btnCheckout = findViewById(R.id.btnCheckOut);
        ivMake = findViewById(R.id.ivMake);
        tvModel = findViewById(R.id.tvModel);
        tvPlateNumber = findViewById(R.id.tvPlateNumber);
        tvName = findViewById(R.id.tvName);
        tvPhoneNumber = findViewById(R.id.tvPhoneNumber);
        tvRegNumber = findViewById(R.id.tvRegNumber);

        fragmentManager = getSupportFragmentManager();
        listFrag = fragmentManager.findFragmentById(R.id.listFrag);
        buttonFrag = fragmentManager.findFragmentById(R.id.buttonFrag);
        carInfoFrag = fragmentManager.findFragmentById(R.id.carInfoFrag);
        ownerInfoFrag = fragmentManager.findFragmentById(R.id.ownerInfoFrag);

        // the phone is in portrait mode
        if(findViewById(R.id.layout_portrait) != null){
            fragmentManager.beginTransaction()
                    .show(listFrag)
                    .hide(carInfoFrag)
                    .hide(ownerInfoFrag)
                    .hide(buttonFrag)
                    .commit();
        }
        // the phone is in landscape mode
        if (findViewById(R.id.layout_land) != null){
            onItemClicked(0);
            fragmentManager.beginTransaction()
                    .show(listFrag)
                    .show(carInfoFrag)
                    .hide(ownerInfoFrag)
                    .show(buttonFrag)
                    .commit();
        }

        //Set Buttons Listeners
        btnCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, tvName.getText().toString()+" Has been checked out", Toast.LENGTH_SHORT).show();
                fragmentManager.popBackStack();
            }
        });

        btnCarInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction()
                        .show(carInfoFrag)
                        .hide(ownerInfoFrag)
                        .commit();

            }
        });
        btnOwnerInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction()
                        .hide(carInfoFrag)
                        .show(ownerInfoFrag)
                        .commit();
            }
        });

    }

    @Override
    public void onItemClicked(int index) {
        if(findViewById(R.id.layout_portrait) != null){
            fragmentManager.beginTransaction()
                    .hide(listFrag)
                    .show(carInfoFrag)
                    .hide(ownerInfoFrag)
                    .show(buttonFrag)
                    .addToBackStack(null)
                    .commit();
        }
        // the phone is in landscape mode
        if (findViewById(R.id.layout_land) != null){
            fragmentManager.beginTransaction()
                    .show(listFrag)
                    .show(carInfoFrag)
                    .hide(ownerInfoFrag)
                    .show(buttonFrag)
                    .commit();
        }
        tvName.setText(ApplicationClass.cars.get(index).getOwnerName());
        tvModel.setText(ApplicationClass.cars.get(index).getModel());
        tvPhoneNumber.setText(ApplicationClass.cars.get(index).getPhoneNum());
        tvRegNumber.setText(ApplicationClass.cars.get(index).getRegNum());
        tvPlateNumber.setText(ApplicationClass.cars.get(index).getPlateNum());

        if(ApplicationClass.cars.get(index).getMake().equals("Volkswagen")){
            ivMake.setImageResource(R.drawable.volkswagen);
        }else if(ApplicationClass.cars.get(index).getMake().equals("Nissan")){
            ivMake.setImageResource(R.drawable.nissan);
        }else if(ApplicationClass.cars.get(index).getMake().equals("Mercedes")){
            ivMake.setImageResource(R.drawable.mercedes);
        }else if(ApplicationClass.cars.get(index).getMake().equals("Ford")){
            ivMake.setImageResource(R.drawable.ford);
        }else if(ApplicationClass.cars.get(index).getMake().equals("Kia")){
            ivMake.setImageResource(R.drawable.kia);
        }else if(ApplicationClass.cars.get(index).getMake().equals("Porsche")){
            ivMake.setImageResource(R.drawable.porsche);
        }else if(ApplicationClass.cars.get(index).getMake().equals("Toyota")){
            ivMake.setImageResource(R.drawable.toyota);
        }else if(ApplicationClass.cars.get(index).getMake().equals("Bugatti")){
            ivMake.setImageResource(R.drawable.bugatti);
        }
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.menu_search:
             //   startActivity(new Intent(Home.this, SearchActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);

    }

}