// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.inputs;

import com.pulumi.aws.networkfirewall.inputs.FirewallFirewallStatusGetArgs;
import com.pulumi.aws.networkfirewall.inputs.FirewallSubnetMappingGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallState extends com.pulumi.resources.ResourceArgs {

    public static final FirewallState Empty = new FirewallState();

    /**
     * The Amazon Resource Name (ARN) that identifies the firewall.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * A boolean flag indicating whether it is possible to delete the firewall. Defaults to `false`.
     * 
     */
    @Import(name="deleteProtection")
      private final @Nullable Output<Boolean> deleteProtection;

    public Output<Boolean> deleteProtection() {
        return this.deleteProtection == null ? Codegen.empty() : this.deleteProtection;
    }

    /**
     * A friendly description of the firewall.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The Amazon Resource Name (ARN) of the VPC Firewall policy.
     * 
     */
    @Import(name="firewallPolicyArn")
      private final @Nullable Output<String> firewallPolicyArn;

    public Output<String> firewallPolicyArn() {
        return this.firewallPolicyArn == null ? Codegen.empty() : this.firewallPolicyArn;
    }

    /**
     * A boolean flag indicating whether it is possible to change the associated firewall policy. Defaults to `false`.
     * 
     */
    @Import(name="firewallPolicyChangeProtection")
      private final @Nullable Output<Boolean> firewallPolicyChangeProtection;

    public Output<Boolean> firewallPolicyChangeProtection() {
        return this.firewallPolicyChangeProtection == null ? Codegen.empty() : this.firewallPolicyChangeProtection;
    }

    /**
     * Nested list of information about the current status of the firewall.
     * 
     */
    @Import(name="firewallStatuses")
      private final @Nullable Output<List<FirewallFirewallStatusGetArgs>> firewallStatuses;

    public Output<List<FirewallFirewallStatusGetArgs>> firewallStatuses() {
        return this.firewallStatuses == null ? Codegen.empty() : this.firewallStatuses;
    }

    /**
     * A friendly name of the firewall.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A boolean flag indicating whether it is possible to change the associated subnet(s). Defaults to `false`.
     * 
     */
    @Import(name="subnetChangeProtection")
      private final @Nullable Output<Boolean> subnetChangeProtection;

    public Output<Boolean> subnetChangeProtection() {
        return this.subnetChangeProtection == null ? Codegen.empty() : this.subnetChangeProtection;
    }

    /**
     * Set of configuration blocks describing the public subnets. Each subnet must belong to a different Availability Zone in the VPC. AWS Network Firewall creates a firewall endpoint in each subnet. See Subnet Mapping below for details.
     * 
     */
    @Import(name="subnetMappings")
      private final @Nullable Output<List<FirewallSubnetMappingGetArgs>> subnetMappings;

    public Output<List<FirewallSubnetMappingGetArgs>> subnetMappings() {
        return this.subnetMappings == null ? Codegen.empty() : this.subnetMappings;
    }

    /**
     * Map of resource tags to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * A string token used when updating a firewall.
     * 
     */
    @Import(name="updateToken")
      private final @Nullable Output<String> updateToken;

    public Output<String> updateToken() {
        return this.updateToken == null ? Codegen.empty() : this.updateToken;
    }

    /**
     * The unique identifier of the VPC where AWS Network Firewall should create the firewall.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> vpcId() {
        return this.vpcId == null ? Codegen.empty() : this.vpcId;
    }

    public FirewallState(
        @Nullable Output<String> arn,
        @Nullable Output<Boolean> deleteProtection,
        @Nullable Output<String> description,
        @Nullable Output<String> firewallPolicyArn,
        @Nullable Output<Boolean> firewallPolicyChangeProtection,
        @Nullable Output<List<FirewallFirewallStatusGetArgs>> firewallStatuses,
        @Nullable Output<String> name,
        @Nullable Output<Boolean> subnetChangeProtection,
        @Nullable Output<List<FirewallSubnetMappingGetArgs>> subnetMappings,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> updateToken,
        @Nullable Output<String> vpcId) {
        this.arn = arn;
        this.deleteProtection = deleteProtection;
        this.description = description;
        this.firewallPolicyArn = firewallPolicyArn;
        this.firewallPolicyChangeProtection = firewallPolicyChangeProtection;
        this.firewallStatuses = firewallStatuses;
        this.name = name;
        this.subnetChangeProtection = subnetChangeProtection;
        this.subnetMappings = subnetMappings;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.updateToken = updateToken;
        this.vpcId = vpcId;
    }

    private FirewallState() {
        this.arn = Codegen.empty();
        this.deleteProtection = Codegen.empty();
        this.description = Codegen.empty();
        this.firewallPolicyArn = Codegen.empty();
        this.firewallPolicyChangeProtection = Codegen.empty();
        this.firewallStatuses = Codegen.empty();
        this.name = Codegen.empty();
        this.subnetChangeProtection = Codegen.empty();
        this.subnetMappings = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.updateToken = Codegen.empty();
        this.vpcId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<Boolean> deleteProtection;
        private @Nullable Output<String> description;
        private @Nullable Output<String> firewallPolicyArn;
        private @Nullable Output<Boolean> firewallPolicyChangeProtection;
        private @Nullable Output<List<FirewallFirewallStatusGetArgs>> firewallStatuses;
        private @Nullable Output<String> name;
        private @Nullable Output<Boolean> subnetChangeProtection;
        private @Nullable Output<List<FirewallSubnetMappingGetArgs>> subnetMappings;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> updateToken;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.deleteProtection = defaults.deleteProtection;
    	      this.description = defaults.description;
    	      this.firewallPolicyArn = defaults.firewallPolicyArn;
    	      this.firewallPolicyChangeProtection = defaults.firewallPolicyChangeProtection;
    	      this.firewallStatuses = defaults.firewallStatuses;
    	      this.name = defaults.name;
    	      this.subnetChangeProtection = defaults.subnetChangeProtection;
    	      this.subnetMappings = defaults.subnetMappings;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.updateToken = defaults.updateToken;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder deleteProtection(@Nullable Output<Boolean> deleteProtection) {
            this.deleteProtection = deleteProtection;
            return this;
        }
        public Builder deleteProtection(@Nullable Boolean deleteProtection) {
            this.deleteProtection = Codegen.ofNullable(deleteProtection);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder firewallPolicyArn(@Nullable Output<String> firewallPolicyArn) {
            this.firewallPolicyArn = firewallPolicyArn;
            return this;
        }
        public Builder firewallPolicyArn(@Nullable String firewallPolicyArn) {
            this.firewallPolicyArn = Codegen.ofNullable(firewallPolicyArn);
            return this;
        }
        public Builder firewallPolicyChangeProtection(@Nullable Output<Boolean> firewallPolicyChangeProtection) {
            this.firewallPolicyChangeProtection = firewallPolicyChangeProtection;
            return this;
        }
        public Builder firewallPolicyChangeProtection(@Nullable Boolean firewallPolicyChangeProtection) {
            this.firewallPolicyChangeProtection = Codegen.ofNullable(firewallPolicyChangeProtection);
            return this;
        }
        public Builder firewallStatuses(@Nullable Output<List<FirewallFirewallStatusGetArgs>> firewallStatuses) {
            this.firewallStatuses = firewallStatuses;
            return this;
        }
        public Builder firewallStatuses(@Nullable List<FirewallFirewallStatusGetArgs> firewallStatuses) {
            this.firewallStatuses = Codegen.ofNullable(firewallStatuses);
            return this;
        }
        public Builder firewallStatuses(FirewallFirewallStatusGetArgs... firewallStatuses) {
            return firewallStatuses(List.of(firewallStatuses));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder subnetChangeProtection(@Nullable Output<Boolean> subnetChangeProtection) {
            this.subnetChangeProtection = subnetChangeProtection;
            return this;
        }
        public Builder subnetChangeProtection(@Nullable Boolean subnetChangeProtection) {
            this.subnetChangeProtection = Codegen.ofNullable(subnetChangeProtection);
            return this;
        }
        public Builder subnetMappings(@Nullable Output<List<FirewallSubnetMappingGetArgs>> subnetMappings) {
            this.subnetMappings = subnetMappings;
            return this;
        }
        public Builder subnetMappings(@Nullable List<FirewallSubnetMappingGetArgs> subnetMappings) {
            this.subnetMappings = Codegen.ofNullable(subnetMappings);
            return this;
        }
        public Builder subnetMappings(FirewallSubnetMappingGetArgs... subnetMappings) {
            return subnetMappings(List.of(subnetMappings));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder updateToken(@Nullable Output<String> updateToken) {
            this.updateToken = updateToken;
            return this;
        }
        public Builder updateToken(@Nullable String updateToken) {
            this.updateToken = Codegen.ofNullable(updateToken);
            return this;
        }
        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Codegen.ofNullable(vpcId);
            return this;
        }        public FirewallState build() {
            return new FirewallState(arn, deleteProtection, description, firewallPolicyArn, firewallPolicyChangeProtection, firewallStatuses, name, subnetChangeProtection, subnetMappings, tags, tagsAll, updateToken, vpcId);
        }
    }
}
