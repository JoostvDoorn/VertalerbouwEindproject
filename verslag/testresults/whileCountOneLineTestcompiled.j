; Jasmin JBC assembler code generated by AliaCodeGenerator
.class public whileCountOneLineTest
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
	putstatic whileCountOneLineTest/in Ljava/io/BufferedReader;
	return

.end method

.method public <init>()V
   aload_0
   invokenonvirtual java/lang/Object/<init>()V
   return
.end method

.method public static main([Ljava/lang/String;)V
   .limit stack 4
   .limit locals 3
   
   iconst_0

   istore 2                  ; store value into i
   iload 2				   ; put value on the stack
   pop

   goto COND0		; Jump to while condition
   WHILE1:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload 2
   istore_1
   iload_1
   invokevirtual java/io/PrintStream/println(I)V


   iload_1 ; repush the value to the stack if it is used again
   pop

   iload 2 ; expr1
   iconst_1
    ; expr2
   iadd
   istore 2                  ; store value into i
   iload 2				   ; put value on the stack
   pop

   COND0:
   iload 2
   bipush 10
   if_icmplt $+7 ; Go to iconst_1 if it is true
   iconst_0
   goto $+4 ; Go to the line after iconst_1
   iconst_1		; Execute condition
   ifne WHILE1		; Jump to start of inner while statement


   return
.end method
