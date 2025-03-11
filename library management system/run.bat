echo off
javac *.java
if %errorlevel% equ 0 (
	java LibraryApp
) else (
	echo check for the errors
)