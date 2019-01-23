package se.ju.fljo.todoapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static se.ju.fljo.todoapp.Data.toDos;

public class DeleteSingleToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deletesingletodo);
        Intent intent = getIntent();
        String toDo = intent.getStringExtra("title");
        TextView textView = (TextView) findViewById(R.id.textViewDelete);
        textView.setText("Title: " + toDo);
    }

    public void deleteThisButtonClicked(View view){
        new AlertDialog.Builder(this)
                .setTitle("Delete ToDo")
                .setMessage("Do you really want to delete it?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int whichButton) {
                        //radera
                        Intent intent = getIntent();
                        String toDo = intent.getStringExtra("title");
                        System.out.println(toDo);
                        toDos.remove(toDo);
                        finish();
                    }
                }).setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int whichButton) {
                //do nothing
            }
        }).show();
    }
}
