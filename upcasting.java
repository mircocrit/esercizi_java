// upcasting.

class Note {
    private int value;
    
    public Note(int val) { value = val; }
    
    private static Note MIDDLE_C;
    private static Note C_SHARP;
    private static Note B_FLAT;
    
    public static final Note[] NoteInternal = {
        MIDDLE_C = new Note(0),
        C_SHARP = new Note(1),
        B_FLAT = new Note(2)
    }; // Etc.
}

class Instrument {
    public void play(Note n) {
        System.out.println("Instrument.play()");
    }
}

class Wind extends Instrument {
    // Redefine interface method:
    public void play(Note n) {
        System.out.println("Wind.play()");
    }
}

public class upcasting {
    public static void tune(Instrument i) {
        // ...
        Note n = new Note(0);
        i.play((Note)n.NoteInternal[0]);
    }
    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute); // Upcasting as Wind extends Instrument
    }
}
    