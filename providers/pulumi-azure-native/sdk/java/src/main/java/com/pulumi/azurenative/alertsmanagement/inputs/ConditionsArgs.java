// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.alertsmanagement.inputs;

import com.pulumi.azurenative.alertsmanagement.inputs.ConditionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Conditions in alert instance to be matched for a given action rule. Default value is all. Multiple values could be provided with comma separation.
 * 
 */
public final class ConditionsArgs extends ResourceArgs {

    public static final ConditionsArgs Empty = new ConditionsArgs();

    /**
     * filter alerts by alert context (payload)
     * 
     */
    @Import(name="alertContext")
    private @Nullable Output<ConditionArgs> alertContext;

    /**
     * @return filter alerts by alert context (payload)
     * 
     */
    public Optional<Output<ConditionArgs>> alertContext() {
        return Optional.ofNullable(this.alertContext);
    }

    /**
     * filter alerts by alert rule id
     * 
     */
    @Import(name="alertRuleId")
    private @Nullable Output<ConditionArgs> alertRuleId;

    /**
     * @return filter alerts by alert rule id
     * 
     */
    public Optional<Output<ConditionArgs>> alertRuleId() {
        return Optional.ofNullable(this.alertRuleId);
    }

    /**
     * filter alerts by alert rule description
     * 
     */
    @Import(name="description")
    private @Nullable Output<ConditionArgs> description;

    /**
     * @return filter alerts by alert rule description
     * 
     */
    public Optional<Output<ConditionArgs>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * filter alerts by monitor condition
     * 
     */
    @Import(name="monitorCondition")
    private @Nullable Output<ConditionArgs> monitorCondition;

    /**
     * @return filter alerts by monitor condition
     * 
     */
    public Optional<Output<ConditionArgs>> monitorCondition() {
        return Optional.ofNullable(this.monitorCondition);
    }

    /**
     * filter alerts by monitor service
     * 
     */
    @Import(name="monitorService")
    private @Nullable Output<ConditionArgs> monitorService;

    /**
     * @return filter alerts by monitor service
     * 
     */
    public Optional<Output<ConditionArgs>> monitorService() {
        return Optional.ofNullable(this.monitorService);
    }

    /**
     * filter alerts by severity
     * 
     */
    @Import(name="severity")
    private @Nullable Output<ConditionArgs> severity;

    /**
     * @return filter alerts by severity
     * 
     */
    public Optional<Output<ConditionArgs>> severity() {
        return Optional.ofNullable(this.severity);
    }

    /**
     * filter alerts by target resource type
     * 
     */
    @Import(name="targetResourceType")
    private @Nullable Output<ConditionArgs> targetResourceType;

    /**
     * @return filter alerts by target resource type
     * 
     */
    public Optional<Output<ConditionArgs>> targetResourceType() {
        return Optional.ofNullable(this.targetResourceType);
    }

    private ConditionsArgs() {}

    private ConditionsArgs(ConditionsArgs $) {
        this.alertContext = $.alertContext;
        this.alertRuleId = $.alertRuleId;
        this.description = $.description;
        this.monitorCondition = $.monitorCondition;
        this.monitorService = $.monitorService;
        this.severity = $.severity;
        this.targetResourceType = $.targetResourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConditionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConditionsArgs $;

        public Builder() {
            $ = new ConditionsArgs();
        }

        public Builder(ConditionsArgs defaults) {
            $ = new ConditionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertContext filter alerts by alert context (payload)
         * 
         * @return builder
         * 
         */
        public Builder alertContext(@Nullable Output<ConditionArgs> alertContext) {
            $.alertContext = alertContext;
            return this;
        }

        /**
         * @param alertContext filter alerts by alert context (payload)
         * 
         * @return builder
         * 
         */
        public Builder alertContext(ConditionArgs alertContext) {
            return alertContext(Output.of(alertContext));
        }

        /**
         * @param alertRuleId filter alerts by alert rule id
         * 
         * @return builder
         * 
         */
        public Builder alertRuleId(@Nullable Output<ConditionArgs> alertRuleId) {
            $.alertRuleId = alertRuleId;
            return this;
        }

        /**
         * @param alertRuleId filter alerts by alert rule id
         * 
         * @return builder
         * 
         */
        public Builder alertRuleId(ConditionArgs alertRuleId) {
            return alertRuleId(Output.of(alertRuleId));
        }

        /**
         * @param description filter alerts by alert rule description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<ConditionArgs> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description filter alerts by alert rule description
         * 
         * @return builder
         * 
         */
        public Builder description(ConditionArgs description) {
            return description(Output.of(description));
        }

        /**
         * @param monitorCondition filter alerts by monitor condition
         * 
         * @return builder
         * 
         */
        public Builder monitorCondition(@Nullable Output<ConditionArgs> monitorCondition) {
            $.monitorCondition = monitorCondition;
            return this;
        }

        /**
         * @param monitorCondition filter alerts by monitor condition
         * 
         * @return builder
         * 
         */
        public Builder monitorCondition(ConditionArgs monitorCondition) {
            return monitorCondition(Output.of(monitorCondition));
        }

        /**
         * @param monitorService filter alerts by monitor service
         * 
         * @return builder
         * 
         */
        public Builder monitorService(@Nullable Output<ConditionArgs> monitorService) {
            $.monitorService = monitorService;
            return this;
        }

        /**
         * @param monitorService filter alerts by monitor service
         * 
         * @return builder
         * 
         */
        public Builder monitorService(ConditionArgs monitorService) {
            return monitorService(Output.of(monitorService));
        }

        /**
         * @param severity filter alerts by severity
         * 
         * @return builder
         * 
         */
        public Builder severity(@Nullable Output<ConditionArgs> severity) {
            $.severity = severity;
            return this;
        }

        /**
         * @param severity filter alerts by severity
         * 
         * @return builder
         * 
         */
        public Builder severity(ConditionArgs severity) {
            return severity(Output.of(severity));
        }

        /**
         * @param targetResourceType filter alerts by target resource type
         * 
         * @return builder
         * 
         */
        public Builder targetResourceType(@Nullable Output<ConditionArgs> targetResourceType) {
            $.targetResourceType = targetResourceType;
            return this;
        }

        /**
         * @param targetResourceType filter alerts by target resource type
         * 
         * @return builder
         * 
         */
        public Builder targetResourceType(ConditionArgs targetResourceType) {
            return targetResourceType(Output.of(targetResourceType));
        }

        public ConditionsArgs build() {
            return $;
        }
    }

}
