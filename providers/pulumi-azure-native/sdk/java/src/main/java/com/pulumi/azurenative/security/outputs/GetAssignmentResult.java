// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.outputs;

import com.pulumi.azurenative.security.outputs.AssignedComponentItemResponse;
import com.pulumi.azurenative.security.outputs.AssignedStandardItemResponse;
import com.pulumi.azurenative.security.outputs.AssignmentPropertiesResponseAdditionalData;
import com.pulumi.azurenative.security.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAssignmentResult {
    /**
     * Additional data about the assignment
     * 
     */
    private final @Nullable AssignmentPropertiesResponseAdditionalData additionalData;
    /**
     * Component item with key as applied to this standard assignment over the given scope
     * 
     */
    private final @Nullable AssignedComponentItemResponse assignedComponent;
    /**
     * Standard item with key as applied to this standard assignment over the given scope
     * 
     */
    private final @Nullable AssignedStandardItemResponse assignedStandard;
    /**
     * description of the standardAssignment
     * 
     */
    private final @Nullable String description;
    /**
     * display name of the standardAssignment
     * 
     */
    private final @Nullable String displayName;
    /**
     * expected effect of this assignment (Disable/Exempt/etc)
     * 
     */
    private final @Nullable String effect;
    /**
     * Entity tag is used for comparing two or more entities from the same requested resource.
     * 
     */
    private final @Nullable String etag;
    /**
     * Expiration date of this assignment as a full ISO date
     * 
     */
    private final @Nullable String expiresOn;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Kind of the resource
     * 
     */
    private final @Nullable String kind;
    /**
     * Location where the resource is stored
     * 
     */
    private final @Nullable String location;
    /**
     * The assignment metadata. Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    private final @Nullable Object metadata;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Scope to which the standardAssignment applies - can be a subscription path or a resource group under that subscription
     * 
     */
    private final @Nullable String scope;
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * A list of key value pairs that describe the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetAssignmentResult(
        @CustomType.Parameter("additionalData") @Nullable AssignmentPropertiesResponseAdditionalData additionalData,
        @CustomType.Parameter("assignedComponent") @Nullable AssignedComponentItemResponse assignedComponent,
        @CustomType.Parameter("assignedStandard") @Nullable AssignedStandardItemResponse assignedStandard,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("effect") @Nullable String effect,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("expiresOn") @Nullable String expiresOn,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("metadata") @Nullable Object metadata,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("scope") @Nullable String scope,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.additionalData = additionalData;
        this.assignedComponent = assignedComponent;
        this.assignedStandard = assignedStandard;
        this.description = description;
        this.displayName = displayName;
        this.effect = effect;
        this.etag = etag;
        this.expiresOn = expiresOn;
        this.id = id;
        this.kind = kind;
        this.location = location;
        this.metadata = metadata;
        this.name = name;
        this.scope = scope;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Additional data about the assignment
     * 
    */
    public Optional<AssignmentPropertiesResponseAdditionalData> additionalData() {
        return Optional.ofNullable(this.additionalData);
    }
    /**
     * Component item with key as applied to this standard assignment over the given scope
     * 
    */
    public Optional<AssignedComponentItemResponse> assignedComponent() {
        return Optional.ofNullable(this.assignedComponent);
    }
    /**
     * Standard item with key as applied to this standard assignment over the given scope
     * 
    */
    public Optional<AssignedStandardItemResponse> assignedStandard() {
        return Optional.ofNullable(this.assignedStandard);
    }
    /**
     * description of the standardAssignment
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * display name of the standardAssignment
     * 
    */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * expected effect of this assignment (Disable/Exempt/etc)
     * 
    */
    public Optional<String> effect() {
        return Optional.ofNullable(this.effect);
    }
    /**
     * Entity tag is used for comparing two or more entities from the same requested resource.
     * 
    */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Expiration date of this assignment as a full ISO date
     * 
    */
    public Optional<String> expiresOn() {
        return Optional.ofNullable(this.expiresOn);
    }
    /**
     * Resource Id
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Kind of the resource
     * 
    */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Location where the resource is stored
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The assignment metadata. Metadata is an open ended object and is typically a collection of key value pairs.
     * 
    */
    public Optional<Object> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * Resource name
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Scope to which the standardAssignment applies - can be a subscription path or a resource group under that subscription
     * 
    */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
    */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * A list of key value pairs that describe the resource.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssignmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AssignmentPropertiesResponseAdditionalData additionalData;
        private @Nullable AssignedComponentItemResponse assignedComponent;
        private @Nullable AssignedStandardItemResponse assignedStandard;
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable String effect;
        private @Nullable String etag;
        private @Nullable String expiresOn;
        private String id;
        private @Nullable String kind;
        private @Nullable String location;
        private @Nullable Object metadata;
        private String name;
        private @Nullable String scope;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssignmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalData = defaults.additionalData;
    	      this.assignedComponent = defaults.assignedComponent;
    	      this.assignedStandard = defaults.assignedStandard;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.effect = defaults.effect;
    	      this.etag = defaults.etag;
    	      this.expiresOn = defaults.expiresOn;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.scope = defaults.scope;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder additionalData(@Nullable AssignmentPropertiesResponseAdditionalData additionalData) {
            this.additionalData = additionalData;
            return this;
        }
        public Builder assignedComponent(@Nullable AssignedComponentItemResponse assignedComponent) {
            this.assignedComponent = assignedComponent;
            return this;
        }
        public Builder assignedStandard(@Nullable AssignedStandardItemResponse assignedStandard) {
            this.assignedStandard = assignedStandard;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder effect(@Nullable String effect) {
            this.effect = effect;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }
        public Builder expiresOn(@Nullable String expiresOn) {
            this.expiresOn = expiresOn;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder metadata(@Nullable Object metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetAssignmentResult build() {
            return new GetAssignmentResult(additionalData, assignedComponent, assignedStandard, description, displayName, effect, etag, expiresOn, id, kind, location, metadata, name, scope, systemData, tags, type);
        }
    }
}
