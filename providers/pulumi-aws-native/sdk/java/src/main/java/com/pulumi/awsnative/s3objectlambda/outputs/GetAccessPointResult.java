// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3objectlambda.outputs;

import com.pulumi.awsnative.s3objectlambda.outputs.AccessPointObjectLambdaConfiguration;
import com.pulumi.awsnative.s3objectlambda.outputs.AccessPointPublicAccessBlockConfiguration;
import com.pulumi.awsnative.s3objectlambda.outputs.PolicyStatusProperties;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccessPointResult {
    private final @Nullable String arn;
    /**
     * @return The date and time when the Object lambda Access Point was created.
     * 
     */
    private final @Nullable String creationDate;
    /**
     * @return The Object lambda Access Point Configuration that configures transformations to be applied on the objects on specified S3 Actions
     * 
     */
    private final @Nullable AccessPointObjectLambdaConfiguration objectLambdaConfiguration;
    private final @Nullable PolicyStatusProperties policyStatus;
    /**
     * @return The PublicAccessBlock configuration that you want to apply to this Access Point. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status &#39;The Meaning of Public&#39; in the Amazon Simple Storage Service Developer Guide.
     * 
     */
    private final @Nullable AccessPointPublicAccessBlockConfiguration publicAccessBlockConfiguration;

    @CustomType.Constructor
    private GetAccessPointResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("creationDate") @Nullable String creationDate,
        @CustomType.Parameter("objectLambdaConfiguration") @Nullable AccessPointObjectLambdaConfiguration objectLambdaConfiguration,
        @CustomType.Parameter("policyStatus") @Nullable PolicyStatusProperties policyStatus,
        @CustomType.Parameter("publicAccessBlockConfiguration") @Nullable AccessPointPublicAccessBlockConfiguration publicAccessBlockConfiguration) {
        this.arn = arn;
        this.creationDate = creationDate;
        this.objectLambdaConfiguration = objectLambdaConfiguration;
        this.policyStatus = policyStatus;
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
    }

    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return The date and time when the Object lambda Access Point was created.
     * 
     */
    public Optional<String> creationDate() {
        return Optional.ofNullable(this.creationDate);
    }
    /**
     * @return The Object lambda Access Point Configuration that configures transformations to be applied on the objects on specified S3 Actions
     * 
     */
    public Optional<AccessPointObjectLambdaConfiguration> objectLambdaConfiguration() {
        return Optional.ofNullable(this.objectLambdaConfiguration);
    }
    public Optional<PolicyStatusProperties> policyStatus() {
        return Optional.ofNullable(this.policyStatus);
    }
    /**
     * @return The PublicAccessBlock configuration that you want to apply to this Access Point. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status &#39;The Meaning of Public&#39; in the Amazon Simple Storage Service Developer Guide.
     * 
     */
    public Optional<AccessPointPublicAccessBlockConfiguration> publicAccessBlockConfiguration() {
        return Optional.ofNullable(this.publicAccessBlockConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPointResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String creationDate;
        private @Nullable AccessPointObjectLambdaConfiguration objectLambdaConfiguration;
        private @Nullable PolicyStatusProperties policyStatus;
        private @Nullable AccessPointPublicAccessBlockConfiguration publicAccessBlockConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessPointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.creationDate = defaults.creationDate;
    	      this.objectLambdaConfiguration = defaults.objectLambdaConfiguration;
    	      this.policyStatus = defaults.policyStatus;
    	      this.publicAccessBlockConfiguration = defaults.publicAccessBlockConfiguration;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder creationDate(@Nullable String creationDate) {
            this.creationDate = creationDate;
            return this;
        }
        public Builder objectLambdaConfiguration(@Nullable AccessPointObjectLambdaConfiguration objectLambdaConfiguration) {
            this.objectLambdaConfiguration = objectLambdaConfiguration;
            return this;
        }
        public Builder policyStatus(@Nullable PolicyStatusProperties policyStatus) {
            this.policyStatus = policyStatus;
            return this;
        }
        public Builder publicAccessBlockConfiguration(@Nullable AccessPointPublicAccessBlockConfiguration publicAccessBlockConfiguration) {
            this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
            return this;
        }        public GetAccessPointResult build() {
            return new GetAccessPointResult(arn, creationDate, objectLambdaConfiguration, policyStatus, publicAccessBlockConfiguration);
        }
    }
}
