// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.RepositoryResponse;
import io.pulumi.azurenative.securityinsights.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSourceControlResult {
    /**
     * Array of source control content types.
     * 
     */
    private final List<String> contentTypes;
    /**
     * The timestamp of resource creation (UTC).
     * 
     */
    private final @Nullable String createdAt;
    /**
     * The identity that created the resource.
     * 
     */
    private final @Nullable String createdBy;
    /**
     * The type of identity that created the resource.
     * 
     */
    private final @Nullable String createdByType;
    /**
     * A description of the source control
     * 
     */
    private final @Nullable String description;
    /**
     * The display name of the source control
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
     * The timestamp of resource last modification (UTC)
     * 
     */
    private final @Nullable String lastModifiedAt;
    /**
     * The identity that last modified the resource.
     * 
     */
    private final @Nullable String lastModifiedBy;
    /**
     * The type of identity that last modified the resource.
     * 
     */
    private final @Nullable String lastModifiedByType;
    /**
     * Azure resource name
     * 
     */
    private final String name;
    /**
     * The repository type of the source control
     * 
     */
    private final String repoType;
    /**
     * Repository metadata.
     * 
     */
    private final RepositoryResponse repository;
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Azure resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetSourceControlResult(
        @CustomType.Parameter("contentTypes") List<String> contentTypes,
        @CustomType.Parameter("createdAt") @Nullable String createdAt,
        @CustomType.Parameter("createdBy") @Nullable String createdBy,
        @CustomType.Parameter("createdByType") @Nullable String createdByType,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastModifiedAt") @Nullable String lastModifiedAt,
        @CustomType.Parameter("lastModifiedBy") @Nullable String lastModifiedBy,
        @CustomType.Parameter("lastModifiedByType") @Nullable String lastModifiedByType,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("repoType") String repoType,
        @CustomType.Parameter("repository") RepositoryResponse repository,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.contentTypes = contentTypes;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.createdByType = createdByType;
        this.description = description;
        this.displayName = displayName;
        this.etag = etag;
        this.id = id;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedByType = lastModifiedByType;
        this.name = name;
        this.repoType = repoType;
        this.repository = repository;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * Array of source control content types.
     * 
    */
    public List<String> contentTypes() {
        return this.contentTypes;
    }
    /**
     * The timestamp of resource creation (UTC).
     * 
    */
    public Optional<String> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }
    /**
     * The identity that created the resource.
     * 
    */
    public Optional<String> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }
    /**
     * The type of identity that created the resource.
     * 
    */
    public Optional<String> createdByType() {
        return Optional.ofNullable(this.createdByType);
    }
    /**
     * A description of the source control
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The display name of the source control
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
     * The timestamp of resource last modification (UTC)
     * 
    */
    public Optional<String> lastModifiedAt() {
        return Optional.ofNullable(this.lastModifiedAt);
    }
    /**
     * The identity that last modified the resource.
     * 
    */
    public Optional<String> lastModifiedBy() {
        return Optional.ofNullable(this.lastModifiedBy);
    }
    /**
     * The type of identity that last modified the resource.
     * 
    */
    public Optional<String> lastModifiedByType() {
        return Optional.ofNullable(this.lastModifiedByType);
    }
    /**
     * Azure resource name
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The repository type of the source control
     * 
    */
    public String repoType() {
        return this.repoType;
    }
    /**
     * Repository metadata.
     * 
    */
    public RepositoryResponse repository() {
        return this.repository;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
    */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * Azure resource type
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSourceControlResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> contentTypes;
        private @Nullable String createdAt;
        private @Nullable String createdBy;
        private @Nullable String createdByType;
        private @Nullable String description;
        private String displayName;
        private @Nullable String etag;
        private String id;
        private @Nullable String lastModifiedAt;
        private @Nullable String lastModifiedBy;
        private @Nullable String lastModifiedByType;
        private String name;
        private String repoType;
        private RepositoryResponse repository;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSourceControlResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentTypes = defaults.contentTypes;
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.createdByType = defaults.createdByType;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.lastModifiedByType = defaults.lastModifiedByType;
    	      this.name = defaults.name;
    	      this.repoType = defaults.repoType;
    	      this.repository = defaults.repository;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder contentTypes(List<String> contentTypes) {
            this.contentTypes = Objects.requireNonNull(contentTypes);
            return this;
        }
        public Builder contentTypes(String... contentTypes) {
            return contentTypes(List.of(contentTypes));
        }
        public Builder createdAt(@Nullable String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Builder createdBy(@Nullable String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public Builder createdByType(@Nullable String createdByType) {
            this.createdByType = createdByType;
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
        public Builder lastModifiedAt(@Nullable String lastModifiedAt) {
            this.lastModifiedAt = lastModifiedAt;
            return this;
        }
        public Builder lastModifiedBy(@Nullable String lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }
        public Builder lastModifiedByType(@Nullable String lastModifiedByType) {
            this.lastModifiedByType = lastModifiedByType;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder repoType(String repoType) {
            this.repoType = Objects.requireNonNull(repoType);
            return this;
        }
        public Builder repository(RepositoryResponse repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetSourceControlResult build() {
            return new GetSourceControlResult(contentTypes, createdAt, createdBy, createdByType, description, displayName, etag, id, lastModifiedAt, lastModifiedBy, lastModifiedByType, name, repoType, repository, systemData, type);
        }
    }
}
