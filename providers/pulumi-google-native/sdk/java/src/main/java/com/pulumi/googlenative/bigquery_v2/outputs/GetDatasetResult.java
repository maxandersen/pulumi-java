// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.bigquery_v2.outputs.DatasetAccessItemResponse;
import com.pulumi.googlenative.bigquery_v2.outputs.DatasetReferenceResponse;
import com.pulumi.googlenative.bigquery_v2.outputs.DatasetTagsItemResponse;
import com.pulumi.googlenative.bigquery_v2.outputs.EncryptionConfigurationResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDatasetResult {
    /**
     * @return [Optional] An array of objects that define dataset access for one or more entities. You can set this property when inserting or updating a dataset in order to control who is allowed to access the data. If unspecified at dataset creation time, BigQuery adds default dataset access for the following entities: access.specialGroup: projectReaders; access.role: READER; access.specialGroup: projectWriters; access.role: WRITER; access.specialGroup: projectOwners; access.role: OWNER; access.userByEmail: [dataset creator email]; access.role: OWNER;
     * 
     */
    private final List<DatasetAccessItemResponse> access;
    /**
     * @return The time when this dataset was created, in milliseconds since the epoch.
     * 
     */
    private final String creationTime;
    /**
     * @return [Required] A reference that identifies the dataset.
     * 
     */
    private final DatasetReferenceResponse datasetReference;
    /**
     * @return The default collation of the dataset.
     * 
     */
    private final String defaultCollation;
    private final EncryptionConfigurationResponse defaultEncryptionConfiguration;
    /**
     * @return [Optional] The default partition expiration for all partitioned tables in the dataset, in milliseconds. Once this property is set, all newly-created partitioned tables in the dataset will have an expirationMs property in the timePartitioning settings set to this value, and changing the value will only affect new tables, not existing ones. The storage in a partition will have an expiration time of its partition time plus this value. Setting this property overrides the use of defaultTableExpirationMs for partitioned tables: only one of defaultTableExpirationMs and defaultPartitionExpirationMs will be used for any new partitioned table. If you provide an explicit timePartitioning.expirationMs when creating or updating a partitioned table, that value takes precedence over the default partition expiration time indicated by this property.
     * 
     */
    private final String defaultPartitionExpirationMs;
    /**
     * @return [Optional] The default lifetime of all tables in the dataset, in milliseconds. The minimum value is 3600000 milliseconds (one hour). Once this property is set, all newly-created tables in the dataset will have an expirationTime property set to the creation time plus the value in this property, and changing the value will only affect new tables, not existing ones. When the expirationTime for a given table is reached, that table will be deleted automatically. If a table&#39;s expirationTime is modified or removed before the table expires, or if you provide an explicit expirationTime when creating a table, that value takes precedence over the default expiration time indicated by this property.
     * 
     */
    private final String defaultTableExpirationMs;
    /**
     * @return [Optional] A user-friendly description of the dataset.
     * 
     */
    private final String description;
    /**
     * @return A hash of the resource.
     * 
     */
    private final String etag;
    /**
     * @return [Optional] A descriptive name for the dataset.
     * 
     */
    private final String friendlyName;
    /**
     * @return [Optional] Indicates if table names are case insensitive in the dataset.
     * 
     */
    private final Boolean isCaseInsensitive;
    /**
     * @return The resource type.
     * 
     */
    private final String kind;
    /**
     * @return The labels associated with this dataset. You can use these to organize and group your datasets. You can set this property when inserting or updating a dataset. See Creating and Updating Dataset Labels for more information.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The date when this dataset or any of its tables was last modified, in milliseconds since the epoch.
     * 
     */
    private final String lastModifiedTime;
    /**
     * @return The geographic location where the dataset should reside. The default value is US. See details at https://cloud.google.com/bigquery/docs/locations.
     * 
     */
    private final String location;
    /**
     * @return [Optional] Number of hours for the max time travel for all tables in the dataset.
     * 
     */
    private final String maxTimeTravelHours;
    /**
     * @return Reserved for future use.
     * 
     */
    private final Boolean satisfiesPZS;
    /**
     * @return A URL that can be used to access the resource again. You can use this URL in Get or Update requests to the resource.
     * 
     */
    private final String selfLink;
    /**
     * @return [Optional]The tags associated with this dataset. Tag keys are globally unique.
     * 
     */
    private final List<DatasetTagsItemResponse> tags;

    @CustomType.Constructor
    private GetDatasetResult(
        @CustomType.Parameter("access") List<DatasetAccessItemResponse> access,
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("datasetReference") DatasetReferenceResponse datasetReference,
        @CustomType.Parameter("defaultCollation") String defaultCollation,
        @CustomType.Parameter("defaultEncryptionConfiguration") EncryptionConfigurationResponse defaultEncryptionConfiguration,
        @CustomType.Parameter("defaultPartitionExpirationMs") String defaultPartitionExpirationMs,
        @CustomType.Parameter("defaultTableExpirationMs") String defaultTableExpirationMs,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("friendlyName") String friendlyName,
        @CustomType.Parameter("isCaseInsensitive") Boolean isCaseInsensitive,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("lastModifiedTime") String lastModifiedTime,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("maxTimeTravelHours") String maxTimeTravelHours,
        @CustomType.Parameter("satisfiesPZS") Boolean satisfiesPZS,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("tags") List<DatasetTagsItemResponse> tags) {
        this.access = access;
        this.creationTime = creationTime;
        this.datasetReference = datasetReference;
        this.defaultCollation = defaultCollation;
        this.defaultEncryptionConfiguration = defaultEncryptionConfiguration;
        this.defaultPartitionExpirationMs = defaultPartitionExpirationMs;
        this.defaultTableExpirationMs = defaultTableExpirationMs;
        this.description = description;
        this.etag = etag;
        this.friendlyName = friendlyName;
        this.isCaseInsensitive = isCaseInsensitive;
        this.kind = kind;
        this.labels = labels;
        this.lastModifiedTime = lastModifiedTime;
        this.location = location;
        this.maxTimeTravelHours = maxTimeTravelHours;
        this.satisfiesPZS = satisfiesPZS;
        this.selfLink = selfLink;
        this.tags = tags;
    }

    /**
     * @return [Optional] An array of objects that define dataset access for one or more entities. You can set this property when inserting or updating a dataset in order to control who is allowed to access the data. If unspecified at dataset creation time, BigQuery adds default dataset access for the following entities: access.specialGroup: projectReaders; access.role: READER; access.specialGroup: projectWriters; access.role: WRITER; access.specialGroup: projectOwners; access.role: OWNER; access.userByEmail: [dataset creator email]; access.role: OWNER;
     * 
     */
    public List<DatasetAccessItemResponse> access() {
        return this.access;
    }
    /**
     * @return The time when this dataset was created, in milliseconds since the epoch.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return [Required] A reference that identifies the dataset.
     * 
     */
    public DatasetReferenceResponse datasetReference() {
        return this.datasetReference;
    }
    /**
     * @return The default collation of the dataset.
     * 
     */
    public String defaultCollation() {
        return this.defaultCollation;
    }
    public EncryptionConfigurationResponse defaultEncryptionConfiguration() {
        return this.defaultEncryptionConfiguration;
    }
    /**
     * @return [Optional] The default partition expiration for all partitioned tables in the dataset, in milliseconds. Once this property is set, all newly-created partitioned tables in the dataset will have an expirationMs property in the timePartitioning settings set to this value, and changing the value will only affect new tables, not existing ones. The storage in a partition will have an expiration time of its partition time plus this value. Setting this property overrides the use of defaultTableExpirationMs for partitioned tables: only one of defaultTableExpirationMs and defaultPartitionExpirationMs will be used for any new partitioned table. If you provide an explicit timePartitioning.expirationMs when creating or updating a partitioned table, that value takes precedence over the default partition expiration time indicated by this property.
     * 
     */
    public String defaultPartitionExpirationMs() {
        return this.defaultPartitionExpirationMs;
    }
    /**
     * @return [Optional] The default lifetime of all tables in the dataset, in milliseconds. The minimum value is 3600000 milliseconds (one hour). Once this property is set, all newly-created tables in the dataset will have an expirationTime property set to the creation time plus the value in this property, and changing the value will only affect new tables, not existing ones. When the expirationTime for a given table is reached, that table will be deleted automatically. If a table&#39;s expirationTime is modified or removed before the table expires, or if you provide an explicit expirationTime when creating a table, that value takes precedence over the default expiration time indicated by this property.
     * 
     */
    public String defaultTableExpirationMs() {
        return this.defaultTableExpirationMs;
    }
    /**
     * @return [Optional] A user-friendly description of the dataset.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return A hash of the resource.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return [Optional] A descriptive name for the dataset.
     * 
     */
    public String friendlyName() {
        return this.friendlyName;
    }
    /**
     * @return [Optional] Indicates if table names are case insensitive in the dataset.
     * 
     */
    public Boolean isCaseInsensitive() {
        return this.isCaseInsensitive;
    }
    /**
     * @return The resource type.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The labels associated with this dataset. You can use these to organize and group your datasets. You can set this property when inserting or updating a dataset. See Creating and Updating Dataset Labels for more information.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The date when this dataset or any of its tables was last modified, in milliseconds since the epoch.
     * 
     */
    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * @return The geographic location where the dataset should reside. The default value is US. See details at https://cloud.google.com/bigquery/docs/locations.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return [Optional] Number of hours for the max time travel for all tables in the dataset.
     * 
     */
    public String maxTimeTravelHours() {
        return this.maxTimeTravelHours;
    }
    /**
     * @return Reserved for future use.
     * 
     */
    public Boolean satisfiesPZS() {
        return this.satisfiesPZS;
    }
    /**
     * @return A URL that can be used to access the resource again. You can use this URL in Get or Update requests to the resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return [Optional]The tags associated with this dataset. Tag keys are globally unique.
     * 
     */
    public List<DatasetTagsItemResponse> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatasetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DatasetAccessItemResponse> access;
        private String creationTime;
        private DatasetReferenceResponse datasetReference;
        private String defaultCollation;
        private EncryptionConfigurationResponse defaultEncryptionConfiguration;
        private String defaultPartitionExpirationMs;
        private String defaultTableExpirationMs;
        private String description;
        private String etag;
        private String friendlyName;
        private Boolean isCaseInsensitive;
        private String kind;
        private Map<String,String> labels;
        private String lastModifiedTime;
        private String location;
        private String maxTimeTravelHours;
        private Boolean satisfiesPZS;
        private String selfLink;
        private List<DatasetTagsItemResponse> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatasetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.creationTime = defaults.creationTime;
    	      this.datasetReference = defaults.datasetReference;
    	      this.defaultCollation = defaults.defaultCollation;
    	      this.defaultEncryptionConfiguration = defaults.defaultEncryptionConfiguration;
    	      this.defaultPartitionExpirationMs = defaults.defaultPartitionExpirationMs;
    	      this.defaultTableExpirationMs = defaults.defaultTableExpirationMs;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.friendlyName = defaults.friendlyName;
    	      this.isCaseInsensitive = defaults.isCaseInsensitive;
    	      this.kind = defaults.kind;
    	      this.labels = defaults.labels;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.location = defaults.location;
    	      this.maxTimeTravelHours = defaults.maxTimeTravelHours;
    	      this.satisfiesPZS = defaults.satisfiesPZS;
    	      this.selfLink = defaults.selfLink;
    	      this.tags = defaults.tags;
        }

        public Builder access(List<DatasetAccessItemResponse> access) {
            this.access = Objects.requireNonNull(access);
            return this;
        }
        public Builder access(DatasetAccessItemResponse... access) {
            return access(List.of(access));
        }
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder datasetReference(DatasetReferenceResponse datasetReference) {
            this.datasetReference = Objects.requireNonNull(datasetReference);
            return this;
        }
        public Builder defaultCollation(String defaultCollation) {
            this.defaultCollation = Objects.requireNonNull(defaultCollation);
            return this;
        }
        public Builder defaultEncryptionConfiguration(EncryptionConfigurationResponse defaultEncryptionConfiguration) {
            this.defaultEncryptionConfiguration = Objects.requireNonNull(defaultEncryptionConfiguration);
            return this;
        }
        public Builder defaultPartitionExpirationMs(String defaultPartitionExpirationMs) {
            this.defaultPartitionExpirationMs = Objects.requireNonNull(defaultPartitionExpirationMs);
            return this;
        }
        public Builder defaultTableExpirationMs(String defaultTableExpirationMs) {
            this.defaultTableExpirationMs = Objects.requireNonNull(defaultTableExpirationMs);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder friendlyName(String friendlyName) {
            this.friendlyName = Objects.requireNonNull(friendlyName);
            return this;
        }
        public Builder isCaseInsensitive(Boolean isCaseInsensitive) {
            this.isCaseInsensitive = Objects.requireNonNull(isCaseInsensitive);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder maxTimeTravelHours(String maxTimeTravelHours) {
            this.maxTimeTravelHours = Objects.requireNonNull(maxTimeTravelHours);
            return this;
        }
        public Builder satisfiesPZS(Boolean satisfiesPZS) {
            this.satisfiesPZS = Objects.requireNonNull(satisfiesPZS);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder tags(List<DatasetTagsItemResponse> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(DatasetTagsItemResponse... tags) {
            return tags(List.of(tags));
        }        public GetDatasetResult build() {
            return new GetDatasetResult(access, creationTime, datasetReference, defaultCollation, defaultEncryptionConfiguration, defaultPartitionExpirationMs, defaultTableExpirationMs, description, etag, friendlyName, isCaseInsensitive, kind, labels, lastModifiedTime, location, maxTimeTravelHours, satisfiesPZS, selfLink, tags);
        }
    }
}
