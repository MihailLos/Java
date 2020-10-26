package sample;

import javafx.scene.paint.Color;

public class ColoredRect extends DrawableRect {
    public javafx.scene.paint.Color inColor; // Поле задает внутренний цвет прямоугольника

    ColoredRect(Rectangle rectangle, javafx.scene.paint.Color inColor, javafx.scene.paint.Color outColor) {
        super(rectangle, outColor); // Взяли нарисованный прямоугольник класса родителя
        this.inColor = inColor;
    }

    @Override
    public javafx.scene.shape.Rectangle draw() {
        javafx.scene.shape.Rectangle rect = new javafx.scene.shape.Rectangle(this.x1, this.y1, this.height,
                this.width);
        rect.setFill(this.inColor); // Задаем цвет контура
        rect.setStrokeWidth(2); // Толщина обводки
        rect.setStroke(outColor); // задаем цвет границы;

        return rect;
    }

}
