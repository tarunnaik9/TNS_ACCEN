package com.TaskAssignments;
class User {

    final int userId; // final variable
    String userName;
    double balance;

    static int totalUsers = 0; // static variable

    User(int userId, String userName, double balance) {
        this.userId = userId;
        this.userName = userName;
        this.balance = balance;
        totalUsers++;
    }

    void displayDetails() {
        System.out.println("User ID: " + userId);
        System.out.println("User Name: " + userName);
        System.out.println("Balance: " + balance);
    }
}

class PrepaidUser extends User {

    PrepaidUser(int userId, String userName, double balance) {
        super(userId, userName, balance);
    }
}

class PostpaidUser extends User {

    PostpaidUser(int userId, String userName, double balance) {
        super(userId, userName, balance);
    }
}


public class Mobile_Recharge_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrepaidUser p1 = new PrepaidUser(101, "Tarun", 299);
        PostpaidUser p2 = new PostpaidUser(102, "Charan", 499);

        p1.displayDetails();
        System.out.println();

        p2.displayDetails();
        System.out.println();

        System.out.println("Total Users: " + User.totalUsers);
   

	}

}
