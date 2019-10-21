import java.util.Arrays;

public class Main {

    public enum ColorEnum {
        RED("красный"),
        BLUE("синий"),
        GREEN("зелёный");

        private String color;

        ColorEnum(String color)
        {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString(){
            return "Color = " + color;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(ColorEnum.values() ));
    }

}