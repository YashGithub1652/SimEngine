package com.simengine;

import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class home extends Application {

    @Override
    public void start(Stage engine) throws Exception {
       
        BorderPane Base = new BorderPane();
        Base.setPadding(new Insets(10));

        Image bgImage = new Image(getClass().getResource("/bgImage.jpeg").toExternalForm());

        BackgroundImage backgroundImage = new BackgroundImage(
            bgImage,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.DEFAULT,
            new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true)
        ); 

        StackPane bg = new StackPane();
        bg.setBackground(new Background(backgroundImage));

        ImageView profileIcon = new ImageView(getClass().getResource("/male-face-icon-default-profile-image--c3f2c592f9.jpg").toExternalForm());
        profileIcon.setFitWidth(60);
        profileIcon.setFitHeight(60);

        Circle clip = new Circle(30,30,30);
        profileIcon.setClip(clip);

        Font leagueSpartan = Font.loadFont(getClass().getResourceAsStream("/fonts/LeagueSpartan-Regular.ttf"), 20);

        Text simName = new Text("Simulon");
             simName.setStyle("-fx-fill : white;"+
                         "-fx-font-weight: Bold;"+
                         "-fx-font-size : 40px");   

        Text disbtn = new Text("Discover");
            disbtn.setFont(leagueSpartan);
            disbtn.setStyle("-fx-fill: white;"+
                            "-fx-font-size : 19px");

        disbtn.setOnMouseEntered(e -> {
            disbtn.setStyle("-fx-font-size:21px; -fx-fill:#b673f8; -fx-font-weight:italic;"
                     + "-fx-effect: dropshadow(gaussian, #231538ff, 18, 0.2, 0, 1);"
                     + "-fx-scale-x:1.11; -fx-scale-y:1.11;"
                     + "-fx-underline: true;");
        });
        disbtn.setOnMouseExited(e -> {
            disbtn.setFill(Color.web("#cccccc"));
            disbtn.setEffect(null);
            disbtn.setStyle("-fx-underline: false;"
                            +"-fx-font-size : 19px");
        });
    
        Text home = new Text("Home");
        home.setStyle("-fx-fill : white;"+
                      "-fx-font-size : 19px");

        
        home.setOnMouseEntered(e -> {
        home.setStyle("-fx-font-size:21px; -fx-fill:#b673f8; -fx-font-weight:italic;"
                     + "-fx-effect: dropshadow(gaussian, #321e4fff, 18, 0.2, 0, 1);"
                     + "-fx-scale-x:1.11; -fx-scale-y:1.11;"+
                     "-fx-underline: true;");
        });
        home.setOnMouseExited(e -> {
        home.setFill(Color.web("#cccccc"));
        home.setEffect(null);
        home.setStyle("-fx-underline: false;"+
                      "-fx-font-size : 19px");
        });
    
        Text expbtn = new Text("Explore");
        expbtn.setStyle("-fx-fill : white;"+
                      "-fx-font-size : 19px");

        
        expbtn.setOnMouseEntered(e -> {
        expbtn.setStyle("-fx-font-size:21px; -fx-fill:#b673f8; -fx-font-weight:italic;"
                     + "-fx-effect: dropshadow(gaussian, #321e4fff, 18, 0.2, 0, 1);"
                     + "-fx-scale-x:1.11; -fx-scale-y:1.11;"+
                     "-fx-underline: true;");
        });
        expbtn.setOnMouseExited(e -> {
        expbtn.setFill(Color.web("#cccccc"));
        expbtn.setEffect(null);
        expbtn.setStyle("-fx-underline: false;"+
                      "-fx-font-size : 19px");
        });

      
        Text combtn = new Text("Community");
        combtn.setStyle("-fx-fill : white;"+
                      "-fx-font-size : 19px");

        
        combtn.setOnMouseEntered(e -> {
        combtn.setStyle("-fx-font-size:21px; -fx-fill:#b673f8; -fx-font-weight:italic;"
                     + "-fx-effect: dropshadow(gaussian, #321e4fff, 18, 0.2, 0, 1);"
                     + "-fx-scale-x:1.11; -fx-scale-y:1.11;"+
                     "-fx-underline: true;");
        });
        combtn.setOnMouseExited(e -> {
        combtn.setFill(Color.web("#cccccc"));
        combtn.setEffect(null);
        combtn.setStyle("-fx-underline: false;"+
                      "-fx-font-size : 19px");
        });

        TextField searchField = new TextField();
        searchField.setPromptText("Search Simulation");
        searchField.setStyle("-fx-cursor:hand");
        searchField.setFocusTraversable(false);

        Text askAI = new Text("Ask AI");
    

        Region spacer1 = new Region();
        HBox.setHgrow(spacer1, Priority.ALWAYS);
        Region spacer2 = new Region();
        HBox.setHgrow(spacer2, Priority.ALWAYS);
        Region spacer3 = new Region();
        HBox.setHgrow(spacer3, Priority.ALWAYS);

        HBox Bar1 = new HBox(40);
        Bar1.setAlignment(Pos.CENTER_LEFT);
        Bar1.getChildren().addAll(simName,spacer1,home,combtn,disbtn,expbtn,profileIcon);
        Bar1.setMaxHeight(100);
        Bar1.setPadding(new Insets(10));
        Base.setTop(Bar1);

        Text header1 = new Text("Welcome ," + "\n" + "Yash");
        header1.setStyle("-fx-font-size : 20px");
        Text header2 = new Text("Ready to Simulate Today???");
        header2.setStyle("-fx-font-size : 16px"+
                         "-fx-font-style : Denis Masharov");
        VBox header = new VBox(header1,header2);

        HBox Bar2 = new HBox(10);
        Bar2.setAlignment(Pos.CENTER_LEFT);
        Bar2.getChildren().addAll(header,spacer2,searchField,askAI);
        Bar2.setPadding(new Insets(10)); 

        Text quizbtn = new Text("Knowledge Check");

        HBox Bar3 = new HBox(100);
        Bar3.setAlignment(Pos.CENTER_LEFT);
        Bar3.getChildren().addAll(spacer3,quizbtn);
        Bar3.setPadding(new Insets(10)); 

        VBox card1 = SimulationCard1.createSimulationCard();
        card1.setBackground(new Background(new BackgroundFill(
                           new LinearGradient(0,0,1,1,true, CycleMethod.NO_CYCLE,
                           new Stop(0, Color.web("#463d58ff")), new Stop(1, Color.web("#0b030fff"))),
                           CornerRadii.EMPTY, Insets.EMPTY)));

        HBox mechanicsRow1 = new HBox(20); 
        mechanicsRow1.getChildren().add(card1);
        ElevationCard.applyElevationEffect(mechanicsRow1);

        VBox card2 = SimulationCard2.createSimulationCard();
        HBox mechanicsRow2= new HBox(20); 
        mechanicsRow2.getChildren().add(card2);

        VBox card3 = SimulationCard3.createSimulationCard();
        HBox mechanicsRow3= new HBox(20); 
        mechanicsRow3.getChildren().add(card3);

        VBox card4 = SimulationCard4.createSimulationCard();
        HBox mechanicsRow4= new HBox(20); 
        mechanicsRow4.getChildren().add(card4);

        HBox hcard1 = new HBox(50,card1,card2);
        hcard1.setAlignment(Pos.CENTER);

        HBox hcard2 = new HBox(50,card3,card4);
        hcard2.setAlignment(Pos.CENTER);

       VBox plotBox = new VBox(10,hcard1,hcard2);
       plotBox.setPadding(new Insets(50));
        plotBox.setStyle(
            "-fx-background-color: rgba(255,255,255,0.3);" +                       
            "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.5), 10, 0.5, 0, 0);" +  
            "-fx-padding: 15;" +
            "-fx-border-radius: 10;" +
            "-fx-background-radius: 10;"+
            "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.25), 12, 0, 0, 2);"
        );

        VBox vb = new VBox(5,Bar1,Bar2,Bar3,plotBox);
        vb.setBackground(new Background(backgroundImage));

        ScrollPane scrollPane = new ScrollPane(vb);
        scrollPane.setFitToWidth(true); 

        bg.getChildren().add(scrollPane);

        Scene sc = new Scene(bg,999,665);
        engine.setScene(sc);
        engine.setResizable(false);
        engine.show();    
    }    
}
