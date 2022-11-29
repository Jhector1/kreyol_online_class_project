/**
 *
 */
module com.example.kreyolonlineclassproject {

    requires javafx.fxml;
    requires javafx.controls;
requires javafx.base;
    requires javafx.media;

    opens edu.kreyolonlineclass to javafx.fxml;
    exports edu.kreyolonlineclass;
    exports edu.kreyolonlineclass.familyLesson;
    opens edu.kreyolonlineclass.familyLesson to javafx.fxml;
}