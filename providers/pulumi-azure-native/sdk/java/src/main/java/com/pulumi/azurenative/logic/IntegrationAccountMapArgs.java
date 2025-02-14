// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic;

import com.pulumi.azurenative.logic.enums.MapType;
import com.pulumi.azurenative.logic.inputs.IntegrationAccountMapPropertiesParametersSchemaArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationAccountMapArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationAccountMapArgs Empty = new IntegrationAccountMapArgs();

    /**
     * The content.
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    /**
     * @return The content.
     * 
     */
    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * The content type.
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    /**
     * @return The content type.
     * 
     */
    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * The integration account name.
     * 
     */
    @Import(name="integrationAccountName", required=true)
    private Output<String> integrationAccountName;

    /**
     * @return The integration account name.
     * 
     */
    public Output<String> integrationAccountName() {
        return this.integrationAccountName;
    }

    /**
     * The resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The integration account map name.
     * 
     */
    @Import(name="mapName")
    private @Nullable Output<String> mapName;

    /**
     * @return The integration account map name.
     * 
     */
    public Optional<Output<String>> mapName() {
        return Optional.ofNullable(this.mapName);
    }

    /**
     * The map type.
     * 
     */
    @Import(name="mapType", required=true)
    private Output<Either<String,MapType>> mapType;

    /**
     * @return The map type.
     * 
     */
    public Output<Either<String,MapType>> mapType() {
        return this.mapType;
    }

    /**
     * The metadata.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Object> metadata;

    /**
     * @return The metadata.
     * 
     */
    public Optional<Output<Object>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The parameters schema of integration account map.
     * 
     */
    @Import(name="parametersSchema")
    private @Nullable Output<IntegrationAccountMapPropertiesParametersSchemaArgs> parametersSchema;

    /**
     * @return The parameters schema of integration account map.
     * 
     */
    public Optional<Output<IntegrationAccountMapPropertiesParametersSchemaArgs>> parametersSchema() {
        return Optional.ofNullable(this.parametersSchema);
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private IntegrationAccountMapArgs() {}

    private IntegrationAccountMapArgs(IntegrationAccountMapArgs $) {
        this.content = $.content;
        this.contentType = $.contentType;
        this.integrationAccountName = $.integrationAccountName;
        this.location = $.location;
        this.mapName = $.mapName;
        this.mapType = $.mapType;
        this.metadata = $.metadata;
        this.parametersSchema = $.parametersSchema;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationAccountMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationAccountMapArgs $;

        public Builder() {
            $ = new IntegrationAccountMapArgs();
        }

        public Builder(IntegrationAccountMapArgs defaults) {
            $ = new IntegrationAccountMapArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param content The content.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The content.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param contentType The content type.
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType The content type.
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        /**
         * @param integrationAccountName The integration account name.
         * 
         * @return builder
         * 
         */
        public Builder integrationAccountName(Output<String> integrationAccountName) {
            $.integrationAccountName = integrationAccountName;
            return this;
        }

        /**
         * @param integrationAccountName The integration account name.
         * 
         * @return builder
         * 
         */
        public Builder integrationAccountName(String integrationAccountName) {
            return integrationAccountName(Output.of(integrationAccountName));
        }

        /**
         * @param location The resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param mapName The integration account map name.
         * 
         * @return builder
         * 
         */
        public Builder mapName(@Nullable Output<String> mapName) {
            $.mapName = mapName;
            return this;
        }

        /**
         * @param mapName The integration account map name.
         * 
         * @return builder
         * 
         */
        public Builder mapName(String mapName) {
            return mapName(Output.of(mapName));
        }

        /**
         * @param mapType The map type.
         * 
         * @return builder
         * 
         */
        public Builder mapType(Output<Either<String,MapType>> mapType) {
            $.mapType = mapType;
            return this;
        }

        /**
         * @param mapType The map type.
         * 
         * @return builder
         * 
         */
        public Builder mapType(Either<String,MapType> mapType) {
            return mapType(Output.of(mapType));
        }

        /**
         * @param mapType The map type.
         * 
         * @return builder
         * 
         */
        public Builder mapType(String mapType) {
            return mapType(Either.ofLeft(mapType));
        }

        /**
         * @param mapType The map type.
         * 
         * @return builder
         * 
         */
        public Builder mapType(MapType mapType) {
            return mapType(Either.ofRight(mapType));
        }

        /**
         * @param metadata The metadata.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Object> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata The metadata.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Object metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param parametersSchema The parameters schema of integration account map.
         * 
         * @return builder
         * 
         */
        public Builder parametersSchema(@Nullable Output<IntegrationAccountMapPropertiesParametersSchemaArgs> parametersSchema) {
            $.parametersSchema = parametersSchema;
            return this;
        }

        /**
         * @param parametersSchema The parameters schema of integration account map.
         * 
         * @return builder
         * 
         */
        public Builder parametersSchema(IntegrationAccountMapPropertiesParametersSchemaArgs parametersSchema) {
            return parametersSchema(Output.of(parametersSchema));
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags The resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public IntegrationAccountMapArgs build() {
            $.integrationAccountName = Objects.requireNonNull($.integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
            $.mapType = Objects.requireNonNull($.mapType, "expected parameter 'mapType' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
