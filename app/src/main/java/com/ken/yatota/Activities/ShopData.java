package com.ken.yatota.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ken.yatota.Adapters.DownloadAdapter;
import com.ken.yatota.Models.DownloadModel;
import com.ken.yatota.R;
import com.ken.yatota.Utils.Endpoints;
import com.ken.yatota.Utils.VolleySingleton;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShopData extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<DownloadModel> downloadModelList;
    private DownloadAdapter downloadAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_data);

        downloadModelList = new ArrayList<>();
        recyclerView= findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        downloadAdapter = new DownloadAdapter(downloadModelList,this);
        recyclerView.setAdapter(downloadAdapter);

        populatedata();
    }

    private void populatedata() {
        StringRequest stringRequest= new StringRequest(Request.Method.POST, Endpoints.download_url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson= new Gson();
                Type type= new TypeToken<List<DownloadModel>>(){}.getType();
                List<DownloadModel> dataModels=gson.fromJson(response,type);
                downloadModelList.addAll(dataModels);
                downloadAdapter.notifyDataSetChanged();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(ShopData.this, "Something is Wrong :(", Toast.LENGTH_SHORT).show();

                Log.d("VOLLEY",error.getMessage());

            }
        }){

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();


                return params;
            }
        };
        VolleySingleton.getInstance(this).addToRequestQueue(stringRequest);

    }
}
