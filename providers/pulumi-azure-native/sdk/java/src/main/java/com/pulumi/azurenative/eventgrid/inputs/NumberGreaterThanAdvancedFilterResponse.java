// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * NumberGreaterThan Advanced Filter.
 * 
 */
public final class NumberGreaterThanAdvancedFilterResponse extends com.pulumi.resources.InvokeArgs {

    public static final NumberGreaterThanAdvancedFilterResponse Empty = new NumberGreaterThanAdvancedFilterResponse();

    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    @Import(name="key")
    private @Nullable String key;

    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is &#39;NumberGreaterThan&#39;.
     * 
     */
    @Import(name="operatorType", required=true)
    private String operatorType;

    public String operatorType() {
        return this.operatorType;
    }

    /**
     * The filter value.
     * 
     */
    @Import(name="value")
    private @Nullable Double value;

    public Optional<Double> value() {
        return Optional.ofNullable(this.value);
    }

    private NumberGreaterThanAdvancedFilterResponse() {}

    private NumberGreaterThanAdvancedFilterResponse(NumberGreaterThanAdvancedFilterResponse $) {
        this.key = $.key;
        this.operatorType = $.operatorType;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NumberGreaterThanAdvancedFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NumberGreaterThanAdvancedFilterResponse $;

        public Builder() {
            $ = new NumberGreaterThanAdvancedFilterResponse();
        }

        public Builder(NumberGreaterThanAdvancedFilterResponse defaults) {
            $ = new NumberGreaterThanAdvancedFilterResponse(Objects.requireNonNull(defaults));
        }

        public Builder key(@Nullable String key) {
            $.key = key;
            return this;
        }

        public Builder operatorType(String operatorType) {
            $.operatorType = operatorType;
            return this;
        }

        public Builder value(@Nullable Double value) {
            $.value = value;
            return this;
        }

        public NumberGreaterThanAdvancedFilterResponse build() {
            $.operatorType = Codegen.stringProp("operatorType").arg($.operatorType).require();
            return $;
        }
    }

}
