// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GroupExposedPort {
    /**
     * @return The port number the container will expose. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Integer port;
    /**
     * @return The network protocol associated with port. Possible values are `TCP` &amp; `UDP`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String protocol;

    @CustomType.Constructor
    private GroupExposedPort(
        @CustomType.Parameter("port") @Nullable Integer port,
        @CustomType.Parameter("protocol") @Nullable String protocol) {
        this.port = port;
        this.protocol = protocol;
    }

    /**
     * @return The port number the container will expose. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return The network protocol associated with port. Possible values are `TCP` &amp; `UDP`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupExposedPort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer port;
        private @Nullable String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupExposedPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }        public GroupExposedPort build() {
            return new GroupExposedPort(port, protocol);
        }
    }
}
