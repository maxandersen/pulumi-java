// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.keyvault.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MHSMIPRuleResponse {
    /**
     * An IPv4 address range in CIDR notation, such as &#39;124.56.78.91&#39; (simple IP address) or &#39;124.56.78.0/24&#39; (all addresses that start with 124.56.78).
     * 
     */
    private final String value;

    @CustomType.Constructor
    private MHSMIPRuleResponse(@CustomType.Parameter("value") String value) {
        this.value = value;
    }

    /**
     * An IPv4 address range in CIDR notation, such as &#39;124.56.78.91&#39; (simple IP address) or &#39;124.56.78.0/24&#39; (all addresses that start with 124.56.78).
     * 
    */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MHSMIPRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(MHSMIPRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public MHSMIPRuleResponse build() {
            return new MHSMIPRuleResponse(value);
        }
    }
}
