/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.DB4OUtil;

/**
 *
 * @author mayurchaudhari
 */

import BusinessModel.SystemConfiguration;
import BusinessModel.Ecosystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

public class DB4OUtil {

    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();

    private static DB4OUtil dB4OUtil;

    public synchronized static DB4OUtil getInstance() {
        if (dB4OUtil == null) 
        {
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {
            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            System.out.println("file name before create connection---"+FILENAME);
            ObjectContainer database = Db4oEmbedded.openFile(config, FILENAME);
            System.out.println("database ---"+database);
            config.common().add(new TransparentPersistenceSupport());
            config.common().activationDepth(Integer.MAX_VALUE);
            config.common().updateDepth(Integer.MAX_VALUE);
            config.common().objectClass(Ecosystem.class).cascadeOnUpdate(true);
            return database;
        } catch (Exception ex) {
            System.out.print("exception ----"+ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(Ecosystem system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }

    public Ecosystem retrieveSystem() {
        ObjectContainer conn = createConnection();
        System.out.println("connection ---"+conn);
        ObjectSet<Ecosystem> systems = conn.query(Ecosystem.class);
       
        Ecosystem system;
        if (systems.isEmpty()) {
            system = SystemConfiguration.configure();
        } else {
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        return system;
    }
}

