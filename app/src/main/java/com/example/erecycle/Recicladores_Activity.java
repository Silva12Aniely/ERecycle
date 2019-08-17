package com.example.erecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Recicladores_Activity extends AppCompatActivity {
    Toolbar toolbar;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recicladores_layout);

        toolbar = (Toolbar) findViewById(R.id.mRecicladores);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = (ListView) findViewById(R.id.lstRecicladores);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//                Intent intent = new Intent(getApplicationContext(), Recicladores_Activity.class);
//                startActivity(intent);
            }
        });
    }
    private class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View ViewGroup, ViewGroup parent) {
            View view1 = getLayoutInflater().inflate(R.layout.lst_recicladores_layout, null);

            return view1;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();
        }

        switch (item.getItemId()) {
            case R.id.mhome:
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            break;
            case R.id.mconta:
//                Toast.makeText(getApplicationContext(), "Você já esta na pagina de usúario.", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), UserActivity.class));
                finish();
            break;
            case R.id.mquiz:
                startActivity(new Intent(getApplicationContext(), Quiz_Activity.class));
                finish();
            break;
            case R.id.mconfi:
                Toast.makeText(getApplicationContext(), "Configurações", Toast.LENGTH_LONG).show();
            break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
