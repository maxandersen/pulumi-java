// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.inputs;

import com.pulumi.azurenative.botservice.inputs.ServiceProviderParameterResponseConstraints;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Meta data for the Service Provider
 * 
 */
public final class ServiceProviderParameterResponseMetadata extends com.pulumi.resources.InvokeArgs {

    public static final ServiceProviderParameterResponseMetadata Empty = new ServiceProviderParameterResponseMetadata();

    /**
     * the constraints of the bot meta data.
     * 
     */
    @Import(name="constraints")
      private final @Nullable ServiceProviderParameterResponseConstraints constraints;

    public Optional<ServiceProviderParameterResponseConstraints> constraints() {
        return this.constraints == null ? Optional.empty() : Optional.ofNullable(this.constraints);
    }

    public ServiceProviderParameterResponseMetadata(@Nullable ServiceProviderParameterResponseConstraints constraints) {
        this.constraints = constraints;
    }

    private ServiceProviderParameterResponseMetadata() {
        this.constraints = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceProviderParameterResponseMetadata defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceProviderParameterResponseConstraints constraints;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceProviderParameterResponseMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constraints = defaults.constraints;
        }

        public Builder constraints(@Nullable ServiceProviderParameterResponseConstraints constraints) {
            this.constraints = constraints;
            return this;
        }        public ServiceProviderParameterResponseMetadata build() {
            return new ServiceProviderParameterResponseMetadata(constraints);
        }
    }
}
