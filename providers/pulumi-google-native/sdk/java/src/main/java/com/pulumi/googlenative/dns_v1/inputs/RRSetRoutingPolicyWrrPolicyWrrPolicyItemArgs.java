// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A routing block which contains the routing information for one WRR item.
 * 
 */
public final class RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs Empty = new RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs();

    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    @Import(name="rrdatas")
      private final @Nullable Output<List<String>> rrdatas;

    public Output<List<String>> rrdatas() {
        return this.rrdatas == null ? Codegen.empty() : this.rrdatas;
    }

    /**
     * DNSSEC generated signatures for all the rrdata within this item. Note that if health checked targets are provided for DNSSEC enabled zones, there's a restriction of 1 ip per item. .
     * 
     */
    @Import(name="signatureRrdatas")
      private final @Nullable Output<List<String>> signatureRrdatas;

    public Output<List<String>> signatureRrdatas() {
        return this.signatureRrdatas == null ? Codegen.empty() : this.signatureRrdatas;
    }

    /**
     * The weight corresponding to this subset of rrdata. When multiple WeightedRoundRobinPolicyItems are configured, the probability of returning an rrset is proportional to its weight relative to the sum of weights configured for all items. This weight should be non-negative.
     * 
     */
    @Import(name="weight")
      private final @Nullable Output<Double> weight;

    public Output<Double> weight() {
        return this.weight == null ? Codegen.empty() : this.weight;
    }

    public RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs(
        @Nullable Output<String> kind,
        @Nullable Output<List<String>> rrdatas,
        @Nullable Output<List<String>> signatureRrdatas,
        @Nullable Output<Double> weight) {
        this.kind = kind;
        this.rrdatas = rrdatas;
        this.signatureRrdatas = signatureRrdatas;
        this.weight = weight;
    }

    private RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs() {
        this.kind = Codegen.empty();
        this.rrdatas = Codegen.empty();
        this.signatureRrdatas = Codegen.empty();
        this.weight = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kind;
        private @Nullable Output<List<String>> rrdatas;
        private @Nullable Output<List<String>> signatureRrdatas;
        private @Nullable Output<Double> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.rrdatas = defaults.rrdatas;
    	      this.signatureRrdatas = defaults.signatureRrdatas;
    	      this.weight = defaults.weight;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder rrdatas(@Nullable Output<List<String>> rrdatas) {
            this.rrdatas = rrdatas;
            return this;
        }
        public Builder rrdatas(@Nullable List<String> rrdatas) {
            this.rrdatas = Codegen.ofNullable(rrdatas);
            return this;
        }
        public Builder rrdatas(String... rrdatas) {
            return rrdatas(List.of(rrdatas));
        }
        public Builder signatureRrdatas(@Nullable Output<List<String>> signatureRrdatas) {
            this.signatureRrdatas = signatureRrdatas;
            return this;
        }
        public Builder signatureRrdatas(@Nullable List<String> signatureRrdatas) {
            this.signatureRrdatas = Codegen.ofNullable(signatureRrdatas);
            return this;
        }
        public Builder signatureRrdatas(String... signatureRrdatas) {
            return signatureRrdatas(List.of(signatureRrdatas));
        }
        public Builder weight(@Nullable Output<Double> weight) {
            this.weight = weight;
            return this;
        }
        public Builder weight(@Nullable Double weight) {
            this.weight = Codegen.ofNullable(weight);
            return this;
        }        public RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs build() {
            return new RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs(kind, rrdatas, signatureRrdatas, weight);
        }
    }
}
