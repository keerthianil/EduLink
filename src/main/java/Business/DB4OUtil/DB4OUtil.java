package Business.DB4OUtil;

import Business.ConfigureEduLink;
import Business.EcoSystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class DB4OUtil {

    private static final String FILENAME = System.getProperty("user.home") + "/EduLink.db4o"; // Path to the database
    private static DB4OUtil dB4OUtil;
    private ObjectContainer db;

    // Singleton instance
    public synchronized static DB4OUtil getInstance() {
        if (dB4OUtil == null) {
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    // Open connection to the database
    private ObjectContainer createConnection() {
        try {
            db = Db4oEmbedded.openFile(FILENAME);
            System.out.println("Database connection established to: " + FILENAME);
        } catch (Exception e) {
            System.err.println("Error creating DB4O connection: " + e.getMessage());
            e.printStackTrace();
        }
        return db;
    }

    // Close the connection
    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
            System.out.println("Database connection closed.");
        }
    }

    // Retrieve the EcoSystem from the database
    public EcoSystem retrieveSystem() {
        EcoSystem ecoSystem = null;
        try {
            db = createConnection();
            ObjectSet<EcoSystem> systems = db.query(EcoSystem.class);
            if (systems.isEmpty()) {
                System.out.println("No existing EcoSystem found. Initializing a new one...");
                ecoSystem = ConfigureEduLink.configure();
                storeSystem(ecoSystem);
            } else {
                ecoSystem = systems.get(0);
                System.out.println("EcoSystem retrieved from database.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            shutdown(db);
        }
        return ecoSystem;
    }

    // Store the EcoSystem in the database
    public void storeSystem(EcoSystem system) {
        try {
            db = createConnection();
            db.store(system);
            db.commit();
            System.out.println("EcoSystem stored successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            shutdown(db);
        }
    }
}
