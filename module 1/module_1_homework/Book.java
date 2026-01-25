// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
class Book {
   private String name;
   private String author;
   private int isbn;
   private int kol;

   public Book(String var1, String var2, int var3, int var4) {
      this.name = var1;
      this.author = var2;
      this.isbn = var3;
      this.kol = var4;
   }

   public String getName() {
      return this.name;
   }

   public String getAuthor() {
      return this.author;
   }

   public int getIsbn() {
      return this.isbn;
   }

   public int getKol() {
      return this.kol;
   }

   public void increaseKol(int var1) {
      this.kol += var1;
   }

   public void decreaseKol(int var1) {
      this.kol -= var1;
   }
}
