
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class CarPane_Test extends Application{
    CarPane car1 = new CarPane();
    CarPane car2 = new CarPane();
    CarPane car3 = new CarPane();
    CarPane car4 = new CarPane();
    @Override
    public void start(Stage primaryStage){
        BorderPane borderPane = new BorderPane();
        HBox textbox = new HBox();
        GridPane mainPane = new GridPane();
        mainPane.setVgap(4);

        textbox.setAlignment(Pos.CENTER);
        textbox.setPadding(new Insets(10, 10,10 ,10 ));

         TextField t1 = new TextField("");
           t1.setPrefColumnCount(7);

         TextField t2 = new TextField("");
         t2.setPrefColumnCount(7);

        TextField t3 = new TextField("");
        t3.setPrefColumnCount(7);

        TextField t4 = new TextField("");
        t4.setPrefColumnCount(7);

        Text text1 = new Text("Car1 : ");
        Text text2 = new Text("Car2 : ");
        Text text3 = new Text("Car3 : ");
        Text text4 = new Text("Car4 : ");

        textbox.setSpacing(7);

        textbox.getChildren().addAll(text1, t1, text2, t2, text3, t3, text4, t4);
        borderPane.setCenter(mainPane);
        borderPane.setTop(textbox);

        Scene scene = new Scene(borderPane, 450 , 200);
        primaryStage.setTitle("Ch_6_25");
        primaryStage.setScene(scene);


           Rectangle rectangle1 ;
            for(int i = 0; i<4; i++) {
                rectangle1 = new Rectangle(borderPane.getWidth(), borderPane.getHeight()/6);
                rectangle1.widthProperty().bind(borderPane.widthProperty());
                rectangle1.heightProperty().bind(borderPane.heightProperty().divide(6));
                rectangle1.setStroke(Color.BLACK);
                rectangle1.setFill(Color.WHITE);
                mainPane.add(rectangle1, 0, i);
            }



            mainPane.add(car1, 0, 0);
            mainPane.add(car2, 0 , 1);
            mainPane.add(car3, 0 ,2);
            mainPane.add(car4, 0 , 3);

            t1.setOnAction(e ->{
                car1.setSpeed(Integer.parseInt(t1.getText(), 10));
            });

        t2.setOnAction(e ->{
            car2.setSpeed(Integer.parseInt(t2.getText(), 10));
        });

        t3.setOnAction(e ->{
            car3.setSpeed(Integer.parseInt(t3.getText(), 10));
        });

        t4.setOnAction(e ->{
            car4.setSpeed(Integer.parseInt(t4.getText(), 10));
        });







        primaryStage.show();



    }
}
