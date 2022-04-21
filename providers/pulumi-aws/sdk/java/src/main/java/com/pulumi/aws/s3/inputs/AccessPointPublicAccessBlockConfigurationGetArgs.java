// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessPointPublicAccessBlockConfigurationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessPointPublicAccessBlockConfigurationGetArgs Empty = new AccessPointPublicAccessBlockConfigurationGetArgs();

    /**
     * Whether Amazon S3 should block public ACLs for buckets in this account. Defaults to `true`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
     * * PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.
     * * PUT Object calls fail if the request includes a public ACL.
     * * PUT Bucket calls fail if the request includes a public ACL.
     * 
     */
    @Import(name="blockPublicAcls")
    private @Nullable Output<Boolean> blockPublicAcls;

    public Optional<Output<Boolean>> blockPublicAcls() {
        return Optional.ofNullable(this.blockPublicAcls);
    }

    /**
     * Whether Amazon S3 should block public bucket policies for buckets in this account. Defaults to `true`. Enabling this setting does not affect existing bucket policies. When set to `true` causes Amazon S3 to:
     * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
     * 
     */
    @Import(name="blockPublicPolicy")
    private @Nullable Output<Boolean> blockPublicPolicy;

    public Optional<Output<Boolean>> blockPublicPolicy() {
        return Optional.ofNullable(this.blockPublicPolicy);
    }

    /**
     * Whether Amazon S3 should ignore public ACLs for buckets in this account. Defaults to `true`. Enabling this setting does not affect the persistence of any existing ACLs and doesn&#39;t prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
     * * Ignore all public ACLs on buckets in this account and any objects that they contain.
     * 
     */
    @Import(name="ignorePublicAcls")
    private @Nullable Output<Boolean> ignorePublicAcls;

    public Optional<Output<Boolean>> ignorePublicAcls() {
        return Optional.ofNullable(this.ignorePublicAcls);
    }

    /**
     * Whether Amazon S3 should restrict public bucket policies for buckets in this account. Defaults to `true`. Enabling this setting does not affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
     * * Only the bucket owner and AWS Services can access buckets with public policies.
     * 
     */
    @Import(name="restrictPublicBuckets")
    private @Nullable Output<Boolean> restrictPublicBuckets;

    public Optional<Output<Boolean>> restrictPublicBuckets() {
        return Optional.ofNullable(this.restrictPublicBuckets);
    }

    private AccessPointPublicAccessBlockConfigurationGetArgs() {}

    private AccessPointPublicAccessBlockConfigurationGetArgs(AccessPointPublicAccessBlockConfigurationGetArgs $) {
        this.blockPublicAcls = $.blockPublicAcls;
        this.blockPublicPolicy = $.blockPublicPolicy;
        this.ignorePublicAcls = $.ignorePublicAcls;
        this.restrictPublicBuckets = $.restrictPublicBuckets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPointPublicAccessBlockConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPointPublicAccessBlockConfigurationGetArgs $;

        public Builder() {
            $ = new AccessPointPublicAccessBlockConfigurationGetArgs();
        }

        public Builder(AccessPointPublicAccessBlockConfigurationGetArgs defaults) {
            $ = new AccessPointPublicAccessBlockConfigurationGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder blockPublicAcls(@Nullable Output<Boolean> blockPublicAcls) {
            $.blockPublicAcls = blockPublicAcls;
            return this;
        }

        public Builder blockPublicAcls(Boolean blockPublicAcls) {
            return blockPublicAcls(Output.of(blockPublicAcls));
        }

        public Builder blockPublicPolicy(@Nullable Output<Boolean> blockPublicPolicy) {
            $.blockPublicPolicy = blockPublicPolicy;
            return this;
        }

        public Builder blockPublicPolicy(Boolean blockPublicPolicy) {
            return blockPublicPolicy(Output.of(blockPublicPolicy));
        }

        public Builder ignorePublicAcls(@Nullable Output<Boolean> ignorePublicAcls) {
            $.ignorePublicAcls = ignorePublicAcls;
            return this;
        }

        public Builder ignorePublicAcls(Boolean ignorePublicAcls) {
            return ignorePublicAcls(Output.of(ignorePublicAcls));
        }

        public Builder restrictPublicBuckets(@Nullable Output<Boolean> restrictPublicBuckets) {
            $.restrictPublicBuckets = restrictPublicBuckets;
            return this;
        }

        public Builder restrictPublicBuckets(Boolean restrictPublicBuckets) {
            return restrictPublicBuckets(Output.of(restrictPublicBuckets));
        }

        public AccessPointPublicAccessBlockConfigurationGetArgs build() {
            return $;
        }
    }

}
