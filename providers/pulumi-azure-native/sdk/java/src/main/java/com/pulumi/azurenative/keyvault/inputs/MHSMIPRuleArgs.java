// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.keyvault.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * A rule governing the accessibility of a managed hsm pool from a specific ip address or ip range.
 * 
 */
public final class MHSMIPRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final MHSMIPRuleArgs Empty = new MHSMIPRuleArgs();

    /**
     * An IPv4 address range in CIDR notation, such as &#39;124.56.78.91&#39; (simple IP address) or &#39;124.56.78.0/24&#39; (all addresses that start with 124.56.78).
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    public MHSMIPRuleArgs(Output<String> value) {
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private MHSMIPRuleArgs() {
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MHSMIPRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(MHSMIPRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public MHSMIPRuleArgs build() {
            return new MHSMIPRuleArgs(value);
        }
    }
}
