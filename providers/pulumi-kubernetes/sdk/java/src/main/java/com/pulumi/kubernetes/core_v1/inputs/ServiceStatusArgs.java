// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core_v1.inputs.LoadBalancerStatusArgs;
import com.pulumi.kubernetes.meta_v1.inputs.ConditionArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ServiceStatus represents the current status of a service.
 * 
 */
public final class ServiceStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceStatusArgs Empty = new ServiceStatusArgs();

    /**
     * Current service state
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<ConditionArgs>> conditions;

    public Optional<Output<List<ConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * LoadBalancer contains the current status of the load-balancer, if one is present.
     * 
     */
    @Import(name="loadBalancer")
    private @Nullable Output<LoadBalancerStatusArgs> loadBalancer;

    public Optional<Output<LoadBalancerStatusArgs>> loadBalancer() {
        return Optional.ofNullable(this.loadBalancer);
    }

    private ServiceStatusArgs() {}

    private ServiceStatusArgs(ServiceStatusArgs $) {
        this.conditions = $.conditions;
        this.loadBalancer = $.loadBalancer;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceStatusArgs $;

        public Builder() {
            $ = new ServiceStatusArgs();
        }

        public Builder(ServiceStatusArgs defaults) {
            $ = new ServiceStatusArgs(Objects.requireNonNull(defaults));
        }

        public Builder conditions(@Nullable Output<List<ConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(List<ConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        public Builder conditions(ConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public Builder loadBalancer(@Nullable Output<LoadBalancerStatusArgs> loadBalancer) {
            $.loadBalancer = loadBalancer;
            return this;
        }

        public Builder loadBalancer(LoadBalancerStatusArgs loadBalancer) {
            return loadBalancer(Output.of(loadBalancer));
        }

        public ServiceStatusArgs build() {
            return $;
        }
    }

}
