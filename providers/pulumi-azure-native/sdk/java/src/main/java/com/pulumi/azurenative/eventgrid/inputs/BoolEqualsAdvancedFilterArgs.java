// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * BoolEquals Advanced Filter.
 * 
 */
public final class BoolEqualsAdvancedFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final BoolEqualsAdvancedFilterArgs Empty = new BoolEqualsAdvancedFilterArgs();

    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is &#39;BoolEquals&#39;.
     * 
     */
    @Import(name="operatorType", required=true)
    private Output<String> operatorType;

    public Output<String> operatorType() {
        return this.operatorType;
    }

    /**
     * The boolean filter value.
     * 
     */
    @Import(name="value")
    private @Nullable Output<Boolean> value;

    public Optional<Output<Boolean>> value() {
        return Optional.ofNullable(this.value);
    }

    private BoolEqualsAdvancedFilterArgs() {}

    private BoolEqualsAdvancedFilterArgs(BoolEqualsAdvancedFilterArgs $) {
        this.key = $.key;
        this.operatorType = $.operatorType;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BoolEqualsAdvancedFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BoolEqualsAdvancedFilterArgs $;

        public Builder() {
            $ = new BoolEqualsAdvancedFilterArgs();
        }

        public Builder(BoolEqualsAdvancedFilterArgs defaults) {
            $ = new BoolEqualsAdvancedFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder operatorType(Output<String> operatorType) {
            $.operatorType = operatorType;
            return this;
        }

        public Builder operatorType(String operatorType) {
            return operatorType(Output.of(operatorType));
        }

        public Builder value(@Nullable Output<Boolean> value) {
            $.value = value;
            return this;
        }

        public Builder value(Boolean value) {
            return value(Output.of(value));
        }

        public BoolEqualsAdvancedFilterArgs build() {
            $.operatorType = Codegen.stringProp("operatorType").output().arg($.operatorType).require();
            return $;
        }
    }

}
