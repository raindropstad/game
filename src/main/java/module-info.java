module com.example.game_1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;



    opens com.example.game_1 to spring.core, spring.beans, spring.context, javafx.fxml;
    opens com.example.game_1.controller to spring.core, spring.beans, spring.context, javafx.fxml;

    exports com.example.game_1;
    exports com.example.game_1.controller;
}
   