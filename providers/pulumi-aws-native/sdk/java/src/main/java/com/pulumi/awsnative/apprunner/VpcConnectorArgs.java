// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apprunner;

import com.pulumi.awsnative.apprunner.inputs.VpcConnectorTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcConnectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpcConnectorArgs Empty = new VpcConnectorArgs();

    /**
     * A list of IDs of security groups that App Runner should use for access to AWS resources under the specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The default security group allows all outbound traffic.
     * 
     */
    @Import(name="securityGroups")
      private final @Nullable Output<List<String>> securityGroups;

    public Output<List<String>> securityGroups() {
        return this.securityGroups == null ? Codegen.empty() : this.securityGroups;
    }

    /**
     * A list of IDs of subnets that App Runner should use when it associates your service with a custom Amazon VPC. Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the subnets you specify.
     * 
     */
    @Import(name="subnets", required=true)
      private final Output<List<String>> subnets;

    public Output<List<String>> subnets() {
        return this.subnets;
    }

    /**
     * A list of metadata items that you can associate with your VPC connector resource. A tag is a key-value pair.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<VpcConnectorTagArgs>> tags;

    public Output<List<VpcConnectorTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A name for the VPC connector. If you don&#39;t specify a name, AWS CloudFormation generates a name for your VPC connector.
     * 
     */
    @Import(name="vpcConnectorName")
      private final @Nullable Output<String> vpcConnectorName;

    public Output<String> vpcConnectorName() {
        return this.vpcConnectorName == null ? Codegen.empty() : this.vpcConnectorName;
    }

    public VpcConnectorArgs(
        @Nullable Output<List<String>> securityGroups,
        Output<List<String>> subnets,
        @Nullable Output<List<VpcConnectorTagArgs>> tags,
        @Nullable Output<String> vpcConnectorName) {
        this.securityGroups = securityGroups;
        this.subnets = Objects.requireNonNull(subnets, "expected parameter 'subnets' to be non-null");
        this.tags = tags;
        this.vpcConnectorName = vpcConnectorName;
    }

    private VpcConnectorArgs() {
        this.securityGroups = Codegen.empty();
        this.subnets = Codegen.empty();
        this.tags = Codegen.empty();
        this.vpcConnectorName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> securityGroups;
        private Output<List<String>> subnets;
        private @Nullable Output<List<VpcConnectorTagArgs>> tags;
        private @Nullable Output<String> vpcConnectorName;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnets = defaults.subnets;
    	      this.tags = defaults.tags;
    	      this.vpcConnectorName = defaults.vpcConnectorName;
        }

        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }
        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Codegen.ofNullable(securityGroups);
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        public Builder subnets(Output<List<String>> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }
        public Builder subnets(List<String> subnets) {
            this.subnets = Output.of(Objects.requireNonNull(subnets));
            return this;
        }
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }
        public Builder tags(@Nullable Output<List<VpcConnectorTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<VpcConnectorTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(VpcConnectorTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder vpcConnectorName(@Nullable Output<String> vpcConnectorName) {
            this.vpcConnectorName = vpcConnectorName;
            return this;
        }
        public Builder vpcConnectorName(@Nullable String vpcConnectorName) {
            this.vpcConnectorName = Codegen.ofNullable(vpcConnectorName);
            return this;
        }        public VpcConnectorArgs build() {
            return new VpcConnectorArgs(securityGroups, subnets, tags, vpcConnectorName);
        }
    }
}
