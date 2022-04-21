// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Different types of filters supported and its values.
 * 
 */
public final class FilterablePropertyResponse extends com.pulumi.resources.InvokeArgs {

    public static final FilterablePropertyResponse Empty = new FilterablePropertyResponse();

    /**
     * Values to be filtered.
     * 
     */
    @Import(name="supportedValues", required=true)
    private List<String> supportedValues;

    public List<String> supportedValues() {
        return this.supportedValues;
    }

    /**
     * Type of product filter.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private FilterablePropertyResponse() {}

    private FilterablePropertyResponse(FilterablePropertyResponse $) {
        this.supportedValues = $.supportedValues;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FilterablePropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FilterablePropertyResponse $;

        public Builder() {
            $ = new FilterablePropertyResponse();
        }

        public Builder(FilterablePropertyResponse defaults) {
            $ = new FilterablePropertyResponse(Objects.requireNonNull(defaults));
        }

        public Builder supportedValues(List<String> supportedValues) {
            $.supportedValues = supportedValues;
            return this;
        }

        public Builder supportedValues(String... supportedValues) {
            return supportedValues(List.of(supportedValues));
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public FilterablePropertyResponse build() {
            $.supportedValues = Objects.requireNonNull($.supportedValues, "expected parameter 'supportedValues' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
