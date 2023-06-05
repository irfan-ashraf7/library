package Arrays;
import java.util.ArrayList;

public class LibraryManage {

        
            public static void main(String[] args) {
                // Create an ArrayList to hold the table
                ArrayList<ArrayList<Object>> table = new ArrayList<>();
        
                // Create and add the title row
                ArrayList<Object> titleRow = new ArrayList<>();
                titleRow.add("Isn_No");
                titleRow.add("Name");
                titleRow.add("Author");
                table.add(titleRow);
        
                // Create and add data rows
                ArrayList<Object> row1 = new ArrayList<>();
                row1.add(1);
                row1.add("The Discovery of India");
                row1.add("Jawahrlal Nehru");
                table.add(row1);
        
                ArrayList<Object> row2 = new ArrayList<>();
                row2.add(2);
                row2.add("12 Rules for Life");
                row2.add(" Dr. Jordan Peterson");
                table.add(row2);

                ArrayList<Object> row3 = new ArrayList<>();
                row3.add(3);
                row3.add("Beyond Order");
                row3.add(" Dr. Jordan Peterson");
                table.add(row3);

                ArrayList<Object> row4 = new ArrayList<>();
                row4.add(4);
                row4.add("The Leader in You");
                row4.add("Dale Carnegie ");
                table.add(row4);

                ArrayList<Object> row5 = new ArrayList<>();
                row5.add(5);
                row5.add("How to win friends");
                row5.add("Dale Carnegie");
                table.add(row5);

                ArrayList<Object> row6 = new ArrayList<>();
                row6.add(6);
                row6.add("The Art Of Public Speaking");
                row6.add(":Dale Carnegie ");
                table.add(row6);

                ArrayList<Object> row7 = new ArrayList<>();
                row7.add(7);
                row7.add("The Richest Man In Babylon");
                row7.add("George Samuel Clason");
                table.add(row7);

                ArrayList<Object> row8 = new ArrayList<>();
                row8.add(8);
                row8.add("The Diary of a Young Girl");
                row8.add("Anne Frank");
                table.add(row8);

                ArrayList<Object> row9 = new ArrayList<>();
                row9.add(9);
                row9.add("The Hunger Games");
                row9.add(" Suzanne collins");
                table.add(row9);

                ArrayList<Object> row10 = new ArrayList<>();
                row10.add(10);
                row10.add("The Book Thief");
                row10.add("Markus zusak ");
                table.add(row10);

                ArrayList<Object> row11 = new ArrayList<>();
                row11.add(11);
                row11.add("When dogs cry");
                row11.add(" Markus zusak");
                table.add(row11);
        
                // Access and print the table
                for (ArrayList<Object> row : table) {
                    for (Object value : row) {
                        System.out.print(value + "\t");
                    }
                    System.out.println();
                }
            }
        }
        


    

