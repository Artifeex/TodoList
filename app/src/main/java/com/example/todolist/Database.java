package com.example.todolist;

import androidx.room.Entity;

import java.util.ArrayList;
import java.util.Random;


public class Database {
    private ArrayList<Note> notes = new ArrayList<>();

    private static Database instance = null;

    public static Database getInstance() {
        if(instance == null) {
            instance = new Database();
        }
        return instance;
    }

    private Database() {
//        Random random = new Random();
//        for(int i = 0; i < 20; i++) {
//            Note note = new Note(i, "Note" + i, random.nextInt(3));
//            notes.add(note);
//        }
        notes.add(new Note(0,"Пример 1", 0));
    }

    public void add(Note note) {
        notes.add(note);
    }

    public void remove(int id) {
        for(int i = 0; i < notes.size(); i++) {
            Note note = notes.get(i);
            if(note.getId() == id) {
                notes.remove(note);
            }
        }
    }

    public ArrayList<Note> getNotes() {
        return new ArrayList<>(notes); //СОздаем копию коллекции, чтобы из нее нельзя было изменить приватную коллекцию
    }
}
