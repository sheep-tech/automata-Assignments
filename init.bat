SET CLASSPATH=%CLASSPATH%;obj;antlr-4.9.2-complete.jar
doskey a4=java org.antlr.v4.Tool MyGrammar.g4 -o gen
doskey jc=javac MyGrammar*.java Main.java -d obj
doskey grun=java org.antlr.v4.gui.TestRig MyGrammar start -gui input.txt
doskey run=java Main $L input.txt
doskey clean=del /Q gen\* obj\*

