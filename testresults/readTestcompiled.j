; Jasmin JBC assembler code generated by AliaCodeGenerator
.class public readTest
.super java/lang/Object

.field private static in Ljava/io/BufferedReader;

.method static public <clinit>()V
	.limit stack 5

	new java/io/BufferedReader
	dup
	new java/io/InputStreamReader
	dup
	getstatic java/lang/System/in Ljava/io/InputStream;
	invokespecial java/io/InputStreamReader/<init>(Ljava/io/InputStream;)V
	invokespecial java/io/BufferedReader/<init>(Ljava/io/Reader;)V
	putstatic readTest/in Ljava/io/BufferedReader;
	return

.end method

.method public <init>()V
   aload_0
   invokenonvirtual java/lang/Object/<init>()V
   return
.end method

.method public static main([Ljava/lang/String;)V
   .limit stack 3
   .limit locals 6
   
   bipush 99 ; Char
   istore 2                  ; store value into x
   iload 2				   ; put value on the stack
   pop

   ldc 1000000
   istore 3                  ; store value into z
   iload 3				   ; put value on the stack
   pop

   iconst_5

   istore 4                  ; store value into y
   iload 4				   ; put value on the stack
   pop

   getstatic readTest/in Ljava/io/BufferedReader;
   invokevirtual java/io/BufferedReader/readLine()Ljava/lang/String;

   iconst_0
   invokevirtual java/lang/String/charAt(I)C
   istore_1
   iload_1
   istore 2                  ; store value
   getstatic readTest/in Ljava/io/BufferedReader;
   invokevirtual java/io/BufferedReader/readLine()Ljava/lang/String;

   invokestatic java/lang/Integer/parseInt(Ljava/lang/String;)I


   istore 4                  ; store value into y
   getstatic readTest/in Ljava/io/BufferedReader;
   invokevirtual java/io/BufferedReader/readLine()Ljava/lang/String;

   invokestatic java/lang/Integer/parseInt(Ljava/lang/String;)I


   istore 3                  ; store value into z

   iload_1 ; repush the value to the stack if it is used again
   pop

   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload 2
   invokevirtual java/io/PrintStream/println(C)V

   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload 4
   invokevirtual java/io/PrintStream/println(I)V ; add right constant pool reference bytes for println
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload 3
   invokevirtual java/io/PrintStream/println(I)V ; add right constant pool reference bytes for println



   iconst_1 ; Bool
   istore 5                  ; store value into x1
   iload 5				   ; put value on the stack
   pop

   getstatic readTest/in Ljava/io/BufferedReader;
   invokevirtual java/io/BufferedReader/readLine()Ljava/lang/String;

   invokestatic java/lang/Boolean/parseBoolean(Ljava/lang/String;)Z

   istore_1
   iload_1
   istore 5                  ; store value
   iload_1 ; repush the value to the stack if it is used again
   pop

   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload 5
   istore_1
   iload_1
   invokevirtual java/io/PrintStream/println(Z)V


   iload_1 ; repush the value to the stack if it is used again
   pop

   getstatic readTest/in Ljava/io/BufferedReader;
   invokevirtual java/io/BufferedReader/readLine()Ljava/lang/String;

   invokestatic java/lang/Boolean/parseBoolean(Ljava/lang/String;)Z

   istore_1
   iload_1
   istore 5                  ; store value
   iload_1 ; repush the value to the stack if it is used again
   pop

   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload 5
   istore_1
   iload_1
   invokevirtual java/io/PrintStream/println(Z)V


   iload_1 ; repush the value to the stack if it is used again
   pop


   return
.end method
