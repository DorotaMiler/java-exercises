package _2_data_types_and_casting._2_3_generic_types._2_3_2_casting_happening;

public class BoxForFigures <T extends Circle>{
    private T element;

    public BoxForFigures(T element){
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public String getElementName(){
        return element.getName();
    }
}