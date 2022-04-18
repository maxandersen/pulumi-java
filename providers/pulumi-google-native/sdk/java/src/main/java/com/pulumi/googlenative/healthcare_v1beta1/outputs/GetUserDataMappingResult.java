// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.healthcare_v1beta1.outputs.AttributeResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetUserDataMappingResult {
    /**
     * Indicates the time when this mapping was archived.
     * 
     */
    private final String archiveTime;
    /**
     * Indicates whether this mapping is archived.
     * 
     */
    private final Boolean archived;
    /**
     * A unique identifier for the mapped resource.
     * 
     */
    private final String dataId;
    /**
     * Resource name of the User data mapping, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/userDataMappings/{user_data_mapping_id}`.
     * 
     */
    private final String name;
    /**
     * Attributes of the resource. Only explicitly set attributes are displayed here. Attribute definitions with defaults set implicitly apply to these User data mappings. Attributes listed here must be single valued, that is, exactly one value is specified for the field "values" in each Attribute.
     * 
     */
    private final List<AttributeResponse> resourceAttributes;
    /**
     * User's UUID provided by the client.
     * 
     */
    private final String userId;

    @CustomType.Constructor
    private GetUserDataMappingResult(
        @CustomType.Parameter("archiveTime") String archiveTime,
        @CustomType.Parameter("archived") Boolean archived,
        @CustomType.Parameter("dataId") String dataId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceAttributes") List<AttributeResponse> resourceAttributes,
        @CustomType.Parameter("userId") String userId) {
        this.archiveTime = archiveTime;
        this.archived = archived;
        this.dataId = dataId;
        this.name = name;
        this.resourceAttributes = resourceAttributes;
        this.userId = userId;
    }

    /**
     * Indicates the time when this mapping was archived.
     * 
    */
    public String archiveTime() {
        return this.archiveTime;
    }
    /**
     * Indicates whether this mapping is archived.
     * 
    */
    public Boolean archived() {
        return this.archived;
    }
    /**
     * A unique identifier for the mapped resource.
     * 
    */
    public String dataId() {
        return this.dataId;
    }
    /**
     * Resource name of the User data mapping, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/userDataMappings/{user_data_mapping_id}`.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Attributes of the resource. Only explicitly set attributes are displayed here. Attribute definitions with defaults set implicitly apply to these User data mappings. Attributes listed here must be single valued, that is, exactly one value is specified for the field "values" in each Attribute.
     * 
    */
    public List<AttributeResponse> resourceAttributes() {
        return this.resourceAttributes;
    }
    /**
     * User's UUID provided by the client.
     * 
    */
    public String userId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserDataMappingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String archiveTime;
        private Boolean archived;
        private String dataId;
        private String name;
        private List<AttributeResponse> resourceAttributes;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserDataMappingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveTime = defaults.archiveTime;
    	      this.archived = defaults.archived;
    	      this.dataId = defaults.dataId;
    	      this.name = defaults.name;
    	      this.resourceAttributes = defaults.resourceAttributes;
    	      this.userId = defaults.userId;
        }

        public Builder archiveTime(String archiveTime) {
            this.archiveTime = Objects.requireNonNull(archiveTime);
            return this;
        }
        public Builder archived(Boolean archived) {
            this.archived = Objects.requireNonNull(archived);
            return this;
        }
        public Builder dataId(String dataId) {
            this.dataId = Objects.requireNonNull(dataId);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceAttributes(List<AttributeResponse> resourceAttributes) {
            this.resourceAttributes = Objects.requireNonNull(resourceAttributes);
            return this;
        }
        public Builder resourceAttributes(AttributeResponse... resourceAttributes) {
            return resourceAttributes(List.of(resourceAttributes));
        }
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }        public GetUserDataMappingResult build() {
            return new GetUserDataMappingResult(archiveTime, archived, dataId, name, resourceAttributes, userId);
        }
    }
}
