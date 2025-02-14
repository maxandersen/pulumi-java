// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The baseline constraints resource for a monitoring job.
 * 
 */
public final class DataQualityJobDefinitionConstraintsResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataQualityJobDefinitionConstraintsResourceArgs Empty = new DataQualityJobDefinitionConstraintsResourceArgs();

    /**
     * The Amazon S3 URI for baseline constraint file in Amazon S3 that the current monitoring job should validated against.
     * 
     */
    @Import(name="s3Uri")
    private @Nullable Output<String> s3Uri;

    /**
     * @return The Amazon S3 URI for baseline constraint file in Amazon S3 that the current monitoring job should validated against.
     * 
     */
    public Optional<Output<String>> s3Uri() {
        return Optional.ofNullable(this.s3Uri);
    }

    private DataQualityJobDefinitionConstraintsResourceArgs() {}

    private DataQualityJobDefinitionConstraintsResourceArgs(DataQualityJobDefinitionConstraintsResourceArgs $) {
        this.s3Uri = $.s3Uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataQualityJobDefinitionConstraintsResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataQualityJobDefinitionConstraintsResourceArgs $;

        public Builder() {
            $ = new DataQualityJobDefinitionConstraintsResourceArgs();
        }

        public Builder(DataQualityJobDefinitionConstraintsResourceArgs defaults) {
            $ = new DataQualityJobDefinitionConstraintsResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param s3Uri The Amazon S3 URI for baseline constraint file in Amazon S3 that the current monitoring job should validated against.
         * 
         * @return builder
         * 
         */
        public Builder s3Uri(@Nullable Output<String> s3Uri) {
            $.s3Uri = s3Uri;
            return this;
        }

        /**
         * @param s3Uri The Amazon S3 URI for baseline constraint file in Amazon S3 that the current monitoring job should validated against.
         * 
         * @return builder
         * 
         */
        public Builder s3Uri(String s3Uri) {
            return s3Uri(Output.of(s3Uri));
        }

        public DataQualityJobDefinitionConstraintsResourceArgs build() {
            return $;
        }
    }

}
