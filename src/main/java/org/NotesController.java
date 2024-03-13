package org;

import lombok.*;

import java.util.ArrayList;
@Getter
@Setter
@ToString

public class NotesController {
    protected ArrayList<Note> Notes;

    public NotesController (ArrayList<Note> notes) {
        Notes = notes;
    }
    public NotesController() {
        this(new ArrayList<>());
    }

    public Note CreateNote(String text_of_note){
        if (text_of_note==null){
            System.out.println("Enter the TEXT OF THE NOTE");
            return null;
        }
        Integer id = GetId();
        Note note = new Note(id,text_of_note);
        this.Notes.add(note);
        return note;
    }

    protected Integer GetId(){
        return Notes.size() + 1;
    }

}
