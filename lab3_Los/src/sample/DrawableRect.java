package sample;

public class DrawableRect extends Rectangle {
    public javafx.scene.paint.Color outColor; // Поле задает цвет границы (контура) прямоугольника

    DrawableRect(Rectangle rectangle, javafx.scene.paint.Color outColor) {
        x1 = rectangle.x1;
        y1 = rectangle.y1;
        height = rectangle.height;
        width = rectangle.width;
        this.outColor = outColor;
    }

    public javafx.scene.shape.Rectangle draw() {
        // Создаем графический объект - прямоугольник
        javafx.scene.shape.Rectangle rect = new javafx.scene.shape.Rectangle(this.x1, this.y1, this.height,
                this.width);
        rect.setStroke(outColor); // задаем цвет границы
        return rect;
    }
}

