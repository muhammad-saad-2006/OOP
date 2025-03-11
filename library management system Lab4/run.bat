echo off
javac -d out src/com/library/Address/Address.java src/com/library/Book/Book.java src/com/library/Date/Date.java src/com/library/Incharge/Incharge.java src/com/library/Library/Library.java src/com/library/LibraryApp/LibraryApp.java src/com/library/Person/Person.java src/com/library/Staff/Staff.java
if %errorlevel% equ 0 (
	java -cp out com.library.LibraryApp.LibraryApp
) else (
	echo check for the errors
)