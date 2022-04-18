// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkspaceCustomBooleanParameterResponse {
    /**
     * The type of variable that this is
     * 
     */
    private final String type;
    /**
     * The value which should be used for this field.
     * 
     */
    private final Boolean value;

    @CustomType.Constructor
    private WorkspaceCustomBooleanParameterResponse(
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") Boolean value) {
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
    public Boolean value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceCustomBooleanParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private Boolean value;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceCustomBooleanParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(Boolean value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public WorkspaceCustomBooleanParameterResponse build() {
            return new WorkspaceCustomBooleanParameterResponse(type, value);
        }
    }
}
