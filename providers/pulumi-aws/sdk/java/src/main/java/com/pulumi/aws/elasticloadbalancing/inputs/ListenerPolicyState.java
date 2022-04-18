// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancing.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final ListenerPolicyState Empty = new ListenerPolicyState();

    /**
     * The load balancer to attach the policy to.
     * 
     */
    @Import(name="loadBalancerName")
      private final @Nullable Output<String> loadBalancerName;

    public Output<String> loadBalancerName() {
        return this.loadBalancerName == null ? Codegen.empty() : this.loadBalancerName;
    }

    /**
     * The load balancer listener port to apply the policy to.
     * 
     */
    @Import(name="loadBalancerPort")
      private final @Nullable Output<Integer> loadBalancerPort;

    public Output<Integer> loadBalancerPort() {
        return this.loadBalancerPort == null ? Codegen.empty() : this.loadBalancerPort;
    }

    /**
     * List of Policy Names to apply to the backend server.
     * 
     */
    @Import(name="policyNames")
      private final @Nullable Output<List<String>> policyNames;

    public Output<List<String>> policyNames() {
        return this.policyNames == null ? Codegen.empty() : this.policyNames;
    }

    public ListenerPolicyState(
        @Nullable Output<String> loadBalancerName,
        @Nullable Output<Integer> loadBalancerPort,
        @Nullable Output<List<String>> policyNames) {
        this.loadBalancerName = loadBalancerName;
        this.loadBalancerPort = loadBalancerPort;
        this.policyNames = policyNames;
    }

    private ListenerPolicyState() {
        this.loadBalancerName = Codegen.empty();
        this.loadBalancerPort = Codegen.empty();
        this.policyNames = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> loadBalancerName;
        private @Nullable Output<Integer> loadBalancerPort;
        private @Nullable Output<List<String>> policyNames;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loadBalancerName = defaults.loadBalancerName;
    	      this.loadBalancerPort = defaults.loadBalancerPort;
    	      this.policyNames = defaults.policyNames;
        }

        public Builder loadBalancerName(@Nullable Output<String> loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public Builder loadBalancerName(@Nullable String loadBalancerName) {
            this.loadBalancerName = Codegen.ofNullable(loadBalancerName);
            return this;
        }
        public Builder loadBalancerPort(@Nullable Output<Integer> loadBalancerPort) {
            this.loadBalancerPort = loadBalancerPort;
            return this;
        }
        public Builder loadBalancerPort(@Nullable Integer loadBalancerPort) {
            this.loadBalancerPort = Codegen.ofNullable(loadBalancerPort);
            return this;
        }
        public Builder policyNames(@Nullable Output<List<String>> policyNames) {
            this.policyNames = policyNames;
            return this;
        }
        public Builder policyNames(@Nullable List<String> policyNames) {
            this.policyNames = Codegen.ofNullable(policyNames);
            return this;
        }
        public Builder policyNames(String... policyNames) {
            return policyNames(List.of(policyNames));
        }        public ListenerPolicyState build() {
            return new ListenerPolicyState(loadBalancerName, loadBalancerPort, policyNames);
        }
    }
}
