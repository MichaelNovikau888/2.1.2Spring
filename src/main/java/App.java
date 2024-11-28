import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        // Получение бина HelloWorld
        HelloWorld helloWorldBean1 =
                (HelloWorld) applicationContext.getBean("helloworld");


        // Получение бина Cat
        Cat catBean1 = (Cat) applicationContext.getBean("Cat");
        Cat catBean2 = (Cat) applicationContext.getBean("Cat");

        // Сравнение бинов по ссылке
        System.out.println("HelloWorld beans are equal: " + (helloWorldBean1 == bean));
        System.out.println("Cat beans are equal: " + (catBean1 == catBean2));
    }

}