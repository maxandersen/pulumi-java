// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.xray;

import com.pulumi.awsnative.xray.inputs.SamplingRuleRecordArgs;
import com.pulumi.awsnative.xray.inputs.SamplingRuleUpdateArgs;
import com.pulumi.awsnative.xray.inputs.TagsItemPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SamplingRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SamplingRuleArgs Empty = new SamplingRuleArgs();

    @Import(name="ruleName")
    private @Nullable Output<String> ruleName;

    public Optional<Output<String>> ruleName() {
        return Optional.ofNullable(this.ruleName);
    }

    @Import(name="samplingRule")
    private @Nullable Output<com.pulumi.awsnative.xray.inputs.SamplingRuleArgs> samplingRule;

    public Optional<Output<com.pulumi.awsnative.xray.inputs.SamplingRuleArgs>> samplingRule() {
        return Optional.ofNullable(this.samplingRule);
    }

    @Import(name="samplingRuleRecord")
    private @Nullable Output<SamplingRuleRecordArgs> samplingRuleRecord;

    public Optional<Output<SamplingRuleRecordArgs>> samplingRuleRecord() {
        return Optional.ofNullable(this.samplingRuleRecord);
    }

    @Import(name="samplingRuleUpdate")
    private @Nullable Output<SamplingRuleUpdateArgs> samplingRuleUpdate;

    public Optional<Output<SamplingRuleUpdateArgs>> samplingRuleUpdate() {
        return Optional.ofNullable(this.samplingRuleUpdate);
    }

    @Import(name="tags")
    private @Nullable Output<List<TagsItemPropertiesArgs>> tags;

    public Optional<Output<List<TagsItemPropertiesArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SamplingRuleArgs() {}

    private SamplingRuleArgs(SamplingRuleArgs $) {
        this.ruleName = $.ruleName;
        this.samplingRule = $.samplingRule;
        this.samplingRuleRecord = $.samplingRuleRecord;
        this.samplingRuleUpdate = $.samplingRuleUpdate;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SamplingRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SamplingRuleArgs $;

        public Builder() {
            $ = new SamplingRuleArgs();
        }

        public Builder(SamplingRuleArgs defaults) {
            $ = new SamplingRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder ruleName(@Nullable Output<String> ruleName) {
            $.ruleName = ruleName;
            return this;
        }

        public Builder ruleName(String ruleName) {
            return ruleName(Output.of(ruleName));
        }

        public Builder samplingRule(@Nullable Output<com.pulumi.awsnative.xray.inputs.SamplingRuleArgs> samplingRule) {
            $.samplingRule = samplingRule;
            return this;
        }

        public Builder samplingRule(com.pulumi.awsnative.xray.inputs.SamplingRuleArgs samplingRule) {
            return samplingRule(Output.of(samplingRule));
        }

        public Builder samplingRuleRecord(@Nullable Output<SamplingRuleRecordArgs> samplingRuleRecord) {
            $.samplingRuleRecord = samplingRuleRecord;
            return this;
        }

        public Builder samplingRuleRecord(SamplingRuleRecordArgs samplingRuleRecord) {
            return samplingRuleRecord(Output.of(samplingRuleRecord));
        }

        public Builder samplingRuleUpdate(@Nullable Output<SamplingRuleUpdateArgs> samplingRuleUpdate) {
            $.samplingRuleUpdate = samplingRuleUpdate;
            return this;
        }

        public Builder samplingRuleUpdate(SamplingRuleUpdateArgs samplingRuleUpdate) {
            return samplingRuleUpdate(Output.of(samplingRuleUpdate));
        }

        public Builder tags(@Nullable Output<List<TagsItemPropertiesArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<TagsItemPropertiesArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(TagsItemPropertiesArgs... tags) {
            return tags(List.of(tags));
        }

        public SamplingRuleArgs build() {
            return $;
        }
    }

}
