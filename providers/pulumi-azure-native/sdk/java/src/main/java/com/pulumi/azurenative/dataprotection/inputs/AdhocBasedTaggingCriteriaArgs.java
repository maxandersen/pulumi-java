// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.azurenative.dataprotection.inputs.RetentionTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Adhoc backup tagging criteria
 * 
 */
public final class AdhocBasedTaggingCriteriaArgs extends ResourceArgs {

    public static final AdhocBasedTaggingCriteriaArgs Empty = new AdhocBasedTaggingCriteriaArgs();

    /**
     * Retention tag information
     * 
     */
    @Import(name="tagInfo")
    private @Nullable Output<RetentionTagArgs> tagInfo;

    /**
     * @return Retention tag information
     * 
     */
    public Optional<Output<RetentionTagArgs>> tagInfo() {
        return Optional.ofNullable(this.tagInfo);
    }

    private AdhocBasedTaggingCriteriaArgs() {}

    private AdhocBasedTaggingCriteriaArgs(AdhocBasedTaggingCriteriaArgs $) {
        this.tagInfo = $.tagInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdhocBasedTaggingCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdhocBasedTaggingCriteriaArgs $;

        public Builder() {
            $ = new AdhocBasedTaggingCriteriaArgs();
        }

        public Builder(AdhocBasedTaggingCriteriaArgs defaults) {
            $ = new AdhocBasedTaggingCriteriaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param tagInfo Retention tag information
         * 
         * @return builder
         * 
         */
        public Builder tagInfo(@Nullable Output<RetentionTagArgs> tagInfo) {
            $.tagInfo = tagInfo;
            return this;
        }

        /**
         * @param tagInfo Retention tag information
         * 
         * @return builder
         * 
         */
        public Builder tagInfo(RetentionTagArgs tagInfo) {
            return tagInfo(Output.of(tagInfo));
        }

        public AdhocBasedTaggingCriteriaArgs build() {
            return $;
        }
    }

}
