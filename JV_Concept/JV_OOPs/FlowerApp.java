import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Complete the classes below
class Flower {
    public String whatsYourName() {
        return "I have many names and types";
    }
}

class Jasmine extends Flower {
    @Override
    public String whatsYourName() {
        return "Jasmine";  // Corrected spelling
    }
}

class Lily extends Flower {
    @Override
    public String whatsYourName() {
        return "Lily";
    }
}

class Region {
    public Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends Region {
    @Override
    public Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region {
    @Override
    public Lily yourNationalFlower() {
        return new Lily();
    }
}

public class FlowerApp {  // Changed the class name to follow Java naming conventions
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
            default:
                System.out.println("Invalid input.");
                return;  // Exit if the input is invalid
        }

        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}
