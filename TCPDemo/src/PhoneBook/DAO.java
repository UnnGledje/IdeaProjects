package PhoneBook;

public class DAO extends Database{

      Database d = new Database();

      public String getKompis(String name){
          System.out.println("get kompis" + name);
          String message = "";
          for(Kompis n : d.kompis){
              if (n.getName().equalsIgnoreCase(name.trim())){
                  message = ("Name: " + n.getName() + "Address: " + n.getAddress() + "Phonenumber: " + n.getPhoneNumber());
              }
              else{
                  message = "Could not be found";
              }
          }
            return message;
      }


}
