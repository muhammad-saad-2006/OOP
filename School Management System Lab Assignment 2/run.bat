echo off
javac -d bin src/com/Main/Main.java src/com/School/School.java src/com/ClassRoom/ClassRoom.java src/com/Principal/Principal.java src/com/Teacher/Teacher.java src/com/Student/Student.java src/com/Person/Person.java
if %errorlevel% equ 0 (
	java -cp bin com.Main.Main
) else (
	check for the errors...
)