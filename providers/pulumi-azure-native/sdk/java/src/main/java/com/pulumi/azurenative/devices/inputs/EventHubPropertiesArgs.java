// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of the provisioned Event Hub-compatible endpoint used by the IoT hub.
 * 
 */
public final class EventHubPropertiesArgs extends ResourceArgs {

    public static final EventHubPropertiesArgs Empty = new EventHubPropertiesArgs();

    /**
     * The number of partitions for receiving device-to-cloud messages in the Event Hub-compatible endpoint. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages.
     * 
     */
    @Import(name="partitionCount")
    private @Nullable Output<Integer> partitionCount;

    /**
     * @return The number of partitions for receiving device-to-cloud messages in the Event Hub-compatible endpoint. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages.
     * 
     */
    public Optional<Output<Integer>> partitionCount() {
        return Optional.ofNullable(this.partitionCount);
    }

    /**
     * The retention time for device-to-cloud messages in days. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages
     * 
     */
    @Import(name="retentionTimeInDays")
    private @Nullable Output<Double> retentionTimeInDays;

    /**
     * @return The retention time for device-to-cloud messages in days. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages
     * 
     */
    public Optional<Output<Double>> retentionTimeInDays() {
        return Optional.ofNullable(this.retentionTimeInDays);
    }

    private EventHubPropertiesArgs() {}

    private EventHubPropertiesArgs(EventHubPropertiesArgs $) {
        this.partitionCount = $.partitionCount;
        this.retentionTimeInDays = $.retentionTimeInDays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventHubPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventHubPropertiesArgs $;

        public Builder() {
            $ = new EventHubPropertiesArgs();
        }

        public Builder(EventHubPropertiesArgs defaults) {
            $ = new EventHubPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param partitionCount The number of partitions for receiving device-to-cloud messages in the Event Hub-compatible endpoint. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages.
         * 
         * @return builder
         * 
         */
        public Builder partitionCount(@Nullable Output<Integer> partitionCount) {
            $.partitionCount = partitionCount;
            return this;
        }

        /**
         * @param partitionCount The number of partitions for receiving device-to-cloud messages in the Event Hub-compatible endpoint. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages.
         * 
         * @return builder
         * 
         */
        public Builder partitionCount(Integer partitionCount) {
            return partitionCount(Output.of(partitionCount));
        }

        /**
         * @param retentionTimeInDays The retention time for device-to-cloud messages in days. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages
         * 
         * @return builder
         * 
         */
        public Builder retentionTimeInDays(@Nullable Output<Double> retentionTimeInDays) {
            $.retentionTimeInDays = retentionTimeInDays;
            return this;
        }

        /**
         * @param retentionTimeInDays The retention time for device-to-cloud messages in days. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages
         * 
         * @return builder
         * 
         */
        public Builder retentionTimeInDays(Double retentionTimeInDays) {
            return retentionTimeInDays(Output.of(retentionTimeInDays));
        }

        public EventHubPropertiesArgs build() {
            return $;
        }
    }

}
