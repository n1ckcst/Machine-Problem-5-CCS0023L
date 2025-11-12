
import java.util.InputMismatchException;
import java.util.Scanner;

// MAIN CLASS
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("Enter Student No. 1 Details:");

        System.out.print("Name: "); String student1Name = scanner.nextLine();

        int student1Age; //STUDENT 1 AGE
        while (true) {
            System.out.print("Age: ");
            try {
                student1Age = scanner.nextInt();
                if (student1Age < 1 || student1Age > 110) {
                    throw new InvalidAgeException("Age is invalid. It must be between 1 and 110.");                                                                          
                }
            break;
            } catch (InvalidAgeException e) { System.out.println(e.getMessage()); // USER-DEFINED EXCEPTION HANDLING: STUDENT1AGE
            } catch (InputMismatchException e) { System.out.println("Input Mismatch. Please enter a valid integer for age."); // REGULAR EXCEPTION
            } catch (RuntimeException e) { System.out.println("Runtime Exception. An unexpected error occurred: ");
            } catch (Exception e) { System.out.println("General Exception occured: ");
            } finally { scanner.nextLine(); // Clear the invalid input
            }
        }

     char student1Gender;
       while (true) {
            System.out.print("Gender (M/F): ");
            try {
                student1Gender = scanner.next().charAt(0); // read only the first character
                if (Character.isDigit(student1Gender)) {
                    throw new InputMismatchException();
                }
                if (!((student1Gender == 'M') || (student1Gender == 'F') || (student1Gender == 'm') || (student1Gender == 'f'))) {
                    throw new InvalidGenderException("Invalid input. Please enter only Male [M] or Female [F].");
                }
                student1Gender = Character.toUpperCase(student1Gender);
            break; // Exit loop when valid  
            }catch (InvalidGenderException e) { System.out.println(e.getMessage()); // USER-DEFINED EXCEPTION HANDLING: STUDENT1GENDER
            }catch (InputMismatchException e) { System.out.println("Input Mismatch. Digits are not allowed."); // USER DEFINED EXCEPTION HANDLING: STUDENT1GENDER (MISMATCH DIGITS/CHARACTERS)
            }catch (RuntimeException e) { System.out.println("Runtime Exception. An unexpected error occurred: ");
            }catch (Exception e) { System.out.println("General exception occurred: ");
            }finally { scanner.nextLine(); // Clear the invalid input
            }
        }

        double student1Grade; 
        while (true) {
            System.out.print("Grade: ");
            try {
                student1Grade = scanner.nextDouble();
                if (student1Grade < 0.0 || student1Grade > 100.0) {
                    throw new InvalidGradeException("Grade is invalid. It must be between 0.0 and 100.0."); // USER-DEFINED EXCEPTION - GRADE VALIDATION: must be between 0.0 and 100.0
                } 
            break;
            } catch (InvalidGradeException e) { System.out.println(e.getMessage());  // USER-DEFINED EXCEPTION HANDLING: STUDENT1GRADE
            } catch (InputMismatchException e) { System.out.println("Input Mismatch. Please enter a valid number for grade."); // REGULAR EXCEPTION
            } catch (RuntimeException e) { System.out.println("An unexpected error occurred: ");
            } catch (Exception e) { System.out.println("General Exception occured: ");
            } finally { scanner.nextLine();
            }
        }

    Student student1 = new Student(student1Name, student1Age, student1Gender, student1Grade);


        System.out.println("===================================");

        System.out.println("Enter Student No. 2 Details:");
        System.out.print("Name: ");
        String student2Name = scanner.nextLine();

        int student2Age;
        while (true) { // STUDENT 2 AGE
            System.out.print("Age: ");
            try {
                student2Age = scanner.nextInt();
                if (student2Age < 1 || student2Age > 110) {
                    throw new InvalidAgeException("Age is invalid. It must be between 1 and 110.");                                                                          
                }
            break;

            } catch (InvalidAgeException e) { System.out.println(e.getMessage()); // USER-DEFINED EXCEPTION HANDLING: STUDENT1AGE
            } catch (InputMismatchException e) { System.out.println("Input Mismatch. Please enter a valid integer for age."); // REGULAR EXCEPTION
            } catch (RuntimeException e) { System.out.println("Runtime Exception. An unexpected error occurred: ");
            } catch (Exception e) { System.out.println("General Exception occured: ");
            } finally { scanner.nextLine(); // Clear the invalid input
            }
        }

        char student2Gender;
        while (true) { // STUDENT 2 GENDER
            System.out.print("Gender (M/F): ");
            try {
                student2Gender = scanner.next().charAt(0); // read only the first character
                if (Character.isDigit(student2Gender)) {
                    throw new InputMismatchException();
                }
                if (!((student2Gender == 'M') || (student2Gender == 'F') || (student2Gender == 'm') || (student2Gender == 'f'))) {
                    throw new InvalidGenderException("Invalid input. Please enter only Male [M] or Female [F].");
                }
                student2Gender = Character.toUpperCase(student2Gender);
            break; // Exit loop when valid  
            }catch (InvalidGenderException e) { System.out.println(e.getMessage()); // USER-DEFINED EXCEPTION HANDLING: STUDENT1GENDER
            }catch (InputMismatchException e) { System.out.println("Input Mismatch. Digits are not allowed."); // USER DEFINED EXCEPTION HANDLING: STUDENT1GENDER (MISMATCH DIGITS/CHARACTERS)
            }catch (RuntimeException e) { System.out.println("Runtime Exception. An unexpected error occurred: ");
            }catch (Exception e) { System.out.println("General exception occurred: ");
            }finally { scanner.nextLine(); // Clear the invalid input
            }
        }

       double student2Grade; // REGULAR EXCEPTION HANDLING: STUDENT1GRADE
        while (true) {
            System.out.print("Grade: ");
            try {
                student2Grade = scanner.nextDouble();
                if (student2Grade < 0.0 || student2Grade > 100.0) {
                    throw new InvalidGradeException("Grade is invalid. It must be between 0.0 and 100.0."); // USER-DEFINED EXCEPTION - GRADE VALIDATION: must be between 0.0 and 100.0
                } 
            break;
            } catch (InvalidGradeException e) { System.out.println(e.getMessage());  // USER-DEFINED EXCEPTION HANDLING: STUDENT1GRADE
            } catch (InputMismatchException e) { System.out.println("Input Mismatch. Please enter a valid number for grade."); // REGULAR EXCEPTION
            } catch (RuntimeException e) { System.out.println("An unexpected error occurred: ");
            } catch (Exception e) { System.out.println("General Exception occured: ");
            } finally { scanner.nextLine();
            }
        }

        Student student2 = new Student(student2Name, student2Age, student2Gender, student2Grade);

        System.out.println("===================================");

        System.out.println("Enter Teacher Details:");
        System.out.print("Name: ");
        String teacherName = scanner.nextLine();

        int teacherAge;
        while (true) { // TEACHER 2 AGE
            System.out.print("Age: ");
            try {
                teacherAge = scanner.nextInt();
                if (teacherAge < 1 || teacherAge > 110) {
                    throw new InvalidAgeException("Age is invalid. It must be between 1 and 110.");                                                                          
                }
            break;

            } catch (InvalidAgeException e) { System.out.println(e.getMessage()); // USER-DEFINED EXCEPTION HANDLING: STUDENT1AGE
            } catch (InputMismatchException e) { System.out.println("Input Mismatch. Please enter a valid integer for age."); // REGULAR EXCEPTION
            } catch (RuntimeException e) { System.out.println("Runtime Exception. An unexpected error occurred: ");
            } catch (Exception e) { System.out.println("General Exception occured: ");
            } finally { scanner.nextLine(); // Clear the invalid input
            }
        }

         char teacherGender;
          while (true) { // TEACHER 2 GENDER
            System.out.print("Gender (M/F): ");
            try {
                teacherGender = scanner.next().charAt(0); // read only the first character
                if (Character.isDigit(teacherGender)) {
                    throw new InputMismatchException();
                }
                if (!((teacherGender == 'M') || (teacherGender == 'F') || (teacherGender == 'm') || (teacherGender == 'f'))) {
                    throw new InvalidGenderException("Invalid input. Please enter only Male [M] or Female [F].");
                }
                teacherGender = Character.toUpperCase(teacherGender);
            break; // Exit loop when valid  
            }catch (InvalidGenderException e) { System.out.println(e.getMessage()); // USER-DEFINED EXCEPTION HANDLING: TEACHER GENDER
            }catch (InputMismatchException e) { System.out.println("Input Mismatch. Digits are not allowed."); // USER DEFINED EXCEPTION HANDLING: TEACHER GENDER (MISMATCH DIGITS/CHARACTERS)
            }catch (RuntimeException e) { System.out.println("Runtime Exception. An unexpected error occurred: ");
            }catch (Exception e) { System.out.println("General exception occurred: ");
            }finally { scanner.nextLine(); // Clear the invalid input
            }
        }
        

        double teacherSalary; // REGULAR EXCEPTION HANDLING: TEACHER SALARY
        while (true) { // TEACHER 2 AGE
            System.out.print("Salary: ");
            try {
                teacherSalary = scanner.nextInt();
                if (teacherSalary < 0.0) {
                    throw new InvalidSalaryException("Salary is invalid. It must not be negative.");                                                                          
                }
            break;

            } catch (InvalidSalaryException e) { System.out.println(e.getMessage()); // USER-DEFINED EXCEPTION HANDLING: TEACHER SALARY
            } catch (InputMismatchException e) { System.out.println("Input Mismatch. Please enter a valid number for salary."); // REGULAR EXCEPTION
            } catch (RuntimeException e) { System.out.println("Runtime Exception. An unexpected error occurred: ");
            } catch (Exception e) { System.out.println("General Exception occured: ");
            } finally { scanner.nextLine(); // Clear the invalid input
            }
        }

        Teacher teacher = new Teacher(teacherName, teacherAge, teacherGender, teacherSalary);
        System.out.println("===================================");

        System.out.println();
        System.out.println();
        
        System.out.println("------------------OUTPUT RECORDS------------------");
        System.out.println("Student No. 1:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Gender: " + student1.getGender());
        System.out.printf("Grade: %.2f\n", student1.getGrade());
        System.out.println("===================================");

        System.out.println("Student No. 2:");
        System.out.println("Name: " + student2.getName());
        System.out.println("Age: " + student2.getAge());
        System.out.println("Gender: " + student2.getGender());
        System.out.printf("Grade: %.2f\n ", student2.getGrade());
        System.out.println("===================================");

        System.out.println("Teacher:");
        System.out.println("Name: " + teacher.getName());
        System.out.println("Age: " + teacher.getAge());
        System.out.println("Gender: " + teacher.getGender());
        System.out.printf("Salary: %.2f\n", teacher.getSalary());
        

        scanner.close();
    }
}
