public class Main {
  public static void main(String[] args) {
    Product coffee = new Product();
    coffee.setNama("coffee");
    coffee.setDeskripsi("this is coffee");
    coffee.setHarga(15000);
    coffee.setStock(10);

    coffee.getInfo();

    Product milk = new Product(
      "milk", 
      "this is fresh milk", 
      25000, 
      10
    );

    milk.getInfo();

    Product apple = new Product(
      "apple juice", 
      "this is juice", 
      18000, 
      20
    );

    apple.getInfo();
  }
}
