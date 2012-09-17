package lab3;

public abstract class ReadingMaterial {
    // make these two properties part of the abstract class because they apply to
    // all types of reading material

    private double numberPages;
    private String readingMaterialType;

    public double getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(double numberPages) {
        // add validation
        this.numberPages = numberPages;
    }

    public abstract void setReadingMaterialType(String readingMaterialType);
    // make this method abstract so each type of reading material can make its 
    // own implementation of type

    public String getReadingMaterialType() {
        return readingMaterialType;
    }
}