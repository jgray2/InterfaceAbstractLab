package lab3;

public class Book extends ReadingMaterial implements Author {

    private String authorName;

    @Override
    public void setReadingMaterialType(String readingMaterialType) {
        // add validation
        // create implementation for books
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName() {
        // add validation
        
    }
}
