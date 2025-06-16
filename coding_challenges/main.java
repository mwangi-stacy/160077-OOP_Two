//package coding_challenges;
//
//public class main {
//    interface DataSource {
//        void execute();
//    }
//
//    class Update implements DataSource {
//        public void execute() {
//            System.out.println("Updating data...");
//        }
//    }
//
//    class View implements DataSource {
//        public void execute() {
//            System.out.println("Viewing data...");
//        }
//    }
//
//    class Delete implements DataSource {
//        public void execute() {
//            System.out.println("Deleting data...");
//        }
//    }
//
//    class Account {
//        protected int id;
//        protected String name;
//        protected DataSource myData;
//
//        public Account(int id, String name) {
//            this.id = id;
//            this.name = name;
//        }
////
//        public void performOperation(DataSource myData) {
//            this.myData = myData;
//            myData.execute();
//        }
//    }
//
//    static class Admin extends Account {
//        private String authPassword;
//
//        public Admin(int id, String name, String password) {
//            super(id, name);
//            this.authPassword = password;
//        }
//    }
//
//    static class User extends Account {
//        public User(int id, String name) {
//            super(id, name);
//        }
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            Admin admin = new Admin(1, "Alice", "securePass123");
//            User user = new User(2, "Bob");
//
////            DataSource update = new Update();
////            DataSource view = new View();
////            DataSource delete = new Delete();
//
////            admin.performOperation(update);
////            user.performOperation(view);
////            admin.performOperation(delete);
////        }
////    }
//
//}
