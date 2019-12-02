package MyPackage;

public class Horse implements HorseLike {
    // must use the modifiers with "public", otherwise it will go wrong
    public String ride() {
        return "cantering";
    }
}
