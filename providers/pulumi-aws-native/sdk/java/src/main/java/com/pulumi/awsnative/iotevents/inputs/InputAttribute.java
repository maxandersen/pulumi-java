// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The attributes from the JSON payload that are made available by the input. Inputs are derived from messages sent to the AWS IoT Events system using `BatchPutMessage`. Each such message contains a JSON payload, and those attributes (and their paired values) specified here are available for use in the `condition` expressions used by detectors that monitor this input.
 * 
 */
public final class InputAttribute extends com.pulumi.resources.InvokeArgs {

    public static final InputAttribute Empty = new InputAttribute();

    /**
     * An expression that specifies an attribute-value pair in a JSON structure. Use this to specify an attribute from the JSON payload that is made available by the input. Inputs are derived from messages sent to AWS IoT Events (`BatchPutMessage`). Each such message contains a JSON payload. The attribute (and its paired value) specified here are available for use in the `condition` expressions used by detectors.
     * 
     * _Syntax_: `&lt;field-name&gt;.&lt;field-name&gt;...`
     * 
     */
    @Import(name="jsonPath", required=true)
      private final String jsonPath;

    public String jsonPath() {
        return this.jsonPath;
    }

    public InputAttribute(String jsonPath) {
        this.jsonPath = Objects.requireNonNull(jsonPath, "expected parameter 'jsonPath' to be non-null");
    }

    private InputAttribute() {
        this.jsonPath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputAttribute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String jsonPath;

        public Builder() {
    	      // Empty
        }

        public Builder(InputAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jsonPath = defaults.jsonPath;
        }

        public Builder jsonPath(String jsonPath) {
            this.jsonPath = Objects.requireNonNull(jsonPath);
            return this;
        }        public InputAttribute build() {
            return new InputAttribute(jsonPath);
        }
    }
}
