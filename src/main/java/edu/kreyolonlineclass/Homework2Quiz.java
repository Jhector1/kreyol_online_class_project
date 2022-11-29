package edu.kreyolonlineclass;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Homework2Quiz extends Application {
    Text text = new Text("Kabrit");
    Text textA = new Text("a");
    Text textLa = new Text("la");
    Text textNan = new Text("nan");
    Text textAn = new Text("an");
    Text textLan = new Text("lan");
    Rectangle placeHolder=new Rectangle(96,43);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();
        HBox box = new HBox();
        placeHolder.setLayoutX(323);
        placeHolder.setLayoutY(41);
        placeHolder.setStroke(Color.BLACK);
        placeHolder.setFill(Color.TRANSPARENT);
        System.out.println(textA.getX()+" "+textA.getY());
        pane.getStylesheets().add(getClass().getResource("myStyleSheet.css").toExternalForm());
        text.setLayoutX(189);
        text.setLayoutY(79);
        Text txt = new Text("My text");
        text.getStyleClass().add("textSize");
        box.getChildren().add(txt);
        txt.setOnMouseDragged(e->{
            txt.setLayoutX(e.getSceneX());
            txt.setLayoutY(e.getSceneY());
        });
        pane.setBottom(box);
        double initialX = 17;
        double initialY = 295;


        textA.setLayoutX(initialX);
        textA.setLayoutY(initialY);
        textA.getStyleClass().add("textSize");

        textAn.setLayoutX(175);
        textAn.setLayoutY(295);
        textAn.getStyleClass().add("textSize");

        textLa.setLayoutX(535);
        textLa.setLayoutY(295);
        textLa.getStyleClass().add("textSize");

        textLan.setLayoutX(415);
        textLan.setLayoutY(295);
        textLan.getStyleClass().add("textSize");

        textNan.setLayoutX(267);
        textNan.setLayoutY(295);
        textNan.getStyleClass().add("textSize");

        Pane paneForArticle = new Pane();
        paneForArticle.getChildren().addAll(text,textA,textLan,textAn,textLa,textNan, placeHolder);

        textA.setOnMouseDragged(e->{
            textA.setX(e.getX());
            textA.setY(e.getY());
        });
        textA.setOnMouseReleased(e->{
            if(placeHolder.contains(e.getX(), e.getY())){
                placeHolder.toBack();
                textA.setX(placeHolder.getX()+placeHolder.getWidth()/2);
                textA.setY(placeHolder.getY()+placeHolder.getHeight()/2);


            }
            else {
                textA.setLayoutX(initialX);
                textA.setLayoutY(initialY);
            }
        });
        pane.setCenter(paneForArticle);
        Scene scene = new Scene(pane, 600, 527);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
