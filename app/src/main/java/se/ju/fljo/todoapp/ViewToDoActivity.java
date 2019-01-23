package se.ju.fljo.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ViewToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewtodoactivity);
        Intent intent = getIntent();
        String toDo = intent.getStringExtra("title");
        TextView textView = (TextView) findViewById(R.id.textViewToDo);
        textView.setText("Title: " + toDo);
    }
}
