package se.ju.fljo.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DeleteToDoActivity extends AppCompatActivity {

    static ListView mListView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deletetodoactivity);
        mListView =(ListView) findViewById(R.id.deleteListView);
        mListView.setAdapter(new ArrayAdapter<Data.ToDo>(
                this,
                android.R.layout.simple_list_item_1,
                Data.toDos
        ));
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Data.ToDo clickedToDo = Data.toDos.get(i);
                System.out.println(clickedToDo);
                Intent intent = new Intent(DeleteToDoActivity.this, DeleteSingleToDoActivity.class);
                intent.putExtra("title", clickedToDo.title);
                intent.putExtra("index", i);
                startActivity(intent);
            }
        });
    }

    public static void removeItem(int index){
        Data.toDos.remove(index);
        mListView.invalidateViews();
    }
}
