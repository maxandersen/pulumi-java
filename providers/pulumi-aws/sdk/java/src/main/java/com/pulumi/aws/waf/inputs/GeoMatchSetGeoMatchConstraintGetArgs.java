// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GeoMatchSetGeoMatchConstraintGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GeoMatchSetGeoMatchConstraintGetArgs Empty = new GeoMatchSetGeoMatchConstraintGetArgs();

    /**
     * The type of geographical area you want AWS WAF to search for. Currently Country is the only valid value.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * The country that you want AWS WAF to search for.
     * This is the two-letter country code, e.g., `US`, `CA`, `RU`, `CN`, etc.
     * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchConstraint.html) for all supported values.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private GeoMatchSetGeoMatchConstraintGetArgs() {}

    private GeoMatchSetGeoMatchConstraintGetArgs(GeoMatchSetGeoMatchConstraintGetArgs $) {
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GeoMatchSetGeoMatchConstraintGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GeoMatchSetGeoMatchConstraintGetArgs $;

        public Builder() {
            $ = new GeoMatchSetGeoMatchConstraintGetArgs();
        }

        public Builder(GeoMatchSetGeoMatchConstraintGetArgs defaults) {
            $ = new GeoMatchSetGeoMatchConstraintGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GeoMatchSetGeoMatchConstraintGetArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
