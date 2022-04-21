// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InventoryScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final InventoryScheduleArgs Empty = new InventoryScheduleArgs();

    /**
     * Specifies how frequently inventory results are produced. Valid values: `Daily`, `Weekly`.
     * 
     */
    @Import(name="frequency", required=true)
    private Output<String> frequency;

    public Output<String> frequency() {
        return this.frequency;
    }

    private InventoryScheduleArgs() {}

    private InventoryScheduleArgs(InventoryScheduleArgs $) {
        this.frequency = $.frequency;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InventoryScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InventoryScheduleArgs $;

        public Builder() {
            $ = new InventoryScheduleArgs();
        }

        public Builder(InventoryScheduleArgs defaults) {
            $ = new InventoryScheduleArgs(Objects.requireNonNull(defaults));
        }

        public Builder frequency(Output<String> frequency) {
            $.frequency = frequency;
            return this;
        }

        public Builder frequency(String frequency) {
            return frequency(Output.of(frequency));
        }

        public InventoryScheduleArgs build() {
            $.frequency = Objects.requireNonNull($.frequency, "expected parameter 'frequency' to be non-null");
            return $;
        }
    }

}
