// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.AutoHealCustomActionResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Actions which to take by the auto-heal module when a rule is triggered.
 * 
 */
public final class AutoHealActionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final AutoHealActionsResponse Empty = new AutoHealActionsResponse();

    /**
     * Predefined action to be taken.
     * 
     */
    @Import(name="actionType")
      private final @Nullable String actionType;

    public Optional<String> actionType() {
        return this.actionType == null ? Optional.empty() : Optional.ofNullable(this.actionType);
    }

    /**
     * Custom action to be taken.
     * 
     */
    @Import(name="customAction")
      private final @Nullable AutoHealCustomActionResponse customAction;

    public Optional<AutoHealCustomActionResponse> customAction() {
        return this.customAction == null ? Optional.empty() : Optional.ofNullable(this.customAction);
    }

    /**
     * Minimum time the process must execute
     * before taking the action
     * 
     */
    @Import(name="minProcessExecutionTime")
      private final @Nullable String minProcessExecutionTime;

    public Optional<String> minProcessExecutionTime() {
        return this.minProcessExecutionTime == null ? Optional.empty() : Optional.ofNullable(this.minProcessExecutionTime);
    }

    public AutoHealActionsResponse(
        @Nullable String actionType,
        @Nullable AutoHealCustomActionResponse customAction,
        @Nullable String minProcessExecutionTime) {
        this.actionType = actionType;
        this.customAction = customAction;
        this.minProcessExecutionTime = minProcessExecutionTime;
    }

    private AutoHealActionsResponse() {
        this.actionType = null;
        this.customAction = null;
        this.minProcessExecutionTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoHealActionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionType;
        private @Nullable AutoHealCustomActionResponse customAction;
        private @Nullable String minProcessExecutionTime;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoHealActionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
    	      this.customAction = defaults.customAction;
    	      this.minProcessExecutionTime = defaults.minProcessExecutionTime;
        }

        public Builder actionType(@Nullable String actionType) {
            this.actionType = actionType;
            return this;
        }
        public Builder customAction(@Nullable AutoHealCustomActionResponse customAction) {
            this.customAction = customAction;
            return this;
        }
        public Builder minProcessExecutionTime(@Nullable String minProcessExecutionTime) {
            this.minProcessExecutionTime = minProcessExecutionTime;
            return this;
        }        public AutoHealActionsResponse build() {
            return new AutoHealActionsResponse(actionType, customAction, minProcessExecutionTime);
        }
    }
}
