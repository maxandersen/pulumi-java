// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.amplifyuibuilder.inputs;

import java.util.Objects;


public final class ComponentVariantValues extends com.pulumi.resources.InvokeArgs {

    public static final ComponentVariantValues Empty = new ComponentVariantValues();

    public ComponentVariantValues() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentVariantValues defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentVariantValues defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public ComponentVariantValues build() {
            return new ComponentVariantValues();
        }
    }
}
