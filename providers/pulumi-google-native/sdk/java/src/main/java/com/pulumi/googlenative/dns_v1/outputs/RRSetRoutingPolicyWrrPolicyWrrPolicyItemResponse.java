// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse {
    private final String kind;
    private final List<String> rrdatas;
    /**
     * DNSSEC generated signatures for all the rrdata within this item. Note that if health checked targets are provided for DNSSEC enabled zones, there&#39;s a restriction of 1 ip per item. .
     * 
     */
    private final List<String> signatureRrdatas;
    /**
     * The weight corresponding to this subset of rrdata. When multiple WeightedRoundRobinPolicyItems are configured, the probability of returning an rrset is proportional to its weight relative to the sum of weights configured for all items. This weight should be non-negative.
     * 
     */
    private final Double weight;

    @CustomType.Constructor
    private RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse(
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("rrdatas") List<String> rrdatas,
        @CustomType.Parameter("signatureRrdatas") List<String> signatureRrdatas,
        @CustomType.Parameter("weight") Double weight) {
        this.kind = kind;
        this.rrdatas = rrdatas;
        this.signatureRrdatas = signatureRrdatas;
        this.weight = weight;
    }

    public String kind() {
        return this.kind;
    }
    public List<String> rrdatas() {
        return this.rrdatas;
    }
    /**
     * DNSSEC generated signatures for all the rrdata within this item. Note that if health checked targets are provided for DNSSEC enabled zones, there&#39;s a restriction of 1 ip per item. .
     * 
    */
    public List<String> signatureRrdatas() {
        return this.signatureRrdatas;
    }
    /**
     * The weight corresponding to this subset of rrdata. When multiple WeightedRoundRobinPolicyItems are configured, the probability of returning an rrset is proportional to its weight relative to the sum of weights configured for all items. This weight should be non-negative.
     * 
    */
    public Double weight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private List<String> rrdatas;
        private List<String> signatureRrdatas;
        private Double weight;

        public Builder() {
    	      // Empty
        }

        public Builder(RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.rrdatas = defaults.rrdatas;
    	      this.signatureRrdatas = defaults.signatureRrdatas;
    	      this.weight = defaults.weight;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder rrdatas(List<String> rrdatas) {
            this.rrdatas = Objects.requireNonNull(rrdatas);
            return this;
        }
        public Builder rrdatas(String... rrdatas) {
            return rrdatas(List.of(rrdatas));
        }
        public Builder signatureRrdatas(List<String> signatureRrdatas) {
            this.signatureRrdatas = Objects.requireNonNull(signatureRrdatas);
            return this;
        }
        public Builder signatureRrdatas(String... signatureRrdatas) {
            return signatureRrdatas(List.of(signatureRrdatas));
        }
        public Builder weight(Double weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }        public RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse build() {
            return new RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse(kind, rrdatas, signatureRrdatas, weight);
        }
    }
}
