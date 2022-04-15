// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.IPConfigurationProfileResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerNetworkInterfaceConfigurationResponse {
    /**
     * A list of container network interfaces created from this container network interface configuration.
     * 
     */
    private final @Nullable List<SubResourceResponse> containerNetworkInterfaces;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * A list of ip configurations of the container network interface configuration.
     * 
     */
    private final @Nullable List<IPConfigurationProfileResponse> ipConfigurations;
    /**
     * The name of the resource. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * The provisioning state of the container network interface configuration resource.
     * 
     */
    private final String provisioningState;
    /**
     * Sub Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ContainerNetworkInterfaceConfigurationResponse(
        @CustomType.Parameter("containerNetworkInterfaces") @Nullable List<SubResourceResponse> containerNetworkInterfaces,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("ipConfigurations") @Nullable List<IPConfigurationProfileResponse> ipConfigurations,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("type") String type) {
        this.containerNetworkInterfaces = containerNetworkInterfaces;
        this.etag = etag;
        this.id = id;
        this.ipConfigurations = ipConfigurations;
        this.name = name;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * A list of container network interfaces created from this container network interface configuration.
     * 
    */
    public List<SubResourceResponse> containerNetworkInterfaces() {
        return this.containerNetworkInterfaces == null ? List.of() : this.containerNetworkInterfaces;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * A list of ip configurations of the container network interface configuration.
     * 
    */
    public List<IPConfigurationProfileResponse> ipConfigurations() {
        return this.ipConfigurations == null ? List.of() : this.ipConfigurations;
    }
    /**
     * The name of the resource. This name can be used to access the resource.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The provisioning state of the container network interface configuration resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Sub Resource type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerNetworkInterfaceConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SubResourceResponse> containerNetworkInterfaces;
        private String etag;
        private @Nullable String id;
        private @Nullable List<IPConfigurationProfileResponse> ipConfigurations;
        private @Nullable String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerNetworkInterfaceConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerNetworkInterfaces = defaults.containerNetworkInterfaces;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder containerNetworkInterfaces(@Nullable List<SubResourceResponse> containerNetworkInterfaces) {
            this.containerNetworkInterfaces = containerNetworkInterfaces;
            return this;
        }
        public Builder containerNetworkInterfaces(SubResourceResponse... containerNetworkInterfaces) {
            return containerNetworkInterfaces(List.of(containerNetworkInterfaces));
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder ipConfigurations(@Nullable List<IPConfigurationProfileResponse> ipConfigurations) {
            this.ipConfigurations = ipConfigurations;
            return this;
        }
        public Builder ipConfigurations(IPConfigurationProfileResponse... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ContainerNetworkInterfaceConfigurationResponse build() {
            return new ContainerNetworkInterfaceConfigurationResponse(containerNetworkInterfaces, etag, id, ipConfigurations, name, provisioningState, type);
        }
    }
}
