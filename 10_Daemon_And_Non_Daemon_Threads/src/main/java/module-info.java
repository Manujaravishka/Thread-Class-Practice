module lk.ijse._0_daemon_and_non_daemon_threads {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens lk.ijse._0_daemon_and_non_daemon_threads to javafx.fxml;
    exports lk.ijse._0_daemon_and_non_daemon_threads;
}