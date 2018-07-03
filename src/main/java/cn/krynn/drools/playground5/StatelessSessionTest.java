package cn.krynn.drools.playground5;

import cn.krynn.drools.BaseTest;
import cn.krynn.drools.model.Person;
import org.junit.Test;
import org.kie.api.runtime.StatelessKieSession;

/**
 * Created by RaistlinD
 * 2018/7/3 下午10:54
 */
public class StatelessSessionTest extends BaseTest {

    @Test
    public void testStatelessSession() {
        StatelessKieSession kieSession = this.getStatelessKieSession();

        Person p = new Person();
        p.setAge(35);

        kieSession.execute(p);
    }
}
