// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights;

import com.pulumi.azurenative.customerinsights.enums.EntityType;
import com.pulumi.azurenative.customerinsights.enums.InstanceOperationType;
import com.pulumi.azurenative.customerinsights.inputs.ParticipantPropertyReferenceArgs;
import com.pulumi.azurenative.customerinsights.inputs.TypePropertiesMappingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinkArgs Empty = new LinkArgs();

    /**
     * Localized descriptions for the Link.
     * 
     */
    @Import(name="description")
    private @Nullable Output<Map<String,String>> description;

    public Optional<Output<Map<String,String>>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Localized display name for the Link.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<Map<String,String>> displayName;

    public Optional<Output<Map<String,String>>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The name of the hub.
     * 
     */
    @Import(name="hubName", required=true)
    private Output<String> hubName;

    public Output<String> hubName() {
        return this.hubName;
    }

    /**
     * The name of the link.
     * 
     */
    @Import(name="linkName")
    private @Nullable Output<String> linkName;

    public Optional<Output<String>> linkName() {
        return Optional.ofNullable(this.linkName);
    }

    /**
     * The set of properties mappings between the source and target Types.
     * 
     */
    @Import(name="mappings")
    private @Nullable Output<List<TypePropertiesMappingArgs>> mappings;

    public Optional<Output<List<TypePropertiesMappingArgs>>> mappings() {
        return Optional.ofNullable(this.mappings);
    }

    /**
     * Determines whether this link is supposed to create or delete instances if Link is NOT Reference Only.
     * 
     */
    @Import(name="operationType")
    private @Nullable Output<InstanceOperationType> operationType;

    public Optional<Output<InstanceOperationType>> operationType() {
        return Optional.ofNullable(this.operationType);
    }

    /**
     * The properties that represent the participating profile.
     * 
     */
    @Import(name="participantPropertyReferences", required=true)
    private Output<List<ParticipantPropertyReferenceArgs>> participantPropertyReferences;

    public Output<List<ParticipantPropertyReferenceArgs>> participantPropertyReferences() {
        return this.participantPropertyReferences;
    }

    /**
     * Indicating whether the link is reference only link. This flag is ignored if the Mappings are defined. If the mappings are not defined and it is set to true, links processing will not create or update profiles.
     * 
     */
    @Import(name="referenceOnly")
    private @Nullable Output<Boolean> referenceOnly;

    public Optional<Output<Boolean>> referenceOnly() {
        return Optional.ofNullable(this.referenceOnly);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Type of source entity.
     * 
     */
    @Import(name="sourceEntityType", required=true)
    private Output<EntityType> sourceEntityType;

    public Output<EntityType> sourceEntityType() {
        return this.sourceEntityType;
    }

    /**
     * Name of the source Entity Type.
     * 
     */
    @Import(name="sourceEntityTypeName", required=true)
    private Output<String> sourceEntityTypeName;

    public Output<String> sourceEntityTypeName() {
        return this.sourceEntityTypeName;
    }

    /**
     * Type of target entity.
     * 
     */
    @Import(name="targetEntityType", required=true)
    private Output<EntityType> targetEntityType;

    public Output<EntityType> targetEntityType() {
        return this.targetEntityType;
    }

    /**
     * Name of the target Entity Type.
     * 
     */
    @Import(name="targetEntityTypeName", required=true)
    private Output<String> targetEntityTypeName;

    public Output<String> targetEntityTypeName() {
        return this.targetEntityTypeName;
    }

    private LinkArgs() {}

    private LinkArgs(LinkArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.hubName = $.hubName;
        this.linkName = $.linkName;
        this.mappings = $.mappings;
        this.operationType = $.operationType;
        this.participantPropertyReferences = $.participantPropertyReferences;
        this.referenceOnly = $.referenceOnly;
        this.resourceGroupName = $.resourceGroupName;
        this.sourceEntityType = $.sourceEntityType;
        this.sourceEntityTypeName = $.sourceEntityTypeName;
        this.targetEntityType = $.targetEntityType;
        this.targetEntityTypeName = $.targetEntityTypeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkArgs $;

        public Builder() {
            $ = new LinkArgs();
        }

        public Builder(LinkArgs defaults) {
            $ = new LinkArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<Map<String,String>> description) {
            $.description = description;
            return this;
        }

        public Builder description(Map<String,String> description) {
            return description(Output.of(description));
        }

        public Builder displayName(@Nullable Output<Map<String,String>> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(Map<String,String> displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder hubName(Output<String> hubName) {
            $.hubName = hubName;
            return this;
        }

        public Builder hubName(String hubName) {
            return hubName(Output.of(hubName));
        }

        public Builder linkName(@Nullable Output<String> linkName) {
            $.linkName = linkName;
            return this;
        }

        public Builder linkName(String linkName) {
            return linkName(Output.of(linkName));
        }

        public Builder mappings(@Nullable Output<List<TypePropertiesMappingArgs>> mappings) {
            $.mappings = mappings;
            return this;
        }

        public Builder mappings(List<TypePropertiesMappingArgs> mappings) {
            return mappings(Output.of(mappings));
        }

        public Builder mappings(TypePropertiesMappingArgs... mappings) {
            return mappings(List.of(mappings));
        }

        public Builder operationType(@Nullable Output<InstanceOperationType> operationType) {
            $.operationType = operationType;
            return this;
        }

        public Builder operationType(InstanceOperationType operationType) {
            return operationType(Output.of(operationType));
        }

        public Builder participantPropertyReferences(Output<List<ParticipantPropertyReferenceArgs>> participantPropertyReferences) {
            $.participantPropertyReferences = participantPropertyReferences;
            return this;
        }

        public Builder participantPropertyReferences(List<ParticipantPropertyReferenceArgs> participantPropertyReferences) {
            return participantPropertyReferences(Output.of(participantPropertyReferences));
        }

        public Builder participantPropertyReferences(ParticipantPropertyReferenceArgs... participantPropertyReferences) {
            return participantPropertyReferences(List.of(participantPropertyReferences));
        }

        public Builder referenceOnly(@Nullable Output<Boolean> referenceOnly) {
            $.referenceOnly = referenceOnly;
            return this;
        }

        public Builder referenceOnly(Boolean referenceOnly) {
            return referenceOnly(Output.of(referenceOnly));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder sourceEntityType(Output<EntityType> sourceEntityType) {
            $.sourceEntityType = sourceEntityType;
            return this;
        }

        public Builder sourceEntityType(EntityType sourceEntityType) {
            return sourceEntityType(Output.of(sourceEntityType));
        }

        public Builder sourceEntityTypeName(Output<String> sourceEntityTypeName) {
            $.sourceEntityTypeName = sourceEntityTypeName;
            return this;
        }

        public Builder sourceEntityTypeName(String sourceEntityTypeName) {
            return sourceEntityTypeName(Output.of(sourceEntityTypeName));
        }

        public Builder targetEntityType(Output<EntityType> targetEntityType) {
            $.targetEntityType = targetEntityType;
            return this;
        }

        public Builder targetEntityType(EntityType targetEntityType) {
            return targetEntityType(Output.of(targetEntityType));
        }

        public Builder targetEntityTypeName(Output<String> targetEntityTypeName) {
            $.targetEntityTypeName = targetEntityTypeName;
            return this;
        }

        public Builder targetEntityTypeName(String targetEntityTypeName) {
            return targetEntityTypeName(Output.of(targetEntityTypeName));
        }

        public LinkArgs build() {
            $.hubName = Objects.requireNonNull($.hubName, "expected parameter 'hubName' to be non-null");
            $.participantPropertyReferences = Objects.requireNonNull($.participantPropertyReferences, "expected parameter 'participantPropertyReferences' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sourceEntityType = Objects.requireNonNull($.sourceEntityType, "expected parameter 'sourceEntityType' to be non-null");
            $.sourceEntityTypeName = Objects.requireNonNull($.sourceEntityTypeName, "expected parameter 'sourceEntityTypeName' to be non-null");
            $.targetEntityType = Objects.requireNonNull($.targetEntityType, "expected parameter 'targetEntityType' to be non-null");
            $.targetEntityTypeName = Objects.requireNonNull($.targetEntityTypeName, "expected parameter 'targetEntityTypeName' to be non-null");
            return $;
        }
    }

}
