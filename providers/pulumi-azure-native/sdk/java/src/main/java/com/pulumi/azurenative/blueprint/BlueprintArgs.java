// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blueprint;

import com.pulumi.azurenative.blueprint.enums.BlueprintTargetScope;
import com.pulumi.azurenative.blueprint.inputs.ParameterDefinitionArgs;
import com.pulumi.azurenative.blueprint.inputs.ResourceGroupDefinitionArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BlueprintArgs extends ResourceArgs {

    public static final BlueprintArgs Empty = new BlueprintArgs();

    /**
     * Name of the blueprint definition.
     * 
     */
    @Import(name="blueprintName")
    private @Nullable Output<String> blueprintName;

    /**
     * @return Name of the blueprint definition.
     * 
     */
    public Optional<Output<String>> blueprintName() {
        return Optional.ofNullable(this.blueprintName);
    }

    /**
     * Multi-line explain this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Multi-line explain this resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * One-liner string explain this resource.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return One-liner string explain this resource.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Parameters required by this blueprint definition.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterDefinitionArgs>> parameters;

    /**
     * @return Parameters required by this blueprint definition.
     * 
     */
    public Optional<Output<Map<String,ParameterDefinitionArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Resource group placeholders defined by this blueprint definition.
     * 
     */
    @Import(name="resourceGroups")
    private @Nullable Output<Map<String,ResourceGroupDefinitionArgs>> resourceGroups;

    /**
     * @return Resource group placeholders defined by this blueprint definition.
     * 
     */
    public Optional<Output<Map<String,ResourceGroupDefinitionArgs>>> resourceGroups() {
        return Optional.ofNullable(this.resourceGroups);
    }

    /**
     * The scope of the resource. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;).
     * 
     */
    @Import(name="resourceScope", required=true)
    private Output<String> resourceScope;

    /**
     * @return The scope of the resource. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;).
     * 
     */
    public Output<String> resourceScope() {
        return this.resourceScope;
    }

    /**
     * The scope where this blueprint definition can be assigned.
     * 
     */
    @Import(name="targetScope", required=true)
    private Output<Either<String,BlueprintTargetScope>> targetScope;

    /**
     * @return The scope where this blueprint definition can be assigned.
     * 
     */
    public Output<Either<String,BlueprintTargetScope>> targetScope() {
        return this.targetScope;
    }

    /**
     * Published versions of this blueprint definition.
     * 
     */
    @Import(name="versions")
    private @Nullable Output<Object> versions;

    /**
     * @return Published versions of this blueprint definition.
     * 
     */
    public Optional<Output<Object>> versions() {
        return Optional.ofNullable(this.versions);
    }

    private BlueprintArgs() {}

    private BlueprintArgs(BlueprintArgs $) {
        this.blueprintName = $.blueprintName;
        this.description = $.description;
        this.displayName = $.displayName;
        this.parameters = $.parameters;
        this.resourceGroups = $.resourceGroups;
        this.resourceScope = $.resourceScope;
        this.targetScope = $.targetScope;
        this.versions = $.versions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BlueprintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlueprintArgs $;

        public Builder() {
            $ = new BlueprintArgs();
        }

        public Builder(BlueprintArgs defaults) {
            $ = new BlueprintArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blueprintName Name of the blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder blueprintName(@Nullable Output<String> blueprintName) {
            $.blueprintName = blueprintName;
            return this;
        }

        /**
         * @param blueprintName Name of the blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder blueprintName(String blueprintName) {
            return blueprintName(Output.of(blueprintName));
        }

        /**
         * @param description Multi-line explain this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Multi-line explain this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName One-liner string explain this resource.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName One-liner string explain this resource.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param parameters Parameters required by this blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,ParameterDefinitionArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Parameters required by this blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,ParameterDefinitionArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param resourceGroups Resource group placeholders defined by this blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroups(@Nullable Output<Map<String,ResourceGroupDefinitionArgs>> resourceGroups) {
            $.resourceGroups = resourceGroups;
            return this;
        }

        /**
         * @param resourceGroups Resource group placeholders defined by this blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroups(Map<String,ResourceGroupDefinitionArgs> resourceGroups) {
            return resourceGroups(Output.of(resourceGroups));
        }

        /**
         * @param resourceScope The scope of the resource. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;).
         * 
         * @return builder
         * 
         */
        public Builder resourceScope(Output<String> resourceScope) {
            $.resourceScope = resourceScope;
            return this;
        }

        /**
         * @param resourceScope The scope of the resource. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;).
         * 
         * @return builder
         * 
         */
        public Builder resourceScope(String resourceScope) {
            return resourceScope(Output.of(resourceScope));
        }

        /**
         * @param targetScope The scope where this blueprint definition can be assigned.
         * 
         * @return builder
         * 
         */
        public Builder targetScope(Output<Either<String,BlueprintTargetScope>> targetScope) {
            $.targetScope = targetScope;
            return this;
        }

        /**
         * @param targetScope The scope where this blueprint definition can be assigned.
         * 
         * @return builder
         * 
         */
        public Builder targetScope(Either<String,BlueprintTargetScope> targetScope) {
            return targetScope(Output.of(targetScope));
        }

        /**
         * @param targetScope The scope where this blueprint definition can be assigned.
         * 
         * @return builder
         * 
         */
        public Builder targetScope(String targetScope) {
            return targetScope(Either.ofLeft(targetScope));
        }

        /**
         * @param targetScope The scope where this blueprint definition can be assigned.
         * 
         * @return builder
         * 
         */
        public Builder targetScope(BlueprintTargetScope targetScope) {
            return targetScope(Either.ofRight(targetScope));
        }

        /**
         * @param versions Published versions of this blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder versions(@Nullable Output<Object> versions) {
            $.versions = versions;
            return this;
        }

        /**
         * @param versions Published versions of this blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder versions(Object versions) {
            return versions(Output.of(versions));
        }

        public BlueprintArgs build() {
            $.resourceScope = Objects.requireNonNull($.resourceScope, "expected parameter 'resourceScope' to be non-null");
            $.targetScope = Objects.requireNonNull($.targetScope, "expected parameter 'targetScope' to be non-null");
            return $;
        }
    }

}
