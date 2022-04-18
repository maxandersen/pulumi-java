// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker;

import com.pulumi.core.TypeShape;
import com.pulumi.core.internal.Optionals;
import com.pulumi.docker.Utilities;
import com.pulumi.docker.config.inputs.RegistryAuth;
import java.lang.String;
import java.util.List;
import java.util.Optional;

public final class Config {

    private static final com.pulumi.Config config = com.pulumi.Config.of("docker");
/**
 * PEM-encoded content of Docker host CA certificate
 * 
 */
    public Optional<String> caMaterial() {
        return config.getObject("caMaterial",TypeShape.<String>builder(String.class).build());
    }
/**
 * PEM-encoded content of Docker client certificate
 * 
 */
    public Optional<String> certMaterial() {
        return config.getObject("certMaterial",TypeShape.<String>builder(String.class).build());
    }
/**
 * Path to directory with Docker TLS config
 * 
 */
    public Optional<String> certPath() {
        return config.getObject("certPath",TypeShape.<String>builder(String.class).build());
    }
/**
 * The Docker daemon address
 * 
 */
    public String host() {
        return Optionals.combine(config.get("host"), Utilities.getEnv("DOCKER_HOST").orElse(null) == null ? "unix:///var/run/docker.sock" : Utilities.getEnv("DOCKER_HOST").orElse(null));
    }
/**
 * PEM-encoded content of Docker client private key
 * 
 */
    public Optional<String> keyMaterial() {
        return config.getObject("keyMaterial",TypeShape.<String>builder(String.class).build());
    }
    public Optional<List<RegistryAuth>> registryAuth() {
        return config.getObject("registryAuth",TypeShape.<List<RegistryAuth>>builder(List.class).addParameter(RegistryAuth.class).build());
    }
}
