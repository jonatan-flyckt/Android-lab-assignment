package se.ju.fljo.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import static se.ju.fljo.todoapp.Data.toDos;

/**
 * Created by Jonatan on 2019-01-22.
 */

public class CreateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
    }

    public void createButtonClicked(View view) {
        System.out.println("Button clicked");
        EditText editText = (EditText) findViewById(R.id.enteredTitle);
        String enteredTitle = editText.getText().toString();
        System.out.println(enteredTitle);
        toDos.add(new Data.ToDo(enteredTitle));
        System.out.println(toDos);
        finish();
    }
}
