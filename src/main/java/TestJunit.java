import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * @author: Radhey Shyam
 * Date: 07/01/19
 * Time: 4:38 PM
 */
public class TestJunit {
    public void load(String filePath)  {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classloader.getResourceAsStream(filePath);
        InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader);
        String strCurrentLine;
        try {
            while ((strCurrentLine = reader.readLine()) != null) {
                System.out.println(strCurrentLine);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
