// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Maintenance Operation Status.
 * 
 */
public final class MaintenanceRedeployStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final MaintenanceRedeployStatusResponse Empty = new MaintenanceRedeployStatusResponse();

    /**
     * True, if customer is allowed to perform Maintenance.
     * 
     */
    @Import(name="isCustomerInitiatedMaintenanceAllowed")
      private final @Nullable Boolean isCustomerInitiatedMaintenanceAllowed;

    public Optional<Boolean> isCustomerInitiatedMaintenanceAllowed() {
        return this.isCustomerInitiatedMaintenanceAllowed == null ? Optional.empty() : Optional.ofNullable(this.isCustomerInitiatedMaintenanceAllowed);
    }

    /**
     * Message returned for the last Maintenance Operation.
     * 
     */
    @Import(name="lastOperationMessage")
      private final @Nullable String lastOperationMessage;

    public Optional<String> lastOperationMessage() {
        return this.lastOperationMessage == null ? Optional.empty() : Optional.ofNullable(this.lastOperationMessage);
    }

    /**
     * The Last Maintenance Operation Result Code.
     * 
     */
    @Import(name="lastOperationResultCode")
      private final @Nullable String lastOperationResultCode;

    public Optional<String> lastOperationResultCode() {
        return this.lastOperationResultCode == null ? Optional.empty() : Optional.ofNullable(this.lastOperationResultCode);
    }

    /**
     * End Time for the Maintenance Window.
     * 
     */
    @Import(name="maintenanceWindowEndTime")
      private final @Nullable String maintenanceWindowEndTime;

    public Optional<String> maintenanceWindowEndTime() {
        return this.maintenanceWindowEndTime == null ? Optional.empty() : Optional.ofNullable(this.maintenanceWindowEndTime);
    }

    /**
     * Start Time for the Maintenance Window.
     * 
     */
    @Import(name="maintenanceWindowStartTime")
      private final @Nullable String maintenanceWindowStartTime;

    public Optional<String> maintenanceWindowStartTime() {
        return this.maintenanceWindowStartTime == null ? Optional.empty() : Optional.ofNullable(this.maintenanceWindowStartTime);
    }

    /**
     * End Time for the Pre Maintenance Window.
     * 
     */
    @Import(name="preMaintenanceWindowEndTime")
      private final @Nullable String preMaintenanceWindowEndTime;

    public Optional<String> preMaintenanceWindowEndTime() {
        return this.preMaintenanceWindowEndTime == null ? Optional.empty() : Optional.ofNullable(this.preMaintenanceWindowEndTime);
    }

    /**
     * Start Time for the Pre Maintenance Window.
     * 
     */
    @Import(name="preMaintenanceWindowStartTime")
      private final @Nullable String preMaintenanceWindowStartTime;

    public Optional<String> preMaintenanceWindowStartTime() {
        return this.preMaintenanceWindowStartTime == null ? Optional.empty() : Optional.ofNullable(this.preMaintenanceWindowStartTime);
    }

    public MaintenanceRedeployStatusResponse(
        @Nullable Boolean isCustomerInitiatedMaintenanceAllowed,
        @Nullable String lastOperationMessage,
        @Nullable String lastOperationResultCode,
        @Nullable String maintenanceWindowEndTime,
        @Nullable String maintenanceWindowStartTime,
        @Nullable String preMaintenanceWindowEndTime,
        @Nullable String preMaintenanceWindowStartTime) {
        this.isCustomerInitiatedMaintenanceAllowed = isCustomerInitiatedMaintenanceAllowed;
        this.lastOperationMessage = lastOperationMessage;
        this.lastOperationResultCode = lastOperationResultCode;
        this.maintenanceWindowEndTime = maintenanceWindowEndTime;
        this.maintenanceWindowStartTime = maintenanceWindowStartTime;
        this.preMaintenanceWindowEndTime = preMaintenanceWindowEndTime;
        this.preMaintenanceWindowStartTime = preMaintenanceWindowStartTime;
    }

    private MaintenanceRedeployStatusResponse() {
        this.isCustomerInitiatedMaintenanceAllowed = null;
        this.lastOperationMessage = null;
        this.lastOperationResultCode = null;
        this.maintenanceWindowEndTime = null;
        this.maintenanceWindowStartTime = null;
        this.preMaintenanceWindowEndTime = null;
        this.preMaintenanceWindowStartTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceRedeployStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isCustomerInitiatedMaintenanceAllowed;
        private @Nullable String lastOperationMessage;
        private @Nullable String lastOperationResultCode;
        private @Nullable String maintenanceWindowEndTime;
        private @Nullable String maintenanceWindowStartTime;
        private @Nullable String preMaintenanceWindowEndTime;
        private @Nullable String preMaintenanceWindowStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceRedeployStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isCustomerInitiatedMaintenanceAllowed = defaults.isCustomerInitiatedMaintenanceAllowed;
    	      this.lastOperationMessage = defaults.lastOperationMessage;
    	      this.lastOperationResultCode = defaults.lastOperationResultCode;
    	      this.maintenanceWindowEndTime = defaults.maintenanceWindowEndTime;
    	      this.maintenanceWindowStartTime = defaults.maintenanceWindowStartTime;
    	      this.preMaintenanceWindowEndTime = defaults.preMaintenanceWindowEndTime;
    	      this.preMaintenanceWindowStartTime = defaults.preMaintenanceWindowStartTime;
        }

        public Builder isCustomerInitiatedMaintenanceAllowed(@Nullable Boolean isCustomerInitiatedMaintenanceAllowed) {
            this.isCustomerInitiatedMaintenanceAllowed = isCustomerInitiatedMaintenanceAllowed;
            return this;
        }
        public Builder lastOperationMessage(@Nullable String lastOperationMessage) {
            this.lastOperationMessage = lastOperationMessage;
            return this;
        }
        public Builder lastOperationResultCode(@Nullable String lastOperationResultCode) {
            this.lastOperationResultCode = lastOperationResultCode;
            return this;
        }
        public Builder maintenanceWindowEndTime(@Nullable String maintenanceWindowEndTime) {
            this.maintenanceWindowEndTime = maintenanceWindowEndTime;
            return this;
        }
        public Builder maintenanceWindowStartTime(@Nullable String maintenanceWindowStartTime) {
            this.maintenanceWindowStartTime = maintenanceWindowStartTime;
            return this;
        }
        public Builder preMaintenanceWindowEndTime(@Nullable String preMaintenanceWindowEndTime) {
            this.preMaintenanceWindowEndTime = preMaintenanceWindowEndTime;
            return this;
        }
        public Builder preMaintenanceWindowStartTime(@Nullable String preMaintenanceWindowStartTime) {
            this.preMaintenanceWindowStartTime = preMaintenanceWindowStartTime;
            return this;
        }        public MaintenanceRedeployStatusResponse build() {
            return new MaintenanceRedeployStatusResponse(isCustomerInitiatedMaintenanceAllowed, lastOperationMessage, lastOperationResultCode, maintenanceWindowEndTime, maintenanceWindowStartTime, preMaintenanceWindowEndTime, preMaintenanceWindowStartTime);
        }
    }
}
