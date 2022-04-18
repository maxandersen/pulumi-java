// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights;

import com.pulumi.azurenative.customerinsights.enums.EntityTypes;
import com.pulumi.azurenative.customerinsights.inputs.PropertyDefinitionArgs;
import com.pulumi.azurenative.customerinsights.inputs.StrongIdArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProfileArgs Empty = new ProfileArgs();

    /**
     * The api entity set name. This becomes the odata entity set name for the entity Type being referred in this object.
     * 
     */
    @Import(name="apiEntitySetName")
      private final @Nullable Output<String> apiEntitySetName;

    public Output<String> apiEntitySetName() {
        return this.apiEntitySetName == null ? Codegen.empty() : this.apiEntitySetName;
    }

    /**
     * The attributes for the Type.
     * 
     */
    @Import(name="attributes")
      private final @Nullable Output<Map<String,List<String>>> attributes;

    public Output<Map<String,List<String>>> attributes() {
        return this.attributes == null ? Codegen.empty() : this.attributes;
    }

    /**
     * Localized descriptions for the property.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<Map<String,String>> description;

    public Output<Map<String,String>> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Localized display names for the property.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<Map<String,String>> displayName;

    public Output<Map<String,String>> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * Type of entity.
     * 
     */
    @Import(name="entityType")
      private final @Nullable Output<EntityTypes> entityType;

    public Output<EntityTypes> entityType() {
        return this.entityType == null ? Codegen.empty() : this.entityType;
    }

    /**
     * The properties of the Profile.
     * 
     */
    @Import(name="fields")
      private final @Nullable Output<List<PropertyDefinitionArgs>> fields;

    public Output<List<PropertyDefinitionArgs>> fields() {
        return this.fields == null ? Codegen.empty() : this.fields;
    }

    /**
     * The name of the hub.
     * 
     */
    @Import(name="hubName", required=true)
      private final Output<String> hubName;

    public Output<String> hubName() {
        return this.hubName;
    }

    /**
     * The instance count.
     * 
     */
    @Import(name="instancesCount")
      private final @Nullable Output<Integer> instancesCount;

    public Output<Integer> instancesCount() {
        return this.instancesCount == null ? Codegen.empty() : this.instancesCount;
    }

    /**
     * Large Image associated with the Property or EntityType.
     * 
     */
    @Import(name="largeImage")
      private final @Nullable Output<String> largeImage;

    public Output<String> largeImage() {
        return this.largeImage == null ? Codegen.empty() : this.largeImage;
    }

    /**
     * Any custom localized attributes for the Type.
     * 
     */
    @Import(name="localizedAttributes")
      private final @Nullable Output<Map<String,Map<String,String>>> localizedAttributes;

    public Output<Map<String,Map<String,String>>> localizedAttributes() {
        return this.localizedAttributes == null ? Codegen.empty() : this.localizedAttributes;
    }

    /**
     * Medium Image associated with the Property or EntityType.
     * 
     */
    @Import(name="mediumImage")
      private final @Nullable Output<String> mediumImage;

    public Output<String> mediumImage() {
        return this.mediumImage == null ? Codegen.empty() : this.mediumImage;
    }

    /**
     * The name of the profile.
     * 
     */
    @Import(name="profileName")
      private final @Nullable Output<String> profileName;

    public Output<String> profileName() {
        return this.profileName == null ? Codegen.empty() : this.profileName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The schema org link. This helps ACI identify and suggest semantic models.
     * 
     */
    @Import(name="schemaItemTypeLink")
      private final @Nullable Output<String> schemaItemTypeLink;

    public Output<String> schemaItemTypeLink() {
        return this.schemaItemTypeLink == null ? Codegen.empty() : this.schemaItemTypeLink;
    }

    /**
     * Small Image associated with the Property or EntityType.
     * 
     */
    @Import(name="smallImage")
      private final @Nullable Output<String> smallImage;

    public Output<String> smallImage() {
        return this.smallImage == null ? Codegen.empty() : this.smallImage;
    }

    /**
     * The strong IDs.
     * 
     */
    @Import(name="strongIds")
      private final @Nullable Output<List<StrongIdArgs>> strongIds;

    public Output<List<StrongIdArgs>> strongIds() {
        return this.strongIds == null ? Codegen.empty() : this.strongIds;
    }

    /**
     * The timestamp property name. Represents the time when the interaction or profile update happened.
     * 
     */
    @Import(name="timestampFieldName")
      private final @Nullable Output<String> timestampFieldName;

    public Output<String> timestampFieldName() {
        return this.timestampFieldName == null ? Codegen.empty() : this.timestampFieldName;
    }

    /**
     * The name of the entity.
     * 
     */
    @Import(name="typeName")
      private final @Nullable Output<String> typeName;

    public Output<String> typeName() {
        return this.typeName == null ? Codegen.empty() : this.typeName;
    }

    public ProfileArgs(
        @Nullable Output<String> apiEntitySetName,
        @Nullable Output<Map<String,List<String>>> attributes,
        @Nullable Output<Map<String,String>> description,
        @Nullable Output<Map<String,String>> displayName,
        @Nullable Output<EntityTypes> entityType,
        @Nullable Output<List<PropertyDefinitionArgs>> fields,
        Output<String> hubName,
        @Nullable Output<Integer> instancesCount,
        @Nullable Output<String> largeImage,
        @Nullable Output<Map<String,Map<String,String>>> localizedAttributes,
        @Nullable Output<String> mediumImage,
        @Nullable Output<String> profileName,
        Output<String> resourceGroupName,
        @Nullable Output<String> schemaItemTypeLink,
        @Nullable Output<String> smallImage,
        @Nullable Output<List<StrongIdArgs>> strongIds,
        @Nullable Output<String> timestampFieldName,
        @Nullable Output<String> typeName) {
        this.apiEntitySetName = apiEntitySetName;
        this.attributes = attributes;
        this.description = description;
        this.displayName = displayName;
        this.entityType = entityType;
        this.fields = fields;
        this.hubName = Objects.requireNonNull(hubName, "expected parameter 'hubName' to be non-null");
        this.instancesCount = instancesCount;
        this.largeImage = largeImage;
        this.localizedAttributes = localizedAttributes;
        this.mediumImage = mediumImage;
        this.profileName = profileName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.schemaItemTypeLink = schemaItemTypeLink;
        this.smallImage = smallImage;
        this.strongIds = strongIds;
        this.timestampFieldName = timestampFieldName;
        this.typeName = typeName;
    }

    private ProfileArgs() {
        this.apiEntitySetName = Codegen.empty();
        this.attributes = Codegen.empty();
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.entityType = Codegen.empty();
        this.fields = Codegen.empty();
        this.hubName = Codegen.empty();
        this.instancesCount = Codegen.empty();
        this.largeImage = Codegen.empty();
        this.localizedAttributes = Codegen.empty();
        this.mediumImage = Codegen.empty();
        this.profileName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.schemaItemTypeLink = Codegen.empty();
        this.smallImage = Codegen.empty();
        this.strongIds = Codegen.empty();
        this.timestampFieldName = Codegen.empty();
        this.typeName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiEntitySetName;
        private @Nullable Output<Map<String,List<String>>> attributes;
        private @Nullable Output<Map<String,String>> description;
        private @Nullable Output<Map<String,String>> displayName;
        private @Nullable Output<EntityTypes> entityType;
        private @Nullable Output<List<PropertyDefinitionArgs>> fields;
        private Output<String> hubName;
        private @Nullable Output<Integer> instancesCount;
        private @Nullable Output<String> largeImage;
        private @Nullable Output<Map<String,Map<String,String>>> localizedAttributes;
        private @Nullable Output<String> mediumImage;
        private @Nullable Output<String> profileName;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> schemaItemTypeLink;
        private @Nullable Output<String> smallImage;
        private @Nullable Output<List<StrongIdArgs>> strongIds;
        private @Nullable Output<String> timestampFieldName;
        private @Nullable Output<String> typeName;

        public Builder() {
    	      // Empty
        }

        public Builder(ProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiEntitySetName = defaults.apiEntitySetName;
    	      this.attributes = defaults.attributes;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.entityType = defaults.entityType;
    	      this.fields = defaults.fields;
    	      this.hubName = defaults.hubName;
    	      this.instancesCount = defaults.instancesCount;
    	      this.largeImage = defaults.largeImage;
    	      this.localizedAttributes = defaults.localizedAttributes;
    	      this.mediumImage = defaults.mediumImage;
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.schemaItemTypeLink = defaults.schemaItemTypeLink;
    	      this.smallImage = defaults.smallImage;
    	      this.strongIds = defaults.strongIds;
    	      this.timestampFieldName = defaults.timestampFieldName;
    	      this.typeName = defaults.typeName;
        }

        public Builder apiEntitySetName(@Nullable Output<String> apiEntitySetName) {
            this.apiEntitySetName = apiEntitySetName;
            return this;
        }
        public Builder apiEntitySetName(@Nullable String apiEntitySetName) {
            this.apiEntitySetName = Codegen.ofNullable(apiEntitySetName);
            return this;
        }
        public Builder attributes(@Nullable Output<Map<String,List<String>>> attributes) {
            this.attributes = attributes;
            return this;
        }
        public Builder attributes(@Nullable Map<String,List<String>> attributes) {
            this.attributes = Codegen.ofNullable(attributes);
            return this;
        }
        public Builder description(@Nullable Output<Map<String,String>> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable Map<String,String> description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<Map<String,String>> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable Map<String,String> displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder entityType(@Nullable Output<EntityTypes> entityType) {
            this.entityType = entityType;
            return this;
        }
        public Builder entityType(@Nullable EntityTypes entityType) {
            this.entityType = Codegen.ofNullable(entityType);
            return this;
        }
        public Builder fields(@Nullable Output<List<PropertyDefinitionArgs>> fields) {
            this.fields = fields;
            return this;
        }
        public Builder fields(@Nullable List<PropertyDefinitionArgs> fields) {
            this.fields = Codegen.ofNullable(fields);
            return this;
        }
        public Builder fields(PropertyDefinitionArgs... fields) {
            return fields(List.of(fields));
        }
        public Builder hubName(Output<String> hubName) {
            this.hubName = Objects.requireNonNull(hubName);
            return this;
        }
        public Builder hubName(String hubName) {
            this.hubName = Output.of(Objects.requireNonNull(hubName));
            return this;
        }
        public Builder instancesCount(@Nullable Output<Integer> instancesCount) {
            this.instancesCount = instancesCount;
            return this;
        }
        public Builder instancesCount(@Nullable Integer instancesCount) {
            this.instancesCount = Codegen.ofNullable(instancesCount);
            return this;
        }
        public Builder largeImage(@Nullable Output<String> largeImage) {
            this.largeImage = largeImage;
            return this;
        }
        public Builder largeImage(@Nullable String largeImage) {
            this.largeImage = Codegen.ofNullable(largeImage);
            return this;
        }
        public Builder localizedAttributes(@Nullable Output<Map<String,Map<String,String>>> localizedAttributes) {
            this.localizedAttributes = localizedAttributes;
            return this;
        }
        public Builder localizedAttributes(@Nullable Map<String,Map<String,String>> localizedAttributes) {
            this.localizedAttributes = Codegen.ofNullable(localizedAttributes);
            return this;
        }
        public Builder mediumImage(@Nullable Output<String> mediumImage) {
            this.mediumImage = mediumImage;
            return this;
        }
        public Builder mediumImage(@Nullable String mediumImage) {
            this.mediumImage = Codegen.ofNullable(mediumImage);
            return this;
        }
        public Builder profileName(@Nullable Output<String> profileName) {
            this.profileName = profileName;
            return this;
        }
        public Builder profileName(@Nullable String profileName) {
            this.profileName = Codegen.ofNullable(profileName);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder schemaItemTypeLink(@Nullable Output<String> schemaItemTypeLink) {
            this.schemaItemTypeLink = schemaItemTypeLink;
            return this;
        }
        public Builder schemaItemTypeLink(@Nullable String schemaItemTypeLink) {
            this.schemaItemTypeLink = Codegen.ofNullable(schemaItemTypeLink);
            return this;
        }
        public Builder smallImage(@Nullable Output<String> smallImage) {
            this.smallImage = smallImage;
            return this;
        }
        public Builder smallImage(@Nullable String smallImage) {
            this.smallImage = Codegen.ofNullable(smallImage);
            return this;
        }
        public Builder strongIds(@Nullable Output<List<StrongIdArgs>> strongIds) {
            this.strongIds = strongIds;
            return this;
        }
        public Builder strongIds(@Nullable List<StrongIdArgs> strongIds) {
            this.strongIds = Codegen.ofNullable(strongIds);
            return this;
        }
        public Builder strongIds(StrongIdArgs... strongIds) {
            return strongIds(List.of(strongIds));
        }
        public Builder timestampFieldName(@Nullable Output<String> timestampFieldName) {
            this.timestampFieldName = timestampFieldName;
            return this;
        }
        public Builder timestampFieldName(@Nullable String timestampFieldName) {
            this.timestampFieldName = Codegen.ofNullable(timestampFieldName);
            return this;
        }
        public Builder typeName(@Nullable Output<String> typeName) {
            this.typeName = typeName;
            return this;
        }
        public Builder typeName(@Nullable String typeName) {
            this.typeName = Codegen.ofNullable(typeName);
            return this;
        }        public ProfileArgs build() {
            return new ProfileArgs(apiEntitySetName, attributes, description, displayName, entityType, fields, hubName, instancesCount, largeImage, localizedAttributes, mediumImage, profileName, resourceGroupName, schemaItemTypeLink, smallImage, strongIds, timestampFieldName, typeName);
        }
    }
}
