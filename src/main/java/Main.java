import SeminarOne.FileWorking;
import SeminarOne.Note;
import SeminarOne.NotesController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text_for_output = "Enter text of notes";
        String file_name;
        if (args.length == 0 ) file_name = "file.txt";
        else file_name = args[0];
        Scanner input = new Scanner(System.in);
        System.out.print(text_for_output);
        String text_of_notes = input.next();
        FileWorking fileWorking = new FileWorking(file_name);
        Note note = new NotesController().CreateNote(text_of_notes);
        fileWorking.SavinToTheFile(note.toString());
    }
}