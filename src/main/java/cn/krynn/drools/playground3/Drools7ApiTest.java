package cn.krynn.drools.playground3;

import cn.krynn.drools.BaseTest;
import cn.krynn.drools.model.Car;
import cn.krynn.drools.model.Person;
import org.junit.Test;
import org.kie.api.runtime.KieSession;

/**
 * Created by RaistlinD
 * 2018/6/28 下午11:49
 */
public class Drools7ApiTest extends BaseTest {

    @Test
    public void testDrools7Api() {

        KieSession kieSession = getKieSession("test-gdrools7");

        Person p1 = new Person();
        p1.setAge(30);
        Car c1 = new Car();
        c1.setPerson(p1);

        Person p2 = new Person();
        p2.setAge(70);
        Car c2 = new Car();
        c2.setPerson(p2);

        kieSession.insert(c1);
        kieSession.insert(c2);

        int count = kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println("Fire " + count + " rules(s)!");

        System.out.println("The discount of c1 is " + c1.getDiscount() + "%");
        System.out.println("The discount of c2 is " + c2.getDiscount() + "%");
    }
}
