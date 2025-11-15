// File: Main.java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== SMART UNIVERSITY MANAGEMENT SYSTEM DEMO ===");
        System.out.println();

        // 1. Department system
        Department csDept = new Department("Computer Science", 300000);
        System.out.println("Created Department: " + csDept.getName());
        System.out.println("Initial Budget: " + csDept.getBudget().getAnnualLimit());
        System.out.println();

        // 2. Faculty
        Professor profAli = new Professor(
                "F001", "Dr. Ali Raza", "ali.raza@techverse.edu", "0300-1111111",
                "Computer Science", 180000, "CS-201", "Artificial Intelligence"
        );

        Professor profAneeque = new Professor(
                "F002", "Prof. Aneeque Attique", "aneeque.attique@techverse.edu", "0301-2222222",
                "Computer Science", 170000, "CS-202", "Software Engineering"
        );

        csDept.addFaculty(profAli);
        csDept.addFaculty(profAneeque);

        System.out.println("Added Faculty Members:");
        for (Faculty f : csDept.getFacultyMembers()) {
            System.out.println(" - " + f.getRole() + ": " + f.getName());
        }
        System.out.println();

        // 3. Students
        UndergraduateStudent ugMuhammad = new UndergraduateStudent(
                "S001", "Muhammad Bin Saleem", "muhammad.saleem@techverse.edu", "0312-3333333",
                "BS Computer Science", 2, "CARD-001"
        );

        UndergraduateStudent ugFatima = new UndergraduateStudent(
                "S002", "Fatima Saleem", "fatima.saleem@techverse.edu", "0321-4444444",
                "BS Computer Science", 3, "CARD-002"
        );

        GraduateStudent gradAyesha = new GraduateStudent(
                "S003", "Ayesha Khan", "ayesha.khan@techverse.edu", "0333-5555555",
                "MS Data Science", 1, "CARD-003"
        );

        PhDStudent phdMaryam = new PhDStudent(
                "S004", "Maryam Iqtedar", "maryam.iqtedar@techverse.edu", "0345-6666666",
                "PhD Computer Science", 1, "CARD-004"
        );

        PhDStudent phdSara = new PhDStudent(
                "S005", "Sara Khan", "sara.khan@techverse.edu", "0305-7777777",
                "PhD Computer Science", 2, "CARD-005"
        );

        // Assign advisors
        ugMuhammad.setAdvisor(profAli);
        ugFatima.setAdvisor(profAneeque);
        gradAyesha.setAdvisor(profAli);
        phdMaryam.setAdvisor(profAneeque);
        phdSara.setAdvisor(profAli);

        System.out.println("Assigned Academic Advisors:");
        System.out.println(" - " + ugMuhammad.getName() + " -> " + ugMuhammad.getAdvisor().getName());
        System.out.println(" - " + ugFatima.getName() + " -> " + ugFatima.getAdvisor().getName());
        System.out.println(" - " + gradAyesha.getName() + " -> " + gradAyesha.getAdvisor().getName());
        System.out.println(" - " + phdMaryam.getName() + " -> " + phdMaryam.getAdvisor().getName());
        System.out.println(" - " + phdSara.getName() + " -> " + phdSara.getAdvisor().getName());
        System.out.println();

        // 4. Courses
        UndergraduateCourse cs101 = new UndergraduateCourse("CS101", "Introduction to Programming", 3, 40);
        UndergraduateCourse cs201 = new UndergraduateCourse("CS201", "Object Oriented Programming", 3, 35);
        GraduateCourse cs501 = new GraduateCourse("CS501", "Advanced Machine Learning", 3, 20);

        cs101.setInstructor(profAli);
        cs201.setInstructor(profAneeque);
        cs501.setInstructor(profAli);

        csDept.addCourse(cs101);
        csDept.addCourse(cs201);
        csDept.addCourse(cs501);

        System.out.println("Course Offerings in " + csDept.getName() + ":");
        for (Course c : csDept.getCourseOfferings()) {
            System.out.println(" - " + c.getCode() + " | " + c.getTitle());
        }
        System.out.println();

        // Facilities
        Classroom room101 = new Classroom("Room-101", 40);
        Classroom room201 = new Classroom("Room-201", 35);
        Lab aiLab = new Lab("AI Lab", 25);

        cs101.setClassroom(room101);
        cs201.setClassroom(room201);
        cs501.setLab(aiLab);

        System.out.println("Classroom and Lab Allocation:");
        System.out.println(" - " + cs101.getCode() + " in " + cs101.getClassroom().getRoomNumber());
        System.out.println(" - " + cs201.getCode() + " in " + cs201.getClassroom().getRoomNumber());
        System.out.println(" - " + cs501.getCode() + " in lab " + cs501.getLab().getLabName());
        System.out.println();

        // 5. Library system
        Library library = new Library();
        Book book1 = new Book("ISBN-1", "Data Structures in Java", "Rehan Ahmed");
        Book book2 = new Book("ISBN-2", "Operating Systems", "Zafar Ullah");
        Book book3 = new Book("ISBN-3", "Machine Learning Basics", "Imran Ali");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Library Catalog:");
        for (Book b : library.getCatalog()) {
            System.out.println(" - " + b.getTitle());
        }
        System.out.println();

        // 6. Staff with Pakistani names
        Administrator adminFarooq = new Administrator(
                "ST001", "Farooq Ali", "farooq.ali@techverse.edu", "0302-8888888", 90000
        );

        TechnicalStaff techBilal = new TechnicalStaff(
                "ST002", "Bilal Ahmed", "bilal.ahmed@techverse.edu", "0308-9999999", 80000
        );

        Librarian librarianHafsa = new Librarian(
                "ST003", "Hafsa Rehman", "hafsa.rehman@techverse.edu", "0309-1212121", 75000
        );

        // 7. Financial transactions
        System.out.println("Processing Salaries and Tuition Payments...");
        profAli.processPayment(profAli.calculateSalary());
        profAneeque.processPayment(profAneeque.calculateSalary());
        adminFarooq.processPayment(adminFarooq.calculateSalary());
        techBilal.processPayment(techBilal.calculateSalary());
        librarianHafsa.processPayment(librarianHafsa.calculateSalary());

        ugMuhammad.processPayment(2500); // pays some tuition
        ugFatima.processPayment(3000);
        gradAyesha.processPayment(4000);
        phdMaryam.processPayment(5000);
        phdSara.processPayment(4500);
        System.out.println("Financial transactions recorded.");
        System.out.println();

        // 8. Enrollment: students in multiple courses
        System.out.println("Enrolling Students into Courses...");
        ugMuhammad.enrollInCourse(cs101);
        ugMuhammad.enrollInCourse(cs201);

        ugFatima.enrollInCourse(cs101);
        ugFatima.enrollInCourse(cs201);

        gradAyesha.enrollInCourse(cs501);

        phdMaryam.enrollInCourse(cs501);
        phdSara.enrollInCourse(cs501);

        System.out.println("Enrollment complete.");
        System.out.println();

        // 9. Teaching and grading
        System.out.println("Teaching and Grading Activities:");
        profAli.teach(cs101);
        profAli.assignGrades(cs101);
        profAneeque.teach(cs201);
        profAneeque.assignGrades(cs201);
        profAli.teach(cs501);
        profAli.assignGrades(cs501);
        System.out.println();

        // Update grades (dummy values)
        ugMuhammad.updateGrade(cs101, "A");
        ugMuhammad.updateGrade(cs201, "B");

        ugFatima.updateGrade(cs101, "A");
        ugFatima.updateGrade(cs201, "A");

        gradAyesha.updateGrade(cs501, "A");

        phdMaryam.updateGrade(cs501, "A");
        phdSara.updateGrade(cs501, "B");

        System.out.println("Updated Grades and GPAs:");
        System.out.println(" - " + ugMuhammad.getName() + " GPA: " + ugMuhammad.getGpa());
        System.out.println(" - " + ugFatima.getName() + " GPA: " + ugFatima.getGpa());
        System.out.println(" - " + gradAyesha.getName() + " GPA: " + gradAyesha.getGpa());
        System.out.println(" - " + phdMaryam.getName() + " GPA: " + phdMaryam.getGpa());
        System.out.println(" - " + phdSara.getName() + " GPA: " + phdSara.getGpa());
        System.out.println();

        // 10. Library rules (polymorphism)
        System.out.println("Library Access Rules (Polymorphism):");
        ugMuhammad.accessLibrary(library);
        gradAyesha.accessLibrary(library);
        phdMaryam.accessLibrary(library); // PhD gets special rules
        profAli.accessLibrary(library);
        librarianHafsa.accessLibrary(library);
        System.out.println();

        // Borrow and return books
        System.out.println("Borrowing Books:");
        library.borrowBook(ugMuhammad, book1);
        library.borrowBook(profAli, book2);
        library.borrowBook(phdMaryam, book3);
        System.out.println();

        System.out.println("Returning a Book:");
        library.returnBook(book1);
        System.out.println();

        // 11. Department budget usage
        System.out.println("Department Budget Usage:");
        csDept.getBudget().allocate(80000); // labs
        csDept.getBudget().allocate(50000); // events
        System.out.println("Total Spent: " + csDept.getBudget().getSpent());
        System.out.println("Remaining Budget: " + csDept.getBudget().getRemaining());
        System.out.println();

        // 12. Many-to-many examples: Clubs and Research Projects
        Club aiClub = new Club("AI Club");
        aiClub.addMember(ugMuhammad);
        aiClub.addMember(ugFatima);
        aiClub.addMember(phdMaryam);

        ResearchProject projDeepLearning = new ResearchProject("Deep Learning for Urdu Text");
        projDeepLearning.addInvestigator(profAli);
        projDeepLearning.addInvestigator(profAneeque);

        System.out.println("Club Memberships:");
        System.out.println("Club: " + aiClub.getName());
        for (Student s : aiClub.getMembers()) {
            System.out.println(" - Member: " + s.getName());
        }
        System.out.println();

        System.out.println("Research Project Investigators:");
        System.out.println("Project: " + projDeepLearning.getTitle());
        for (Faculty f : projDeepLearning.getInvestigators()) {
            System.out.println(" - Investigator: " + f.getName());
        }
        System.out.println();

        // 13. Polymorphism: list of Person (students, faculty, staff mixed)
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(ugMuhammad);
        people.add(ugFatima);
        people.add(gradAyesha);
        people.add(phdMaryam);
        people.add(phdSara);
        people.add(profAli);
        people.add(profAneeque);
        people.add(adminFarooq);
        people.add(techBilal);
        people.add(librarianHafsa);

        System.out.println("=== POLYMORPHIC DASHBOARDS FOR ALL PERSONS ===");
        for (Person p : people) {
            System.out.println("-------------------------------------------------");
            System.out.println("Name: " + p.getName());
            System.out.println("Role: " + p.getRole());
            p.displayDashboard();
            System.out.println("Permissions: " + p.getPermissions());
            System.out.println("Workload (hours/week): " + p.calculateWorkload());
        }
        System.out.println();

        // 14. Final invoices and summaries
        System.out.println("=== FINANCIAL SUMMARIES ===");
        System.out.println(ugMuhammad.generateInvoice());
        System.out.println(ugFatima.generateInvoice());
        System.out.println(gradAyesha.generateInvoice());
        System.out.println(phdMaryam.generateInvoice());
        System.out.println(phdSara.generateInvoice());
        System.out.println();

        System.out.println(profAli.generateInvoice());
        System.out.println(profAneeque.generateInvoice());
        System.out.println(adminFarooq.generateInvoice());
        System.out.println(techBilal.generateInvoice());
        System.out.println(librarianHafsa.generateInvoice());
        System.out.println();

        System.out.println("=== DEMO COMPLETE ===");
    }
}
