import java.awt.Component;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class reportInfo{
    String nid;
    String name;
    String area;
    String number;
    String evidence;
    String gender;
    String details;
    String date;
    private File file;
   private FileWriter fwriter;

   reportInfo(){
   }

      public reportInfo(String nid3, String name3, String area3, String number3, String evidence3, String gender3, String details3, String date3) {
      this.nid = nid3;
      this.name = name3;
      this.area = area3;
      this.number = number3;
      this.evidence = evidence3;
      this.gender = gender3;
      this.details= details3;
      this.date =date3;
   }
   public void showInfo(){
         System.out.println("========================================\n");
         System.out.println("Name          ->  : " + this.name+ "\n");
         System.out.println("N.I.D         ->  : " + this.nid + "\n");
         System.out.println("Area          ->  : " + this.area + "\n");
         System.out.println("Evidence      ->  : " + this.evidence + "\n");
         System.out.println("Gender        ->  : " + this.gender + "\n");
         System.out.println("Crime Details ->  : " + this.details + "\n");
         System.out.println("Date and Time ->  : " + this.date + "\n");
         System.out.println("========================================\n");
   }

   public void insertInfo() {
      try {
         this.file = new File("D:\\D drive files\\java\\saveInfo.txt");
         if (!this.file.exists()) {
            this.file.getParentFile().mkdirs();
            this.file.createNewFile();
         }

         this.fwriter = new FileWriter(this.file, true);
         this.fwriter.write("========================================\n");
         this.fwriter.write("Name          ->  : " + this.name+ "\n");
         this.fwriter.write("N.I.D         ->  : " + this.nid + "\n");
         this.fwriter.write("Area          ->  : " + this.area + "\n");
         this.fwriter.write("Evidence      ->  : " + this.evidence + "\n");
         this.fwriter.write("Gender        ->  : " + this.gender + "\n");
         this.fwriter.write("Crime Details ->  : " + this.details + "\n");
         this.fwriter.write("Date and Time ->  : " + this.date + "\n");
         this.fwriter.write("========================================\n");
         this.fwriter.flush();
         this.fwriter.close();
      } catch (IOException var2) {
         var2.printStackTrace();
         JOptionPane.showMessageDialog((Component)null, "Error occcurs");
      }

   }
}

