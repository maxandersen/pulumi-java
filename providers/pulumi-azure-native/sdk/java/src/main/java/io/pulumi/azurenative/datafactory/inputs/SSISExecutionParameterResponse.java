// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;


/**
 * SSIS execution parameter.
 * 
 */
public final class SSISExecutionParameterResponse extends io.pulumi.resources.InvokeArgs {

    public static final SSISExecutionParameterResponse Empty = new SSISExecutionParameterResponse();

    /**
     * SSIS package execution parameter value. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="value", required=true)
      private final Object value;

    public Object value() {
        return this.value;
    }

    public SSISExecutionParameterResponse(Object value) {
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private SSISExecutionParameterResponse() {
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SSISExecutionParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object value;

        public Builder() {
    	      // Empty
        }

        public Builder(SSISExecutionParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(Object value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public SSISExecutionParameterResponse build() {
            return new SSISExecutionParameterResponse(value);
        }
    }
}
