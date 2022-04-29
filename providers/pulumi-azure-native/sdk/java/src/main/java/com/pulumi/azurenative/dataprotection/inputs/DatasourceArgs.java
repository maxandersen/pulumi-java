// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Datasource to be backed up
 * 
 */
public final class DatasourceArgs extends ResourceArgs {

    public static final DatasourceArgs Empty = new DatasourceArgs();

    /**
     * DatasourceType of the resource.
     * 
     */
    @Import(name="datasourceType")
    private @Nullable Output<String> datasourceType;

    /**
     * @return DatasourceType of the resource.
     * 
     */
    public Optional<Output<String>> datasourceType() {
        return Optional.ofNullable(this.datasourceType);
    }

    /**
     * Type of Datasource object, used to initialize the right inherited type
     * 
     */
    @Import(name="objectType")
    private @Nullable Output<String> objectType;

    /**
     * @return Type of Datasource object, used to initialize the right inherited type
     * 
     */
    public Optional<Output<String>> objectType() {
        return Optional.ofNullable(this.objectType);
    }

    /**
     * Full ARM ID of the resource. For azure resources, this is ARM ID. For non azure resources, this will be the ID created by backup service via Fabric/Vault.
     * 
     */
    @Import(name="resourceID", required=true)
    private Output<String> resourceID;

    /**
     * @return Full ARM ID of the resource. For azure resources, this is ARM ID. For non azure resources, this will be the ID created by backup service via Fabric/Vault.
     * 
     */
    public Output<String> resourceID() {
        return this.resourceID;
    }

    /**
     * Location of datasource.
     * 
     */
    @Import(name="resourceLocation")
    private @Nullable Output<String> resourceLocation;

    /**
     * @return Location of datasource.
     * 
     */
    public Optional<Output<String>> resourceLocation() {
        return Optional.ofNullable(this.resourceLocation);
    }

    /**
     * Unique identifier of the resource in the context of parent.
     * 
     */
    @Import(name="resourceName")
    private @Nullable Output<String> resourceName;

    /**
     * @return Unique identifier of the resource in the context of parent.
     * 
     */
    public Optional<Output<String>> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }

    /**
     * Resource Type of Datasource.
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    /**
     * @return Resource Type of Datasource.
     * 
     */
    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    /**
     * Uri of the resource.
     * 
     */
    @Import(name="resourceUri")
    private @Nullable Output<String> resourceUri;

    /**
     * @return Uri of the resource.
     * 
     */
    public Optional<Output<String>> resourceUri() {
        return Optional.ofNullable(this.resourceUri);
    }

    private DatasourceArgs() {}

    private DatasourceArgs(DatasourceArgs $) {
        this.datasourceType = $.datasourceType;
        this.objectType = $.objectType;
        this.resourceID = $.resourceID;
        this.resourceLocation = $.resourceLocation;
        this.resourceName = $.resourceName;
        this.resourceType = $.resourceType;
        this.resourceUri = $.resourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasourceArgs $;

        public Builder() {
            $ = new DatasourceArgs();
        }

        public Builder(DatasourceArgs defaults) {
            $ = new DatasourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datasourceType DatasourceType of the resource.
         * 
         * @return builder
         * 
         */
        public Builder datasourceType(@Nullable Output<String> datasourceType) {
            $.datasourceType = datasourceType;
            return this;
        }

        /**
         * @param datasourceType DatasourceType of the resource.
         * 
         * @return builder
         * 
         */
        public Builder datasourceType(String datasourceType) {
            return datasourceType(Output.of(datasourceType));
        }

        /**
         * @param objectType Type of Datasource object, used to initialize the right inherited type
         * 
         * @return builder
         * 
         */
        public Builder objectType(@Nullable Output<String> objectType) {
            $.objectType = objectType;
            return this;
        }

        /**
         * @param objectType Type of Datasource object, used to initialize the right inherited type
         * 
         * @return builder
         * 
         */
        public Builder objectType(String objectType) {
            return objectType(Output.of(objectType));
        }

        /**
         * @param resourceID Full ARM ID of the resource. For azure resources, this is ARM ID. For non azure resources, this will be the ID created by backup service via Fabric/Vault.
         * 
         * @return builder
         * 
         */
        public Builder resourceID(Output<String> resourceID) {
            $.resourceID = resourceID;
            return this;
        }

        /**
         * @param resourceID Full ARM ID of the resource. For azure resources, this is ARM ID. For non azure resources, this will be the ID created by backup service via Fabric/Vault.
         * 
         * @return builder
         * 
         */
        public Builder resourceID(String resourceID) {
            return resourceID(Output.of(resourceID));
        }

        /**
         * @param resourceLocation Location of datasource.
         * 
         * @return builder
         * 
         */
        public Builder resourceLocation(@Nullable Output<String> resourceLocation) {
            $.resourceLocation = resourceLocation;
            return this;
        }

        /**
         * @param resourceLocation Location of datasource.
         * 
         * @return builder
         * 
         */
        public Builder resourceLocation(String resourceLocation) {
            return resourceLocation(Output.of(resourceLocation));
        }

        /**
         * @param resourceName Unique identifier of the resource in the context of parent.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(@Nullable Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName Unique identifier of the resource in the context of parent.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        /**
         * @param resourceType Resource Type of Datasource.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType Resource Type of Datasource.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param resourceUri Uri of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceUri(@Nullable Output<String> resourceUri) {
            $.resourceUri = resourceUri;
            return this;
        }

        /**
         * @param resourceUri Uri of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceUri(String resourceUri) {
            return resourceUri(Output.of(resourceUri));
        }

        public DatasourceArgs build() {
            $.resourceID = Objects.requireNonNull($.resourceID, "expected parameter 'resourceID' to be non-null");
            return $;
        }
    }

}
