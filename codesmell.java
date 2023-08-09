class ShoppingCart {
    private List<String> items = new ArrayList<>();
    
    public void addItem(String item) {
        items.add(item);
    }
    
    public void removeItem(String item) {
        items.remove(item);
    }
    
    public double calculateTotalPrice() {
        double total = 0.0;
        for (String item : items) {
            if (item.equals("Shirt")) {
                total += 15.0; // Price for a shirt
            } else if (item.equals("Jeans")) {
                total += 30.0; // Price for jeans
            } else if (item.equals("Shoes")) {
                total += 50.0; // Price for shoes
            }
            // More items and prices...
        }
        return total;
    }
}
