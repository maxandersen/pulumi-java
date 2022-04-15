// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.gameservices_v1.outputs.CustomFieldResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
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

    @CustomType.Constructor
    private CounterOptionsResponse(
        @CustomType.Parameter("customFields") List<CustomFieldResponse> customFields,
        @CustomType.Parameter("field") String field,
        @CustomType.Parameter("metric") String metric) {
        this.customFields = customFields;
        this.field = field;
        this.metric = metric;
    }

    /**
     * Custom fields.
     * 
    */
    public List<CustomFieldResponse> customFields() {
        return this.customFields;
    }
    /**
     * The field value to attribute.
     * 
    */
    public String field() {
        return this.field;
    }
    /**
     * The metric to update.
     * 
    */
    public String metric() {
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

        public Builder customFields(List<CustomFieldResponse> customFields) {
            this.customFields = Objects.requireNonNull(customFields);
            return this;
        }
        public Builder customFields(CustomFieldResponse... customFields) {
            return customFields(List.of(customFields));
        }
        public Builder field(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }
        public Builder metric(String metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }        public CounterOptionsResponse build() {
            return new CounterOptionsResponse(customFields, field, metric);
        }
    }
}
