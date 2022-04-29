// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights;

import com.pulumi.azurenative.operationalinsights.enums.PublicNetworkAccessType;
import com.pulumi.azurenative.operationalinsights.enums.WorkspaceEntityStatus;
import com.pulumi.azurenative.operationalinsights.inputs.WorkspaceCappingArgs;
import com.pulumi.azurenative.operationalinsights.inputs.WorkspaceFeaturesArgs;
import com.pulumi.azurenative.operationalinsights.inputs.WorkspaceSkuArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkspaceArgs extends ResourceArgs {

    public static final WorkspaceArgs Empty = new WorkspaceArgs();

    /**
     * The ETag of the workspace.
     * 
     */
    @Import(name="eTag")
    private @Nullable Output<String> eTag;

    /**
     * @return The ETag of the workspace.
     * 
     */
    public Optional<Output<String>> eTag() {
        return Optional.ofNullable(this.eTag);
    }

    /**
     * Workspace features.
     * 
     */
    @Import(name="features")
    private @Nullable Output<WorkspaceFeaturesArgs> features;

    /**
     * @return Workspace features.
     * 
     */
    public Optional<Output<WorkspaceFeaturesArgs>> features() {
        return Optional.ofNullable(this.features);
    }

    /**
     * Indicates whether customer managed storage is mandatory for query management.
     * 
     */
    @Import(name="forceCmkForQuery")
    private @Nullable Output<Boolean> forceCmkForQuery;

    /**
     * @return Indicates whether customer managed storage is mandatory for query management.
     * 
     */
    public Optional<Output<Boolean>> forceCmkForQuery() {
        return Optional.ofNullable(this.forceCmkForQuery);
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The provisioning state of the workspace.
     * 
     */
    @Import(name="provisioningState")
    private @Nullable Output<Either<String,WorkspaceEntityStatus>> provisioningState;

    /**
     * @return The provisioning state of the workspace.
     * 
     */
    public Optional<Output<Either<String,WorkspaceEntityStatus>>> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    /**
     * The network access type for accessing Log Analytics ingestion.
     * 
     */
    @Import(name="publicNetworkAccessForIngestion")
    private @Nullable Output<Either<String,PublicNetworkAccessType>> publicNetworkAccessForIngestion;

    /**
     * @return The network access type for accessing Log Analytics ingestion.
     * 
     */
    public Optional<Output<Either<String,PublicNetworkAccessType>>> publicNetworkAccessForIngestion() {
        return Optional.ofNullable(this.publicNetworkAccessForIngestion);
    }

    /**
     * The network access type for accessing Log Analytics query.
     * 
     */
    @Import(name="publicNetworkAccessForQuery")
    private @Nullable Output<Either<String,PublicNetworkAccessType>> publicNetworkAccessForQuery;

    /**
     * @return The network access type for accessing Log Analytics query.
     * 
     */
    public Optional<Output<Either<String,PublicNetworkAccessType>>> publicNetworkAccessForQuery() {
        return Optional.ofNullable(this.publicNetworkAccessForQuery);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The workspace data retention in days. Allowed values are per pricing plan. See pricing tiers documentation for details.
     * 
     */
    @Import(name="retentionInDays")
    private @Nullable Output<Integer> retentionInDays;

    /**
     * @return The workspace data retention in days. Allowed values are per pricing plan. See pricing tiers documentation for details.
     * 
     */
    public Optional<Output<Integer>> retentionInDays() {
        return Optional.ofNullable(this.retentionInDays);
    }

    /**
     * The SKU of the workspace.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<WorkspaceSkuArgs> sku;

    /**
     * @return The SKU of the workspace.
     * 
     */
    public Optional<Output<WorkspaceSkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The daily volume cap for ingestion.
     * 
     */
    @Import(name="workspaceCapping")
    private @Nullable Output<WorkspaceCappingArgs> workspaceCapping;

    /**
     * @return The daily volume cap for ingestion.
     * 
     */
    public Optional<Output<WorkspaceCappingArgs>> workspaceCapping() {
        return Optional.ofNullable(this.workspaceCapping);
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName")
    private @Nullable Output<String> workspaceName;

    /**
     * @return The name of the workspace.
     * 
     */
    public Optional<Output<String>> workspaceName() {
        return Optional.ofNullable(this.workspaceName);
    }

    private WorkspaceArgs() {}

    private WorkspaceArgs(WorkspaceArgs $) {
        this.eTag = $.eTag;
        this.features = $.features;
        this.forceCmkForQuery = $.forceCmkForQuery;
        this.location = $.location;
        this.provisioningState = $.provisioningState;
        this.publicNetworkAccessForIngestion = $.publicNetworkAccessForIngestion;
        this.publicNetworkAccessForQuery = $.publicNetworkAccessForQuery;
        this.resourceGroupName = $.resourceGroupName;
        this.retentionInDays = $.retentionInDays;
        this.sku = $.sku;
        this.tags = $.tags;
        this.workspaceCapping = $.workspaceCapping;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceArgs $;

        public Builder() {
            $ = new WorkspaceArgs();
        }

        public Builder(WorkspaceArgs defaults) {
            $ = new WorkspaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eTag The ETag of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder eTag(@Nullable Output<String> eTag) {
            $.eTag = eTag;
            return this;
        }

        /**
         * @param eTag The ETag of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder eTag(String eTag) {
            return eTag(Output.of(eTag));
        }

        /**
         * @param features Workspace features.
         * 
         * @return builder
         * 
         */
        public Builder features(@Nullable Output<WorkspaceFeaturesArgs> features) {
            $.features = features;
            return this;
        }

        /**
         * @param features Workspace features.
         * 
         * @return builder
         * 
         */
        public Builder features(WorkspaceFeaturesArgs features) {
            return features(Output.of(features));
        }

        /**
         * @param forceCmkForQuery Indicates whether customer managed storage is mandatory for query management.
         * 
         * @return builder
         * 
         */
        public Builder forceCmkForQuery(@Nullable Output<Boolean> forceCmkForQuery) {
            $.forceCmkForQuery = forceCmkForQuery;
            return this;
        }

        /**
         * @param forceCmkForQuery Indicates whether customer managed storage is mandatory for query management.
         * 
         * @return builder
         * 
         */
        public Builder forceCmkForQuery(Boolean forceCmkForQuery) {
            return forceCmkForQuery(Output.of(forceCmkForQuery));
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param provisioningState The provisioning state of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(@Nullable Output<Either<String,WorkspaceEntityStatus>> provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param provisioningState The provisioning state of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(Either<String,WorkspaceEntityStatus> provisioningState) {
            return provisioningState(Output.of(provisioningState));
        }

        /**
         * @param provisioningState The provisioning state of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            return provisioningState(Either.ofLeft(provisioningState));
        }

        /**
         * @param provisioningState The provisioning state of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(WorkspaceEntityStatus provisioningState) {
            return provisioningState(Either.ofRight(provisioningState));
        }

        /**
         * @param publicNetworkAccessForIngestion The network access type for accessing Log Analytics ingestion.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessForIngestion(@Nullable Output<Either<String,PublicNetworkAccessType>> publicNetworkAccessForIngestion) {
            $.publicNetworkAccessForIngestion = publicNetworkAccessForIngestion;
            return this;
        }

        /**
         * @param publicNetworkAccessForIngestion The network access type for accessing Log Analytics ingestion.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessForIngestion(Either<String,PublicNetworkAccessType> publicNetworkAccessForIngestion) {
            return publicNetworkAccessForIngestion(Output.of(publicNetworkAccessForIngestion));
        }

        /**
         * @param publicNetworkAccessForIngestion The network access type for accessing Log Analytics ingestion.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessForIngestion(String publicNetworkAccessForIngestion) {
            return publicNetworkAccessForIngestion(Either.ofLeft(publicNetworkAccessForIngestion));
        }

        /**
         * @param publicNetworkAccessForIngestion The network access type for accessing Log Analytics ingestion.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessForIngestion(PublicNetworkAccessType publicNetworkAccessForIngestion) {
            return publicNetworkAccessForIngestion(Either.ofRight(publicNetworkAccessForIngestion));
        }

        /**
         * @param publicNetworkAccessForQuery The network access type for accessing Log Analytics query.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessForQuery(@Nullable Output<Either<String,PublicNetworkAccessType>> publicNetworkAccessForQuery) {
            $.publicNetworkAccessForQuery = publicNetworkAccessForQuery;
            return this;
        }

        /**
         * @param publicNetworkAccessForQuery The network access type for accessing Log Analytics query.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessForQuery(Either<String,PublicNetworkAccessType> publicNetworkAccessForQuery) {
            return publicNetworkAccessForQuery(Output.of(publicNetworkAccessForQuery));
        }

        /**
         * @param publicNetworkAccessForQuery The network access type for accessing Log Analytics query.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessForQuery(String publicNetworkAccessForQuery) {
            return publicNetworkAccessForQuery(Either.ofLeft(publicNetworkAccessForQuery));
        }

        /**
         * @param publicNetworkAccessForQuery The network access type for accessing Log Analytics query.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessForQuery(PublicNetworkAccessType publicNetworkAccessForQuery) {
            return publicNetworkAccessForQuery(Either.ofRight(publicNetworkAccessForQuery));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param retentionInDays The workspace data retention in days. Allowed values are per pricing plan. See pricing tiers documentation for details.
         * 
         * @return builder
         * 
         */
        public Builder retentionInDays(@Nullable Output<Integer> retentionInDays) {
            $.retentionInDays = retentionInDays;
            return this;
        }

        /**
         * @param retentionInDays The workspace data retention in days. Allowed values are per pricing plan. See pricing tiers documentation for details.
         * 
         * @return builder
         * 
         */
        public Builder retentionInDays(Integer retentionInDays) {
            return retentionInDays(Output.of(retentionInDays));
        }

        /**
         * @param sku The SKU of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable Output<WorkspaceSkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The SKU of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder sku(WorkspaceSkuArgs sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param workspaceCapping The daily volume cap for ingestion.
         * 
         * @return builder
         * 
         */
        public Builder workspaceCapping(@Nullable Output<WorkspaceCappingArgs> workspaceCapping) {
            $.workspaceCapping = workspaceCapping;
            return this;
        }

        /**
         * @param workspaceCapping The daily volume cap for ingestion.
         * 
         * @return builder
         * 
         */
        public Builder workspaceCapping(WorkspaceCappingArgs workspaceCapping) {
            return workspaceCapping(Output.of(workspaceCapping));
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(@Nullable Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public WorkspaceArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
