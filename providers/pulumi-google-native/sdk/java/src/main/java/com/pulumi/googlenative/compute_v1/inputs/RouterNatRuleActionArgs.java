// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouterNatRuleActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouterNatRuleActionArgs Empty = new RouterNatRuleActionArgs();

    /**
     * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid static external IP addresses assigned to the project. This field is used for public NAT.
     * 
     */
    @Import(name="sourceNatActiveIps")
      private final @Nullable Output<List<String>> sourceNatActiveIps;

    public Output<List<String>> sourceNatActiveIps() {
        return this.sourceNatActiveIps == null ? Codegen.empty() : this.sourceNatActiveIps;
    }

    /**
     * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule only. This field is used for public NAT.
     * 
     */
    @Import(name="sourceNatDrainIps")
      private final @Nullable Output<List<String>> sourceNatDrainIps;

    public Output<List<String>> sourceNatDrainIps() {
        return this.sourceNatDrainIps == null ? Codegen.empty() : this.sourceNatDrainIps;
    }

    public RouterNatRuleActionArgs(
        @Nullable Output<List<String>> sourceNatActiveIps,
        @Nullable Output<List<String>> sourceNatDrainIps) {
        this.sourceNatActiveIps = sourceNatActiveIps;
        this.sourceNatDrainIps = sourceNatDrainIps;
    }

    private RouterNatRuleActionArgs() {
        this.sourceNatActiveIps = Codegen.empty();
        this.sourceNatDrainIps = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatRuleActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> sourceNatActiveIps;
        private @Nullable Output<List<String>> sourceNatDrainIps;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatRuleActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceNatActiveIps = defaults.sourceNatActiveIps;
    	      this.sourceNatDrainIps = defaults.sourceNatDrainIps;
        }

        public Builder sourceNatActiveIps(@Nullable Output<List<String>> sourceNatActiveIps) {
            this.sourceNatActiveIps = sourceNatActiveIps;
            return this;
        }
        public Builder sourceNatActiveIps(@Nullable List<String> sourceNatActiveIps) {
            this.sourceNatActiveIps = Codegen.ofNullable(sourceNatActiveIps);
            return this;
        }
        public Builder sourceNatActiveIps(String... sourceNatActiveIps) {
            return sourceNatActiveIps(List.of(sourceNatActiveIps));
        }
        public Builder sourceNatDrainIps(@Nullable Output<List<String>> sourceNatDrainIps) {
            this.sourceNatDrainIps = sourceNatDrainIps;
            return this;
        }
        public Builder sourceNatDrainIps(@Nullable List<String> sourceNatDrainIps) {
            this.sourceNatDrainIps = Codegen.ofNullable(sourceNatDrainIps);
            return this;
        }
        public Builder sourceNatDrainIps(String... sourceNatDrainIps) {
            return sourceNatDrainIps(List.of(sourceNatDrainIps));
        }        public RouterNatRuleActionArgs build() {
            return new RouterNatRuleActionArgs(sourceNatActiveIps, sourceNatDrainIps);
        }
    }
}
