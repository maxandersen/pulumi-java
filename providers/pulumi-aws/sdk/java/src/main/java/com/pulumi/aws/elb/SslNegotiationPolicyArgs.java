// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elb;

import com.pulumi.aws.elb.inputs.SslNegotiationPolicyAttributeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SslNegotiationPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SslNegotiationPolicyArgs Empty = new SslNegotiationPolicyArgs();

    /**
     * An SSL Negotiation policy attribute. Each has two properties:
     * 
     */
    @Import(name="attributes")
      private final @Nullable Output<List<SslNegotiationPolicyAttributeArgs>> attributes;

    public Output<List<SslNegotiationPolicyAttributeArgs>> attributes() {
        return this.attributes == null ? Codegen.empty() : this.attributes;
    }

    /**
     * The load balancer port to which the policy
     * should be applied. This must be an active listener on the load
     * balancer.
     * 
     */
    @Import(name="lbPort", required=true)
      private final Output<Integer> lbPort;

    public Output<Integer> lbPort() {
        return this.lbPort;
    }

    /**
     * The load balancer to which the policy
     * should be attached.
     * 
     */
    @Import(name="loadBalancer", required=true)
      private final Output<String> loadBalancer;

    public Output<String> loadBalancer() {
        return this.loadBalancer;
    }

    /**
     * The name of the attribute
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public SslNegotiationPolicyArgs(
        @Nullable Output<List<SslNegotiationPolicyAttributeArgs>> attributes,
        Output<Integer> lbPort,
        Output<String> loadBalancer,
        @Nullable Output<String> name) {
        this.attributes = attributes;
        this.lbPort = Objects.requireNonNull(lbPort, "expected parameter 'lbPort' to be non-null");
        this.loadBalancer = Objects.requireNonNull(loadBalancer, "expected parameter 'loadBalancer' to be non-null");
        this.name = name;
    }

    private SslNegotiationPolicyArgs() {
        this.attributes = Codegen.empty();
        this.lbPort = Codegen.empty();
        this.loadBalancer = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslNegotiationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<SslNegotiationPolicyAttributeArgs>> attributes;
        private Output<Integer> lbPort;
        private Output<String> loadBalancer;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SslNegotiationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.lbPort = defaults.lbPort;
    	      this.loadBalancer = defaults.loadBalancer;
    	      this.name = defaults.name;
        }

        public Builder attributes(@Nullable Output<List<SslNegotiationPolicyAttributeArgs>> attributes) {
            this.attributes = attributes;
            return this;
        }
        public Builder attributes(@Nullable List<SslNegotiationPolicyAttributeArgs> attributes) {
            this.attributes = Codegen.ofNullable(attributes);
            return this;
        }
        public Builder attributes(SslNegotiationPolicyAttributeArgs... attributes) {
            return attributes(List.of(attributes));
        }
        public Builder lbPort(Output<Integer> lbPort) {
            this.lbPort = Objects.requireNonNull(lbPort);
            return this;
        }
        public Builder lbPort(Integer lbPort) {
            this.lbPort = Output.of(Objects.requireNonNull(lbPort));
            return this;
        }
        public Builder loadBalancer(Output<String> loadBalancer) {
            this.loadBalancer = Objects.requireNonNull(loadBalancer);
            return this;
        }
        public Builder loadBalancer(String loadBalancer) {
            this.loadBalancer = Output.of(Objects.requireNonNull(loadBalancer));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public SslNegotiationPolicyArgs build() {
            return new SslNegotiationPolicyArgs(attributes, lbPort, loadBalancer, name);
        }
    }
}
