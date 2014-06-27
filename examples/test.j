.class public Test.j
.super java/lang/Object

.method public <init>()V
   aload_0
   invokenonvirtual java/lang/Object/<init>()V
   return
.end method

.method public static main([Ljava/lang/String;)V
   .limit stack 20
   .limit locals 20
   
   iconst_5
   istore_0                  ; store value into x
   iconst_1
   istore_1                  ; store value into y
   ; getstatic //add right constant pool reference bytes for printstream
   iload_1 ; expr1
   iload_ ; expr2
   iadd
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V ; add right constant pool reference bytes for println

   return
.end method