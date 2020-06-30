package com.timkontrakan.mynotesapp.helper;

import android.database.Cursor;

import com.timkontrakan.mynotesapp.db.DatabaseContract;
import com.timkontrakan.mynotesapp.entity.Note;

import java.util.ArrayList;

public class MappingHelper {

    public static ArrayList<Note> mapCursorToArrayList(Cursor noteCursor){
        ArrayList<Note> notesList  = new ArrayList<>();

        while (noteCursor.moveToNext()){
            int id = noteCursor.getInt(noteCursor.getColumnIndexOrThrow(DatabaseContract.NoteColumns._ID));
            String title = noteCursor.getString(noteCursor.getColumnIndexOrThrow(DatabaseContract.NoteColumns.TITLE));
            String description = noteCursor.getString(noteCursor.getColumnIndexOrThrow(DatabaseContract.NoteColumns.DESCRIPTION));
            String date = noteCursor.getString(noteCursor.getColumnIndexOrThrow(DatabaseContract.NoteColumns.DATE));
            notesList.add(new Note(id, title, description, date));
        }
        return notesList;
    }
}
