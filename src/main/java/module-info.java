module com.example.daw {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires org.apache.httpcomponents.httpclient;
    requires java.net.http;
    requires com.google.gson;

    opens com.example.daw to javafx.fxml;
    exports com.example.daw;
    exports com.example.daw.model;
    opens com.example.daw.model to javafx.fxml;






}