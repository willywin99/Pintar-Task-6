public class Product {
  private String nama;
  private String deskripsi;
  private double harga;
  private double stock;

  public Product() {

  }

  public Product(String nama, String deskripsi, double harga, double stock) {
    this.nama = nama;
    this.deskripsi = deskripsi;
    this.harga = harga;
    this.stock = stock;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getDeskripsi() {
    return deskripsi;
  }

  public void setDeskripsi(String deskripsi) {
    this.deskripsi = deskripsi;
  }

  public double getHarga() {
    return harga;
  }

  public void setHarga(double harga) {
    this.harga = harga;
  }

  public double getStock() {
    return stock;
  }

  public void setStock(double stock) {
    this.stock = stock;
  }

  public void getInfo() {
    System.out.println("=============================================");
    System.out.println("INFO PRODUK");
    System.out.println("nama : " + getNama());
    System.out.println("deskripsi : " + getDeskripsi());
    System.out.println("harga : " + getHarga());
    System.out.println("stock : " + getStock());
    System.out.println("=============================================");
  }
}
