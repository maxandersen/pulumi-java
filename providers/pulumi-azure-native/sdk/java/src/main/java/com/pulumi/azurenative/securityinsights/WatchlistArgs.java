// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights;

import com.pulumi.azurenative.securityinsights.enums.Source;
import com.pulumi.azurenative.securityinsights.inputs.WatchlistUserInfoArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WatchlistArgs extends ResourceArgs {

    public static final WatchlistArgs Empty = new WatchlistArgs();

    /**
     * The content type of the raw content. Example : text/csv or text/tsv
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    /**
     * @return The content type of the raw content. Example : text/csv or text/tsv
     * 
     */
    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * The time the watchlist was created
     * 
     */
    @Import(name="created")
    private @Nullable Output<String> created;

    /**
     * @return The time the watchlist was created
     * 
     */
    public Optional<Output<String>> created() {
        return Optional.ofNullable(this.created);
    }

    /**
     * Describes a user that created the watchlist
     * 
     */
    @Import(name="createdBy")
    private @Nullable Output<WatchlistUserInfoArgs> createdBy;

    /**
     * @return Describes a user that created the watchlist
     * 
     */
    public Optional<Output<WatchlistUserInfoArgs>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * The default duration of a watchlist (in ISO 8601 duration format)
     * 
     */
    @Import(name="defaultDuration")
    private @Nullable Output<String> defaultDuration;

    /**
     * @return The default duration of a watchlist (in ISO 8601 duration format)
     * 
     */
    public Optional<Output<String>> defaultDuration() {
        return Optional.ofNullable(this.defaultDuration);
    }

    /**
     * A description of the watchlist
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the watchlist
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The display name of the watchlist
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The display name of the watchlist
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * A flag that indicates if the watchlist is deleted or not
     * 
     */
    @Import(name="isDeleted")
    private @Nullable Output<Boolean> isDeleted;

    /**
     * @return A flag that indicates if the watchlist is deleted or not
     * 
     */
    public Optional<Output<Boolean>> isDeleted() {
        return Optional.ofNullable(this.isDeleted);
    }

    /**
     * The search key is used to optimize query performance when using watchlists for joins with other data. For example, enable a column with IP addresses to be the designated SearchKey field, then use this field as the key field when joining to other event data by IP address.
     * 
     */
    @Import(name="itemsSearchKey", required=true)
    private Output<String> itemsSearchKey;

    /**
     * @return The search key is used to optimize query performance when using watchlists for joins with other data. For example, enable a column with IP addresses to be the designated SearchKey field, then use this field as the key field when joining to other event data by IP address.
     * 
     */
    public Output<String> itemsSearchKey() {
        return this.itemsSearchKey;
    }

    /**
     * List of labels relevant to this watchlist
     * 
     */
    @Import(name="labels")
    private @Nullable Output<List<String>> labels;

    /**
     * @return List of labels relevant to this watchlist
     * 
     */
    public Optional<Output<List<String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The number of lines in a csv/tsv content to skip before the header
     * 
     */
    @Import(name="numberOfLinesToSkip")
    private @Nullable Output<Integer> numberOfLinesToSkip;

    /**
     * @return The number of lines in a csv/tsv content to skip before the header
     * 
     */
    public Optional<Output<Integer>> numberOfLinesToSkip() {
        return Optional.ofNullable(this.numberOfLinesToSkip);
    }

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @Import(name="operationalInsightsResourceProvider", required=true)
    private Output<String> operationalInsightsResourceProvider;

    /**
     * @return The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    public Output<String> operationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * The provider of the watchlist
     * 
     */
    @Import(name="provider", required=true)
    private Output<String> provider;

    /**
     * @return The provider of the watchlist
     * 
     */
    public Output<String> provider() {
        return this.provider;
    }

    /**
     * The raw content that represents to watchlist items to create. In case of csv/tsv content type, it&#39;s the content of the file that will parsed by the endpoint
     * 
     */
    @Import(name="rawContent")
    private @Nullable Output<String> rawContent;

    /**
     * @return The raw content that represents to watchlist items to create. In case of csv/tsv content type, it&#39;s the content of the file that will parsed by the endpoint
     * 
     */
    public Optional<Output<String>> rawContent() {
        return Optional.ofNullable(this.rawContent);
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
     * The source of the watchlist
     * 
     */
    @Import(name="source", required=true)
    private Output<Either<String,Source>> source;

    /**
     * @return The source of the watchlist
     * 
     */
    public Output<Either<String,Source>> source() {
        return this.source;
    }

    /**
     * The tenantId where the watchlist belongs to
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The tenantId where the watchlist belongs to
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * The last time the watchlist was updated
     * 
     */
    @Import(name="updated")
    private @Nullable Output<String> updated;

    /**
     * @return The last time the watchlist was updated
     * 
     */
    public Optional<Output<String>> updated() {
        return Optional.ofNullable(this.updated);
    }

    /**
     * Describes a user that updated the watchlist
     * 
     */
    @Import(name="updatedBy")
    private @Nullable Output<WatchlistUserInfoArgs> updatedBy;

    /**
     * @return Describes a user that updated the watchlist
     * 
     */
    public Optional<Output<WatchlistUserInfoArgs>> updatedBy() {
        return Optional.ofNullable(this.updatedBy);
    }

    /**
     * The status of the Watchlist upload : New, InProgress or Complete. Pls note : When a Watchlist upload status is equal to InProgress, the Watchlist cannot be deleted
     * 
     */
    @Import(name="uploadStatus")
    private @Nullable Output<String> uploadStatus;

    /**
     * @return The status of the Watchlist upload : New, InProgress or Complete. Pls note : When a Watchlist upload status is equal to InProgress, the Watchlist cannot be deleted
     * 
     */
    public Optional<Output<String>> uploadStatus() {
        return Optional.ofNullable(this.uploadStatus);
    }

    /**
     * The alias of the watchlist
     * 
     */
    @Import(name="watchlistAlias")
    private @Nullable Output<String> watchlistAlias;

    /**
     * @return The alias of the watchlist
     * 
     */
    public Optional<Output<String>> watchlistAlias() {
        return Optional.ofNullable(this.watchlistAlias);
    }

    /**
     * The id (a Guid) of the watchlist
     * 
     */
    @Import(name="watchlistId")
    private @Nullable Output<String> watchlistId;

    /**
     * @return The id (a Guid) of the watchlist
     * 
     */
    public Optional<Output<String>> watchlistId() {
        return Optional.ofNullable(this.watchlistId);
    }

    /**
     * The number of Watchlist Items in the Watchlist
     * 
     */
    @Import(name="watchlistItemsCount")
    private @Nullable Output<Integer> watchlistItemsCount;

    /**
     * @return The number of Watchlist Items in the Watchlist
     * 
     */
    public Optional<Output<Integer>> watchlistItemsCount() {
        return Optional.ofNullable(this.watchlistItemsCount);
    }

    /**
     * The type of the watchlist
     * 
     */
    @Import(name="watchlistType")
    private @Nullable Output<String> watchlistType;

    /**
     * @return The type of the watchlist
     * 
     */
    public Optional<Output<String>> watchlistType() {
        return Optional.ofNullable(this.watchlistType);
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    /**
     * @return The name of the workspace.
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private WatchlistArgs() {}

    private WatchlistArgs(WatchlistArgs $) {
        this.contentType = $.contentType;
        this.created = $.created;
        this.createdBy = $.createdBy;
        this.defaultDuration = $.defaultDuration;
        this.description = $.description;
        this.displayName = $.displayName;
        this.isDeleted = $.isDeleted;
        this.itemsSearchKey = $.itemsSearchKey;
        this.labels = $.labels;
        this.numberOfLinesToSkip = $.numberOfLinesToSkip;
        this.operationalInsightsResourceProvider = $.operationalInsightsResourceProvider;
        this.provider = $.provider;
        this.rawContent = $.rawContent;
        this.resourceGroupName = $.resourceGroupName;
        this.source = $.source;
        this.tenantId = $.tenantId;
        this.updated = $.updated;
        this.updatedBy = $.updatedBy;
        this.uploadStatus = $.uploadStatus;
        this.watchlistAlias = $.watchlistAlias;
        this.watchlistId = $.watchlistId;
        this.watchlistItemsCount = $.watchlistItemsCount;
        this.watchlistType = $.watchlistType;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WatchlistArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WatchlistArgs $;

        public Builder() {
            $ = new WatchlistArgs();
        }

        public Builder(WatchlistArgs defaults) {
            $ = new WatchlistArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentType The content type of the raw content. Example : text/csv or text/tsv
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType The content type of the raw content. Example : text/csv or text/tsv
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        /**
         * @param created The time the watchlist was created
         * 
         * @return builder
         * 
         */
        public Builder created(@Nullable Output<String> created) {
            $.created = created;
            return this;
        }

        /**
         * @param created The time the watchlist was created
         * 
         * @return builder
         * 
         */
        public Builder created(String created) {
            return created(Output.of(created));
        }

        /**
         * @param createdBy Describes a user that created the watchlist
         * 
         * @return builder
         * 
         */
        public Builder createdBy(@Nullable Output<WatchlistUserInfoArgs> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param createdBy Describes a user that created the watchlist
         * 
         * @return builder
         * 
         */
        public Builder createdBy(WatchlistUserInfoArgs createdBy) {
            return createdBy(Output.of(createdBy));
        }

        /**
         * @param defaultDuration The default duration of a watchlist (in ISO 8601 duration format)
         * 
         * @return builder
         * 
         */
        public Builder defaultDuration(@Nullable Output<String> defaultDuration) {
            $.defaultDuration = defaultDuration;
            return this;
        }

        /**
         * @param defaultDuration The default duration of a watchlist (in ISO 8601 duration format)
         * 
         * @return builder
         * 
         */
        public Builder defaultDuration(String defaultDuration) {
            return defaultDuration(Output.of(defaultDuration));
        }

        /**
         * @param description A description of the watchlist
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the watchlist
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The display name of the watchlist
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name of the watchlist
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param isDeleted A flag that indicates if the watchlist is deleted or not
         * 
         * @return builder
         * 
         */
        public Builder isDeleted(@Nullable Output<Boolean> isDeleted) {
            $.isDeleted = isDeleted;
            return this;
        }

        /**
         * @param isDeleted A flag that indicates if the watchlist is deleted or not
         * 
         * @return builder
         * 
         */
        public Builder isDeleted(Boolean isDeleted) {
            return isDeleted(Output.of(isDeleted));
        }

        /**
         * @param itemsSearchKey The search key is used to optimize query performance when using watchlists for joins with other data. For example, enable a column with IP addresses to be the designated SearchKey field, then use this field as the key field when joining to other event data by IP address.
         * 
         * @return builder
         * 
         */
        public Builder itemsSearchKey(Output<String> itemsSearchKey) {
            $.itemsSearchKey = itemsSearchKey;
            return this;
        }

        /**
         * @param itemsSearchKey The search key is used to optimize query performance when using watchlists for joins with other data. For example, enable a column with IP addresses to be the designated SearchKey field, then use this field as the key field when joining to other event data by IP address.
         * 
         * @return builder
         * 
         */
        public Builder itemsSearchKey(String itemsSearchKey) {
            return itemsSearchKey(Output.of(itemsSearchKey));
        }

        /**
         * @param labels List of labels relevant to this watchlist
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<List<String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels List of labels relevant to this watchlist
         * 
         * @return builder
         * 
         */
        public Builder labels(List<String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param labels List of labels relevant to this watchlist
         * 
         * @return builder
         * 
         */
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }

        /**
         * @param numberOfLinesToSkip The number of lines in a csv/tsv content to skip before the header
         * 
         * @return builder
         * 
         */
        public Builder numberOfLinesToSkip(@Nullable Output<Integer> numberOfLinesToSkip) {
            $.numberOfLinesToSkip = numberOfLinesToSkip;
            return this;
        }

        /**
         * @param numberOfLinesToSkip The number of lines in a csv/tsv content to skip before the header
         * 
         * @return builder
         * 
         */
        public Builder numberOfLinesToSkip(Integer numberOfLinesToSkip) {
            return numberOfLinesToSkip(Output.of(numberOfLinesToSkip));
        }

        /**
         * @param operationalInsightsResourceProvider The namespace of workspaces resource provider- Microsoft.OperationalInsights.
         * 
         * @return builder
         * 
         */
        public Builder operationalInsightsResourceProvider(Output<String> operationalInsightsResourceProvider) {
            $.operationalInsightsResourceProvider = operationalInsightsResourceProvider;
            return this;
        }

        /**
         * @param operationalInsightsResourceProvider The namespace of workspaces resource provider- Microsoft.OperationalInsights.
         * 
         * @return builder
         * 
         */
        public Builder operationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            return operationalInsightsResourceProvider(Output.of(operationalInsightsResourceProvider));
        }

        /**
         * @param provider The provider of the watchlist
         * 
         * @return builder
         * 
         */
        public Builder provider(Output<String> provider) {
            $.provider = provider;
            return this;
        }

        /**
         * @param provider The provider of the watchlist
         * 
         * @return builder
         * 
         */
        public Builder provider(String provider) {
            return provider(Output.of(provider));
        }

        /**
         * @param rawContent The raw content that represents to watchlist items to create. In case of csv/tsv content type, it&#39;s the content of the file that will parsed by the endpoint
         * 
         * @return builder
         * 
         */
        public Builder rawContent(@Nullable Output<String> rawContent) {
            $.rawContent = rawContent;
            return this;
        }

        /**
         * @param rawContent The raw content that represents to watchlist items to create. In case of csv/tsv content type, it&#39;s the content of the file that will parsed by the endpoint
         * 
         * @return builder
         * 
         */
        public Builder rawContent(String rawContent) {
            return rawContent(Output.of(rawContent));
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
         * @param source The source of the watchlist
         * 
         * @return builder
         * 
         */
        public Builder source(Output<Either<String,Source>> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The source of the watchlist
         * 
         * @return builder
         * 
         */
        public Builder source(Either<String,Source> source) {
            return source(Output.of(source));
        }

        /**
         * @param source The source of the watchlist
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Either.ofLeft(source));
        }

        /**
         * @param source The source of the watchlist
         * 
         * @return builder
         * 
         */
        public Builder source(Source source) {
            return source(Either.ofRight(source));
        }

        /**
         * @param tenantId The tenantId where the watchlist belongs to
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The tenantId where the watchlist belongs to
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param updated The last time the watchlist was updated
         * 
         * @return builder
         * 
         */
        public Builder updated(@Nullable Output<String> updated) {
            $.updated = updated;
            return this;
        }

        /**
         * @param updated The last time the watchlist was updated
         * 
         * @return builder
         * 
         */
        public Builder updated(String updated) {
            return updated(Output.of(updated));
        }

        /**
         * @param updatedBy Describes a user that updated the watchlist
         * 
         * @return builder
         * 
         */
        public Builder updatedBy(@Nullable Output<WatchlistUserInfoArgs> updatedBy) {
            $.updatedBy = updatedBy;
            return this;
        }

        /**
         * @param updatedBy Describes a user that updated the watchlist
         * 
         * @return builder
         * 
         */
        public Builder updatedBy(WatchlistUserInfoArgs updatedBy) {
            return updatedBy(Output.of(updatedBy));
        }

        /**
         * @param uploadStatus The status of the Watchlist upload : New, InProgress or Complete. Pls note : When a Watchlist upload status is equal to InProgress, the Watchlist cannot be deleted
         * 
         * @return builder
         * 
         */
        public Builder uploadStatus(@Nullable Output<String> uploadStatus) {
            $.uploadStatus = uploadStatus;
            return this;
        }

        /**
         * @param uploadStatus The status of the Watchlist upload : New, InProgress or Complete. Pls note : When a Watchlist upload status is equal to InProgress, the Watchlist cannot be deleted
         * 
         * @return builder
         * 
         */
        public Builder uploadStatus(String uploadStatus) {
            return uploadStatus(Output.of(uploadStatus));
        }

        /**
         * @param watchlistAlias The alias of the watchlist
         * 
         * @return builder
         * 
         */
        public Builder watchlistAlias(@Nullable Output<String> watchlistAlias) {
            $.watchlistAlias = watchlistAlias;
            return this;
        }

        /**
         * @param watchlistAlias The alias of the watchlist
         * 
         * @return builder
         * 
         */
        public Builder watchlistAlias(String watchlistAlias) {
            return watchlistAlias(Output.of(watchlistAlias));
        }

        /**
         * @param watchlistId The id (a Guid) of the watchlist
         * 
         * @return builder
         * 
         */
        public Builder watchlistId(@Nullable Output<String> watchlistId) {
            $.watchlistId = watchlistId;
            return this;
        }

        /**
         * @param watchlistId The id (a Guid) of the watchlist
         * 
         * @return builder
         * 
         */
        public Builder watchlistId(String watchlistId) {
            return watchlistId(Output.of(watchlistId));
        }

        /**
         * @param watchlistItemsCount The number of Watchlist Items in the Watchlist
         * 
         * @return builder
         * 
         */
        public Builder watchlistItemsCount(@Nullable Output<Integer> watchlistItemsCount) {
            $.watchlistItemsCount = watchlistItemsCount;
            return this;
        }

        /**
         * @param watchlistItemsCount The number of Watchlist Items in the Watchlist
         * 
         * @return builder
         * 
         */
        public Builder watchlistItemsCount(Integer watchlistItemsCount) {
            return watchlistItemsCount(Output.of(watchlistItemsCount));
        }

        /**
         * @param watchlistType The type of the watchlist
         * 
         * @return builder
         * 
         */
        public Builder watchlistType(@Nullable Output<String> watchlistType) {
            $.watchlistType = watchlistType;
            return this;
        }

        /**
         * @param watchlistType The type of the watchlist
         * 
         * @return builder
         * 
         */
        public Builder watchlistType(String watchlistType) {
            return watchlistType(Output.of(watchlistType));
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(Output<String> workspaceName) {
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

        public WatchlistArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.itemsSearchKey = Objects.requireNonNull($.itemsSearchKey, "expected parameter 'itemsSearchKey' to be non-null");
            $.operationalInsightsResourceProvider = Objects.requireNonNull($.operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
            $.provider = Objects.requireNonNull($.provider, "expected parameter 'provider' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
