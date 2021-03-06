package cn.krynn.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;

/**
 * Created by RaistlinD
 * 2018/6/29 下午11:38
 */
public class BaseTest {

    protected KieSession getKieSession() {

        KieServices kieService = KieServices.get();
        KieContainer kieContainer = kieService.getKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession("all-rules");

        return kieSession;
    }

    protected KieSession getKieSession(String agendaGroupName) {
        KieSession kieSession = getKieSession();
        kieSession.getAgenda().getAgendaGroup(agendaGroupName).setFocus();
        return kieSession;
    }

    protected StatelessKieSession getStatelessKieSession() {

        KieServices kieService = KieServices.get();
        KieContainer kieContainer = kieService.getKieClasspathContainer();
        StatelessKieSession kieSession = kieContainer.newStatelessKieSession("stateless-rules");

        return kieSession;
    }

    protected StatelessKieSession getStatelessKieSession(String agendaGroupName) {
        StatelessKieSession kieSession = getStatelessKieSession();
        return kieSession;
    }
}
