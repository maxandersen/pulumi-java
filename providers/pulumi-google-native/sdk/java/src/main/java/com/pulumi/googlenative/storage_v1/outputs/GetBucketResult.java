// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.storage_v1.outputs.BucketAccessControlResponse;
import com.pulumi.googlenative.storage_v1.outputs.BucketAutoclassResponse;
import com.pulumi.googlenative.storage_v1.outputs.BucketBillingResponse;
import com.pulumi.googlenative.storage_v1.outputs.BucketCorsItemResponse;
import com.pulumi.googlenative.storage_v1.outputs.BucketCustomPlacementConfigResponse;
import com.pulumi.googlenative.storage_v1.outputs.BucketEncryptionResponse;
import com.pulumi.googlenative.storage_v1.outputs.BucketIamConfigurationResponse;
import com.pulumi.googlenative.storage_v1.outputs.BucketLifecycleResponse;
import com.pulumi.googlenative.storage_v1.outputs.BucketLoggingResponse;
import com.pulumi.googlenative.storage_v1.outputs.BucketOwnerResponse;
import com.pulumi.googlenative.storage_v1.outputs.BucketRetentionPolicyResponse;
import com.pulumi.googlenative.storage_v1.outputs.BucketVersioningResponse;
import com.pulumi.googlenative.storage_v1.outputs.BucketWebsiteResponse;
import com.pulumi.googlenative.storage_v1.outputs.ObjectAccessControlResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetBucketResult {
    /**
     * Access controls on the bucket.
     * 
     */
    private final List<BucketAccessControlResponse> acl;
    /**
     * The bucket's Autoclass configuration.
     * 
     */
    private final BucketAutoclassResponse autoclass;
    /**
     * The bucket's billing configuration.
     * 
     */
    private final BucketBillingResponse billing;
    /**
     * The bucket's Cross-Origin Resource Sharing (CORS) configuration.
     * 
     */
    private final List<BucketCorsItemResponse> cors;
    /**
     * The bucket's custom placement configuration for Custom Dual Regions.
     * 
     */
    private final BucketCustomPlacementConfigResponse customPlacementConfig;
    /**
     * The default value for event-based hold on newly created objects in this bucket. Event-based hold is a way to retain objects indefinitely until an event occurs, signified by the hold's release. After being released, such objects will be subject to bucket-level retention (if any). One sample use case of this flag is for banks to hold loan documents for at least 3 years after loan is paid in full. Here, bucket-level retention is 3 years and the event is loan being paid in full. In this example, these objects will be held intact for any number of years until the event has occurred (event-based hold on the object is released) and then 3 more years after that. That means retention duration of the objects begins from the moment event-based hold transitioned from true to false. Objects under event-based hold cannot be deleted, overwritten or archived until the hold is removed.
     * 
     */
    private final Boolean defaultEventBasedHold;
    /**
     * Default access controls to apply to new objects when no ACL is provided.
     * 
     */
    private final List<ObjectAccessControlResponse> defaultObjectAcl;
    /**
     * Encryption configuration for a bucket.
     * 
     */
    private final BucketEncryptionResponse encryption;
    /**
     * HTTP 1.1 Entity tag for the bucket.
     * 
     */
    private final String etag;
    /**
     * The bucket's IAM configuration.
     * 
     */
    private final BucketIamConfigurationResponse iamConfiguration;
    /**
     * The kind of item this is. For buckets, this is always storage#bucket.
     * 
     */
    private final String kind;
    /**
     * User-provided labels, in key/value pairs.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The bucket's lifecycle configuration. See lifecycle management for more information.
     * 
     */
    private final BucketLifecycleResponse lifecycle;
    /**
     * The location of the bucket. Object data for objects in the bucket resides in physical storage within this region. Defaults to US. See the developer's guide for the authoritative list.
     * 
     */
    private final String location;
    /**
     * The type of the bucket location.
     * 
     */
    private final String locationType;
    /**
     * The bucket's logging configuration, which defines the destination bucket and optional name prefix for the current bucket's logs.
     * 
     */
    private final BucketLoggingResponse logging;
    /**
     * The metadata generation of this bucket.
     * 
     */
    private final String metageneration;
    /**
     * The name of the bucket.
     * 
     */
    private final String name;
    /**
     * The owner of the bucket. This is always the project team's owner group.
     * 
     */
    private final BucketOwnerResponse owner;
    /**
     * The project number of the project the bucket belongs to.
     * 
     */
    private final String projectNumber;
    /**
     * The bucket's retention policy. The retention policy enforces a minimum retention time for all objects contained in the bucket, based on their creation time. Any attempt to overwrite or delete objects younger than the retention period will result in a PERMISSION_DENIED error. An unlocked retention policy can be modified or removed from the bucket via a storage.buckets.update operation. A locked retention policy cannot be removed or shortened in duration for the lifetime of the bucket. Attempting to remove or decrease period of a locked retention policy will result in a PERMISSION_DENIED error.
     * 
     */
    private final BucketRetentionPolicyResponse retentionPolicy;
    /**
     * The Recovery Point Objective (RPO) of this bucket. Set to ASYNC_TURBO to turn on Turbo Replication on a bucket.
     * 
     */
    private final String rpo;
    /**
     * Reserved for future use.
     * 
     */
    private final Boolean satisfiesPZS;
    /**
     * The URI of this bucket.
     * 
     */
    private final String selfLink;
    /**
     * The bucket's default storage class, used whenever no storageClass is specified for a newly-created object. This defines how objects in the bucket are stored and determines the SLA and the cost of storage. Values include MULTI_REGIONAL, REGIONAL, STANDARD, NEARLINE, COLDLINE, ARCHIVE, and DURABLE_REDUCED_AVAILABILITY. If this value is not specified when the bucket is created, it will default to STANDARD. For more information, see storage classes.
     * 
     */
    private final String storageClass;
    /**
     * The creation time of the bucket in RFC 3339 format.
     * 
     */
    private final String timeCreated;
    /**
     * The modification time of the bucket in RFC 3339 format.
     * 
     */
    private final String updated;
    /**
     * The bucket's versioning configuration.
     * 
     */
    private final BucketVersioningResponse versioning;
    /**
     * The bucket's website configuration, controlling how the service behaves when accessing bucket contents as a web site. See the Static Website Examples for more information.
     * 
     */
    private final BucketWebsiteResponse website;

    @CustomType.Constructor
    private GetBucketResult(
        @CustomType.Parameter("acl") List<BucketAccessControlResponse> acl,
        @CustomType.Parameter("autoclass") BucketAutoclassResponse autoclass,
        @CustomType.Parameter("billing") BucketBillingResponse billing,
        @CustomType.Parameter("cors") List<BucketCorsItemResponse> cors,
        @CustomType.Parameter("customPlacementConfig") BucketCustomPlacementConfigResponse customPlacementConfig,
        @CustomType.Parameter("defaultEventBasedHold") Boolean defaultEventBasedHold,
        @CustomType.Parameter("defaultObjectAcl") List<ObjectAccessControlResponse> defaultObjectAcl,
        @CustomType.Parameter("encryption") BucketEncryptionResponse encryption,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("iamConfiguration") BucketIamConfigurationResponse iamConfiguration,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("lifecycle") BucketLifecycleResponse lifecycle,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("locationType") String locationType,
        @CustomType.Parameter("logging") BucketLoggingResponse logging,
        @CustomType.Parameter("metageneration") String metageneration,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("owner") BucketOwnerResponse owner,
        @CustomType.Parameter("projectNumber") String projectNumber,
        @CustomType.Parameter("retentionPolicy") BucketRetentionPolicyResponse retentionPolicy,
        @CustomType.Parameter("rpo") String rpo,
        @CustomType.Parameter("satisfiesPZS") Boolean satisfiesPZS,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("storageClass") String storageClass,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("updated") String updated,
        @CustomType.Parameter("versioning") BucketVersioningResponse versioning,
        @CustomType.Parameter("website") BucketWebsiteResponse website) {
        this.acl = acl;
        this.autoclass = autoclass;
        this.billing = billing;
        this.cors = cors;
        this.customPlacementConfig = customPlacementConfig;
        this.defaultEventBasedHold = defaultEventBasedHold;
        this.defaultObjectAcl = defaultObjectAcl;
        this.encryption = encryption;
        this.etag = etag;
        this.iamConfiguration = iamConfiguration;
        this.kind = kind;
        this.labels = labels;
        this.lifecycle = lifecycle;
        this.location = location;
        this.locationType = locationType;
        this.logging = logging;
        this.metageneration = metageneration;
        this.name = name;
        this.owner = owner;
        this.projectNumber = projectNumber;
        this.retentionPolicy = retentionPolicy;
        this.rpo = rpo;
        this.satisfiesPZS = satisfiesPZS;
        this.selfLink = selfLink;
        this.storageClass = storageClass;
        this.timeCreated = timeCreated;
        this.updated = updated;
        this.versioning = versioning;
        this.website = website;
    }

    /**
     * Access controls on the bucket.
     * 
    */
    public List<BucketAccessControlResponse> acl() {
        return this.acl;
    }
    /**
     * The bucket's Autoclass configuration.
     * 
    */
    public BucketAutoclassResponse autoclass() {
        return this.autoclass;
    }
    /**
     * The bucket's billing configuration.
     * 
    */
    public BucketBillingResponse billing() {
        return this.billing;
    }
    /**
     * The bucket's Cross-Origin Resource Sharing (CORS) configuration.
     * 
    */
    public List<BucketCorsItemResponse> cors() {
        return this.cors;
    }
    /**
     * The bucket's custom placement configuration for Custom Dual Regions.
     * 
    */
    public BucketCustomPlacementConfigResponse customPlacementConfig() {
        return this.customPlacementConfig;
    }
    /**
     * The default value for event-based hold on newly created objects in this bucket. Event-based hold is a way to retain objects indefinitely until an event occurs, signified by the hold's release. After being released, such objects will be subject to bucket-level retention (if any). One sample use case of this flag is for banks to hold loan documents for at least 3 years after loan is paid in full. Here, bucket-level retention is 3 years and the event is loan being paid in full. In this example, these objects will be held intact for any number of years until the event has occurred (event-based hold on the object is released) and then 3 more years after that. That means retention duration of the objects begins from the moment event-based hold transitioned from true to false. Objects under event-based hold cannot be deleted, overwritten or archived until the hold is removed.
     * 
    */
    public Boolean defaultEventBasedHold() {
        return this.defaultEventBasedHold;
    }
    /**
     * Default access controls to apply to new objects when no ACL is provided.
     * 
    */
    public List<ObjectAccessControlResponse> defaultObjectAcl() {
        return this.defaultObjectAcl;
    }
    /**
     * Encryption configuration for a bucket.
     * 
    */
    public BucketEncryptionResponse encryption() {
        return this.encryption;
    }
    /**
     * HTTP 1.1 Entity tag for the bucket.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * The bucket's IAM configuration.
     * 
    */
    public BucketIamConfigurationResponse iamConfiguration() {
        return this.iamConfiguration;
    }
    /**
     * The kind of item this is. For buckets, this is always storage#bucket.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * User-provided labels, in key/value pairs.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * The bucket's lifecycle configuration. See lifecycle management for more information.
     * 
    */
    public BucketLifecycleResponse lifecycle() {
        return this.lifecycle;
    }
    /**
     * The location of the bucket. Object data for objects in the bucket resides in physical storage within this region. Defaults to US. See the developer's guide for the authoritative list.
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * The type of the bucket location.
     * 
    */
    public String locationType() {
        return this.locationType;
    }
    /**
     * The bucket's logging configuration, which defines the destination bucket and optional name prefix for the current bucket's logs.
     * 
    */
    public BucketLoggingResponse logging() {
        return this.logging;
    }
    /**
     * The metadata generation of this bucket.
     * 
    */
    public String metageneration() {
        return this.metageneration;
    }
    /**
     * The name of the bucket.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The owner of the bucket. This is always the project team's owner group.
     * 
    */
    public BucketOwnerResponse owner() {
        return this.owner;
    }
    /**
     * The project number of the project the bucket belongs to.
     * 
    */
    public String projectNumber() {
        return this.projectNumber;
    }
    /**
     * The bucket's retention policy. The retention policy enforces a minimum retention time for all objects contained in the bucket, based on their creation time. Any attempt to overwrite or delete objects younger than the retention period will result in a PERMISSION_DENIED error. An unlocked retention policy can be modified or removed from the bucket via a storage.buckets.update operation. A locked retention policy cannot be removed or shortened in duration for the lifetime of the bucket. Attempting to remove or decrease period of a locked retention policy will result in a PERMISSION_DENIED error.
     * 
    */
    public BucketRetentionPolicyResponse retentionPolicy() {
        return this.retentionPolicy;
    }
    /**
     * The Recovery Point Objective (RPO) of this bucket. Set to ASYNC_TURBO to turn on Turbo Replication on a bucket.
     * 
    */
    public String rpo() {
        return this.rpo;
    }
    /**
     * Reserved for future use.
     * 
    */
    public Boolean satisfiesPZS() {
        return this.satisfiesPZS;
    }
    /**
     * The URI of this bucket.
     * 
    */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * The bucket's default storage class, used whenever no storageClass is specified for a newly-created object. This defines how objects in the bucket are stored and determines the SLA and the cost of storage. Values include MULTI_REGIONAL, REGIONAL, STANDARD, NEARLINE, COLDLINE, ARCHIVE, and DURABLE_REDUCED_AVAILABILITY. If this value is not specified when the bucket is created, it will default to STANDARD. For more information, see storage classes.
     * 
    */
    public String storageClass() {
        return this.storageClass;
    }
    /**
     * The creation time of the bucket in RFC 3339 format.
     * 
    */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * The modification time of the bucket in RFC 3339 format.
     * 
    */
    public String updated() {
        return this.updated;
    }
    /**
     * The bucket's versioning configuration.
     * 
    */
    public BucketVersioningResponse versioning() {
        return this.versioning;
    }
    /**
     * The bucket's website configuration, controlling how the service behaves when accessing bucket contents as a web site. See the Static Website Examples for more information.
     * 
    */
    public BucketWebsiteResponse website() {
        return this.website;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BucketAccessControlResponse> acl;
        private BucketAutoclassResponse autoclass;
        private BucketBillingResponse billing;
        private List<BucketCorsItemResponse> cors;
        private BucketCustomPlacementConfigResponse customPlacementConfig;
        private Boolean defaultEventBasedHold;
        private List<ObjectAccessControlResponse> defaultObjectAcl;
        private BucketEncryptionResponse encryption;
        private String etag;
        private BucketIamConfigurationResponse iamConfiguration;
        private String kind;
        private Map<String,String> labels;
        private BucketLifecycleResponse lifecycle;
        private String location;
        private String locationType;
        private BucketLoggingResponse logging;
        private String metageneration;
        private String name;
        private BucketOwnerResponse owner;
        private String projectNumber;
        private BucketRetentionPolicyResponse retentionPolicy;
        private String rpo;
        private Boolean satisfiesPZS;
        private String selfLink;
        private String storageClass;
        private String timeCreated;
        private String updated;
        private BucketVersioningResponse versioning;
        private BucketWebsiteResponse website;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acl = defaults.acl;
    	      this.autoclass = defaults.autoclass;
    	      this.billing = defaults.billing;
    	      this.cors = defaults.cors;
    	      this.customPlacementConfig = defaults.customPlacementConfig;
    	      this.defaultEventBasedHold = defaults.defaultEventBasedHold;
    	      this.defaultObjectAcl = defaults.defaultObjectAcl;
    	      this.encryption = defaults.encryption;
    	      this.etag = defaults.etag;
    	      this.iamConfiguration = defaults.iamConfiguration;
    	      this.kind = defaults.kind;
    	      this.labels = defaults.labels;
    	      this.lifecycle = defaults.lifecycle;
    	      this.location = defaults.location;
    	      this.locationType = defaults.locationType;
    	      this.logging = defaults.logging;
    	      this.metageneration = defaults.metageneration;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.projectNumber = defaults.projectNumber;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.rpo = defaults.rpo;
    	      this.satisfiesPZS = defaults.satisfiesPZS;
    	      this.selfLink = defaults.selfLink;
    	      this.storageClass = defaults.storageClass;
    	      this.timeCreated = defaults.timeCreated;
    	      this.updated = defaults.updated;
    	      this.versioning = defaults.versioning;
    	      this.website = defaults.website;
        }

        public Builder acl(List<BucketAccessControlResponse> acl) {
            this.acl = Objects.requireNonNull(acl);
            return this;
        }
        public Builder acl(BucketAccessControlResponse... acl) {
            return acl(List.of(acl));
        }
        public Builder autoclass(BucketAutoclassResponse autoclass) {
            this.autoclass = Objects.requireNonNull(autoclass);
            return this;
        }
        public Builder billing(BucketBillingResponse billing) {
            this.billing = Objects.requireNonNull(billing);
            return this;
        }
        public Builder cors(List<BucketCorsItemResponse> cors) {
            this.cors = Objects.requireNonNull(cors);
            return this;
        }
        public Builder cors(BucketCorsItemResponse... cors) {
            return cors(List.of(cors));
        }
        public Builder customPlacementConfig(BucketCustomPlacementConfigResponse customPlacementConfig) {
            this.customPlacementConfig = Objects.requireNonNull(customPlacementConfig);
            return this;
        }
        public Builder defaultEventBasedHold(Boolean defaultEventBasedHold) {
            this.defaultEventBasedHold = Objects.requireNonNull(defaultEventBasedHold);
            return this;
        }
        public Builder defaultObjectAcl(List<ObjectAccessControlResponse> defaultObjectAcl) {
            this.defaultObjectAcl = Objects.requireNonNull(defaultObjectAcl);
            return this;
        }
        public Builder defaultObjectAcl(ObjectAccessControlResponse... defaultObjectAcl) {
            return defaultObjectAcl(List.of(defaultObjectAcl));
        }
        public Builder encryption(BucketEncryptionResponse encryption) {
            this.encryption = Objects.requireNonNull(encryption);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder iamConfiguration(BucketIamConfigurationResponse iamConfiguration) {
            this.iamConfiguration = Objects.requireNonNull(iamConfiguration);
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
        public Builder lifecycle(BucketLifecycleResponse lifecycle) {
            this.lifecycle = Objects.requireNonNull(lifecycle);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder locationType(String locationType) {
            this.locationType = Objects.requireNonNull(locationType);
            return this;
        }
        public Builder logging(BucketLoggingResponse logging) {
            this.logging = Objects.requireNonNull(logging);
            return this;
        }
        public Builder metageneration(String metageneration) {
            this.metageneration = Objects.requireNonNull(metageneration);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder owner(BucketOwnerResponse owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }
        public Builder projectNumber(String projectNumber) {
            this.projectNumber = Objects.requireNonNull(projectNumber);
            return this;
        }
        public Builder retentionPolicy(BucketRetentionPolicyResponse retentionPolicy) {
            this.retentionPolicy = Objects.requireNonNull(retentionPolicy);
            return this;
        }
        public Builder rpo(String rpo) {
            this.rpo = Objects.requireNonNull(rpo);
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
        public Builder storageClass(String storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder updated(String updated) {
            this.updated = Objects.requireNonNull(updated);
            return this;
        }
        public Builder versioning(BucketVersioningResponse versioning) {
            this.versioning = Objects.requireNonNull(versioning);
            return this;
        }
        public Builder website(BucketWebsiteResponse website) {
            this.website = Objects.requireNonNull(website);
            return this;
        }        public GetBucketResult build() {
            return new GetBucketResult(acl, autoclass, billing, cors, customPlacementConfig, defaultEventBasedHold, defaultObjectAcl, encryption, etag, iamConfiguration, kind, labels, lifecycle, location, locationType, logging, metageneration, name, owner, projectNumber, retentionPolicy, rpo, satisfiesPZS, selfLink, storageClass, timeCreated, updated, versioning, website);
        }
    }
}
