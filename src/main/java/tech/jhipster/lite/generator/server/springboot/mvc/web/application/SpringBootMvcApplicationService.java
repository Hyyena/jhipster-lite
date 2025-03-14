package tech.jhipster.lite.generator.server.springboot.mvc.web.application;

import org.springframework.stereotype.Service;
import tech.jhipster.lite.generator.server.springboot.mvc.web.domain.SpringBootMvcsModuleFactory;
import tech.jhipster.lite.module.domain.JHipsterModule;
import tech.jhipster.lite.module.domain.properties.JHipsterModuleProperties;

@Service
public class SpringBootMvcApplicationService {

  private final SpringBootMvcsModuleFactory factory;

  public SpringBootMvcApplicationService() {
    factory = new SpringBootMvcsModuleFactory();
  }

  public JHipsterModule buildTomcatModule(JHipsterModuleProperties properties) {
    return factory.buildTomcatModule(properties);
  }

  public JHipsterModule buildUndertowModule(JHipsterModuleProperties properties) {
    return factory.buildUndertowModule(properties);
  }

  public JHipsterModule buildEmptyModule(JHipsterModuleProperties properties) {
    return factory.buildEmptyModule(properties);
  }
}
