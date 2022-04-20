// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The integration account partner&#39;s business identity.
 * 
 */
public final class BusinessIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final BusinessIdentityArgs Empty = new BusinessIdentityArgs();

    /**
     * The business identity qualifier e.g. as2identity, ZZ, ZZZ, 31, 32
     * 
     */
    @Import(name="qualifier", required=true)
      private final Output<String> qualifier;

    public Output<String> qualifier() {
        return this.qualifier;
    }

    /**
     * The user defined business identity value.
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    public BusinessIdentityArgs(
        Output<String> qualifier,
        Output<String> value) {
        this.qualifier = Objects.requireNonNull(qualifier, "expected parameter 'qualifier' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private BusinessIdentityArgs() {
        this.qualifier = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BusinessIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> qualifier;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(BusinessIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.qualifier = defaults.qualifier;
    	      this.value = defaults.value;
        }

        public Builder qualifier(Output<String> qualifier) {
            this.qualifier = Objects.requireNonNull(qualifier);
            return this;
        }
        public Builder qualifier(String qualifier) {
            this.qualifier = Output.of(Objects.requireNonNull(qualifier));
            return this;
        }
        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public BusinessIdentityArgs build() {
            return new BusinessIdentityArgs(qualifier, value);
        }
    }
}
