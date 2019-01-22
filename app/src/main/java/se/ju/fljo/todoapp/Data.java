package se.ju.fljo.todoapp;

import java.util.ArrayList;

/**
 * Created by Jonatan on 2019-01-22.
 */

public class Data {

    public static ArrayList<ToDo> toDos = new ArrayList<>();
    static {
        toDos.add(new ToDo("Do A"));
        toDos.add(new ToDo("Do B"));
        toDos.add(new ToDo("Do C"));
    }

    public static class ToDo{
        public String title;

        public ToDo(String title){
            this.title = title;
        }

        @Override public String toString(){
            return "ToDo: " + title;
        }
    }

}
