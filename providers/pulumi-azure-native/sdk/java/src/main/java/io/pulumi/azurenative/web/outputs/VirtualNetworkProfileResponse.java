// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNetworkProfileResponse {
    /**
     * Resource id of the Virtual Network.
     * 
     */
    private final String id;
    /**
     * Name of the Virtual Network (read-only).
     * 
     */
    private final String name;
    /**
     * Subnet within the Virtual Network.
     * 
     */
    private final @Nullable String subnet;
    /**
     * Resource type of the Virtual Network (read-only).
     * 
     */
    private final String type;

    @CustomType.Constructor
    private VirtualNetworkProfileResponse(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("subnet") @Nullable String subnet,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.subnet = subnet;
        this.type = type;
    }

    /**
     * Resource id of the Virtual Network.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Name of the Virtual Network (read-only).
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Subnet within the Virtual Network.
     * 
    */
    public Optional<String> subnet() {
        return Optional.ofNullable(this.subnet);
    }
    /**
     * Resource type of the Virtual Network (read-only).
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable String subnet;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.subnet = defaults.subnet;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder subnet(@Nullable String subnet) {
            this.subnet = subnet;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public VirtualNetworkProfileResponse build() {
            return new VirtualNetworkProfileResponse(id, name, subnet, type);
        }
    }
}
