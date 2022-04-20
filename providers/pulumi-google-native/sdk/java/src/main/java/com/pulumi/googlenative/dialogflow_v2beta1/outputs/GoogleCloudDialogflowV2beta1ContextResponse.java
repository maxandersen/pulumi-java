// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1ContextResponse {
    /**
     * Optional. The number of conversational query requests after which the context expires. The default is `0`. If set to `0`, the context expires immediately. Contexts expire automatically after 20 minutes if there are no matching queries.
     * 
     */
    private final Integer lifespanCount;
    /**
     * The unique identifier of the context. Supported formats: - `projects//agent/sessions//contexts/`, - `projects//locations//agent/sessions//contexts/`, - `projects//agent/environments//users//sessions//contexts/`, - `projects//locations//agent/environments//users//sessions//contexts/`, The `Context ID` is always converted to lowercase, may only contain characters in a-zA-Z0-9_-% and may be at most 250 bytes long. If `Environment ID` is not specified, we assume default &#39;draft&#39; environment. If `User ID` is not specified, we assume default &#39;-&#39; user. The following context names are reserved for internal use by Dialogflow. You should not use these contexts or create contexts with these names: * `__system_counters__` * `*_id_dialog_context` * `*_dialog_params_size`
     * 
     */
    private final String name;
    /**
     * Optional. The collection of parameters associated with this context. Depending on your protocol or client library language, this is a map, associative array, symbol table, dictionary, or JSON object composed of a collection of (MapKey, MapValue) pairs: - MapKey type: string - MapKey value: parameter name - MapValue type: - If parameter&#39;s entity type is a composite entity: map - Else: depending on parameter value type, could be one of string, number, boolean, null, list or map - MapValue value: - If parameter&#39;s entity type is a composite entity: map from composite entity property names to property values - Else: parameter value
     * 
     */
    private final Map<String,String> parameters;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2beta1ContextResponse(
        @CustomType.Parameter("lifespanCount") Integer lifespanCount,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") Map<String,String> parameters) {
        this.lifespanCount = lifespanCount;
        this.name = name;
        this.parameters = parameters;
    }

    /**
     * Optional. The number of conversational query requests after which the context expires. The default is `0`. If set to `0`, the context expires immediately. Contexts expire automatically after 20 minutes if there are no matching queries.
     * 
    */
    public Integer lifespanCount() {
        return this.lifespanCount;
    }
    /**
     * The unique identifier of the context. Supported formats: - `projects//agent/sessions//contexts/`, - `projects//locations//agent/sessions//contexts/`, - `projects//agent/environments//users//sessions//contexts/`, - `projects//locations//agent/environments//users//sessions//contexts/`, The `Context ID` is always converted to lowercase, may only contain characters in a-zA-Z0-9_-% and may be at most 250 bytes long. If `Environment ID` is not specified, we assume default &#39;draft&#39; environment. If `User ID` is not specified, we assume default &#39;-&#39; user. The following context names are reserved for internal use by Dialogflow. You should not use these contexts or create contexts with these names: * `__system_counters__` * `*_id_dialog_context` * `*_dialog_params_size`
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Optional. The collection of parameters associated with this context. Depending on your protocol or client library language, this is a map, associative array, symbol table, dictionary, or JSON object composed of a collection of (MapKey, MapValue) pairs: - MapKey type: string - MapKey value: parameter name - MapValue type: - If parameter&#39;s entity type is a composite entity: map - Else: depending on parameter value type, could be one of string, number, boolean, null, list or map - MapValue value: - If parameter&#39;s entity type is a composite entity: map from composite entity property names to property values - Else: parameter value
     * 
    */
    public Map<String,String> parameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1ContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer lifespanCount;
        private String name;
        private Map<String,String> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1ContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lifespanCount = defaults.lifespanCount;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder lifespanCount(Integer lifespanCount) {
            this.lifespanCount = Objects.requireNonNull(lifespanCount);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(Map<String,String> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }        public GoogleCloudDialogflowV2beta1ContextResponse build() {
            return new GoogleCloudDialogflowV2beta1ContextResponse(lifespanCount, name, parameters);
        }
    }
}
