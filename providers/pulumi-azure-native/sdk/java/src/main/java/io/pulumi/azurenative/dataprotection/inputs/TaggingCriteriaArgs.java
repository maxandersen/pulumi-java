// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.inputs.RetentionTagArgs;
import io.pulumi.azurenative.dataprotection.inputs.ScheduleBasedBackupCriteriaArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Tagging criteria
 * 
 */
public final class TaggingCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaggingCriteriaArgs Empty = new TaggingCriteriaArgs();

    /**
     * Criteria which decides whether the tag can be applied to a triggered backup.
     * 
     */
    @Import(name="criteria")
      private final @Nullable Output<List<ScheduleBasedBackupCriteriaArgs>> criteria;

    public Output<List<ScheduleBasedBackupCriteriaArgs>> criteria() {
        return this.criteria == null ? Codegen.empty() : this.criteria;
    }

    /**
     * Specifies if tag is default.
     * 
     */
    @Import(name="isDefault", required=true)
      private final Output<Boolean> isDefault;

    public Output<Boolean> isDefault() {
        return this.isDefault;
    }

    /**
     * Retention tag information
     * 
     */
    @Import(name="tagInfo", required=true)
      private final Output<RetentionTagArgs> tagInfo;

    public Output<RetentionTagArgs> tagInfo() {
        return this.tagInfo;
    }

    /**
     * Retention Tag priority.
     * 
     */
    @Import(name="taggingPriority", required=true)
      private final Output<Double> taggingPriority;

    public Output<Double> taggingPriority() {
        return this.taggingPriority;
    }

    public TaggingCriteriaArgs(
        @Nullable Output<List<ScheduleBasedBackupCriteriaArgs>> criteria,
        Output<Boolean> isDefault,
        Output<RetentionTagArgs> tagInfo,
        Output<Double> taggingPriority) {
        this.criteria = criteria;
        this.isDefault = Objects.requireNonNull(isDefault, "expected parameter 'isDefault' to be non-null");
        this.tagInfo = Objects.requireNonNull(tagInfo, "expected parameter 'tagInfo' to be non-null");
        this.taggingPriority = Objects.requireNonNull(taggingPriority, "expected parameter 'taggingPriority' to be non-null");
    }

    private TaggingCriteriaArgs() {
        this.criteria = Codegen.empty();
        this.isDefault = Codegen.empty();
        this.tagInfo = Codegen.empty();
        this.taggingPriority = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaggingCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ScheduleBasedBackupCriteriaArgs>> criteria;
        private Output<Boolean> isDefault;
        private Output<RetentionTagArgs> tagInfo;
        private Output<Double> taggingPriority;

        public Builder() {
    	      // Empty
        }

        public Builder(TaggingCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criteria = defaults.criteria;
    	      this.isDefault = defaults.isDefault;
    	      this.tagInfo = defaults.tagInfo;
    	      this.taggingPriority = defaults.taggingPriority;
        }

        public Builder criteria(@Nullable Output<List<ScheduleBasedBackupCriteriaArgs>> criteria) {
            this.criteria = criteria;
            return this;
        }
        public Builder criteria(@Nullable List<ScheduleBasedBackupCriteriaArgs> criteria) {
            this.criteria = Codegen.ofNullable(criteria);
            return this;
        }
        public Builder criteria(ScheduleBasedBackupCriteriaArgs... criteria) {
            return criteria(List.of(criteria));
        }
        public Builder isDefault(Output<Boolean> isDefault) {
            this.isDefault = Objects.requireNonNull(isDefault);
            return this;
        }
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = Output.of(Objects.requireNonNull(isDefault));
            return this;
        }
        public Builder tagInfo(Output<RetentionTagArgs> tagInfo) {
            this.tagInfo = Objects.requireNonNull(tagInfo);
            return this;
        }
        public Builder tagInfo(RetentionTagArgs tagInfo) {
            this.tagInfo = Output.of(Objects.requireNonNull(tagInfo));
            return this;
        }
        public Builder taggingPriority(Output<Double> taggingPriority) {
            this.taggingPriority = Objects.requireNonNull(taggingPriority);
            return this;
        }
        public Builder taggingPriority(Double taggingPriority) {
            this.taggingPriority = Output.of(Objects.requireNonNull(taggingPriority));
            return this;
        }        public TaggingCriteriaArgs build() {
            return new TaggingCriteriaArgs(criteria, isDefault, tagInfo, taggingPriority);
        }
    }
}
