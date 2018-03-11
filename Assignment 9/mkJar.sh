#jar cmvf META-INF/MANIFEST.MF Strings.jar Strings.java
# https://stackoverflow.com/questions/4597866/java-creating-jar-file
javac Strings.java && jar cfe Assignment9.jar Strings *.class
