// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotSiteConfigAutoHealSettingActionCustomAction;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WindowsWebAppSlotSiteConfigAutoHealSettingAction {
    /**
     * @return Predefined action to be taken to an Auto Heal trigger. Possible values include: `Recycle`.
     * 
     */
    private final String actionType;
    /**
     * @return A `custom_action` block as defined below.
     * 
     */
    private final @Nullable WindowsWebAppSlotSiteConfigAutoHealSettingActionCustomAction customAction;
    /**
     * @return The minimum amount of time in `hh:mm:ss` the Windows Web App Slot must have been running before the defined action will be run in the event of a trigger.
     * 
     */
    private final @Nullable String minimumProcessExecutionTime;

    @CustomType.Constructor
    private WindowsWebAppSlotSiteConfigAutoHealSettingAction(
        @CustomType.Parameter("actionType") String actionType,
        @CustomType.Parameter("customAction") @Nullable WindowsWebAppSlotSiteConfigAutoHealSettingActionCustomAction customAction,
        @CustomType.Parameter("minimumProcessExecutionTime") @Nullable String minimumProcessExecutionTime) {
        this.actionType = actionType;
        this.customAction = customAction;
        this.minimumProcessExecutionTime = minimumProcessExecutionTime;
    }

    /**
     * @return Predefined action to be taken to an Auto Heal trigger. Possible values include: `Recycle`.
     * 
     */
    public String actionType() {
        return this.actionType;
    }
    /**
     * @return A `custom_action` block as defined below.
     * 
     */
    public Optional<WindowsWebAppSlotSiteConfigAutoHealSettingActionCustomAction> customAction() {
        return Optional.ofNullable(this.customAction);
    }
    /**
     * @return The minimum amount of time in `hh:mm:ss` the Windows Web App Slot must have been running before the defined action will be run in the event of a trigger.
     * 
     */
    public Optional<String> minimumProcessExecutionTime() {
        return Optional.ofNullable(this.minimumProcessExecutionTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsWebAppSlotSiteConfigAutoHealSettingAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionType;
        private @Nullable WindowsWebAppSlotSiteConfigAutoHealSettingActionCustomAction customAction;
        private @Nullable String minimumProcessExecutionTime;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsWebAppSlotSiteConfigAutoHealSettingAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
    	      this.customAction = defaults.customAction;
    	      this.minimumProcessExecutionTime = defaults.minimumProcessExecutionTime;
        }

        public Builder actionType(String actionType) {
            this.actionType = Objects.requireNonNull(actionType);
            return this;
        }
        public Builder customAction(@Nullable WindowsWebAppSlotSiteConfigAutoHealSettingActionCustomAction customAction) {
            this.customAction = customAction;
            return this;
        }
        public Builder minimumProcessExecutionTime(@Nullable String minimumProcessExecutionTime) {
            this.minimumProcessExecutionTime = minimumProcessExecutionTime;
            return this;
        }        public WindowsWebAppSlotSiteConfigAutoHealSettingAction build() {
            return new WindowsWebAppSlotSiteConfigAutoHealSettingAction(actionType, customAction, minimumProcessExecutionTime);
        }
    }
}
