// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kafkaconnect.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details about a fixed capacity allocated to a connector.
 * 
 */
public final class ConnectorProvisionedCapacity extends com.pulumi.resources.InvokeArgs {

    public static final ConnectorProvisionedCapacity Empty = new ConnectorProvisionedCapacity();

    /**
     * Specifies how many MSK Connect Units (MCU) are allocated to the connector.
     * 
     */
    @Import(name="mcuCount")
      private final @Nullable Integer mcuCount;

    public Optional<Integer> mcuCount() {
        return this.mcuCount == null ? Optional.empty() : Optional.ofNullable(this.mcuCount);
    }

    /**
     * Number of workers for a connector.
     * 
     */
    @Import(name="workerCount", required=true)
      private final Integer workerCount;

    public Integer workerCount() {
        return this.workerCount;
    }

    public ConnectorProvisionedCapacity(
        @Nullable Integer mcuCount,
        Integer workerCount) {
        this.mcuCount = mcuCount;
        this.workerCount = Objects.requireNonNull(workerCount, "expected parameter 'workerCount' to be non-null");
    }

    private ConnectorProvisionedCapacity() {
        this.mcuCount = null;
        this.workerCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProvisionedCapacity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer mcuCount;
        private Integer workerCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProvisionedCapacity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mcuCount = defaults.mcuCount;
    	      this.workerCount = defaults.workerCount;
        }

        public Builder mcuCount(@Nullable Integer mcuCount) {
            this.mcuCount = mcuCount;
            return this;
        }
        public Builder workerCount(Integer workerCount) {
            this.workerCount = Objects.requireNonNull(workerCount);
            return this;
        }        public ConnectorProvisionedCapacity build() {
            return new ConnectorProvisionedCapacity(mcuCount, workerCount);
        }
    }
}
