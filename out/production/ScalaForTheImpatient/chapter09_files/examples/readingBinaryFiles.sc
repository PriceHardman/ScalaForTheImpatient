import java.io.{File, FileInputStream}

/*
  Scala has no provision for reading binary files, so
  you'll need to use the Java library.

 */
val filepath = "/Users/hardmanp/IdeaProjects/" +
  "ScalaForTheImpatient/src/" +
  "chapter09_files/examples/" +
  "Hello.class"
val file = new File(filepath)
val in = new FileInputStream(file)
val bytes = new Array[Byte](file.length().toInt)
in.read(bytes)
in.close()
for(b <- bytes) print(b.toChar)

/*
  Output:
ￊ￾ﾺﾾ   4 
  	   
     <init> ()V Code LineNumberTable main ([Ljava/lang/String;)V 
SourceFile 
Hello.java      Hello world!    Hello java/lang/Object java/lang/System out Ljava/io/PrintStream; java/io/PrintStream println (Ljava/lang/String;)V !            	        *ﾷ ﾱ    
        	    	   %     	ﾲ ﾶ ﾱ    
   
            res2: Unit = ()
 */