// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a selector for extracting and matching an MSH field to a value.
 * 
 */
public final class VersionSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final VersionSourceResponse Empty = new VersionSourceResponse();

    /**
     * The field to extract from the MSH segment. For example, &#34;3.1&#34; or &#34;18[1].1&#34;.
     * 
     */
    @Import(name="mshField", required=true)
      private final String mshField;

    public String mshField() {
        return this.mshField;
    }

    /**
     * The value to match with the field. For example, &#34;My Application Name&#34; or &#34;2.3&#34;.
     * 
     */
    @Import(name="value", required=true)
      private final String value;

    public String value() {
        return this.value;
    }

    public VersionSourceResponse(
        String mshField,
        String value) {
        this.mshField = Objects.requireNonNull(mshField, "expected parameter 'mshField' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private VersionSourceResponse() {
        this.mshField = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VersionSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mshField;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(VersionSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mshField = defaults.mshField;
    	      this.value = defaults.value;
        }

        public Builder mshField(String mshField) {
            this.mshField = Objects.requireNonNull(mshField);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public VersionSourceResponse build() {
            return new VersionSourceResponse(mshField, value);
        }
    }
}
