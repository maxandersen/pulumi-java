// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3control.inputs;

import com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MultiRegionAccessPointState extends com.pulumi.resources.ResourceArgs {

    public static final MultiRegionAccessPointState Empty = new MultiRegionAccessPointState();

    /**
     * The AWS account ID for the owner of the buckets for which you want to create a Multi-Region Access Point. Defaults to automatically determined account ID of the AWS provider.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The alias for the Multi-Region Access Point.
     * 
     */
    @Import(name="alias")
    private @Nullable Output<String> alias;

    public Optional<Output<String>> alias() {
        return Optional.ofNullable(this.alias);
    }

    /**
     * Amazon Resource Name (ARN) of the Multi-Region Access Point.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * A configuration block containing details about the Multi-Region Access Point. See Details Configuration Block below for more details
     * 
     */
    @Import(name="details")
    private @Nullable Output<MultiRegionAccessPointDetailsGetArgs> details;

    public Optional<Output<MultiRegionAccessPointDetailsGetArgs>> details() {
        return Optional.ofNullable(this.details);
    }

    /**
     * The DNS domain name of the S3 Multi-Region Access Point in the format _`alias`_.accesspoint.s3-global.amazonaws.com. For more information, see the documentation on [Multi-Region Access Point Requests](https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointRequests.html).
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * The current status of the Multi-Region Access Point. One of: `READY`, `INCONSISTENT_ACROSS_REGIONS`, `CREATING`, `PARTIALLY_CREATED`, `PARTIALLY_DELETED`, `DELETING`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private MultiRegionAccessPointState() {}

    private MultiRegionAccessPointState(MultiRegionAccessPointState $) {
        this.accountId = $.accountId;
        this.alias = $.alias;
        this.arn = $.arn;
        this.details = $.details;
        this.domainName = $.domainName;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MultiRegionAccessPointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MultiRegionAccessPointState $;

        public Builder() {
            $ = new MultiRegionAccessPointState();
        }

        public Builder(MultiRegionAccessPointState defaults) {
            $ = new MultiRegionAccessPointState(Objects.requireNonNull(defaults));
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        public Builder alias(@Nullable Output<String> alias) {
            $.alias = alias;
            return this;
        }

        public Builder alias(String alias) {
            return alias(Output.of(alias));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder details(@Nullable Output<MultiRegionAccessPointDetailsGetArgs> details) {
            $.details = details;
            return this;
        }

        public Builder details(MultiRegionAccessPointDetailsGetArgs details) {
            return details(Output.of(details));
        }

        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public MultiRegionAccessPointState build() {
            return $;
        }
    }

}
