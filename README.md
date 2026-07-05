use para compilar mudanças nos arquivos:
javac -cp "src\lib\gson-2.10.1.jar" -d out src/JsonWriter.java src/Main.java src/classes/Product.java src/classes/FinalOutPut.java

use para executar o código:
java -cp "out;src\lib\gson-2.10.1.jar" src.Main
