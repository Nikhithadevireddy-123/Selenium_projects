package Day_5;

public class Product {
    private final String name;
    private final String code;
    private final double price;
    private final String category;

    private Product(Builder builder) {
        this.name = builder.name;
        this.code = builder.code;
        this.price = builder.price;
        this.category = builder.category;
    }
    public String getName() {
        return name;
    }
    public String getCode() {
        return code;
    }
    public double getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }
    public static class Builder {
        private String name;
        private String code;
        private double price;
        private String category;

        public Builder withName(String name) {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Product name cannot be empty.");
            }
            this.name = name;
            return this;
        }
        public Builder withCode(String code) {
            if (code == null || code.isEmpty()) {
                throw new IllegalArgumentException("Product code cannot be empty.");
            }
            this.code = code;
            return this;
        }
        public Builder withPrice(double price) {
            if (price < 0) {
                throw new IllegalArgumentException("Price must be non-negative.");
            }
            this.price = price;
            return this;
        }
        public Builder withCategory(String category) {
            this.category = category; 
            return this;
        }

        public Product build() {
            if (name == null || code == null || price < 0) {
                throw new IllegalStateException("Missing required fields or invalid values.");
            }
            return new Product(this);
        }
    }
    public void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Code: " + code);
        System.out.println("Price: ₹" + price);
        System.out.println("Category: " + (category != null ? category : "N/A"));
    }
    public static void main(String[] args) {
        Product p = new Product.Builder()
                .withName("tablet")
                .withCode("3763d")
                .withPrice(596478.99)
                .withCategory("Electronics")
                .build();

        p.displayDetails();
    }
}

