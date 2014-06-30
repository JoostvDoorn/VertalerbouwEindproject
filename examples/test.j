.class public NoJad.j
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
   bipush 10
   istore_1                  ; store value into y

   bipush 99 ; Char
   istore_2                  ; store value into c
   iconst_1 ; Bool
   istore_3                  ; store value into z
   iconst_1 ; Bool
   istore_3                  ; store value into z
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload_0 ; expr1
   iload_1 ; expr2
   iadd
   invokevirtual java/io/PrintStream/println(I)V ; add right constant pool reference bytes for println

   return
.end method