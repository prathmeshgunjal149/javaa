import java.util.Scanner;

class Course {
    int courseId;
    String courseName;

    Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }
}

class Enquiry {
    int enquiryId;
    String name;
    int allocatedCourseId;
    boolean status;

    Enquiry(int enquiryId, String name) {
        this.enquiryId = enquiryId;
        this.name = name;
        this.status = false; // Default status is false
        this.allocatedCourseId = -1; // No course allocated initially
    }
}

class Batch {
    int batchId;
    String batchName;
    int courseId;

    Batch(int batchId, String batchName, int courseId) {
        this.batchId = batchId;
        this.batchName = batchName;
        this.courseId = courseId;
    }
}

public class InstituteManagement {
    static Course[] courses = new Course[3];
    static Enquiry[] enquiries = new Enquiry[10];
    static Batch[] batches = new Batch[5]; // Assuming at most 5 batches
    static int batchCount = 0; // To keep track of added batches
    static Scanner sc = new Scanner(System.in);

    // Add New Courses
    public static void addNewCourses() {
        System.out.println("Enter details of 3 courses:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Course ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Enter Course Name: ");
            String name = sc.nextLine();
            courses[i] = new Course(id, name);
        }
    }

    // Take Enquiry
    public static void takeEnquiry() {
        System.out.println("Enter details of 10 enquiries:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Enquiry ID (Unique): ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Enter Enquirer Name: ");
            String name = sc.nextLine();
            enquiries[i] = new Enquiry(id, name);

            System.out.println("Available Courses:");
            for (Course course : courses) {
                if (course != null) {
                    System.out.println("ID: " + course.courseId + ", Name: " + course.courseName);
                }
            }
            System.out.print("Enter Course ID to allocate: ");
            int courseId = sc.nextInt();
            enquiries[i].allocatedCourseId = courseId;
        }
    }

    // Enroll for Admission
    public static void enrollForAdmission() {
        System.out.println("All Enquiries:");
        for (Enquiry enquiry : enquiries) {
            if (enquiry != null) {
                System.out.println("ID: " + enquiry.enquiryId + ", Name: " + enquiry.name +
                        ", Allocated Course ID: " + enquiry.allocatedCourseId + ", Status: " + enquiry.status);
            }
        }
        System.out.print("Enter Enquiry ID for admission: ");
        int id = sc.nextInt();
        for (Enquiry enquiry : enquiries) {
            if (enquiry != null && enquiry.enquiryId == id) {
                enquiry.status = true;
                System.out.println("Enquiry " + id + " status updated to admitted.");
                return;
            }
        }
        System.out.println("Invalid Enquiry ID.");
    }

    // Allocate Batch
    public static void allocateBatch() {
        if (batchCount >= batches.length) {
            System.out.println("No more batches can be added.");
            return;
        }
        System.out.print("Enter Batch ID: ");
        int batchId = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Batch Name: ");
        String batchName = sc.nextLine();

        System.out.println("Available Courses:");
        for (Course course : courses) {
            if (course != null) {
                System.out.println("ID: " + course.courseId + ", Name: " + course.courseName);
            }
        }
        System.out.print("Enter Course ID for this batch: ");
        int courseId = sc.nextInt();

        batches[batchCount++] = new Batch(batchId, batchName, courseId);

        System.out.println("Admissions for Course ID " + courseId + ":");
        for (Enquiry enquiry : enquiries) {
            if (enquiry != null && enquiry.allocatedCourseId == courseId && enquiry.status) {
                System.out.println("Enquiry ID: " + enquiry.enquiryId + ", Name: " + enquiry.name);
            }
        }
    }

    // View All Courses
    public static void viewAllCourses() {
        System.out.println("All Courses:");
        for (Course course : courses) {
            if (course != null) {
                System.out.println("ID: " + course.courseId + ", Name: " + course.courseName);
            }
        }
    }

    // View Course-Wise Students
    public static void viewCourseWiseStudents() {
        System.out.println("Course-Wise Students:");
        for (Course course : courses) {
            if (course != null) {
                System.out.println("Course ID: " + course.courseId + ", Name: " + course.courseName);
                for (Enquiry enquiry : enquiries) {
                    if (enquiry != null && enquiry.allocatedCourseId == course.courseId) {
                        System.out.println("  Enquiry ID: " + enquiry.enquiryId + ", Name: " + enquiry.name +
                                ", Status: " + enquiry.status);
                    }
                }
            }
        }
    }

    // View Batch-Wise Students
    public static void viewBatchWiseStudents() {
        System.out.println("Batch-Wise Students:");
        for (Batch batch : batches) {
            if (batch != null) {
                System.out.println("Batch ID: " + batch.batchId + ", Name: " + batch.batchName +
                        ", Course ID: " + batch.courseId);
                for (Enquiry enquiry : enquiries) {
                    if (enquiry != null && enquiry.allocatedCourseId == batch.courseId && enquiry.status) {
                        System.out.println("  Enquiry ID: " + enquiry.enquiryId + ", Name: " + enquiry.name);
                    }
                }
            }
        }
    }

    // View All Enquiries
    public static void viewAllEnquiries() {
        System.out.println("All Enquiries:");
        for (Enquiry enquiry : enquiries) {
            if (enquiry != null) {
                System.out.println("ID: " + enquiry.enquiryId + ", Name: " + enquiry.name +
                        ", Allocated Course ID: " + enquiry.allocatedCourseId + ", Status: " + enquiry.status);
            }
        }
    }

    // View All Admissions
    public static void viewAllAdmissions() {
        System.out.println("All Admissions:");
        for (Enquiry enquiry : enquiries) {
            if (enquiry != null && enquiry.status) {
                System.out.println("Enquiry ID: " + enquiry.enquiryId + ", Name: " + enquiry.name +
                        ", Allocated Course ID: " + enquiry.allocatedCourseId);
            }
        }
    }

    // View Cancelled Enquiries
    public static void viewCancelledEnquiries() {
        System.out.println("Cancelled Enquiries:");
        for (Enquiry enquiry : enquiries) {
            if (enquiry != null && !enquiry.status) {
                System.out.println("Enquiry ID: " + enquiry.enquiryId + ", Name: " + enquiry.name);
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Institute Management ---");
            System.out.println("1. Add New Courses");
            System.out.println("2. Take Enquiry");
            System.out.println("3. Enroll For Admission");
            System.out.println("4. Allocate Batch");
            System.out.println("5. View All Courses");
            System.out.println("6. View Course-Wise Students");
            System.out.println("7. View Batch-Wise Students");
            System.out.println("8. View All Enquiries");
            System.out.println("9. View All Admissions");
            System.out.println("10. View Cancelled Enquiries");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addNewCourses();
                    break;
                case 2:
                    takeEnquiry();
                    break;
                case 3:
                    enrollForAdmission();
                    break;
                case 4:
                    allocateBatch();
                    break;
                case 5:
                    viewAllCourses();
                    break;
                case 6:
                    viewCourseWiseStudents();
                    break;
                case 7:
                    viewBatchWiseStudents();
                    break;
                case 8:
                    viewAllEnquiries();
                    break;
                case 9:
                    viewAllAdmissions();
                    break;
                case 10:
                    viewCancelledEnquiries();
                    break;
                case 11:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

