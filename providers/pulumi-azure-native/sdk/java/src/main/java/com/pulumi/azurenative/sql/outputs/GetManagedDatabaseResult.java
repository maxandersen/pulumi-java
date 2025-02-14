// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetManagedDatabaseResult {
    /**
     * @return Collation of the metadata catalog.
     * 
     */
    private final @Nullable String catalogCollation;
    /**
     * @return Collation of the managed database.
     * 
     */
    private final @Nullable String collation;
    /**
     * @return Creation date of the database.
     * 
     */
    private final String creationDate;
    /**
     * @return Geo paired region.
     * 
     */
    private final String defaultSecondaryLocation;
    /**
     * @return Earliest restore point in time for point in time restore.
     * 
     */
    private final String earliestRestorePoint;
    /**
     * @return Instance Failover Group resource identifier that this managed database belongs to.
     * 
     */
    private final String failoverGroupId;
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return Resource location.
     * 
     */
    private final String location;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return Status of the database.
     * 
     */
    private final String status;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetManagedDatabaseResult(
        @CustomType.Parameter("catalogCollation") @Nullable String catalogCollation,
        @CustomType.Parameter("collation") @Nullable String collation,
        @CustomType.Parameter("creationDate") String creationDate,
        @CustomType.Parameter("defaultSecondaryLocation") String defaultSecondaryLocation,
        @CustomType.Parameter("earliestRestorePoint") String earliestRestorePoint,
        @CustomType.Parameter("failoverGroupId") String failoverGroupId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.catalogCollation = catalogCollation;
        this.collation = collation;
        this.creationDate = creationDate;
        this.defaultSecondaryLocation = defaultSecondaryLocation;
        this.earliestRestorePoint = earliestRestorePoint;
        this.failoverGroupId = failoverGroupId;
        this.id = id;
        this.location = location;
        this.name = name;
        this.status = status;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return Collation of the metadata catalog.
     * 
     */
    public Optional<String> catalogCollation() {
        return Optional.ofNullable(this.catalogCollation);
    }
    /**
     * @return Collation of the managed database.
     * 
     */
    public Optional<String> collation() {
        return Optional.ofNullable(this.collation);
    }
    /**
     * @return Creation date of the database.
     * 
     */
    public String creationDate() {
        return this.creationDate;
    }
    /**
     * @return Geo paired region.
     * 
     */
    public String defaultSecondaryLocation() {
        return this.defaultSecondaryLocation;
    }
    /**
     * @return Earliest restore point in time for point in time restore.
     * 
     */
    public String earliestRestorePoint() {
        return this.earliestRestorePoint;
    }
    /**
     * @return Instance Failover Group resource identifier that this managed database belongs to.
     * 
     */
    public String failoverGroupId() {
        return this.failoverGroupId;
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource location.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Status of the database.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedDatabaseResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String catalogCollation;
        private @Nullable String collation;
        private String creationDate;
        private String defaultSecondaryLocation;
        private String earliestRestorePoint;
        private String failoverGroupId;
        private String id;
        private String location;
        private String name;
        private String status;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedDatabaseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogCollation = defaults.catalogCollation;
    	      this.collation = defaults.collation;
    	      this.creationDate = defaults.creationDate;
    	      this.defaultSecondaryLocation = defaults.defaultSecondaryLocation;
    	      this.earliestRestorePoint = defaults.earliestRestorePoint;
    	      this.failoverGroupId = defaults.failoverGroupId;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder catalogCollation(@Nullable String catalogCollation) {
            this.catalogCollation = catalogCollation;
            return this;
        }
        public Builder collation(@Nullable String collation) {
            this.collation = collation;
            return this;
        }
        public Builder creationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }
        public Builder defaultSecondaryLocation(String defaultSecondaryLocation) {
            this.defaultSecondaryLocation = Objects.requireNonNull(defaultSecondaryLocation);
            return this;
        }
        public Builder earliestRestorePoint(String earliestRestorePoint) {
            this.earliestRestorePoint = Objects.requireNonNull(earliestRestorePoint);
            return this;
        }
        public Builder failoverGroupId(String failoverGroupId) {
            this.failoverGroupId = Objects.requireNonNull(failoverGroupId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetManagedDatabaseResult build() {
            return new GetManagedDatabaseResult(catalogCollation, collation, creationDate, defaultSecondaryLocation, earliestRestorePoint, failoverGroupId, id, location, name, status, tags, type);
        }
    }
}
