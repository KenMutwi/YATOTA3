package com.ken.yatota.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ken.yatota.Models.InputmodelClass;
import com.ken.yatota.R;
import com.ken.yatota.Utils.ApiClient;
import com.ken.yatota.Interfaces.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Livestatus extends AppCompatActivity {
    public EditText it1,ct1,barb11,barb12,barb13,EditTextId;
    public Button btnAddData1,btnViewData1,btnDelete1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livestatus);

        it1 = (EditText)findViewById(R.id.T_issued);
        barb11=(EditText) findViewById(R.id.Barber1Amount);
        barb12=(EditText) findViewById(R.id.Barber2amount);
        barb13 = (EditText) findViewById(R.id.Barber3Amount);

        btnAddData1 = (Button) findViewById(R.id.data1);
        btnViewData1=(Button) findViewById(R.id.view1);
        btnDelete1=(Button) findViewById(R.id.btnDelete);

        uploadData1();
        btnViewData1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Livestatus.this, ShopData.class);
                startActivity(intent);
            }
        });

    }

    private void uploadData1() {
        btnAddData1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String TotalNeckroll =it1.getText().toString();
                String Barber1Used =barb11.getText().toString();
                String Barber2Used =barb12.getText().toString();
                String Barber3Used =barb13.getText().toString();

                ApiInterface apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
                Call<InputmodelClass> call = apiInterface.uploadData(TotalNeckroll,Barber1Used,Barber2Used,Barber3Used);

                call.enqueue(new Callback<InputmodelClass>() {
                    @Override
                    public void onResponse(Call<InputmodelClass> call, Response<InputmodelClass> response) {
                       // InputmodelClass inputmodelClass=response.body();
                        Toast.makeText(Livestatus.this, "Server Response:", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<InputmodelClass> call, Throwable t) {

                    }
                });
            }
        });
    }
}
