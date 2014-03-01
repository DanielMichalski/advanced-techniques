package advanced_techniques.p66_serializacja_klonowanie;

import java.io.*;

/**
 * Author: Daniel
 */
public class SerialClonable implements Cloneable, Serializable {
    @Override
    protected Object clone() {
        try {
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bout);
            oos.writeObject(this);
            bout.close();

            ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
            ObjectInputStream in = new ObjectInputStream(bin);
            Object object = in.readObject();
            in.close();

            return object;
        } catch (Exception e) {
            return null;
        }
    }
}
