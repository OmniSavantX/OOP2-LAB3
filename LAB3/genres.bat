@Echo Off

REM This compiles and then runs the JavaFX Program
REM Change the nameOfFile.java to your java file you intend to run

javac --module-path "C:\Program Files\Java\javafx-sdk-14.0.1\lib" --add-modules javafx.controls,javafx.fxml -classpath "C:\Program Files\Java\javafx-sdk-14.0.1\lib\*.jar" Genres.java

java --module-path "C:\Program Files\Java\javafx-sdk-14.0.1\lib" --add-modules javafx.controls,javafx.fxml -classpath "C:\Program Files\Java\javafx-sdk-14.0.1\lib\*.jar;." Genres

Exit
