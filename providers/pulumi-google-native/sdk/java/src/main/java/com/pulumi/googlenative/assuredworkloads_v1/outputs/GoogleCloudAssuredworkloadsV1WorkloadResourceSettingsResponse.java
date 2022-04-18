// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.assuredworkloads_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse {
    /**
     * User-assigned resource display name. If not empty it will be used to create a resource with the specified name.
     * 
     */
    private final String displayName;
    /**
     * Resource identifier. For a project this represents project_id. If the project is already taken, the workload creation will fail.
     * 
     */
    private final String resourceId;
    /**
     * Indicates the type of resource. This field should be specified to correspond the id to the right project type (CONSUMER_PROJECT or ENCRYPTION_KEYS_PROJECT)
     * 
     */
    private final String resourceType;

    @CustomType.Constructor
    private GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("resourceId") String resourceId,
        @CustomType.Parameter("resourceType") String resourceType) {
        this.displayName = displayName;
        this.resourceId = resourceId;
        this.resourceType = resourceType;
    }

    /**
     * User-assigned resource display name. If not empty it will be used to create a resource with the specified name.
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * Resource identifier. For a project this represents project_id. If the project is already taken, the workload creation will fail.
     * 
    */
    public String resourceId() {
        return this.resourceId;
    }
    /**
     * Indicates the type of resource. This field should be specified to correspond the id to the right project type (CONSUMER_PROJECT or ENCRYPTION_KEYS_PROJECT)
     * 
    */
    public String resourceType() {
        return this.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String resourceId;
        private String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.resourceId = defaults.resourceId;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }        public GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse build() {
            return new GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse(displayName, resourceId, resourceType);
        }
    }
}
