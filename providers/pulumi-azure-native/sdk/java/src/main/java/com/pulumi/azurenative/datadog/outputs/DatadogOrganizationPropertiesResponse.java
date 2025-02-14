// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DatadogOrganizationPropertiesResponse {
    /**
     * @return Id of the Datadog organization.
     * 
     */
    private final String id;
    /**
     * @return Name of the Datadog organization.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private DatadogOrganizationPropertiesResponse(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * @return Id of the Datadog organization.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Name of the Datadog organization.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatadogOrganizationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DatadogOrganizationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public DatadogOrganizationPropertiesResponse build() {
            return new DatadogOrganizationPropertiesResponse(id, name);
        }
    }
}
