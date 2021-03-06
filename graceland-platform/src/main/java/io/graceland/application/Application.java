package io.graceland.application;

import com.google.common.collect.ImmutableList;

import io.graceland.plugin.Plugin;

/**
 * An application defines what plugins will be loaded into the {@link io.graceland.Platform}.
 * <p/>
 * It is the user-defined portion of the framework, determining what features, modules, plugins, resources, etc. are
 * loaded and used in this service.
 */
public interface Application {

    /**
     * Adds the plugin to the list of plugins that will be loaded.
     *
     * @param plugin The plugin to load.
     */
    void loadPlugin(Plugin plugin);

    /**
     * Provides a list of loaded plugins for this application. Once requested, the list of plugins should not change.
     * <p/>
     * At least one plugin must be loaded.
     *
     * @return A list of plugins.
     */
    ImmutableList<Plugin> getPlugins();
}
