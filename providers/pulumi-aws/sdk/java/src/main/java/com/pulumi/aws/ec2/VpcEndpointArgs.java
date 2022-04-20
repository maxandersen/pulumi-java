// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpcEndpointArgs Empty = new VpcEndpointArgs();

    /**
     * Accept the VPC endpoint (the VPC endpoint and service need to be in the same AWS account).
     * 
     */
    @Import(name="autoAccept")
      private final @Nullable Output<Boolean> autoAccept;

    public Output<Boolean> autoAccept() {
        return this.autoAccept == null ? Codegen.empty() : this.autoAccept;
    }

    /**
     * A policy to attach to the endpoint that controls access to the service. This is a JSON formatted string. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> policy() {
        return this.policy == null ? Codegen.empty() : this.policy;
    }

    /**
     * Whether or not to associate a private hosted zone with the specified VPC. Applicable for endpoints of type `Interface`.
     * Defaults to `false`.
     * 
     */
    @Import(name="privateDnsEnabled")
      private final @Nullable Output<Boolean> privateDnsEnabled;

    public Output<Boolean> privateDnsEnabled() {
        return this.privateDnsEnabled == null ? Codegen.empty() : this.privateDnsEnabled;
    }

    /**
     * One or more route table IDs. Applicable for endpoints of type `Gateway`.
     * 
     */
    @Import(name="routeTableIds")
      private final @Nullable Output<List<String>> routeTableIds;

    public Output<List<String>> routeTableIds() {
        return this.routeTableIds == null ? Codegen.empty() : this.routeTableIds;
    }

    /**
     * The ID of one or more security groups to associate with the network interface. Required for endpoints of type `Interface`.
     * 
     */
    @Import(name="securityGroupIds")
      private final @Nullable Output<List<String>> securityGroupIds;

    public Output<List<String>> securityGroupIds() {
        return this.securityGroupIds == null ? Codegen.empty() : this.securityGroupIds;
    }

    /**
     * The service name. For AWS services the service name is usually in the form `com.amazonaws.&lt;region&gt;.&lt;service&gt;` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.&lt;region&gt;.notebook`).
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `GatewayLoadBalancer` and `Interface`.
     * 
     */
    @Import(name="subnetIds")
      private final @Nullable Output<List<String>> subnetIds;

    public Output<List<String>> subnetIds() {
        return this.subnetIds == null ? Codegen.empty() : this.subnetIds;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The VPC endpoint type, `Gateway`, `GatewayLoadBalancer`, or `Interface`. Defaults to `Gateway`.
     * 
     */
    @Import(name="vpcEndpointType")
      private final @Nullable Output<String> vpcEndpointType;

    public Output<String> vpcEndpointType() {
        return this.vpcEndpointType == null ? Codegen.empty() : this.vpcEndpointType;
    }

    /**
     * The ID of the VPC in which the endpoint will be used.
     * 
     */
    @Import(name="vpcId", required=true)
      private final Output<String> vpcId;

    public Output<String> vpcId() {
        return this.vpcId;
    }

    public VpcEndpointArgs(
        @Nullable Output<Boolean> autoAccept,
        @Nullable Output<String> policy,
        @Nullable Output<Boolean> privateDnsEnabled,
        @Nullable Output<List<String>> routeTableIds,
        @Nullable Output<List<String>> securityGroupIds,
        Output<String> serviceName,
        @Nullable Output<List<String>> subnetIds,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> vpcEndpointType,
        Output<String> vpcId) {
        this.autoAccept = autoAccept;
        this.policy = policy;
        this.privateDnsEnabled = privateDnsEnabled;
        this.routeTableIds = routeTableIds;
        this.securityGroupIds = securityGroupIds;
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.subnetIds = subnetIds;
        this.tags = tags;
        this.vpcEndpointType = vpcEndpointType;
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private VpcEndpointArgs() {
        this.autoAccept = Codegen.empty();
        this.policy = Codegen.empty();
        this.privateDnsEnabled = Codegen.empty();
        this.routeTableIds = Codegen.empty();
        this.securityGroupIds = Codegen.empty();
        this.serviceName = Codegen.empty();
        this.subnetIds = Codegen.empty();
        this.tags = Codegen.empty();
        this.vpcEndpointType = Codegen.empty();
        this.vpcId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoAccept;
        private @Nullable Output<String> policy;
        private @Nullable Output<Boolean> privateDnsEnabled;
        private @Nullable Output<List<String>> routeTableIds;
        private @Nullable Output<List<String>> securityGroupIds;
        private Output<String> serviceName;
        private @Nullable Output<List<String>> subnetIds;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> vpcEndpointType;
        private Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoAccept = defaults.autoAccept;
    	      this.policy = defaults.policy;
    	      this.privateDnsEnabled = defaults.privateDnsEnabled;
    	      this.routeTableIds = defaults.routeTableIds;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.serviceName = defaults.serviceName;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.vpcEndpointType = defaults.vpcEndpointType;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder autoAccept(@Nullable Output<Boolean> autoAccept) {
            this.autoAccept = autoAccept;
            return this;
        }
        public Builder autoAccept(@Nullable Boolean autoAccept) {
            this.autoAccept = Codegen.ofNullable(autoAccept);
            return this;
        }
        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }
        public Builder policy(@Nullable String policy) {
            this.policy = Codegen.ofNullable(policy);
            return this;
        }
        public Builder privateDnsEnabled(@Nullable Output<Boolean> privateDnsEnabled) {
            this.privateDnsEnabled = privateDnsEnabled;
            return this;
        }
        public Builder privateDnsEnabled(@Nullable Boolean privateDnsEnabled) {
            this.privateDnsEnabled = Codegen.ofNullable(privateDnsEnabled);
            return this;
        }
        public Builder routeTableIds(@Nullable Output<List<String>> routeTableIds) {
            this.routeTableIds = routeTableIds;
            return this;
        }
        public Builder routeTableIds(@Nullable List<String> routeTableIds) {
            this.routeTableIds = Codegen.ofNullable(routeTableIds);
            return this;
        }
        public Builder routeTableIds(String... routeTableIds) {
            return routeTableIds(List.of(routeTableIds));
        }
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = Codegen.ofNullable(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }
        public Builder subnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Codegen.ofNullable(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder vpcEndpointType(@Nullable Output<String> vpcEndpointType) {
            this.vpcEndpointType = vpcEndpointType;
            return this;
        }
        public Builder vpcEndpointType(@Nullable String vpcEndpointType) {
            this.vpcEndpointType = Codegen.ofNullable(vpcEndpointType);
            return this;
        }
        public Builder vpcId(Output<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Output.of(Objects.requireNonNull(vpcId));
            return this;
        }        public VpcEndpointArgs build() {
            return new VpcEndpointArgs(autoAccept, policy, privateDnsEnabled, routeTableIds, securityGroupIds, serviceName, subnetIds, tags, vpcEndpointType, vpcId);
        }
    }
}
