// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights;

import com.pulumi.azurenative.securityinsights.enums.Source;
import com.pulumi.azurenative.securityinsights.inputs.WatchlistUserInfoArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WatchlistArgs extends com.pulumi.resources.ResourceArgs {

    public static final WatchlistArgs Empty = new WatchlistArgs();

    /**
     * The content type of the raw content. Example : text/csv or text/tsv
     * 
     */
    @Import(name="contentType")
      private final @Nullable Output<String> contentType;

    public Output<String> contentType() {
        return this.contentType == null ? Codegen.empty() : this.contentType;
    }

    /**
     * The time the watchlist was created
     * 
     */
    @Import(name="created")
      private final @Nullable Output<String> created;

    public Output<String> created() {
        return this.created == null ? Codegen.empty() : this.created;
    }

    /**
     * Describes a user that created the watchlist
     * 
     */
    @Import(name="createdBy")
      private final @Nullable Output<WatchlistUserInfoArgs> createdBy;

    public Output<WatchlistUserInfoArgs> createdBy() {
        return this.createdBy == null ? Codegen.empty() : this.createdBy;
    }

    /**
     * The default duration of a watchlist (in ISO 8601 duration format)
     * 
     */
    @Import(name="defaultDuration")
      private final @Nullable Output<String> defaultDuration;

    public Output<String> defaultDuration() {
        return this.defaultDuration == null ? Codegen.empty() : this.defaultDuration;
    }

    /**
     * A description of the watchlist
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The display name of the watchlist
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * A flag that indicates if the watchlist is deleted or not
     * 
     */
    @Import(name="isDeleted")
      private final @Nullable Output<Boolean> isDeleted;

    public Output<Boolean> isDeleted() {
        return this.isDeleted == null ? Codegen.empty() : this.isDeleted;
    }

    /**
     * The search key is used to optimize query performance when using watchlists for joins with other data. For example, enable a column with IP addresses to be the designated SearchKey field, then use this field as the key field when joining to other event data by IP address.
     * 
     */
    @Import(name="itemsSearchKey", required=true)
      private final Output<String> itemsSearchKey;

    public Output<String> itemsSearchKey() {
        return this.itemsSearchKey;
    }

    /**
     * List of labels relevant to this watchlist
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<List<String>> labels;

    public Output<List<String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The number of lines in a csv/tsv content to skip before the header
     * 
     */
    @Import(name="numberOfLinesToSkip")
      private final @Nullable Output<Integer> numberOfLinesToSkip;

    public Output<Integer> numberOfLinesToSkip() {
        return this.numberOfLinesToSkip == null ? Codegen.empty() : this.numberOfLinesToSkip;
    }

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @Import(name="operationalInsightsResourceProvider", required=true)
      private final Output<String> operationalInsightsResourceProvider;

    public Output<String> operationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * The provider of the watchlist
     * 
     */
    @Import(name="provider", required=true)
      private final Output<String> provider;

    public Output<String> provider() {
        return this.provider;
    }

    /**
     * The raw content that represents to watchlist items to create. In case of csv/tsv content type, it&#39;s the content of the file that will parsed by the endpoint
     * 
     */
    @Import(name="rawContent")
      private final @Nullable Output<String> rawContent;

    public Output<String> rawContent() {
        return this.rawContent == null ? Codegen.empty() : this.rawContent;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The source of the watchlist
     * 
     */
    @Import(name="source", required=true)
      private final Output<Either<String,Source>> source;

    public Output<Either<String,Source>> source() {
        return this.source;
    }

    /**
     * The tenantId where the watchlist belongs to
     * 
     */
    @Import(name="tenantId")
      private final @Nullable Output<String> tenantId;

    public Output<String> tenantId() {
        return this.tenantId == null ? Codegen.empty() : this.tenantId;
    }

    /**
     * The last time the watchlist was updated
     * 
     */
    @Import(name="updated")
      private final @Nullable Output<String> updated;

    public Output<String> updated() {
        return this.updated == null ? Codegen.empty() : this.updated;
    }

    /**
     * Describes a user that updated the watchlist
     * 
     */
    @Import(name="updatedBy")
      private final @Nullable Output<WatchlistUserInfoArgs> updatedBy;

    public Output<WatchlistUserInfoArgs> updatedBy() {
        return this.updatedBy == null ? Codegen.empty() : this.updatedBy;
    }

    /**
     * The status of the Watchlist upload : New, InProgress or Complete. Pls note : When a Watchlist upload status is equal to InProgress, the Watchlist cannot be deleted
     * 
     */
    @Import(name="uploadStatus")
      private final @Nullable Output<String> uploadStatus;

    public Output<String> uploadStatus() {
        return this.uploadStatus == null ? Codegen.empty() : this.uploadStatus;
    }

    /**
     * The alias of the watchlist
     * 
     */
    @Import(name="watchlistAlias")
      private final @Nullable Output<String> watchlistAlias;

    public Output<String> watchlistAlias() {
        return this.watchlistAlias == null ? Codegen.empty() : this.watchlistAlias;
    }

    /**
     * The id (a Guid) of the watchlist
     * 
     */
    @Import(name="watchlistId")
      private final @Nullable Output<String> watchlistId;

    public Output<String> watchlistId() {
        return this.watchlistId == null ? Codegen.empty() : this.watchlistId;
    }

    /**
     * The number of Watchlist Items in the Watchlist
     * 
     */
    @Import(name="watchlistItemsCount")
      private final @Nullable Output<Integer> watchlistItemsCount;

    public Output<Integer> watchlistItemsCount() {
        return this.watchlistItemsCount == null ? Codegen.empty() : this.watchlistItemsCount;
    }

    /**
     * The type of the watchlist
     * 
     */
    @Import(name="watchlistType")
      private final @Nullable Output<String> watchlistType;

    public Output<String> watchlistType() {
        return this.watchlistType == null ? Codegen.empty() : this.watchlistType;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    public WatchlistArgs(
        @Nullable Output<String> contentType,
        @Nullable Output<String> created,
        @Nullable Output<WatchlistUserInfoArgs> createdBy,
        @Nullable Output<String> defaultDuration,
        @Nullable Output<String> description,
        Output<String> displayName,
        @Nullable Output<Boolean> isDeleted,
        Output<String> itemsSearchKey,
        @Nullable Output<List<String>> labels,
        @Nullable Output<Integer> numberOfLinesToSkip,
        Output<String> operationalInsightsResourceProvider,
        Output<String> provider,
        @Nullable Output<String> rawContent,
        Output<String> resourceGroupName,
        Output<Either<String,Source>> source,
        @Nullable Output<String> tenantId,
        @Nullable Output<String> updated,
        @Nullable Output<WatchlistUserInfoArgs> updatedBy,
        @Nullable Output<String> uploadStatus,
        @Nullable Output<String> watchlistAlias,
        @Nullable Output<String> watchlistId,
        @Nullable Output<Integer> watchlistItemsCount,
        @Nullable Output<String> watchlistType,
        Output<String> workspaceName) {
        this.contentType = contentType;
        this.created = created;
        this.createdBy = createdBy;
        this.defaultDuration = defaultDuration;
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.isDeleted = isDeleted;
        this.itemsSearchKey = Objects.requireNonNull(itemsSearchKey, "expected parameter 'itemsSearchKey' to be non-null");
        this.labels = labels;
        this.numberOfLinesToSkip = numberOfLinesToSkip;
        this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
        this.provider = Objects.requireNonNull(provider, "expected parameter 'provider' to be non-null");
        this.rawContent = rawContent;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.tenantId = tenantId;
        this.updated = updated;
        this.updatedBy = updatedBy;
        this.uploadStatus = uploadStatus;
        this.watchlistAlias = watchlistAlias;
        this.watchlistId = watchlistId;
        this.watchlistItemsCount = watchlistItemsCount;
        this.watchlistType = watchlistType;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private WatchlistArgs() {
        this.contentType = Codegen.empty();
        this.created = Codegen.empty();
        this.createdBy = Codegen.empty();
        this.defaultDuration = Codegen.empty();
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.isDeleted = Codegen.empty();
        this.itemsSearchKey = Codegen.empty();
        this.labels = Codegen.empty();
        this.numberOfLinesToSkip = Codegen.empty();
        this.operationalInsightsResourceProvider = Codegen.empty();
        this.provider = Codegen.empty();
        this.rawContent = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.source = Codegen.empty();
        this.tenantId = Codegen.empty();
        this.updated = Codegen.empty();
        this.updatedBy = Codegen.empty();
        this.uploadStatus = Codegen.empty();
        this.watchlistAlias = Codegen.empty();
        this.watchlistId = Codegen.empty();
        this.watchlistItemsCount = Codegen.empty();
        this.watchlistType = Codegen.empty();
        this.workspaceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WatchlistArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> contentType;
        private @Nullable Output<String> created;
        private @Nullable Output<WatchlistUserInfoArgs> createdBy;
        private @Nullable Output<String> defaultDuration;
        private @Nullable Output<String> description;
        private Output<String> displayName;
        private @Nullable Output<Boolean> isDeleted;
        private Output<String> itemsSearchKey;
        private @Nullable Output<List<String>> labels;
        private @Nullable Output<Integer> numberOfLinesToSkip;
        private Output<String> operationalInsightsResourceProvider;
        private Output<String> provider;
        private @Nullable Output<String> rawContent;
        private Output<String> resourceGroupName;
        private Output<Either<String,Source>> source;
        private @Nullable Output<String> tenantId;
        private @Nullable Output<String> updated;
        private @Nullable Output<WatchlistUserInfoArgs> updatedBy;
        private @Nullable Output<String> uploadStatus;
        private @Nullable Output<String> watchlistAlias;
        private @Nullable Output<String> watchlistId;
        private @Nullable Output<Integer> watchlistItemsCount;
        private @Nullable Output<String> watchlistType;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(WatchlistArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.created = defaults.created;
    	      this.createdBy = defaults.createdBy;
    	      this.defaultDuration = defaults.defaultDuration;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.isDeleted = defaults.isDeleted;
    	      this.itemsSearchKey = defaults.itemsSearchKey;
    	      this.labels = defaults.labels;
    	      this.numberOfLinesToSkip = defaults.numberOfLinesToSkip;
    	      this.operationalInsightsResourceProvider = defaults.operationalInsightsResourceProvider;
    	      this.provider = defaults.provider;
    	      this.rawContent = defaults.rawContent;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.source = defaults.source;
    	      this.tenantId = defaults.tenantId;
    	      this.updated = defaults.updated;
    	      this.updatedBy = defaults.updatedBy;
    	      this.uploadStatus = defaults.uploadStatus;
    	      this.watchlistAlias = defaults.watchlistAlias;
    	      this.watchlistId = defaults.watchlistId;
    	      this.watchlistItemsCount = defaults.watchlistItemsCount;
    	      this.watchlistType = defaults.watchlistType;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder contentType(@Nullable Output<String> contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder contentType(@Nullable String contentType) {
            this.contentType = Codegen.ofNullable(contentType);
            return this;
        }
        public Builder created(@Nullable Output<String> created) {
            this.created = created;
            return this;
        }
        public Builder created(@Nullable String created) {
            this.created = Codegen.ofNullable(created);
            return this;
        }
        public Builder createdBy(@Nullable Output<WatchlistUserInfoArgs> createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public Builder createdBy(@Nullable WatchlistUserInfoArgs createdBy) {
            this.createdBy = Codegen.ofNullable(createdBy);
            return this;
        }
        public Builder defaultDuration(@Nullable Output<String> defaultDuration) {
            this.defaultDuration = defaultDuration;
            return this;
        }
        public Builder defaultDuration(@Nullable String defaultDuration) {
            this.defaultDuration = Codegen.ofNullable(defaultDuration);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder isDeleted(@Nullable Output<Boolean> isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Builder isDeleted(@Nullable Boolean isDeleted) {
            this.isDeleted = Codegen.ofNullable(isDeleted);
            return this;
        }
        public Builder itemsSearchKey(Output<String> itemsSearchKey) {
            this.itemsSearchKey = Objects.requireNonNull(itemsSearchKey);
            return this;
        }
        public Builder itemsSearchKey(String itemsSearchKey) {
            this.itemsSearchKey = Output.of(Objects.requireNonNull(itemsSearchKey));
            return this;
        }
        public Builder labels(@Nullable Output<List<String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable List<String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }
        public Builder numberOfLinesToSkip(@Nullable Output<Integer> numberOfLinesToSkip) {
            this.numberOfLinesToSkip = numberOfLinesToSkip;
            return this;
        }
        public Builder numberOfLinesToSkip(@Nullable Integer numberOfLinesToSkip) {
            this.numberOfLinesToSkip = Codegen.ofNullable(numberOfLinesToSkip);
            return this;
        }
        public Builder operationalInsightsResourceProvider(Output<String> operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider);
            return this;
        }
        public Builder operationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Output.of(Objects.requireNonNull(operationalInsightsResourceProvider));
            return this;
        }
        public Builder provider(Output<String> provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }
        public Builder provider(String provider) {
            this.provider = Output.of(Objects.requireNonNull(provider));
            return this;
        }
        public Builder rawContent(@Nullable Output<String> rawContent) {
            this.rawContent = rawContent;
            return this;
        }
        public Builder rawContent(@Nullable String rawContent) {
            this.rawContent = Codegen.ofNullable(rawContent);
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
        public Builder source(Output<Either<String,Source>> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder source(Either<String,Source> source) {
            this.source = Output.of(Objects.requireNonNull(source));
            return this;
        }
        public Builder tenantId(@Nullable Output<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = Codegen.ofNullable(tenantId);
            return this;
        }
        public Builder updated(@Nullable Output<String> updated) {
            this.updated = updated;
            return this;
        }
        public Builder updated(@Nullable String updated) {
            this.updated = Codegen.ofNullable(updated);
            return this;
        }
        public Builder updatedBy(@Nullable Output<WatchlistUserInfoArgs> updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public Builder updatedBy(@Nullable WatchlistUserInfoArgs updatedBy) {
            this.updatedBy = Codegen.ofNullable(updatedBy);
            return this;
        }
        public Builder uploadStatus(@Nullable Output<String> uploadStatus) {
            this.uploadStatus = uploadStatus;
            return this;
        }
        public Builder uploadStatus(@Nullable String uploadStatus) {
            this.uploadStatus = Codegen.ofNullable(uploadStatus);
            return this;
        }
        public Builder watchlistAlias(@Nullable Output<String> watchlistAlias) {
            this.watchlistAlias = watchlistAlias;
            return this;
        }
        public Builder watchlistAlias(@Nullable String watchlistAlias) {
            this.watchlistAlias = Codegen.ofNullable(watchlistAlias);
            return this;
        }
        public Builder watchlistId(@Nullable Output<String> watchlistId) {
            this.watchlistId = watchlistId;
            return this;
        }
        public Builder watchlistId(@Nullable String watchlistId) {
            this.watchlistId = Codegen.ofNullable(watchlistId);
            return this;
        }
        public Builder watchlistItemsCount(@Nullable Output<Integer> watchlistItemsCount) {
            this.watchlistItemsCount = watchlistItemsCount;
            return this;
        }
        public Builder watchlistItemsCount(@Nullable Integer watchlistItemsCount) {
            this.watchlistItemsCount = Codegen.ofNullable(watchlistItemsCount);
            return this;
        }
        public Builder watchlistType(@Nullable Output<String> watchlistType) {
            this.watchlistType = watchlistType;
            return this;
        }
        public Builder watchlistType(@Nullable String watchlistType) {
            this.watchlistType = Codegen.ofNullable(watchlistType);
            return this;
        }
        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }        public WatchlistArgs build() {
            return new WatchlistArgs(contentType, created, createdBy, defaultDuration, description, displayName, isDeleted, itemsSearchKey, labels, numberOfLinesToSkip, operationalInsightsResourceProvider, provider, rawContent, resourceGroupName, source, tenantId, updated, updatedBy, uploadStatus, watchlistAlias, watchlistId, watchlistItemsCount, watchlistType, workspaceName);
        }
    }
}
