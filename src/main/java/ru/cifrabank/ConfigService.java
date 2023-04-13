package ru.cifrabank;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class ConfigService {

    @Value("${spring.profiles.active}")
    private String profile;

    @Value("${app.common-value:'common by default'}")
    private String common;
    @Value("${app.for-test-value:'local test by default'}")
    private String localTest;
    @Value("${app.external-for-test:'externalized for TEST by default'}")
    private String externalTest;

    @Value("${app.external-for-dev:'externalized for DEV by default'}")
    private String externalDev;

    public String showProps() {
        StringBuilder builder = new StringBuilder();
        builder.append("Профиль: ").append(profile).append("\n");
        builder.append("Общее свойство: ").append(common).append("\n");
        builder.append("Локальное профильное свойство: ").append(localTest).append("\n");
        builder.append("Снаружи свойство TEST: ").append(externalTest).append("\n");
        builder.append("Снаружи свойство DEV: ").append(externalDev).append("\n");
        return builder.toString();
    }

}
