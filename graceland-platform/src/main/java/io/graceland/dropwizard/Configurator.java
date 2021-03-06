package io.graceland.dropwizard;

import io.dropwizard.setup.Environment;
import io.graceland.PlatformConfiguration;

/**
 * This class is an escape hatch for customizing Dropwizard to your own liking, without having to be forced to use the
 * helper methods in the {@link io.graceland.plugin.AbstractPlugin}.
 * <p/>
 * All configurators are ran during the run phase of a Dropwizard service.
 */
public interface Configurator {

    /**
     * The method that will be called during the Dropwizard's {@link io.dropwizard.Application#run(io.dropwizard.Configuration, io.dropwizard.setup.Environment)}
     * method.
     *
     * @param configuration Provided by Dropwizard.
     * @param environment   Provided by Dropwizard.
     */
    void configure(PlatformConfiguration configuration, Environment environment);
}
