// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate;

import com.pulumi.azurenative.migrate.inputs.MigrateProjectPropertiesArgs;
import com.pulumi.azurenative.migrate.inputs.MigrateProjectTagsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MigrateProjectArgs extends ResourceArgs {

    public static final MigrateProjectArgs Empty = new MigrateProjectArgs();

    /**
     * Gets or sets the eTag for concurrency control.
     * 
     */
    @Import(name="eTag")
    private @Nullable Output<String> eTag;

    /**
     * @return Gets or sets the eTag for concurrency control.
     * 
     */
    public Optional<Output<String>> eTag() {
        return Optional.ofNullable(this.eTag);
    }

    /**
     * Gets or sets the Azure location in which migrate project is created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Gets or sets the Azure location in which migrate project is created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Name of the Azure Migrate project.
     * 
     */
    @Import(name="migrateProjectName")
    private @Nullable Output<String> migrateProjectName;

    /**
     * @return Name of the Azure Migrate project.
     * 
     */
    public Optional<Output<String>> migrateProjectName() {
        return Optional.ofNullable(this.migrateProjectName);
    }

    /**
     * Gets or sets the nested properties.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<MigrateProjectPropertiesArgs> properties;

    /**
     * @return Gets or sets the nested properties.
     * 
     */
    public Optional<Output<MigrateProjectPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Name of the Azure Resource Group that migrate project is part of.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the Azure Resource Group that migrate project is part of.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<MigrateProjectTagsArgs> tags;

    /**
     * @return Gets or sets the tags.
     * 
     */
    public Optional<Output<MigrateProjectTagsArgs>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private MigrateProjectArgs() {}

    private MigrateProjectArgs(MigrateProjectArgs $) {
        this.eTag = $.eTag;
        this.location = $.location;
        this.migrateProjectName = $.migrateProjectName;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MigrateProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MigrateProjectArgs $;

        public Builder() {
            $ = new MigrateProjectArgs();
        }

        public Builder(MigrateProjectArgs defaults) {
            $ = new MigrateProjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eTag Gets or sets the eTag for concurrency control.
         * 
         * @return builder
         * 
         */
        public Builder eTag(@Nullable Output<String> eTag) {
            $.eTag = eTag;
            return this;
        }

        /**
         * @param eTag Gets or sets the eTag for concurrency control.
         * 
         * @return builder
         * 
         */
        public Builder eTag(String eTag) {
            return eTag(Output.of(eTag));
        }

        /**
         * @param location Gets or sets the Azure location in which migrate project is created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Gets or sets the Azure location in which migrate project is created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param migrateProjectName Name of the Azure Migrate project.
         * 
         * @return builder
         * 
         */
        public Builder migrateProjectName(@Nullable Output<String> migrateProjectName) {
            $.migrateProjectName = migrateProjectName;
            return this;
        }

        /**
         * @param migrateProjectName Name of the Azure Migrate project.
         * 
         * @return builder
         * 
         */
        public Builder migrateProjectName(String migrateProjectName) {
            return migrateProjectName(Output.of(migrateProjectName));
        }

        /**
         * @param properties Gets or sets the nested properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<MigrateProjectPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Gets or sets the nested properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(MigrateProjectPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName Name of the Azure Resource Group that migrate project is part of.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Azure Resource Group that migrate project is part of.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags Gets or sets the tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<MigrateProjectTagsArgs> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Gets or sets the tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(MigrateProjectTagsArgs tags) {
            return tags(Output.of(tags));
        }

        public MigrateProjectArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
