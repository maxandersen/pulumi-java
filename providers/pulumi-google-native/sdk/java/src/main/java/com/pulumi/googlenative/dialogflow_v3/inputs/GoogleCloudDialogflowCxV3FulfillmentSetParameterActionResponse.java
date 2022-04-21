// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


/**
 * Setting a parameter value.
 * 
 */
public final class GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse Empty = new GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse();

    /**
     * Display name of the parameter.
     * 
     */
    @Import(name="parameter", required=true)
    private String parameter;

    public String parameter() {
        return this.parameter;
    }

    /**
     * The new value of the parameter. A null value clears the parameter.
     * 
     */
    @Import(name="value", required=true)
    private Object value;

    public Object value() {
        return this.value;
    }

    private GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse() {}

    private GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse(GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse $) {
        this.parameter = $.parameter;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse();
        }

        public Builder(GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse defaults) {
            $ = new GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse(Objects.requireNonNull(defaults));
        }

        public Builder parameter(String parameter) {
            $.parameter = parameter;
            return this;
        }

        public Builder value(Object value) {
            $.value = value;
            return this;
        }

        public GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse build() {
            $.parameter = Objects.requireNonNull($.parameter, "expected parameter 'parameter' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
