// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.connectedvmwarevsphere.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This data object type contains the properties of a SCSI controller device attached to a virtual machine that is reported by the controller.
 * 
 */
public final class VirtualSCSIControllerResponse extends com.pulumi.resources.InvokeArgs {

    public static final VirtualSCSIControllerResponse Empty = new VirtualSCSIControllerResponse();

    /**
     * Gets or sets the bus number of the controller.
     * 
     */
    @Import(name="busNumber")
      private final @Nullable Integer busNumber;

    public Optional<Integer> busNumber() {
        return this.busNumber == null ? Optional.empty() : Optional.ofNullable(this.busNumber);
    }

    /**
     * Gets or sets the key of the controller.
     * 
     */
    @Import(name="controllerKey")
      private final @Nullable Integer controllerKey;

    public Optional<Integer> controllerKey() {
        return this.controllerKey == null ? Optional.empty() : Optional.ofNullable(this.controllerKey);
    }

    /**
     * Gets or sets the SCSI controller unit number.
     * 
     */
    @Import(name="scsiCtlrUnitNumber")
      private final @Nullable Integer scsiCtlrUnitNumber;

    public Optional<Integer> scsiCtlrUnitNumber() {
        return this.scsiCtlrUnitNumber == null ? Optional.empty() : Optional.ofNullable(this.scsiCtlrUnitNumber);
    }

    /**
     * Gets or sets the sharing mode.
     * 
     */
    @Import(name="sharing")
      private final @Nullable String sharing;

    public Optional<String> sharing() {
        return this.sharing == null ? Optional.empty() : Optional.ofNullable(this.sharing);
    }

    /**
     * Gets or sets the controller type.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> type() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public VirtualSCSIControllerResponse(
        @Nullable Integer busNumber,
        @Nullable Integer controllerKey,
        @Nullable Integer scsiCtlrUnitNumber,
        @Nullable String sharing,
        @Nullable String type) {
        this.busNumber = busNumber;
        this.controllerKey = controllerKey;
        this.scsiCtlrUnitNumber = scsiCtlrUnitNumber;
        this.sharing = sharing;
        this.type = type;
    }

    private VirtualSCSIControllerResponse() {
        this.busNumber = null;
        this.controllerKey = null;
        this.scsiCtlrUnitNumber = null;
        this.sharing = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualSCSIControllerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer busNumber;
        private @Nullable Integer controllerKey;
        private @Nullable Integer scsiCtlrUnitNumber;
        private @Nullable String sharing;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualSCSIControllerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.busNumber = defaults.busNumber;
    	      this.controllerKey = defaults.controllerKey;
    	      this.scsiCtlrUnitNumber = defaults.scsiCtlrUnitNumber;
    	      this.sharing = defaults.sharing;
    	      this.type = defaults.type;
        }

        public Builder busNumber(@Nullable Integer busNumber) {
            this.busNumber = busNumber;
            return this;
        }
        public Builder controllerKey(@Nullable Integer controllerKey) {
            this.controllerKey = controllerKey;
            return this;
        }
        public Builder scsiCtlrUnitNumber(@Nullable Integer scsiCtlrUnitNumber) {
            this.scsiCtlrUnitNumber = scsiCtlrUnitNumber;
            return this;
        }
        public Builder sharing(@Nullable String sharing) {
            this.sharing = sharing;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public VirtualSCSIControllerResponse build() {
            return new VirtualSCSIControllerResponse(busNumber, controllerKey, scsiCtlrUnitNumber, sharing, type);
        }
    }
}
