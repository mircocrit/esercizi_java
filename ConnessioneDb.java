import java.io.*;
import java.sql.*;
import java.util.ArrayList;


public class ConnessioneDb {
    public Connection getConnection(){
        try{
            Connection  conn = DriverManager.getConnection("jdbc:mariadb://localhost/" +
                    "inventory?user=root&password=arcangelo");
            return conn;
        }catch (SQLException e){
            System.out.println(e);

        }

        return null;
    }


    public static  void main(String[] args) throws Exception{
        ConnessioneDb cb = new ConnessioneDb();
        Class.forName("org.mariadb.jdbc.Driver");
       Connection conn = cb.getConnection();
       Statement stm = conn.createStatement();
       ResultSet res = stm.executeQuery("Select * from items;");
       ArrayList<Item> items = new ArrayList<Item>();
       Item tmp;

       while(res.next()){
           tmp = new Item(res.getInt("id"),res.getString("barcode"),res.getInt("amount"),res.getString("name"),res.getInt("type"));
           items.add(tmp);
       }



        System.out.println(items);


        FileOutputStream fos = new FileOutputStream("itemsSer.txt");
        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(items);

        PrintWriter pw = new PrintWriter("items.txt");

       for(int i=0; i < 1; i++){

           pw.println(items.get(i));

       }

       pw.close();
       fos.close();

        items.clear();
        System.out.println(items);

        /*FileReader fr = new FileReader("items.txt");
        int y;

        while((y = fr.read()) != -1){
            System.out.println(y);
        }

        fr.close();*/

        FileInputStream fis = new FileInputStream("itemsSer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        items = (ArrayList<Item>) ois.readObject();


        System.out.println(items);

    }


}
