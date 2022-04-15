// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkspaceCustomStringParameterResponse {
    /**
     * The type of variable that this is
     * 
     */
    private final String type;
    /**
     * The value which should be used for this field.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private WorkspaceCustomStringParameterResponse(
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") String value) {
        this.type = type;
        this.value = value;
    }

    /**
     * The type of variable that this is
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The value which should be used for this field.
     * 
    */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceCustomStringParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceCustomStringParameterResponse defaults) {
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
        }        public WorkspaceCustomStringParameterResponse build() {
            return new WorkspaceCustomStringParameterResponse(type, value);
        }
    }
}
