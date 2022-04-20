// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.outputs;

import com.pulumi.azurenative.securityinsights.outputs.SystemDataResponse;
import com.pulumi.azurenative.securityinsights.outputs.WatchlistUserInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWatchlistResult {
    /**
     * The content type of the raw content. Example : text/csv or text/tsv
     * 
     */
    private final @Nullable String contentType;
    /**
     * The time the watchlist was created
     * 
     */
    private final @Nullable String created;
    /**
     * Describes a user that created the watchlist
     * 
     */
    private final @Nullable WatchlistUserInfoResponse createdBy;
    /**
     * The default duration of a watchlist (in ISO 8601 duration format)
     * 
     */
    private final @Nullable String defaultDuration;
    /**
     * A description of the watchlist
     * 
     */
    private final @Nullable String description;
    /**
     * The display name of the watchlist
     * 
     */
    private final String displayName;
    /**
     * Etag of the azure resource
     * 
     */
    private final @Nullable String etag;
    /**
     * Azure resource Id
     * 
     */
    private final String id;
    /**
     * A flag that indicates if the watchlist is deleted or not
     * 
     */
    private final @Nullable Boolean isDeleted;
    /**
     * The search key is used to optimize query performance when using watchlists for joins with other data. For example, enable a column with IP addresses to be the designated SearchKey field, then use this field as the key field when joining to other event data by IP address.
     * 
     */
    private final String itemsSearchKey;
    /**
     * List of labels relevant to this watchlist
     * 
     */
    private final @Nullable List<String> labels;
    /**
     * Azure resource name
     * 
     */
    private final String name;
    /**
     * The number of lines in a csv/tsv content to skip before the header
     * 
     */
    private final @Nullable Integer numberOfLinesToSkip;
    /**
     * The provider of the watchlist
     * 
     */
    private final String provider;
    /**
     * The raw content that represents to watchlist items to create. In case of csv/tsv content type, it&#39;s the content of the file that will parsed by the endpoint
     * 
     */
    private final @Nullable String rawContent;
    /**
     * The source of the watchlist
     * 
     */
    private final String source;
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The tenantId where the watchlist belongs to
     * 
     */
    private final @Nullable String tenantId;
    /**
     * Azure resource type
     * 
     */
    private final String type;
    /**
     * The last time the watchlist was updated
     * 
     */
    private final @Nullable String updated;
    /**
     * Describes a user that updated the watchlist
     * 
     */
    private final @Nullable WatchlistUserInfoResponse updatedBy;
    /**
     * The status of the Watchlist upload : New, InProgress or Complete. Pls note : When a Watchlist upload status is equal to InProgress, the Watchlist cannot be deleted
     * 
     */
    private final @Nullable String uploadStatus;
    /**
     * The alias of the watchlist
     * 
     */
    private final @Nullable String watchlistAlias;
    /**
     * The id (a Guid) of the watchlist
     * 
     */
    private final @Nullable String watchlistId;
    /**
     * The number of Watchlist Items in the Watchlist
     * 
     */
    private final @Nullable Integer watchlistItemsCount;
    /**
     * The type of the watchlist
     * 
     */
    private final @Nullable String watchlistType;

    @CustomType.Constructor
    private GetWatchlistResult(
        @CustomType.Parameter("contentType") @Nullable String contentType,
        @CustomType.Parameter("created") @Nullable String created,
        @CustomType.Parameter("createdBy") @Nullable WatchlistUserInfoResponse createdBy,
        @CustomType.Parameter("defaultDuration") @Nullable String defaultDuration,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isDeleted") @Nullable Boolean isDeleted,
        @CustomType.Parameter("itemsSearchKey") String itemsSearchKey,
        @CustomType.Parameter("labels") @Nullable List<String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("numberOfLinesToSkip") @Nullable Integer numberOfLinesToSkip,
        @CustomType.Parameter("provider") String provider,
        @CustomType.Parameter("rawContent") @Nullable String rawContent,
        @CustomType.Parameter("source") String source,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tenantId") @Nullable String tenantId,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("updated") @Nullable String updated,
        @CustomType.Parameter("updatedBy") @Nullable WatchlistUserInfoResponse updatedBy,
        @CustomType.Parameter("uploadStatus") @Nullable String uploadStatus,
        @CustomType.Parameter("watchlistAlias") @Nullable String watchlistAlias,
        @CustomType.Parameter("watchlistId") @Nullable String watchlistId,
        @CustomType.Parameter("watchlistItemsCount") @Nullable Integer watchlistItemsCount,
        @CustomType.Parameter("watchlistType") @Nullable String watchlistType) {
        this.contentType = contentType;
        this.created = created;
        this.createdBy = createdBy;
        this.defaultDuration = defaultDuration;
        this.description = description;
        this.displayName = displayName;
        this.etag = etag;
        this.id = id;
        this.isDeleted = isDeleted;
        this.itemsSearchKey = itemsSearchKey;
        this.labels = labels;
        this.name = name;
        this.numberOfLinesToSkip = numberOfLinesToSkip;
        this.provider = provider;
        this.rawContent = rawContent;
        this.source = source;
        this.systemData = systemData;
        this.tenantId = tenantId;
        this.type = type;
        this.updated = updated;
        this.updatedBy = updatedBy;
        this.uploadStatus = uploadStatus;
        this.watchlistAlias = watchlistAlias;
        this.watchlistId = watchlistId;
        this.watchlistItemsCount = watchlistItemsCount;
        this.watchlistType = watchlistType;
    }

    /**
     * The content type of the raw content. Example : text/csv or text/tsv
     * 
    */
    public Optional<String> contentType() {
        return Optional.ofNullable(this.contentType);
    }
    /**
     * The time the watchlist was created
     * 
    */
    public Optional<String> created() {
        return Optional.ofNullable(this.created);
    }
    /**
     * Describes a user that created the watchlist
     * 
    */
    public Optional<WatchlistUserInfoResponse> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }
    /**
     * The default duration of a watchlist (in ISO 8601 duration format)
     * 
    */
    public Optional<String> defaultDuration() {
        return Optional.ofNullable(this.defaultDuration);
    }
    /**
     * A description of the watchlist
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The display name of the watchlist
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * Etag of the azure resource
     * 
    */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Azure resource Id
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * A flag that indicates if the watchlist is deleted or not
     * 
    */
    public Optional<Boolean> isDeleted() {
        return Optional.ofNullable(this.isDeleted);
    }
    /**
     * The search key is used to optimize query performance when using watchlists for joins with other data. For example, enable a column with IP addresses to be the designated SearchKey field, then use this field as the key field when joining to other event data by IP address.
     * 
    */
    public String itemsSearchKey() {
        return this.itemsSearchKey;
    }
    /**
     * List of labels relevant to this watchlist
     * 
    */
    public List<String> labels() {
        return this.labels == null ? List.of() : this.labels;
    }
    /**
     * Azure resource name
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The number of lines in a csv/tsv content to skip before the header
     * 
    */
    public Optional<Integer> numberOfLinesToSkip() {
        return Optional.ofNullable(this.numberOfLinesToSkip);
    }
    /**
     * The provider of the watchlist
     * 
    */
    public String provider() {
        return this.provider;
    }
    /**
     * The raw content that represents to watchlist items to create. In case of csv/tsv content type, it&#39;s the content of the file that will parsed by the endpoint
     * 
    */
    public Optional<String> rawContent() {
        return Optional.ofNullable(this.rawContent);
    }
    /**
     * The source of the watchlist
     * 
    */
    public String source() {
        return this.source;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
    */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * The tenantId where the watchlist belongs to
     * 
    */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * Azure resource type
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The last time the watchlist was updated
     * 
    */
    public Optional<String> updated() {
        return Optional.ofNullable(this.updated);
    }
    /**
     * Describes a user that updated the watchlist
     * 
    */
    public Optional<WatchlistUserInfoResponse> updatedBy() {
        return Optional.ofNullable(this.updatedBy);
    }
    /**
     * The status of the Watchlist upload : New, InProgress or Complete. Pls note : When a Watchlist upload status is equal to InProgress, the Watchlist cannot be deleted
     * 
    */
    public Optional<String> uploadStatus() {
        return Optional.ofNullable(this.uploadStatus);
    }
    /**
     * The alias of the watchlist
     * 
    */
    public Optional<String> watchlistAlias() {
        return Optional.ofNullable(this.watchlistAlias);
    }
    /**
     * The id (a Guid) of the watchlist
     * 
    */
    public Optional<String> watchlistId() {
        return Optional.ofNullable(this.watchlistId);
    }
    /**
     * The number of Watchlist Items in the Watchlist
     * 
    */
    public Optional<Integer> watchlistItemsCount() {
        return Optional.ofNullable(this.watchlistItemsCount);
    }
    /**
     * The type of the watchlist
     * 
    */
    public Optional<String> watchlistType() {
        return Optional.ofNullable(this.watchlistType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWatchlistResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String contentType;
        private @Nullable String created;
        private @Nullable WatchlistUserInfoResponse createdBy;
        private @Nullable String defaultDuration;
        private @Nullable String description;
        private String displayName;
        private @Nullable String etag;
        private String id;
        private @Nullable Boolean isDeleted;
        private String itemsSearchKey;
        private @Nullable List<String> labels;
        private String name;
        private @Nullable Integer numberOfLinesToSkip;
        private String provider;
        private @Nullable String rawContent;
        private String source;
        private SystemDataResponse systemData;
        private @Nullable String tenantId;
        private String type;
        private @Nullable String updated;
        private @Nullable WatchlistUserInfoResponse updatedBy;
        private @Nullable String uploadStatus;
        private @Nullable String watchlistAlias;
        private @Nullable String watchlistId;
        private @Nullable Integer watchlistItemsCount;
        private @Nullable String watchlistType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWatchlistResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.created = defaults.created;
    	      this.createdBy = defaults.createdBy;
    	      this.defaultDuration = defaults.defaultDuration;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.isDeleted = defaults.isDeleted;
    	      this.itemsSearchKey = defaults.itemsSearchKey;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.numberOfLinesToSkip = defaults.numberOfLinesToSkip;
    	      this.provider = defaults.provider;
    	      this.rawContent = defaults.rawContent;
    	      this.source = defaults.source;
    	      this.systemData = defaults.systemData;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.updated = defaults.updated;
    	      this.updatedBy = defaults.updatedBy;
    	      this.uploadStatus = defaults.uploadStatus;
    	      this.watchlistAlias = defaults.watchlistAlias;
    	      this.watchlistId = defaults.watchlistId;
    	      this.watchlistItemsCount = defaults.watchlistItemsCount;
    	      this.watchlistType = defaults.watchlistType;
        }

        public Builder contentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder created(@Nullable String created) {
            this.created = created;
            return this;
        }
        public Builder createdBy(@Nullable WatchlistUserInfoResponse createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public Builder defaultDuration(@Nullable String defaultDuration) {
            this.defaultDuration = defaultDuration;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isDeleted(@Nullable Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Builder itemsSearchKey(String itemsSearchKey) {
            this.itemsSearchKey = Objects.requireNonNull(itemsSearchKey);
            return this;
        }
        public Builder labels(@Nullable List<String> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder numberOfLinesToSkip(@Nullable Integer numberOfLinesToSkip) {
            this.numberOfLinesToSkip = numberOfLinesToSkip;
            return this;
        }
        public Builder provider(String provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }
        public Builder rawContent(@Nullable String rawContent) {
            this.rawContent = rawContent;
            return this;
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder updated(@Nullable String updated) {
            this.updated = updated;
            return this;
        }
        public Builder updatedBy(@Nullable WatchlistUserInfoResponse updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public Builder uploadStatus(@Nullable String uploadStatus) {
            this.uploadStatus = uploadStatus;
            return this;
        }
        public Builder watchlistAlias(@Nullable String watchlistAlias) {
            this.watchlistAlias = watchlistAlias;
            return this;
        }
        public Builder watchlistId(@Nullable String watchlistId) {
            this.watchlistId = watchlistId;
            return this;
        }
        public Builder watchlistItemsCount(@Nullable Integer watchlistItemsCount) {
            this.watchlistItemsCount = watchlistItemsCount;
            return this;
        }
        public Builder watchlistType(@Nullable String watchlistType) {
            this.watchlistType = watchlistType;
            return this;
        }        public GetWatchlistResult build() {
            return new GetWatchlistResult(contentType, created, createdBy, defaultDuration, description, displayName, etag, id, isDeleted, itemsSearchKey, labels, name, numberOfLinesToSkip, provider, rawContent, source, systemData, tenantId, type, updated, updatedBy, uploadStatus, watchlistAlias, watchlistId, watchlistItemsCount, watchlistType);
        }
    }
}
