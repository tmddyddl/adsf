package Properties;

import java.util.Properties;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;

// 키와값을 String 타입으로제한 설정정보등을 파일에쓰기위해서
//HashTable 상속받아 기능 제한해서 사용
public class PropertiesEx {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        String path
                 = null;
        path = Properties.class.getResource("./database.properties").getPath();
        path = URLDecoder.decode(path, "utf-8");
        properties.load(new FileReader(path)); //파일 읽기
        String driver = properties.getProperty("driver"); //키값으로 값을 가져 옴
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println("drive : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }
    }