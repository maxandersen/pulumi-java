// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerRegistryResponse {
    private final String password;
    /**
     * If omitted, the default is "docker.io".
     * 
     */
    private final @Nullable String registryServer;
    private final String userName;

    @CustomType.Constructor
    private ContainerRegistryResponse(
        @CustomType.Parameter("password") String password,
        @CustomType.Parameter("registryServer") @Nullable String registryServer,
        @CustomType.Parameter("userName") String userName) {
        this.password = password;
        this.registryServer = registryServer;
        this.userName = userName;
    }

    public String password() {
        return this.password;
    }
    /**
     * If omitted, the default is "docker.io".
     * 
    */
    public Optional<String> registryServer() {
        return Optional.ofNullable(this.registryServer);
    }
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerRegistryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private @Nullable String registryServer;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerRegistryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.registryServer = defaults.registryServer;
    	      this.userName = defaults.userName;
        }

        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder registryServer(@Nullable String registryServer) {
            this.registryServer = registryServer;
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }        public ContainerRegistryResponse build() {
            return new ContainerRegistryResponse(password, registryServer, userName);
        }
    }
}
