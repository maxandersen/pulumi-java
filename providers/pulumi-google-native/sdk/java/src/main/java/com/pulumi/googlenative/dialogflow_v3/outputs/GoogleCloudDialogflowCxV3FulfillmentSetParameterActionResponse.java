// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse {
    /**
     * @return Display name of the parameter.
     * 
     */
    private final String parameter;
    /**
     * @return The new value of the parameter. A null value clears the parameter.
     * 
     */
    private final Object value;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse(
        @CustomType.Parameter("parameter") String parameter,
        @CustomType.Parameter("value") Object value) {
        this.parameter = parameter;
        this.value = value;
    }

    /**
     * @return Display name of the parameter.
     * 
     */
    public String parameter() {
        return this.parameter;
    }
    /**
     * @return The new value of the parameter. A null value clears the parameter.
     * 
     */
    public Object value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String parameter;
        private Object value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameter = defaults.parameter;
    	      this.value = defaults.value;
        }

        public Builder parameter(String parameter) {
            this.parameter = Objects.requireNonNull(parameter);
            return this;
        }
        public Builder value(Object value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse build() {
            return new GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse(parameter, value);
        }
    }
}
