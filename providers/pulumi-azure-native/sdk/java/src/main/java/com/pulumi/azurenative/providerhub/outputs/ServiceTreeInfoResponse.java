// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTreeInfoResponse {
    private final @Nullable String componentId;
    private final @Nullable String serviceId;

    @CustomType.Constructor
    private ServiceTreeInfoResponse(
        @CustomType.Parameter("componentId") @Nullable String componentId,
        @CustomType.Parameter("serviceId") @Nullable String serviceId) {
        this.componentId = componentId;
        this.serviceId = serviceId;
    }

    public Optional<String> componentId() {
        return Optional.ofNullable(this.componentId);
    }
    public Optional<String> serviceId() {
        return Optional.ofNullable(this.serviceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTreeInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String componentId;
        private @Nullable String serviceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTreeInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentId = defaults.componentId;
    	      this.serviceId = defaults.serviceId;
        }

        public Builder componentId(@Nullable String componentId) {
            this.componentId = componentId;
            return this;
        }
        public Builder serviceId(@Nullable String serviceId) {
            this.serviceId = serviceId;
            return this;
        }        public ServiceTreeInfoResponse build() {
            return new ServiceTreeInfoResponse(componentId, serviceId);
        }
    }
}
