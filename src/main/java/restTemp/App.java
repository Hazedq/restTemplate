package restTemp;

import restTemp.config.MyConfig;
import restTemp.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
        communication.allUsers();
        communication.addUser(new User(3L, "James", "Brown", (byte) 35));
        communication.saveUser(new User(3L, "Thomas", "Shelby", (byte) 35));
        communication.deleteUser(3L);
    }
}
