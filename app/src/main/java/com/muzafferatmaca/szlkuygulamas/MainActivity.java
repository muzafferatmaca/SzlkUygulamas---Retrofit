package com.muzafferatmaca.szlkuygulamas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    Toolbar toolbar;
    RecyclerView recyclerView;
    KelimelerAdapter adapter;
    ArrayList<Kelimeler> kelimelerArrayList;
    KelimelerDaoInterface kelimelerDaoInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        recyclerView = findViewById(R.id.rv);

        toolbar.setTitle("Sözlük Uygulaması");
        setSupportActionBar(toolbar);

        kelimelerDaoInterface = ApiUtils.kisilerDataAccessObject();


        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.toolbar_menu, menu);

        MenuItem item = menu.findItem(R.id.action_search);

        SearchView searchView = (SearchView) item.getActionView();

        searchView.setOnQueryTextListener(this);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {


        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {


        return false;
    }

    public void tumKisiler(){

        kelimelerDaoInterface.tumKelimeler().enqueue(new Callback<KelimelerCevap>() {
            @Override
            public void onResponse(Call<KelimelerCevap> call, Response<KelimelerCevap> response) {

                List<Kelimeler> kelimelerList = response.body().getKelimeler();

                adapter = new KelimelerAdapter(MainActivity.this,kelimelerList);

                recyclerView.setAdapter(adapter);



            }

            @Override
            public void onFailure(Call<KelimelerCevap> call, Throwable t) {

            }
        });


    }


}