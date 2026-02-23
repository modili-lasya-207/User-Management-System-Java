 import java.util.*;

class User {

    private int id;
    private String name;
    private String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
	public void setName(String name) {
    this.name = name;
}

public void setEmail(String email) {
    this.email = email;
}


    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Email: " + email;
    }
}

public class UserManagement {

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n--- User Management System ---");
            System.out.println("1. Add User");
            System.out.println("2. View Users");
            System.out.println("3. Search user");
	        System.out.println("4. Update user");
			System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

             if (choice == 1) {

    		System.out.print("Enter User id: ");
   		 int id = sc.nextInt();
   		 sc.nextLine();  // consume newline

   		 System.out.print("Enter User name: ");
   		 String name = sc.nextLine();

   		 System.out.print("Enter User email: ");
   		 String email = sc.nextLine();

  		 User newUser = new User(id, name, email);

    		users.add(newUser);
	
    		System.out.println("User added successfully!");
	}
	   else if(choice==2){
		if (users.isEmpty()) {
   			System.out.println("No users found");
		}
		else {
			 for (User u : users) {
    				System.out.println(u);
			}

		}
	    }
		else if (choice == 3) {

    System.out.print("Enter ID to search: ");
    int searchId = sc.nextInt();

    boolean found = false;

    for (User u : users) {
        if (u.getId() == searchId) {
            System.out.println(u);
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("User not found");
    }
}
else if (choice == 4) {

    System.out.print("Enter ID to update: ");
    int updateId = sc.nextInt();
    sc.nextLine();

    boolean found = false;

    for (User u : users) {
        if (u.getId() == updateId) {

            System.out.print("Enter new name: ");
            String newName = sc.nextLine();

            System.out.print("Enter new email: ");
            String newEmail = sc.nextLine();

            u.setName(newName);
            u.setEmail(newEmail);

            System.out.println("User updated successfully!");
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("User not found");
    }
}


	    else if(choice == 5){
    System.out.println("Exiting...");
    break;
}

	     else{
		System.out.println("Invalid choice");
		}
	
           }
}
}