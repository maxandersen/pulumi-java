// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticbeanstalk.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationAppversionLifecycleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationAppversionLifecycleGetArgs Empty = new ApplicationAppversionLifecycleGetArgs();

    /**
     * Set to `true` to delete a version&#39;s source bundle from S3 when the application version is deleted.
     * 
     */
    @Import(name="deleteSourceFromS3")
    private @Nullable Output<Boolean> deleteSourceFromS3;

    public Optional<Output<Boolean>> deleteSourceFromS3() {
        return Optional.ofNullable(this.deleteSourceFromS3);
    }

    /**
     * The number of days to retain an application version (&#39;max_age_in_days&#39; and &#39;max_count&#39; cannot be enabled simultaneously.).
     * 
     */
    @Import(name="maxAgeInDays")
    private @Nullable Output<Integer> maxAgeInDays;

    public Optional<Output<Integer>> maxAgeInDays() {
        return Optional.ofNullable(this.maxAgeInDays);
    }

    /**
     * The maximum number of application versions to retain (&#39;max_age_in_days&#39; and &#39;max_count&#39; cannot be enabled simultaneously.).
     * 
     */
    @Import(name="maxCount")
    private @Nullable Output<Integer> maxCount;

    public Optional<Output<Integer>> maxCount() {
        return Optional.ofNullable(this.maxCount);
    }

    /**
     * The ARN of an IAM service role under which the application version is deleted.  Elastic Beanstalk must have permission to assume this role.
     * 
     */
    @Import(name="serviceRole", required=true)
    private Output<String> serviceRole;

    public Output<String> serviceRole() {
        return this.serviceRole;
    }

    private ApplicationAppversionLifecycleGetArgs() {}

    private ApplicationAppversionLifecycleGetArgs(ApplicationAppversionLifecycleGetArgs $) {
        this.deleteSourceFromS3 = $.deleteSourceFromS3;
        this.maxAgeInDays = $.maxAgeInDays;
        this.maxCount = $.maxCount;
        this.serviceRole = $.serviceRole;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationAppversionLifecycleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationAppversionLifecycleGetArgs $;

        public Builder() {
            $ = new ApplicationAppversionLifecycleGetArgs();
        }

        public Builder(ApplicationAppversionLifecycleGetArgs defaults) {
            $ = new ApplicationAppversionLifecycleGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder deleteSourceFromS3(@Nullable Output<Boolean> deleteSourceFromS3) {
            $.deleteSourceFromS3 = deleteSourceFromS3;
            return this;
        }

        public Builder deleteSourceFromS3(Boolean deleteSourceFromS3) {
            return deleteSourceFromS3(Output.of(deleteSourceFromS3));
        }

        public Builder maxAgeInDays(@Nullable Output<Integer> maxAgeInDays) {
            $.maxAgeInDays = maxAgeInDays;
            return this;
        }

        public Builder maxAgeInDays(Integer maxAgeInDays) {
            return maxAgeInDays(Output.of(maxAgeInDays));
        }

        public Builder maxCount(@Nullable Output<Integer> maxCount) {
            $.maxCount = maxCount;
            return this;
        }

        public Builder maxCount(Integer maxCount) {
            return maxCount(Output.of(maxCount));
        }

        public Builder serviceRole(Output<String> serviceRole) {
            $.serviceRole = serviceRole;
            return this;
        }

        public Builder serviceRole(String serviceRole) {
            return serviceRole(Output.of(serviceRole));
        }

        public ApplicationAppversionLifecycleGetArgs build() {
            $.serviceRole = Objects.requireNonNull($.serviceRole, "expected parameter 'serviceRole' to be non-null");
            return $;
        }
    }

}
