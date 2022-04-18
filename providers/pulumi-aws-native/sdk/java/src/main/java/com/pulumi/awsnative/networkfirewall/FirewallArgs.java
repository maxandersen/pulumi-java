// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkfirewall;

import com.pulumi.awsnative.networkfirewall.inputs.FirewallSubnetMappingArgs;
import com.pulumi.awsnative.networkfirewall.inputs.FirewallTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallArgs Empty = new FirewallArgs();

    @Import(name="deleteProtection")
      private final @Nullable Output<Boolean> deleteProtection;

    public Output<Boolean> deleteProtection() {
        return this.deleteProtection == null ? Codegen.empty() : this.deleteProtection;
    }

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    @Import(name="firewallName")
      private final @Nullable Output<String> firewallName;

    public Output<String> firewallName() {
        return this.firewallName == null ? Codegen.empty() : this.firewallName;
    }

    @Import(name="firewallPolicyArn", required=true)
      private final Output<String> firewallPolicyArn;

    public Output<String> firewallPolicyArn() {
        return this.firewallPolicyArn;
    }

    @Import(name="firewallPolicyChangeProtection")
      private final @Nullable Output<Boolean> firewallPolicyChangeProtection;

    public Output<Boolean> firewallPolicyChangeProtection() {
        return this.firewallPolicyChangeProtection == null ? Codegen.empty() : this.firewallPolicyChangeProtection;
    }

    @Import(name="subnetChangeProtection")
      private final @Nullable Output<Boolean> subnetChangeProtection;

    public Output<Boolean> subnetChangeProtection() {
        return this.subnetChangeProtection == null ? Codegen.empty() : this.subnetChangeProtection;
    }

    @Import(name="subnetMappings", required=true)
      private final Output<List<FirewallSubnetMappingArgs>> subnetMappings;

    public Output<List<FirewallSubnetMappingArgs>> subnetMappings() {
        return this.subnetMappings;
    }

    @Import(name="tags")
      private final @Nullable Output<List<FirewallTagArgs>> tags;

    public Output<List<FirewallTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    @Import(name="vpcId", required=true)
      private final Output<String> vpcId;

    public Output<String> vpcId() {
        return this.vpcId;
    }

    public FirewallArgs(
        @Nullable Output<Boolean> deleteProtection,
        @Nullable Output<String> description,
        @Nullable Output<String> firewallName,
        Output<String> firewallPolicyArn,
        @Nullable Output<Boolean> firewallPolicyChangeProtection,
        @Nullable Output<Boolean> subnetChangeProtection,
        Output<List<FirewallSubnetMappingArgs>> subnetMappings,
        @Nullable Output<List<FirewallTagArgs>> tags,
        Output<String> vpcId) {
        this.deleteProtection = deleteProtection;
        this.description = description;
        this.firewallName = firewallName;
        this.firewallPolicyArn = Objects.requireNonNull(firewallPolicyArn, "expected parameter 'firewallPolicyArn' to be non-null");
        this.firewallPolicyChangeProtection = firewallPolicyChangeProtection;
        this.subnetChangeProtection = subnetChangeProtection;
        this.subnetMappings = Objects.requireNonNull(subnetMappings, "expected parameter 'subnetMappings' to be non-null");
        this.tags = tags;
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private FirewallArgs() {
        this.deleteProtection = Codegen.empty();
        this.description = Codegen.empty();
        this.firewallName = Codegen.empty();
        this.firewallPolicyArn = Codegen.empty();
        this.firewallPolicyChangeProtection = Codegen.empty();
        this.subnetChangeProtection = Codegen.empty();
        this.subnetMappings = Codegen.empty();
        this.tags = Codegen.empty();
        this.vpcId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> deleteProtection;
        private @Nullable Output<String> description;
        private @Nullable Output<String> firewallName;
        private Output<String> firewallPolicyArn;
        private @Nullable Output<Boolean> firewallPolicyChangeProtection;
        private @Nullable Output<Boolean> subnetChangeProtection;
        private Output<List<FirewallSubnetMappingArgs>> subnetMappings;
        private @Nullable Output<List<FirewallTagArgs>> tags;
        private Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteProtection = defaults.deleteProtection;
    	      this.description = defaults.description;
    	      this.firewallName = defaults.firewallName;
    	      this.firewallPolicyArn = defaults.firewallPolicyArn;
    	      this.firewallPolicyChangeProtection = defaults.firewallPolicyChangeProtection;
    	      this.subnetChangeProtection = defaults.subnetChangeProtection;
    	      this.subnetMappings = defaults.subnetMappings;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
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
        public Builder firewallName(@Nullable Output<String> firewallName) {
            this.firewallName = firewallName;
            return this;
        }
        public Builder firewallName(@Nullable String firewallName) {
            this.firewallName = Codegen.ofNullable(firewallName);
            return this;
        }
        public Builder firewallPolicyArn(Output<String> firewallPolicyArn) {
            this.firewallPolicyArn = Objects.requireNonNull(firewallPolicyArn);
            return this;
        }
        public Builder firewallPolicyArn(String firewallPolicyArn) {
            this.firewallPolicyArn = Output.of(Objects.requireNonNull(firewallPolicyArn));
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
        public Builder subnetChangeProtection(@Nullable Output<Boolean> subnetChangeProtection) {
            this.subnetChangeProtection = subnetChangeProtection;
            return this;
        }
        public Builder subnetChangeProtection(@Nullable Boolean subnetChangeProtection) {
            this.subnetChangeProtection = Codegen.ofNullable(subnetChangeProtection);
            return this;
        }
        public Builder subnetMappings(Output<List<FirewallSubnetMappingArgs>> subnetMappings) {
            this.subnetMappings = Objects.requireNonNull(subnetMappings);
            return this;
        }
        public Builder subnetMappings(List<FirewallSubnetMappingArgs> subnetMappings) {
            this.subnetMappings = Output.of(Objects.requireNonNull(subnetMappings));
            return this;
        }
        public Builder subnetMappings(FirewallSubnetMappingArgs... subnetMappings) {
            return subnetMappings(List.of(subnetMappings));
        }
        public Builder tags(@Nullable Output<List<FirewallTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<FirewallTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(FirewallTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder vpcId(Output<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Output.of(Objects.requireNonNull(vpcId));
            return this;
        }        public FirewallArgs build() {
            return new FirewallArgs(deleteProtection, description, firewallName, firewallPolicyArn, firewallPolicyChangeProtection, subnetChangeProtection, subnetMappings, tags, vpcId);
        }
    }
}
