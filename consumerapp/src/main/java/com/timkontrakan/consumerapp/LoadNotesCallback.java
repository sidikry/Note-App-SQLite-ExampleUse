package com.timkontrakan.consumerapp;

import com.timkontrakan.consumerapp.entity.Note;

import java.util.ArrayList;

public interface LoadNotesCallback {
    void preExecute();
    void postExecute(ArrayList<Note> notes);
}
