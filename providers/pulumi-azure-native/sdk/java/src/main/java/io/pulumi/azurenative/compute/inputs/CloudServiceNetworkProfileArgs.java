// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.LoadBalancerConfigurationArgs;
import io.pulumi.azurenative.compute.inputs.SubResourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Network Profile for the cloud service.
 * 
 */
public final class CloudServiceNetworkProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudServiceNetworkProfileArgs Empty = new CloudServiceNetworkProfileArgs();

    /**
     * List of Load balancer configurations. Cloud service can have up to two load balancer configurations, corresponding to a Public Load Balancer and an Internal Load Balancer.
     * 
     */
    @Import(name="loadBalancerConfigurations")
      private final @Nullable Output<List<LoadBalancerConfigurationArgs>> loadBalancerConfigurations;

    public Output<List<LoadBalancerConfigurationArgs>> loadBalancerConfigurations() {
        return this.loadBalancerConfigurations == null ? Codegen.empty() : this.loadBalancerConfigurations;
    }

    /**
     * The id reference of the cloud service containing the target IP with which the subject cloud service can perform a swap. This property cannot be updated once it is set. The swappable cloud service referred by this id must be present otherwise an error will be thrown.
     * 
     */
    @Import(name="swappableCloudService")
      private final @Nullable Output<SubResourceArgs> swappableCloudService;

    public Output<SubResourceArgs> swappableCloudService() {
        return this.swappableCloudService == null ? Codegen.empty() : this.swappableCloudService;
    }

    public CloudServiceNetworkProfileArgs(
        @Nullable Output<List<LoadBalancerConfigurationArgs>> loadBalancerConfigurations,
        @Nullable Output<SubResourceArgs> swappableCloudService) {
        this.loadBalancerConfigurations = loadBalancerConfigurations;
        this.swappableCloudService = swappableCloudService;
    }

    private CloudServiceNetworkProfileArgs() {
        this.loadBalancerConfigurations = Codegen.empty();
        this.swappableCloudService = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceNetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<LoadBalancerConfigurationArgs>> loadBalancerConfigurations;
        private @Nullable Output<SubResourceArgs> swappableCloudService;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceNetworkProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loadBalancerConfigurations = defaults.loadBalancerConfigurations;
    	      this.swappableCloudService = defaults.swappableCloudService;
        }

        public Builder loadBalancerConfigurations(@Nullable Output<List<LoadBalancerConfigurationArgs>> loadBalancerConfigurations) {
            this.loadBalancerConfigurations = loadBalancerConfigurations;
            return this;
        }
        public Builder loadBalancerConfigurations(@Nullable List<LoadBalancerConfigurationArgs> loadBalancerConfigurations) {
            this.loadBalancerConfigurations = Codegen.ofNullable(loadBalancerConfigurations);
            return this;
        }
        public Builder loadBalancerConfigurations(LoadBalancerConfigurationArgs... loadBalancerConfigurations) {
            return loadBalancerConfigurations(List.of(loadBalancerConfigurations));
        }
        public Builder swappableCloudService(@Nullable Output<SubResourceArgs> swappableCloudService) {
            this.swappableCloudService = swappableCloudService;
            return this;
        }
        public Builder swappableCloudService(@Nullable SubResourceArgs swappableCloudService) {
            this.swappableCloudService = Codegen.ofNullable(swappableCloudService);
            return this;
        }        public CloudServiceNetworkProfileArgs build() {
            return new CloudServiceNetworkProfileArgs(loadBalancerConfigurations, swappableCloudService);
        }
    }
}
