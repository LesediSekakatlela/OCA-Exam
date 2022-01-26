module com.example.oca_chapter_1_exam_questions {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example to javafx.fxml;
    exports com.example;
}