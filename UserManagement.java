package COLLECTIONS.Project;

import java.util.*;

public class UserManagement {
    public static void main(String[] args) {
//        Set<String> user1roles = new HashSet<>(Arrays.asList("Admin","User"));
//        User user1 = new User("Alice",true,user1roles);
//        List<User> user = new ArrayList<>();
//        user.add(user1);
        //short cut
        List<User> user = new ArrayList<>();
        user.add(new User("Alice", true, new HashSet<>(Arrays.asList("Admin", "User"))));
        user.add(new User("Bob", false, new HashSet<>(Arrays.asList("User"))));
        user.add(new User("Charli", true, new HashSet<>(Arrays.asList("User"))));

        // remove inactive users
        Iterator<User> iterator = user.iterator();
        while (iterator.hasNext()) {
            User u = iterator.next();         // <-- change here
            if (!u.isActive()) {
                iterator.remove();
            }
        }

        // print active users
        System.out.println("active users");
        for (User user1 : user) {
            System.out.println(user1.getName());

            // count users per role
            Map<String, Integer> rolecount = new HashMap<>();
            for (User u : user) {
                for (String role : u.getRoles()) {
                    rolecount.put(role, rolecount.getOrDefault(role, 0) + 1);
                }
            }

            // print role count
            System.out.println("role counts");
            System.out.println(rolecount);
        }
    }
}