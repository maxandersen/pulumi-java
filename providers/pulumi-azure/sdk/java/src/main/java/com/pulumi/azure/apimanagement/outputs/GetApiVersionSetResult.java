// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApiVersionSetResult {
    private final String apiManagementName;
    /**
     * @return The description of API Version Set.
     * 
     */
    private final String description;
    /**
     * @return The display name of this API Version Set.
     * 
     */
    private final String displayName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final String resourceGroupName;
    /**
     * @return The name of the Header which should be read from Inbound Requests which defines the API Version.
     * 
     */
    private final String versionHeaderName;
    /**
     * @return The name of the Query String which should be read from Inbound Requests which defines the API Version.
     * 
     */
    private final String versionQueryName;
    private final String versioningScheme;

    @CustomType.Constructor
    private GetApiVersionSetResult(
        @CustomType.Parameter("apiManagementName") String apiManagementName,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("versionHeaderName") String versionHeaderName,
        @CustomType.Parameter("versionQueryName") String versionQueryName,
        @CustomType.Parameter("versioningScheme") String versioningScheme) {
        this.apiManagementName = apiManagementName;
        this.description = description;
        this.displayName = displayName;
        this.id = id;
        this.name = name;
        this.resourceGroupName = resourceGroupName;
        this.versionHeaderName = versionHeaderName;
        this.versionQueryName = versionQueryName;
        this.versioningScheme = versioningScheme;
    }

    public String apiManagementName() {
        return this.apiManagementName;
    }
    /**
     * @return The description of API Version Set.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The display name of this API Version Set.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The name of the Header which should be read from Inbound Requests which defines the API Version.
     * 
     */
    public String versionHeaderName() {
        return this.versionHeaderName;
    }
    /**
     * @return The name of the Query String which should be read from Inbound Requests which defines the API Version.
     * 
     */
    public String versionQueryName() {
        return this.versionQueryName;
    }
    public String versioningScheme() {
        return this.versioningScheme;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiVersionSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiManagementName;
        private String description;
        private String displayName;
        private String id;
        private String name;
        private String resourceGroupName;
        private String versionHeaderName;
        private String versionQueryName;
        private String versioningScheme;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiVersionSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiManagementName = defaults.apiManagementName;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.versionHeaderName = defaults.versionHeaderName;
    	      this.versionQueryName = defaults.versionQueryName;
    	      this.versioningScheme = defaults.versioningScheme;
        }

        public Builder apiManagementName(String apiManagementName) {
            this.apiManagementName = Objects.requireNonNull(apiManagementName);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder versionHeaderName(String versionHeaderName) {
            this.versionHeaderName = Objects.requireNonNull(versionHeaderName);
            return this;
        }
        public Builder versionQueryName(String versionQueryName) {
            this.versionQueryName = Objects.requireNonNull(versionQueryName);
            return this;
        }
        public Builder versioningScheme(String versioningScheme) {
            this.versioningScheme = Objects.requireNonNull(versioningScheme);
            return this;
        }        public GetApiVersionSetResult build() {
            return new GetApiVersionSetResult(apiManagementName, description, displayName, id, name, resourceGroupName, versionHeaderName, versionQueryName, versioningScheme);
        }
    }
}
