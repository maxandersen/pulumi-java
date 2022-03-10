// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.gameservices_v1.outputs.CustomFieldResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class CounterOptionsResponse {
    /**
     * Custom fields.
     * 
     */
    private final List<CustomFieldResponse> customFields;
    /**
     * The field value to attribute.
     * 
     */
    private final String field;
    /**
     * The metric to update.
     * 
     */
    private final String metric;

    @OutputCustomType.Constructor
    private CounterOptionsResponse(
        @OutputCustomType.Parameter("customFields") List<CustomFieldResponse> customFields,
        @OutputCustomType.Parameter("field") String field,
        @OutputCustomType.Parameter("metric") String metric) {
        this.customFields = customFields;
        this.field = field;
        this.metric = metric;
    }

    /**
     * Custom fields.
     * 
    */
    public List<CustomFieldResponse> getCustomFields() {
        return this.customFields;
    }
    /**
     * The field value to attribute.
     * 
    */
    public String getField() {
        return this.field;
    }
    /**
     * The metric to update.
     * 
    */
    public String getMetric() {
        return this.metric;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CounterOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<CustomFieldResponse> customFields;
        private String field;
        private String metric;

        public Builder() {
    	      // Empty
        }

        public Builder(CounterOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customFields = defaults.customFields;
    	      this.field = defaults.field;
    	      this.metric = defaults.metric;
        }

        public Builder setCustomFields(List<CustomFieldResponse> customFields) {
            this.customFields = Objects.requireNonNull(customFields);
            return this;
        }

        public Builder setField(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }

        public Builder setMetric(String metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }
        public CounterOptionsResponse build() {
            return new CounterOptionsResponse(customFields, field, metric);
        }
    }
}
