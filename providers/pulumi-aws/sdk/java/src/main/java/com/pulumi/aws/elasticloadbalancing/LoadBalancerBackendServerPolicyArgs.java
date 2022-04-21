// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancing;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerBackendServerPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerBackendServerPolicyArgs Empty = new LoadBalancerBackendServerPolicyArgs();

    /**
     * The instance port to apply the policy to.
     * 
     */
    @Import(name="instancePort", required=true)
    private Output<Integer> instancePort;

    public Output<Integer> instancePort() {
        return this.instancePort;
    }

    /**
     * The load balancer to attach the policy to.
     * 
     */
    @Import(name="loadBalancerName", required=true)
    private Output<String> loadBalancerName;

    public Output<String> loadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * List of Policy Names to apply to the backend server.
     * 
     */
    @Import(name="policyNames")
    private @Nullable Output<List<String>> policyNames;

    public Optional<Output<List<String>>> policyNames() {
        return Optional.ofNullable(this.policyNames);
    }

    private LoadBalancerBackendServerPolicyArgs() {}

    private LoadBalancerBackendServerPolicyArgs(LoadBalancerBackendServerPolicyArgs $) {
        this.instancePort = $.instancePort;
        this.loadBalancerName = $.loadBalancerName;
        this.policyNames = $.policyNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerBackendServerPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerBackendServerPolicyArgs $;

        public Builder() {
            $ = new LoadBalancerBackendServerPolicyArgs();
        }

        public Builder(LoadBalancerBackendServerPolicyArgs defaults) {
            $ = new LoadBalancerBackendServerPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder instancePort(Output<Integer> instancePort) {
            $.instancePort = instancePort;
            return this;
        }

        public Builder instancePort(Integer instancePort) {
            return instancePort(Output.of(instancePort));
        }

        public Builder loadBalancerName(Output<String> loadBalancerName) {
            $.loadBalancerName = loadBalancerName;
            return this;
        }

        public Builder loadBalancerName(String loadBalancerName) {
            return loadBalancerName(Output.of(loadBalancerName));
        }

        public Builder policyNames(@Nullable Output<List<String>> policyNames) {
            $.policyNames = policyNames;
            return this;
        }

        public Builder policyNames(List<String> policyNames) {
            return policyNames(Output.of(policyNames));
        }

        public Builder policyNames(String... policyNames) {
            return policyNames(List.of(policyNames));
        }

        public LoadBalancerBackendServerPolicyArgs build() {
            $.instancePort = Objects.requireNonNull($.instancePort, "expected parameter 'instancePort' to be non-null");
            $.loadBalancerName = Objects.requireNonNull($.loadBalancerName, "expected parameter 'loadBalancerName' to be non-null");
            return $;
        }
    }

}
