package se.ju.fljo.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Jonatan on 2019-01-22.
 */

public class PickToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picktodoactivity);
        ListView listView =(ListView) findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter<Data.ToDo>(
                this,
                android.R.layout.simple_list_item_1,
                Data.toDos
        ));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Data.ToDo clickedToDo = Data.toDos.get(i);
                System.out.println(clickedToDo);
                Intent intent = new Intent(PickToDoActivity.this, ViewToDoActivity.class);
                intent.putExtra("title", clickedToDo.title);
                startActivity(intent);
            }
        });
    }
}
