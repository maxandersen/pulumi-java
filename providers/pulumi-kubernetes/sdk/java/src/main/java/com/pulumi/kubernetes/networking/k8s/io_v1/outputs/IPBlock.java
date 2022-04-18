// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.k8s.io_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class IPBlock {
    /**
     * CIDR is a string representing the IP Block Valid examples are "192.168.1.1/24" or "2001:db9::/64"
     * 
     */
    private final String cidr;
    /**
     * Except is a slice of CIDRs that should not be included within an IP Block Valid examples are "192.168.1.1/24" or "2001:db9::/64" Except values will be rejected if they are outside the CIDR range
     * 
     */
    private final @Nullable List<String> except;

    @CustomType.Constructor
    private IPBlock(
        @CustomType.Parameter("cidr") String cidr,
        @CustomType.Parameter("except") @Nullable List<String> except) {
        this.cidr = cidr;
        this.except = except;
    }

    /**
     * CIDR is a string representing the IP Block Valid examples are "192.168.1.1/24" or "2001:db9::/64"
     * 
    */
    public String cidr() {
        return this.cidr;
    }
    /**
     * Except is a slice of CIDRs that should not be included within an IP Block Valid examples are "192.168.1.1/24" or "2001:db9::/64" Except values will be rejected if they are outside the CIDR range
     * 
    */
    public List<String> except() {
        return this.except == null ? List.of() : this.except;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPBlock defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cidr;
        private @Nullable List<String> except;

        public Builder() {
    	      // Empty
        }

        public Builder(IPBlock defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.except = defaults.except;
        }

        public Builder cidr(String cidr) {
            this.cidr = Objects.requireNonNull(cidr);
            return this;
        }
        public Builder except(@Nullable List<String> except) {
            this.except = except;
            return this;
        }
        public Builder except(String... except) {
            return except(List.of(except));
        }        public IPBlock build() {
            return new IPBlock(cidr, except);
        }
    }
}
