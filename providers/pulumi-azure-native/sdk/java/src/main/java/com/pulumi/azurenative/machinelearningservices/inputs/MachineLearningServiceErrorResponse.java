// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.ErrorResponseResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Wrapper for error response to follow ARM guidelines.
 * 
 */
public final class MachineLearningServiceErrorResponse extends com.pulumi.resources.InvokeArgs {

    public static final MachineLearningServiceErrorResponse Empty = new MachineLearningServiceErrorResponse();

    /**
     * The error response.
     * 
     */
    @Import(name="error", required=true)
    private ErrorResponseResponse error;

    public ErrorResponseResponse error() {
        return this.error;
    }

    private MachineLearningServiceErrorResponse() {}

    private MachineLearningServiceErrorResponse(MachineLearningServiceErrorResponse $) {
        this.error = $.error;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MachineLearningServiceErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MachineLearningServiceErrorResponse $;

        public Builder() {
            $ = new MachineLearningServiceErrorResponse();
        }

        public Builder(MachineLearningServiceErrorResponse defaults) {
            $ = new MachineLearningServiceErrorResponse(Objects.requireNonNull(defaults));
        }

        public Builder error(ErrorResponseResponse error) {
            $.error = error;
            return this;
        }

        public MachineLearningServiceErrorResponse build() {
            $.error = Objects.requireNonNull($.error, "expected parameter 'error' to be non-null");
            return $;
        }
    }

}
