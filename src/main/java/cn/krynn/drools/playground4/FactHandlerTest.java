package cn.krynn.drools.playground4;

import cn.krynn.drools.BaseTest;
import cn.krynn.drools.model.Person;
import org.junit.Test;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

/**
 * Created by RaistlinD
 * 2018/7/1 下午10:36
 */
public class FactHandlerTest extends BaseTest {

    @Test
    public void testFactHandler() {
        KieSession kieSession = this.getKieSession("fact-handler-group");

        Person p = new Person();
        p.setAge(81);

        FactHandle handle = kieSession.insert(p);

        System.out.println(handle.toExternalForm());

        int count = kieSession.fireAllRules();
        System.out.println("Fires " + count + " rules!");

        p.setAge(90);
        kieSession.getAgenda().getAgendaGroup("fact-handler-group").setFocus();
        kieSession.update(handle, p);
        count = kieSession.fireAllRules();
        System.out.println("Fires " + count + " rules!");

        kieSession.dispose();
    }

}
