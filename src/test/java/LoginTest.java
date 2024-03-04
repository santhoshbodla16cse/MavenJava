import com.practice.santhosh.Login;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest {

    @Test
    public void validateUser(){
        // Arrange
        String uname = "sbodla";
        String password = "manjula786";
        Login login = new Login();

        // Act
        String result = login.validate(uname, password);

        Assert.assertEquals(result, uname);

    }
}
