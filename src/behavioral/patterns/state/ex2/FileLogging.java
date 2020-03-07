package strategy.ex2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Concrete strategy class representing a particular algorithm.
 */
public class FileLogging implements Logging {

	private final File toWrite;

	public FileLogging(final File toWrite) {
		this.toWrite = toWrite;
	}

	@Override
	public void write(String message) {
		try {
			final FileWriter fos = new FileWriter(toWrite);
			fos.write(message);
			fos.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
