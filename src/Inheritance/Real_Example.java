package Inheritance;

class Real_Example {
    public static class Products{
        private String category;
        private String name;
        private double price;

        public Products(String name, String category, double price){
            this.name = name;
            this.category = category;
            this.price = price;
        }

        public void printDetails(){
            System.out.println("Name: " + this.name);
            System.out.println("Category: " + this.category);
            System.out.println("Price " + this.price);
        }
    }

    public static class electronics extends Products {
        private int warrantyPreiod;
        private String brand;

        public electronics(String name, double price, int warrantyPreiod, String brand){
            super(name, "electronics", price);
            this.warrantyPreiod = warrantyPreiod;
            this.brand = brand;
        }
        @Override
        public void printDetails(){
            super.printDetails();
            System.out.println("Warrant Period: " + this.warrantyPreiod);
            System.out.println("Brand: " + this.brand);
        }
    }

    public static class tshirt extends Products {
        private String brand;
        private String variant;

        public tshirt(String name, double price, String brand, String variant){
            super(name, "tshirt", price);
            this.brand = brand;
            this.variant = variant;
        }

        public void printDetails(){
            super.printDetails();
            System.out.println("Brand: " + this.brand);
            System.out.println("Variant: " + this.variant);
        }
    }

    public static void main(String[] args) {
        electronics ele1 = new electronics("EarBud", 120.12, 3, "sony");
        ele1.printDetails();
        tshirt shirt1 = new tshirt("Hoodie", 2200, "Nike", "black");
        shirt1.printDetails();
    }

}


