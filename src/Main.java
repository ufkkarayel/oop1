public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade oranı";

        Product product1 = new Product();
        product1.setName("Kahve Makinesi");
        product1.setDiscount(15);
        product1.setImageUrl("herresi.png");
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        // System.out.println(product1.name);

        Product product2 = new Product();
        product2.name = "Fotoğraf Makinesi";
        product2.discount = 10;
        product2.imageUrl = "resim2.png";
        product2.unitPrice = 8500;
        product2.unitsInStock = 8;

        Product product3 = new Product();
        product3.name = "Kamera";
        product3.discount = 15;
        product3.imageUrl = "resim3.png";
        product3.unitPrice = 10000;
        product3.unitsInStock = 13;

        Product[] products = {product1, product2, product3};

        for (Product product : products
        ) {
            System.out.println(product.name);

        }
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("1");
        individualCustomer.setPhone("5559964452");
        individualCustomer.setFirstName("Ufuk");
        individualCustomer.setLastName("Karayel");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Mikropor");
        corporateCustomer.setPhone("031254521254");
        corporateCustomer.setTaxNumber("234546421");
        corporateCustomer.setCustomerNumber("12461354");

        Customer[] customers = {individualCustomer,corporateCustomer};





    }
}