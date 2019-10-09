import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class fileImplement {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\IBM_ADMIN\\eclipse-workspace\\CodingGame\\myfile");
		try {
			FileOutputStream fos = new FileOutputStream(f);

			// oos = null;
			try {
				ObjectOutputStream oos = new ObjectOutputStream(fos);

				oos.writeObject(new A());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
