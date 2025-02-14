// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclLoggingConfigurationLoggingFilterFilterConditionActionCondition;
import com.pulumi.aws.wafv2.outputs.WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameCondition;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclLoggingConfigurationLoggingFilterFilterCondition {
    /**
     * @return A single action condition. See Action Condition below for more details.
     * 
     */
    private final @Nullable WebAclLoggingConfigurationLoggingFilterFilterConditionActionCondition actionCondition;
    /**
     * @return A single label name condition. See Label Name Condition below for more details.
     * 
     */
    private final @Nullable WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameCondition labelNameCondition;

    @CustomType.Constructor
    private WebAclLoggingConfigurationLoggingFilterFilterCondition(
        @CustomType.Parameter("actionCondition") @Nullable WebAclLoggingConfigurationLoggingFilterFilterConditionActionCondition actionCondition,
        @CustomType.Parameter("labelNameCondition") @Nullable WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameCondition labelNameCondition) {
        this.actionCondition = actionCondition;
        this.labelNameCondition = labelNameCondition;
    }

    /**
     * @return A single action condition. See Action Condition below for more details.
     * 
     */
    public Optional<WebAclLoggingConfigurationLoggingFilterFilterConditionActionCondition> actionCondition() {
        return Optional.ofNullable(this.actionCondition);
    }
    /**
     * @return A single label name condition. See Label Name Condition below for more details.
     * 
     */
    public Optional<WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameCondition> labelNameCondition() {
        return Optional.ofNullable(this.labelNameCondition);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationLoggingFilterFilterCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclLoggingConfigurationLoggingFilterFilterConditionActionCondition actionCondition;
        private @Nullable WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameCondition labelNameCondition;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationLoggingFilterFilterCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionCondition = defaults.actionCondition;
    	      this.labelNameCondition = defaults.labelNameCondition;
        }

        public Builder actionCondition(@Nullable WebAclLoggingConfigurationLoggingFilterFilterConditionActionCondition actionCondition) {
            this.actionCondition = actionCondition;
            return this;
        }
        public Builder labelNameCondition(@Nullable WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameCondition labelNameCondition) {
            this.labelNameCondition = labelNameCondition;
            return this;
        }        public WebAclLoggingConfigurationLoggingFilterFilterCondition build() {
            return new WebAclLoggingConfigurationLoggingFilterFilterCondition(actionCondition, labelNameCondition);
        }
    }
}
