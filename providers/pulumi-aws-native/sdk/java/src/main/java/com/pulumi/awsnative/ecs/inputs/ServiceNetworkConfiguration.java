// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.awsnative.ecs.inputs.ServiceAwsVpcConfiguration;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceNetworkConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final ServiceNetworkConfiguration Empty = new ServiceNetworkConfiguration();

    @Import(name="awsvpcConfiguration")
      private final @Nullable ServiceAwsVpcConfiguration awsvpcConfiguration;

    public Optional<ServiceAwsVpcConfiguration> awsvpcConfiguration() {
        return this.awsvpcConfiguration == null ? Optional.empty() : Optional.ofNullable(this.awsvpcConfiguration);
    }

    public ServiceNetworkConfiguration(@Nullable ServiceAwsVpcConfiguration awsvpcConfiguration) {
        this.awsvpcConfiguration = awsvpcConfiguration;
    }

    private ServiceNetworkConfiguration() {
        this.awsvpcConfiguration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceNetworkConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceAwsVpcConfiguration awsvpcConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceNetworkConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsvpcConfiguration = defaults.awsvpcConfiguration;
        }

        public Builder awsvpcConfiguration(@Nullable ServiceAwsVpcConfiguration awsvpcConfiguration) {
            this.awsvpcConfiguration = awsvpcConfiguration;
            return this;
        }        public ServiceNetworkConfiguration build() {
            return new ServiceNetworkConfiguration(awsvpcConfiguration);
        }
    }
}
