package a_lectures.GeekBrains.Part2OOP.lecture2.Ex006.Interface;

import a_lectures.GeekBrains.Part2OOP.lecture2.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
