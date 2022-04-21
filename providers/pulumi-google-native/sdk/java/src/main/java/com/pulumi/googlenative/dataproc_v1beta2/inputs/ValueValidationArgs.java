// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Validation based on a list of allowed values.
 * 
 */
public final class ValueValidationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ValueValidationArgs Empty = new ValueValidationArgs();

    /**
     * List of allowed values for the parameter.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values;
    }

    private ValueValidationArgs() {}

    private ValueValidationArgs(ValueValidationArgs $) {
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ValueValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ValueValidationArgs $;

        public Builder() {
            $ = new ValueValidationArgs();
        }

        public Builder(ValueValidationArgs defaults) {
            $ = new ValueValidationArgs(Objects.requireNonNull(defaults));
        }

        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ValueValidationArgs build() {
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
