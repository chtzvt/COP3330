public class TestStaff {

        public static void main(String[] args) throws Exception {

              /* Test Intern class */

             Intern i1;

             try {

                    i1 = new Intern("Jane Smith", "1 Knights Plaza @ UCF");

                    System.out.println(i1);

                    i1.addTaskHours("Programming", 20);

                    i1.addTaskHours("Admin", 5);

                    i1.printHours();

                    System.out.println("Average is " + i1.getAverageHour());

                    i1.addTaskHours("ShouldGiveException", 0);

             } catch (Exception e) {

                    System.out.println(e);

             }

              /* Test Supervisor class */

             Supervisor s1 = new Supervisor("John Smith", "UCF HEC 0119");

             System.out.println(s1);

             String[] tasks = { "Programming", "Admin", "Design" };

              for (String task : tasks) {

                    if (s1.addTask(task)) {

                           System.out.println(task + " added.");

                    }

                    else {

                           System.out.println(task + " cannot be added.");

                    }

             }

             System.out.println("Add task Admin again: " + s1.addTask("Admin"));

             System.out.println("Removing task Lunch: " + s1.removeTask("Lunch"));

             System.out.println("Add task Lunch: " + s1.addTask("Lunch"));

             System.out.println("Removing task Lunch: " + s1.removeTask("Lunch"));

             for (String task : tasks) {

                    if (s1.removeTask(task)) {

                           System.out.println(task + " removed.");

                    }

                    else {

                           System.out.println(task + " cannot be removed.");

                    }

             }

       }

}
