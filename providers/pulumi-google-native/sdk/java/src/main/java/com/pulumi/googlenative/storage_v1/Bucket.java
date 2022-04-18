// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.storage_v1.BucketArgs;
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
import javax.annotation.Nullable;

/**
 * Creates a new bucket.
 * 
 */
@ResourceType(type="google-native:storage/v1:Bucket")
public class Bucket extends com.pulumi.resources.CustomResource {
    /**
     * Access controls on the bucket.
     * 
     */
    @Export(name="acl", type=List.class, parameters={BucketAccessControlResponse.class})
    private Output<List<BucketAccessControlResponse>> acl;

    /**
     * @return Access controls on the bucket.
     * 
     */
    public Output<List<BucketAccessControlResponse>> acl() {
        return this.acl;
    }
    /**
     * The bucket's Autoclass configuration.
     * 
     */
    @Export(name="autoclass", type=BucketAutoclassResponse.class, parameters={})
    private Output<BucketAutoclassResponse> autoclass;

    /**
     * @return The bucket's Autoclass configuration.
     * 
     */
    public Output<BucketAutoclassResponse> autoclass() {
        return this.autoclass;
    }
    /**
     * The bucket's billing configuration.
     * 
     */
    @Export(name="billing", type=BucketBillingResponse.class, parameters={})
    private Output<BucketBillingResponse> billing;

    /**
     * @return The bucket's billing configuration.
     * 
     */
    public Output<BucketBillingResponse> billing() {
        return this.billing;
    }
    /**
     * The bucket's Cross-Origin Resource Sharing (CORS) configuration.
     * 
     */
    @Export(name="cors", type=List.class, parameters={BucketCorsItemResponse.class})
    private Output<List<BucketCorsItemResponse>> cors;

    /**
     * @return The bucket's Cross-Origin Resource Sharing (CORS) configuration.
     * 
     */
    public Output<List<BucketCorsItemResponse>> cors() {
        return this.cors;
    }
    /**
     * The bucket's custom placement configuration for Custom Dual Regions.
     * 
     */
    @Export(name="customPlacementConfig", type=BucketCustomPlacementConfigResponse.class, parameters={})
    private Output<BucketCustomPlacementConfigResponse> customPlacementConfig;

    /**
     * @return The bucket's custom placement configuration for Custom Dual Regions.
     * 
     */
    public Output<BucketCustomPlacementConfigResponse> customPlacementConfig() {
        return this.customPlacementConfig;
    }
    /**
     * The default value for event-based hold on newly created objects in this bucket. Event-based hold is a way to retain objects indefinitely until an event occurs, signified by the hold's release. After being released, such objects will be subject to bucket-level retention (if any). One sample use case of this flag is for banks to hold loan documents for at least 3 years after loan is paid in full. Here, bucket-level retention is 3 years and the event is loan being paid in full. In this example, these objects will be held intact for any number of years until the event has occurred (event-based hold on the object is released) and then 3 more years after that. That means retention duration of the objects begins from the moment event-based hold transitioned from true to false. Objects under event-based hold cannot be deleted, overwritten or archived until the hold is removed.
     * 
     */
    @Export(name="defaultEventBasedHold", type=Boolean.class, parameters={})
    private Output<Boolean> defaultEventBasedHold;

    /**
     * @return The default value for event-based hold on newly created objects in this bucket. Event-based hold is a way to retain objects indefinitely until an event occurs, signified by the hold's release. After being released, such objects will be subject to bucket-level retention (if any). One sample use case of this flag is for banks to hold loan documents for at least 3 years after loan is paid in full. Here, bucket-level retention is 3 years and the event is loan being paid in full. In this example, these objects will be held intact for any number of years until the event has occurred (event-based hold on the object is released) and then 3 more years after that. That means retention duration of the objects begins from the moment event-based hold transitioned from true to false. Objects under event-based hold cannot be deleted, overwritten or archived until the hold is removed.
     * 
     */
    public Output<Boolean> defaultEventBasedHold() {
        return this.defaultEventBasedHold;
    }
    /**
     * Default access controls to apply to new objects when no ACL is provided.
     * 
     */
    @Export(name="defaultObjectAcl", type=List.class, parameters={ObjectAccessControlResponse.class})
    private Output<List<ObjectAccessControlResponse>> defaultObjectAcl;

    /**
     * @return Default access controls to apply to new objects when no ACL is provided.
     * 
     */
    public Output<List<ObjectAccessControlResponse>> defaultObjectAcl() {
        return this.defaultObjectAcl;
    }
    /**
     * Encryption configuration for a bucket.
     * 
     */
    @Export(name="encryption", type=BucketEncryptionResponse.class, parameters={})
    private Output<BucketEncryptionResponse> encryption;

    /**
     * @return Encryption configuration for a bucket.
     * 
     */
    public Output<BucketEncryptionResponse> encryption() {
        return this.encryption;
    }
    /**
     * HTTP 1.1 Entity tag for the bucket.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return HTTP 1.1 Entity tag for the bucket.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The bucket's IAM configuration.
     * 
     */
    @Export(name="iamConfiguration", type=BucketIamConfigurationResponse.class, parameters={})
    private Output<BucketIamConfigurationResponse> iamConfiguration;

    /**
     * @return The bucket's IAM configuration.
     * 
     */
    public Output<BucketIamConfigurationResponse> iamConfiguration() {
        return this.iamConfiguration;
    }
    /**
     * The kind of item this is. For buckets, this is always storage#bucket.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of item this is. For buckets, this is always storage#bucket.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * User-provided labels, in key/value pairs.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return User-provided labels, in key/value pairs.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The bucket's lifecycle configuration. See lifecycle management for more information.
     * 
     */
    @Export(name="lifecycle", type=BucketLifecycleResponse.class, parameters={})
    private Output<BucketLifecycleResponse> lifecycle;

    /**
     * @return The bucket's lifecycle configuration. See lifecycle management for more information.
     * 
     */
    public Output<BucketLifecycleResponse> lifecycle() {
        return this.lifecycle;
    }
    /**
     * The location of the bucket. Object data for objects in the bucket resides in physical storage within this region. Defaults to US. See the developer's guide for the authoritative list.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the bucket. Object data for objects in the bucket resides in physical storage within this region. Defaults to US. See the developer's guide for the authoritative list.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The type of the bucket location.
     * 
     */
    @Export(name="locationType", type=String.class, parameters={})
    private Output<String> locationType;

    /**
     * @return The type of the bucket location.
     * 
     */
    public Output<String> locationType() {
        return this.locationType;
    }
    /**
     * The bucket's logging configuration, which defines the destination bucket and optional name prefix for the current bucket's logs.
     * 
     */
    @Export(name="logging", type=BucketLoggingResponse.class, parameters={})
    private Output<BucketLoggingResponse> logging;

    /**
     * @return The bucket's logging configuration, which defines the destination bucket and optional name prefix for the current bucket's logs.
     * 
     */
    public Output<BucketLoggingResponse> logging() {
        return this.logging;
    }
    /**
     * The metadata generation of this bucket.
     * 
     */
    @Export(name="metageneration", type=String.class, parameters={})
    private Output<String> metageneration;

    /**
     * @return The metadata generation of this bucket.
     * 
     */
    public Output<String> metageneration() {
        return this.metageneration;
    }
    /**
     * The name of the bucket.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the bucket.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The owner of the bucket. This is always the project team's owner group.
     * 
     */
    @Export(name="owner", type=BucketOwnerResponse.class, parameters={})
    private Output<BucketOwnerResponse> owner;

    /**
     * @return The owner of the bucket. This is always the project team's owner group.
     * 
     */
    public Output<BucketOwnerResponse> owner() {
        return this.owner;
    }
    /**
     * The project number of the project the bucket belongs to.
     * 
     */
    @Export(name="projectNumber", type=String.class, parameters={})
    private Output<String> projectNumber;

    /**
     * @return The project number of the project the bucket belongs to.
     * 
     */
    public Output<String> projectNumber() {
        return this.projectNumber;
    }
    /**
     * The bucket's retention policy. The retention policy enforces a minimum retention time for all objects contained in the bucket, based on their creation time. Any attempt to overwrite or delete objects younger than the retention period will result in a PERMISSION_DENIED error. An unlocked retention policy can be modified or removed from the bucket via a storage.buckets.update operation. A locked retention policy cannot be removed or shortened in duration for the lifetime of the bucket. Attempting to remove or decrease period of a locked retention policy will result in a PERMISSION_DENIED error.
     * 
     */
    @Export(name="retentionPolicy", type=BucketRetentionPolicyResponse.class, parameters={})
    private Output<BucketRetentionPolicyResponse> retentionPolicy;

    /**
     * @return The bucket's retention policy. The retention policy enforces a minimum retention time for all objects contained in the bucket, based on their creation time. Any attempt to overwrite or delete objects younger than the retention period will result in a PERMISSION_DENIED error. An unlocked retention policy can be modified or removed from the bucket via a storage.buckets.update operation. A locked retention policy cannot be removed or shortened in duration for the lifetime of the bucket. Attempting to remove or decrease period of a locked retention policy will result in a PERMISSION_DENIED error.
     * 
     */
    public Output<BucketRetentionPolicyResponse> retentionPolicy() {
        return this.retentionPolicy;
    }
    /**
     * The Recovery Point Objective (RPO) of this bucket. Set to ASYNC_TURBO to turn on Turbo Replication on a bucket.
     * 
     */
    @Export(name="rpo", type=String.class, parameters={})
    private Output<String> rpo;

    /**
     * @return The Recovery Point Objective (RPO) of this bucket. Set to ASYNC_TURBO to turn on Turbo Replication on a bucket.
     * 
     */
    public Output<String> rpo() {
        return this.rpo;
    }
    /**
     * Reserved for future use.
     * 
     */
    @Export(name="satisfiesPZS", type=Boolean.class, parameters={})
    private Output<Boolean> satisfiesPZS;

    /**
     * @return Reserved for future use.
     * 
     */
    public Output<Boolean> satisfiesPZS() {
        return this.satisfiesPZS;
    }
    /**
     * The URI of this bucket.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of this bucket.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * The bucket's default storage class, used whenever no storageClass is specified for a newly-created object. This defines how objects in the bucket are stored and determines the SLA and the cost of storage. Values include MULTI_REGIONAL, REGIONAL, STANDARD, NEARLINE, COLDLINE, ARCHIVE, and DURABLE_REDUCED_AVAILABILITY. If this value is not specified when the bucket is created, it will default to STANDARD. For more information, see storage classes.
     * 
     */
    @Export(name="storageClass", type=String.class, parameters={})
    private Output<String> storageClass;

    /**
     * @return The bucket's default storage class, used whenever no storageClass is specified for a newly-created object. This defines how objects in the bucket are stored and determines the SLA and the cost of storage. Values include MULTI_REGIONAL, REGIONAL, STANDARD, NEARLINE, COLDLINE, ARCHIVE, and DURABLE_REDUCED_AVAILABILITY. If this value is not specified when the bucket is created, it will default to STANDARD. For more information, see storage classes.
     * 
     */
    public Output<String> storageClass() {
        return this.storageClass;
    }
    /**
     * The creation time of the bucket in RFC 3339 format.
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The creation time of the bucket in RFC 3339 format.
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * The modification time of the bucket in RFC 3339 format.
     * 
     */
    @Export(name="updated", type=String.class, parameters={})
    private Output<String> updated;

    /**
     * @return The modification time of the bucket in RFC 3339 format.
     * 
     */
    public Output<String> updated() {
        return this.updated;
    }
    /**
     * The bucket's versioning configuration.
     * 
     */
    @Export(name="versioning", type=BucketVersioningResponse.class, parameters={})
    private Output<BucketVersioningResponse> versioning;

    /**
     * @return The bucket's versioning configuration.
     * 
     */
    public Output<BucketVersioningResponse> versioning() {
        return this.versioning;
    }
    /**
     * The bucket's website configuration, controlling how the service behaves when accessing bucket contents as a web site. See the Static Website Examples for more information.
     * 
     */
    @Export(name="website", type=BucketWebsiteResponse.class, parameters={})
    private Output<BucketWebsiteResponse> website;

    /**
     * @return The bucket's website configuration, controlling how the service behaves when accessing bucket contents as a web site. See the Static Website Examples for more information.
     * 
     */
    public Output<BucketWebsiteResponse> website() {
        return this.website;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Bucket(String name) {
        this(name, BucketArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Bucket(String name, @Nullable BucketArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Bucket(String name, @Nullable BucketArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:storage/v1:Bucket", name, args == null ? BucketArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Bucket(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:storage/v1:Bucket", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Bucket get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Bucket(name, id, options);
    }
}
