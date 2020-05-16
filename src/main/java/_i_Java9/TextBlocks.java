package _i_Java9;

public class TextBlocks {

    public static void main(String[] args) {
        //Zadanie 14: Utwórz zmienna lokalną używająć bloku tekstu. Obydwie wartości wyświetlone mają być równe (equals)
        final var mString = "Hi\nInfoshare\nPeople\nTests\nNew\nStrings\nFeatures";
        final var textBlock = """
                Hi
                Infoshare
                People
                Tests
                New
                Strings
                Features""";

        System.out.println("equals() result: " + textBlock.equals((mString)));
        System.out.println("== result: " + (textBlock == mString));
    }
}