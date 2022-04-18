// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GeoMatchSetGeoMatchConstraint {
    /**
     * The type of geographical area you want AWS WAF to search for. Currently Country is the only valid value.
     * 
     */
    private final String type;
    /**
     * The country that you want AWS WAF to search for.
     * This is the two-letter country code, e.g., `US`, `CA`, `RU`, `CN`, etc.
     * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchConstraint.html) for all supported values.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private GeoMatchSetGeoMatchConstraint(
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") String value) {
        this.type = type;
        this.value = value;
    }

    /**
     * The type of geographical area you want AWS WAF to search for. Currently Country is the only valid value.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The country that you want AWS WAF to search for.
     * This is the two-letter country code, e.g., `US`, `CA`, `RU`, `CN`, etc.
     * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchConstraint.html) for all supported values.
     * 
    */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GeoMatchSetGeoMatchConstraint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GeoMatchSetGeoMatchConstraint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GeoMatchSetGeoMatchConstraint build() {
            return new GeoMatchSetGeoMatchConstraint(type, value);
        }
    }
}
