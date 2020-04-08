package myspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PetClinicApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(PetClinicApplication.class, args);
        System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");

        /*  MyController myController =  Controller1 controller1 = (Controller1) context.getBean("controller1");
        System.out.println(controller1.getMessage());
        System.out.println("-------------------------------------");

        Controller2 controller2 = (Controller2) context.getBean("controller2");
        System.out.println(controller2.getMessage());
        System.out.println("-------------------------------------");
        Controller3 controller3 = (Controller3) context.getBean("controller3");
        System.out.println(controller3.getMessage());
*/
     /*   (MyController) context.getBean("myController");
        System.out.println(myController.getMessage());
*/
      // GlobalController global= (GlobalController) context.getBean("globalController");
      //  System.out.println(global.getMessage());


    }

}
