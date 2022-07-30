package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {

        String name = "Nur O";
        String buildingNumber = "15";
        String streetName = "Falcon Road";
        String city = "London";
        String state = "Greater London";
        String zipCode = "SW11 2PP";

        String address = name + "\n" + buildingNumber +" "+ streetName + "\n" + city + "\n" + state + "\n" + zipCode;
        System.out.println(address);


    }


}
