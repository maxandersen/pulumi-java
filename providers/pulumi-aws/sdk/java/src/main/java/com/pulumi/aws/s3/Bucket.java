// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.s3.BucketArgs;
import com.pulumi.aws.s3.inputs.BucketState;
import com.pulumi.aws.s3.outputs.BucketCorsRule;
import com.pulumi.aws.s3.outputs.BucketGrant;
import com.pulumi.aws.s3.outputs.BucketLifecycleRule;
import com.pulumi.aws.s3.outputs.BucketLogging;
import com.pulumi.aws.s3.outputs.BucketObjectLockConfiguration;
import com.pulumi.aws.s3.outputs.BucketReplicationConfiguration;
import com.pulumi.aws.s3.outputs.BucketServerSideEncryptionConfiguration;
import com.pulumi.aws.s3.outputs.BucketVersioning;
import com.pulumi.aws.s3.outputs.BucketWebsite;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a S3 bucket resource.
 * 
 * > This functionality is for managing S3 in an AWS Partition. To manage [S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/dev/S3onOutposts.html), see the `aws.s3control.Bucket` resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * S3 bucket can be imported using the `bucket`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:s3/bucket:Bucket bucket bucket-name
 * ```
 * 
 *  The `policy` argument is not imported and will be deprecated in a future version of the provider. Use the `aws_s3_bucket_policy` resource to manage the S3 Bucket Policy instead.
 * 
 */
@ResourceType(type="aws:s3/bucket:Bucket")
public class Bucket extends com.pulumi.resources.CustomResource {
    /**
     * Sets the accelerate configuration of an existing bucket. Can be `Enabled` or `Suspended`.
     * 
     */
    @Export(name="accelerationStatus", type=String.class, parameters={})
    private Output<String> accelerationStatus;

    /**
     * @return Sets the accelerate configuration of an existing bucket. Can be `Enabled` or `Suspended`.
     * 
     */
    public Output<String> accelerationStatus() {
        return this.accelerationStatus;
    }
    /**
     * The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Valid values are `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, and `log-delivery-write`. Defaults to `private`.  Conflicts with `grant`.
     * 
     */
    @Export(name="acl", type=String.class, parameters={})
    private Output</* @Nullable */ String> acl;

    /**
     * @return The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Valid values are `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, and `log-delivery-write`. Defaults to `private`.  Conflicts with `grant`.
     * 
     */
    public Output</* @Nullable */ String> acl() {
        return this.acl;
    }
    /**
     * The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The name of the bucket. If omitted, this provider will assign a random, unique name. Must be lowercase and less than or equal to 63 characters in length. A full list of bucket naming rules [may be found here](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
     * 
     */
    @Export(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return The name of the bucket. If omitted, this provider will assign a random, unique name. Must be lowercase and less than or equal to 63 characters in length. A full list of bucket naming rules [may be found here](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * The bucket domain name. Will be of format `bucketname.s3.amazonaws.com`.
     * 
     */
    @Export(name="bucketDomainName", type=String.class, parameters={})
    private Output<String> bucketDomainName;

    /**
     * @return The bucket domain name. Will be of format `bucketname.s3.amazonaws.com`.
     * 
     */
    public Output<String> bucketDomainName() {
        return this.bucketDomainName;
    }
    /**
     * Creates a unique bucket name beginning with the specified prefix. Conflicts with `bucket`. Must be lowercase and less than or equal to 37 characters in length. A full list of bucket naming rules [may be found here](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
     * 
     */
    @Export(name="bucketPrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> bucketPrefix;

    /**
     * @return Creates a unique bucket name beginning with the specified prefix. Conflicts with `bucket`. Must be lowercase and less than or equal to 37 characters in length. A full list of bucket naming rules [may be found here](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
     * 
     */
    public Output</* @Nullable */ String> bucketPrefix() {
        return this.bucketPrefix;
    }
    /**
     * The bucket region-specific domain name. The bucket domain name including the region name, please refer [here](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region) for format. Note: The AWS CloudFront allows specifying S3 region-specific endpoint when creating S3 origin, it will prevent [redirect issues](https://forums.aws.amazon.com/thread.jspa?threadID=216814) from CloudFront to S3 Origin URL.
     * 
     */
    @Export(name="bucketRegionalDomainName", type=String.class, parameters={})
    private Output<String> bucketRegionalDomainName;

    /**
     * @return The bucket region-specific domain name. The bucket domain name including the region name, please refer [here](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region) for format. Note: The AWS CloudFront allows specifying S3 region-specific endpoint when creating S3 origin, it will prevent [redirect issues](https://forums.aws.amazon.com/thread.jspa?threadID=216814) from CloudFront to S3 Origin URL.
     * 
     */
    public Output<String> bucketRegionalDomainName() {
        return this.bucketRegionalDomainName;
    }
    /**
     * A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
     * 
     */
    @Export(name="corsRules", type=List.class, parameters={BucketCorsRule.class})
    private Output</* @Nullable */ List<BucketCorsRule>> corsRules;

    /**
     * @return A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
     * 
     */
    public Output</* @Nullable */ List<BucketCorsRule>> corsRules() {
        return this.corsRules;
    }
    /**
     * A boolean that indicates all objects (including any [locked objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html)) should be deleted from the bucket so that the bucket can be destroyed without error. These objects are *not* recoverable.
     * 
     */
    @Export(name="forceDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return A boolean that indicates all objects (including any [locked objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html)) should be deleted from the bucket so that the bucket can be destroyed without error. These objects are *not* recoverable.
     * 
     */
    public Output</* @Nullable */ Boolean> forceDestroy() {
        return this.forceDestroy;
    }
    /**
     * An [ACL policy grant](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl) (documented below). Conflicts with `acl`.
     * 
     */
    @Export(name="grants", type=List.class, parameters={BucketGrant.class})
    private Output</* @Nullable */ List<BucketGrant>> grants;

    /**
     * @return An [ACL policy grant](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl) (documented below). Conflicts with `acl`.
     * 
     */
    public Output</* @Nullable */ List<BucketGrant>> grants() {
        return this.grants;
    }
    /**
     * The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket's region.
     * 
     */
    @Export(name="hostedZoneId", type=String.class, parameters={})
    private Output<String> hostedZoneId;

    /**
     * @return The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket's region.
     * 
     */
    public Output<String> hostedZoneId() {
        return this.hostedZoneId;
    }
    /**
     * A configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) (documented below).
     * 
     */
    @Export(name="lifecycleRules", type=List.class, parameters={BucketLifecycleRule.class})
    private Output</* @Nullable */ List<BucketLifecycleRule>> lifecycleRules;

    /**
     * @return A configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) (documented below).
     * 
     */
    public Output</* @Nullable */ List<BucketLifecycleRule>> lifecycleRules() {
        return this.lifecycleRules;
    }
    /**
     * A settings of [bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) (documented below).
     * 
     */
    @Export(name="loggings", type=List.class, parameters={BucketLogging.class})
    private Output</* @Nullable */ List<BucketLogging>> loggings;

    /**
     * @return A settings of [bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) (documented below).
     * 
     */
    public Output</* @Nullable */ List<BucketLogging>> loggings() {
        return this.loggings;
    }
    /**
     * A configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) (documented below)
     * 
     */
    @Export(name="objectLockConfiguration", type=BucketObjectLockConfiguration.class, parameters={})
    private Output</* @Nullable */ BucketObjectLockConfiguration> objectLockConfiguration;

    /**
     * @return A configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) (documented below)
     * 
     */
    public Output</* @Nullable */ BucketObjectLockConfiguration> objectLockConfiguration() {
        return this.objectLockConfiguration;
    }
    /**
     * A valid [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html) JSON document. Note that if the policy document is not specific enough (but still valid), the provider may view the policy as constantly changing in a `pulumi up / preview / update`. In this case, please make sure you use the verbose/specific version of the policy.
     * 
     */
    @Export(name="policy", type=String.class, parameters={})
    private Output</* @Nullable */ String> policy;

    /**
     * @return A valid [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html) JSON document. Note that if the policy document is not specific enough (but still valid), the provider may view the policy as constantly changing in a `pulumi up / preview / update`. In this case, please make sure you use the verbose/specific version of the policy.
     * 
     */
    public Output</* @Nullable */ String> policy() {
        return this.policy;
    }
    /**
     * The AWS region this bucket resides in.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The AWS region this bucket resides in.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * A configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html) (documented below).
     * 
     */
    @Export(name="replicationConfiguration", type=BucketReplicationConfiguration.class, parameters={})
    private Output</* @Nullable */ BucketReplicationConfiguration> replicationConfiguration;

    /**
     * @return A configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html) (documented below).
     * 
     */
    public Output</* @Nullable */ BucketReplicationConfiguration> replicationConfiguration() {
        return this.replicationConfiguration;
    }
    /**
     * Specifies who should bear the cost of Amazon S3 data transfer.
     * Can be either `BucketOwner` or `Requester`. By default, the owner of the S3 bucket would incur
     * the costs of any data transfer. See [Requester Pays Buckets](http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html)
     * developer guide for more information.
     * 
     */
    @Export(name="requestPayer", type=String.class, parameters={})
    private Output<String> requestPayer;

    /**
     * @return Specifies who should bear the cost of Amazon S3 data transfer.
     * Can be either `BucketOwner` or `Requester`. By default, the owner of the S3 bucket would incur
     * the costs of any data transfer. See [Requester Pays Buckets](http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html)
     * developer guide for more information.
     * 
     */
    public Output<String> requestPayer() {
        return this.requestPayer;
    }
    /**
     * A configuration of [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html) (documented below)
     * 
     */
    @Export(name="serverSideEncryptionConfiguration", type=BucketServerSideEncryptionConfiguration.class, parameters={})
    private Output</* @Nullable */ BucketServerSideEncryptionConfiguration> serverSideEncryptionConfiguration;

    /**
     * @return A configuration of [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html) (documented below)
     * 
     */
    public Output</* @Nullable */ BucketServerSideEncryptionConfiguration> serverSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration;
    }
    /**
     * A mapping of tags to assign to the bucket.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the bucket.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
     * 
     */
    @Export(name="versioning", type=BucketVersioning.class, parameters={})
    private Output<BucketVersioning> versioning;

    /**
     * @return A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
     * 
     */
    public Output<BucketVersioning> versioning() {
        return this.versioning;
    }
    /**
     * A website object (documented below).
     * 
     */
    @Export(name="website", type=BucketWebsite.class, parameters={})
    private Output</* @Nullable */ BucketWebsite> website;

    /**
     * @return A website object (documented below).
     * 
     */
    public Output</* @Nullable */ BucketWebsite> website() {
        return this.website;
    }
    /**
     * The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
     * 
     */
    @Export(name="websiteDomain", type=String.class, parameters={})
    private Output<String> websiteDomain;

    /**
     * @return The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
     * 
     */
    public Output<String> websiteDomain() {
        return this.websiteDomain;
    }
    /**
     * The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
     * 
     */
    @Export(name="websiteEndpoint", type=String.class, parameters={})
    private Output<String> websiteEndpoint;

    /**
     * @return The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
     * 
     */
    public Output<String> websiteEndpoint() {
        return this.websiteEndpoint;
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
        super("aws:s3/bucket:Bucket", name, args == null ? BucketArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Bucket(String name, Output<String> id, @Nullable BucketState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucket:Bucket", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Bucket get(String name, Output<String> id, @Nullable BucketState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Bucket(name, id, state, options);
    }
}
