public class Main {
    public static void main(String[] args) {
        DynamicArray<CarBrand> carBrands = new DynamicArray<>();
        DynamicArray<BikeBrand> bikeBrands = new DynamicArray<>();

        // Init add method
        carBrands.add(new CarBrand("Toyota"));
        carBrands.add(new CarBrand("Ford"));
        carBrands.add(new CarBrand("Honda"));
        carBrands.add(new CarBrand("Mercedes"));

        // Test DynamicArray<BikeBrand>
        bikeBrands.add(new BikeBrand("Trek"));
        bikeBrands.add(new BikeBrand("Shimano"));

        // Get all brands
        System.out.println("Brands in array:");
        for (int i = 0; i < carBrands.size(); i++) {
            CarBrand brand = carBrands.get(i);
            System.out.println(brand.getName());
        }

        // Get size
        System.out.println("Array size: " + carBrands.size());
        System.out.println("___");

        // Get brand at index n
        System.out.println("Brand at index 1: " + carBrands.get(1).getName());

        // Remove by index method
        carBrands.remove(1);
        System.out.println("Remove index 1");

        // Get method after removal
        System.out.println("Brand at index 1 after removal: " + carBrands.get(1).getName());

        // Size after removal by index
        System.out.println("Size after removal by index: " + carBrands.size());
        System.out.println("___");

        // Set method
        carBrands.set(0, new CarBrand("Ferrari"));
        System.out.println("Set 'Ferrari' at index 0");

        // Get method after set
        System.out.println("Brand at index 0 after set: " + carBrands.get(0).getName());
        System.out.println("___");

        // Remove last index
        carBrands.remove();
        System.out.println("Remove last index");

        // Get all brands
        System.out.println("Brands in array:");
        for (int i = 0; i < carBrands.size(); i++) {
            CarBrand brand = carBrands.get(i);
            System.out.println(brand.getName());
        }
        System.out.println("Array size: " + carBrands.size());
        System.out.println("___");
        // Clear method
        carBrands.clear();

        // Size after clear
        System.out.println("Size after clear: " + carBrands.size());
        System.out.println("___");

        // Test bike brands print
        System.out.println("Test bike brands in array:");
        for (int i = 0; i < bikeBrands.size(); i++) {
            BikeBrand brand = bikeBrands.get(i);
            System.out.println(brand.getName());
        }

    }
}
