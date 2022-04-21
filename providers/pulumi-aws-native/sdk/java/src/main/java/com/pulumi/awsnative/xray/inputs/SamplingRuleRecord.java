// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.xray.inputs;

import com.pulumi.awsnative.xray.inputs.SamplingRule;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SamplingRuleRecord extends com.pulumi.resources.InvokeArgs {

    public static final SamplingRuleRecord Empty = new SamplingRuleRecord();

    /**
     * When the rule was created, in Unix time seconds.
     * 
     */
    @Import(name="createdAt")
    private @Nullable String createdAt;

    public Optional<String> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * When the rule was modified, in Unix time seconds.
     * 
     */
    @Import(name="modifiedAt")
    private @Nullable String modifiedAt;

    public Optional<String> modifiedAt() {
        return Optional.ofNullable(this.modifiedAt);
    }

    @Import(name="samplingRule")
    private @Nullable SamplingRule samplingRule;

    public Optional<SamplingRule> samplingRule() {
        return Optional.ofNullable(this.samplingRule);
    }

    private SamplingRuleRecord() {}

    private SamplingRuleRecord(SamplingRuleRecord $) {
        this.createdAt = $.createdAt;
        this.modifiedAt = $.modifiedAt;
        this.samplingRule = $.samplingRule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SamplingRuleRecord defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SamplingRuleRecord $;

        public Builder() {
            $ = new SamplingRuleRecord();
        }

        public Builder(SamplingRuleRecord defaults) {
            $ = new SamplingRuleRecord(Objects.requireNonNull(defaults));
        }

        public Builder createdAt(@Nullable String createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder modifiedAt(@Nullable String modifiedAt) {
            $.modifiedAt = modifiedAt;
            return this;
        }

        public Builder samplingRule(@Nullable SamplingRule samplingRule) {
            $.samplingRule = samplingRule;
            return this;
        }

        public SamplingRuleRecord build() {
            return $;
        }
    }

}
