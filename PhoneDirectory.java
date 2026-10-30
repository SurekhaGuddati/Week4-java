import java.io.*;
import java.util.*;
public class PhoneDirectory {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> nameToPhone = new HashMap<>();
        HashMap<String, String> phoneToName = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("contacts.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split("\t");
            String name = data[0];
            String phone = data[1];
            nameToPhone.put(name, phone);
            phoneToName.put(phone, name);
        }
        br.close();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name or Phone Number:");
        String input = sc.nextLine();
        // Search in hash table
        if (nameToPhone.containsKey(input)) {
            System.out.println("Phone Number: " + nameToPhone.get(input));
        } 
        else if (phoneToName.containsKey(input)) {
            System.out.println("Name: " + phoneToName.get(input));
        } 
        else {
            System.out.println("Record not found");
        }
    }
}
