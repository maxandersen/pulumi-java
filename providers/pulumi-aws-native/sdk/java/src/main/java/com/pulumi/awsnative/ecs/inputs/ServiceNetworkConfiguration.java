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
    private @Nullable ServiceAwsVpcConfiguration awsvpcConfiguration;

    public Optional<ServiceAwsVpcConfiguration> awsvpcConfiguration() {
        return Optional.ofNullable(this.awsvpcConfiguration);
    }

    private ServiceNetworkConfiguration() {}

    private ServiceNetworkConfiguration(ServiceNetworkConfiguration $) {
        this.awsvpcConfiguration = $.awsvpcConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceNetworkConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceNetworkConfiguration $;

        public Builder() {
            $ = new ServiceNetworkConfiguration();
        }

        public Builder(ServiceNetworkConfiguration defaults) {
            $ = new ServiceNetworkConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder awsvpcConfiguration(@Nullable ServiceAwsVpcConfiguration awsvpcConfiguration) {
            $.awsvpcConfiguration = awsvpcConfiguration;
            return this;
        }

        public ServiceNetworkConfiguration build() {
            return $;
        }
    }

}
