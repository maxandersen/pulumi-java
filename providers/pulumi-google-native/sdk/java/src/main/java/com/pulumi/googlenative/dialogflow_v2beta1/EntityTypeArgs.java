// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2beta1.enums.EntityTypeAutoExpansionMode;
import com.pulumi.googlenative.dialogflow_v2beta1.enums.EntityTypeKind;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1EntityTypeEntityArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EntityTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final EntityTypeArgs Empty = new EntityTypeArgs();

    /**
     * Optional. Indicates whether the entity type can be automatically expanded.
     * 
     */
    @Import(name="autoExpansionMode")
    private @Nullable Output<EntityTypeAutoExpansionMode> autoExpansionMode;

    public Optional<Output<EntityTypeAutoExpansionMode>> autoExpansionMode() {
        return Optional.ofNullable(this.autoExpansionMode);
    }

    /**
     * The name of the entity type.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Optional. Enables fuzzy entity extraction during classification.
     * 
     */
    @Import(name="enableFuzzyExtraction")
    private @Nullable Output<Boolean> enableFuzzyExtraction;

    public Optional<Output<Boolean>> enableFuzzyExtraction() {
        return Optional.ofNullable(this.enableFuzzyExtraction);
    }

    /**
     * Optional. The collection of entity entries associated with the entity type.
     * 
     */
    @Import(name="entities")
    private @Nullable Output<List<GoogleCloudDialogflowV2beta1EntityTypeEntityArgs>> entities;

    public Optional<Output<List<GoogleCloudDialogflowV2beta1EntityTypeEntityArgs>>> entities() {
        return Optional.ofNullable(this.entities);
    }

    /**
     * Indicates the kind of entity type.
     * 
     */
    @Import(name="kind", required=true)
    private Output<EntityTypeKind> kind;

    public Output<EntityTypeKind> kind() {
        return this.kind;
    }

    @Import(name="languageCode")
    private @Nullable Output<String> languageCode;

    public Optional<Output<String>> languageCode() {
        return Optional.ofNullable(this.languageCode);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType and EntityTypes.BatchUpdateEntityTypes methods. Supported formats: - `projects//agent/entityTypes/` - `projects//locations//agent/entityTypes/`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private EntityTypeArgs() {}

    private EntityTypeArgs(EntityTypeArgs $) {
        this.autoExpansionMode = $.autoExpansionMode;
        this.displayName = $.displayName;
        this.enableFuzzyExtraction = $.enableFuzzyExtraction;
        this.entities = $.entities;
        this.kind = $.kind;
        this.languageCode = $.languageCode;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EntityTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EntityTypeArgs $;

        public Builder() {
            $ = new EntityTypeArgs();
        }

        public Builder(EntityTypeArgs defaults) {
            $ = new EntityTypeArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoExpansionMode(@Nullable Output<EntityTypeAutoExpansionMode> autoExpansionMode) {
            $.autoExpansionMode = autoExpansionMode;
            return this;
        }

        public Builder autoExpansionMode(EntityTypeAutoExpansionMode autoExpansionMode) {
            return autoExpansionMode(Output.of(autoExpansionMode));
        }

        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder enableFuzzyExtraction(@Nullable Output<Boolean> enableFuzzyExtraction) {
            $.enableFuzzyExtraction = enableFuzzyExtraction;
            return this;
        }

        public Builder enableFuzzyExtraction(Boolean enableFuzzyExtraction) {
            return enableFuzzyExtraction(Output.of(enableFuzzyExtraction));
        }

        public Builder entities(@Nullable Output<List<GoogleCloudDialogflowV2beta1EntityTypeEntityArgs>> entities) {
            $.entities = entities;
            return this;
        }

        public Builder entities(List<GoogleCloudDialogflowV2beta1EntityTypeEntityArgs> entities) {
            return entities(Output.of(entities));
        }

        public Builder entities(GoogleCloudDialogflowV2beta1EntityTypeEntityArgs... entities) {
            return entities(List.of(entities));
        }

        public Builder kind(Output<EntityTypeKind> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(EntityTypeKind kind) {
            return kind(Output.of(kind));
        }

        public Builder languageCode(@Nullable Output<String> languageCode) {
            $.languageCode = languageCode;
            return this;
        }

        public Builder languageCode(String languageCode) {
            return languageCode(Output.of(languageCode));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public EntityTypeArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            return $;
        }
    }

}
