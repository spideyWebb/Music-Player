module com.example.musicplayer {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
            
            requires com.dlsc.formsfx;
                        
    opens com.example.musicplayer to javafx.fxml;
    exports com.example.musicplayer;
}